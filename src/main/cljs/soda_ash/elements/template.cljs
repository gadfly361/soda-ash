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
          sanitized-soda (h/sanitize-soda soda)
          sanitized-attrs (h/sanitize-attrs attrs)]

      (fn []
        (let [soda-class (h/soda->class e-name
                                        sanitized-soda
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
