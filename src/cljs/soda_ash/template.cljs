(ns soda-ash.template
  (:require
   [clojure.string :as string]
   [soda-ash.helpers :as h]))


(defn create-ashes [soda ash]
  (when (or soda ash)
    (some->> [soda ash]
             flatten
             (remove nil?))))


(defn create-class
  ([opts]
   (create-class opts nil nil))

  ([opts x]
   (if (coll? x)
     (create-class opts nil x)
     (create-class opts x nil)))

  ([{:keys [ui?
            ui-name
            type
            groups]
     :or   {ui? true}}
    soda
    ash]

   (let [ashes (create-ashes soda ash)]
     (string/join " "
                  (->> [(when ui? "ui")
                        (when ashes (h/ash->class groups ashes))
                        (when type (h/ash->class groups [type]))
                        (when ui-name (h/keyword->class ui-name))]
                       flatten
                       (remove nil?))))))



(defn sanitize-attrs [opts attrs]
  (let [{:keys [soda
                ash
                class]} attrs
        soda-ash        (create-class opts soda ash)
        full-class      (if class
                          (str soda-ash " " class)
                          soda-ash)]

    (assoc attrs :class full-class)))


(defn create-component [opts]
  (let [tag (:tag opts)]
    (fn [attrs & children]
      (if (map? attrs)
        ;; w/ attrs
        (let [{:keys [soda
                      ash]}   attrs
              sanitized-attrs (sanitize-attrs opts attrs)]
          (into [tag
                 sanitized-attrs]
                children))

        ;; w/out attrs
        (let [sanitized-attrs (sanitize-attrs opts {})
              first-child     attrs]
          (into [tag
                 sanitized-attrs
                 first-child] children))))))
