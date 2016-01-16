(ns soda-ash.elements.template
  (:require [soda-ash.elements.helpers :as h]))


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

    (let [tag (:tag soda)
          ratom (:ratom soda)
          path (:path soda)
          sanitized-soda (h/sanitize-soda soda)
          sanitized-attrs (h/sanitize-attrs attrs)]

      (when (and ratom path)
        (h/set-initial-values! ratom path sanitized-soda))

      (fn [_ & children]
        (let [m (when ratom @ratom)
              r-soda (get-in m (flatten [path :soda]))
              soda-class (h/soda->class e-name
                                        (or r-soda sanitized-soda)
                                        type-set
                                        bool-set
                                        mod-set
                                        opt-set
                                        special-map)
              class (h/class ui?
                             soda-class
                             e-name)]

          (into [(or tag default-tag)
                 (merge sanitized-attrs
                        {:class class})]
                children))))))
