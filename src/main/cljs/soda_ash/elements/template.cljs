(ns soda-ash.elements.template
  (:require [soda-ash.elements.helpers :as h]))


(defn create-attrs [sanitized-attrs class]
  (merge sanitized-attrs
         {:class class}))

(defn select-soda [r-soda sanitized-soda]
  (or r-soda sanitized-soda))

(defn select-tag [tag default-tag]
  (or tag default-tag))


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
              ;; class
              soda-class (h/soda->class e-name
                                        selected-soda
                                        type-set
                                        bool-set
                                        mod-set
                                        opt-set
                                        special-map)
              class (h/class ui?
                             soda-class
                             e-name)
              ;; attrs
              r-attrs (create-attrs sanitized-attrs class)]

          (into [selected-tag r-attrs]
                children))))))
