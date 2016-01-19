(ns soda-ash.elements.template
  (:require [soda-ash.elements.helpers :as h]))


(defn create-attrs [sanitized-attrs class]
  (merge sanitized-attrs
         {:class class}))

(defn select-soda [r-soda sanitized-soda]
  (or r-soda sanitized-soda))

(defn select-tag [tag default-tag]
  (or tag default-tag))

(defn select-ui?
  "To overwrite element's ui?, need to set soda's ui? to true or false
  (nil will not overwrite)."
  [s-ui? ui?]
  (if (false? s-ui?)
    false
    (or s-ui? ui?)))


(defn element [{:keys [e-name
                       default-tag
                       ui?
                       type-set
                       bool-set
                       mod-set
                       opt-set
                       special-map]
                :or {ui? true
                     type-set #{}
                     bool-set #{}
                     mod-set #{}
                     opt-set #{}
                     special-map {}}}]
  (fn [{:keys [soda]
        :as attrs}
       & children]

    (let [;; get
          tag (:tag soda)
          ratom (:ratom soda)
          path (:path soda)
          s-ui? (:ui? soda)
          group? (:group? soda)
          ;; sanitize
          sanitized-soda (h/sanitize-soda soda)
          sanitized-attrs (h/sanitize-attrs attrs)]

      (when (and ratom path)
        (h/set-initial-values! ratom path sanitized-soda))

      (fn [_ & children]
        (let [;; get
              m (when ratom @ratom)
              r-soda (get-in m (flatten [path :soda]))
              selected-soda (select-soda r-soda sanitized-soda)
              selected-tag (select-tag tag default-tag)
              selected-ui? (select-ui? s-ui? ui?)
              ;; class
              soda-class (h/soda->class e-name
                                        selected-soda
                                        type-set
                                        bool-set
                                        mod-set
                                        opt-set
                                        special-map)
              class (h/class selected-ui?
                             soda-class
                             e-name
                             group?)
              ;; attrs
              r-attrs (create-attrs sanitized-attrs class)]

          (into [selected-tag r-attrs]
                children))))))
