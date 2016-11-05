(ns soda-ash.template
  (:require
   [clojure.string :as string]
   [soda-ash.helpers :as h]))


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
            states
            variations]
     :or   {ui? true}}
    data-soda
    data-ash]

   (string/join " "
                (->> [(when ui? "ui")
                      (when data-soda (h/ash->class states [data-soda]))
                      (when data-ash (h/ash->class variations data-ash))
                      (when type (h/keyword->class type))
                      (when ui-name (h/keyword->class ui-name))]
                     flatten
                     (remove nil?)))))



(defn sanitize-attrs [opts attrs]
  (let [{:keys [data-soda
                data-ash
                class]} attrs
        soda-ash        (create-class opts data-soda data-ash)
        full-class      (if class
                          (str soda-ash " " class)
                          soda-ash)
        tab-index?      (:tab-index? opts)]

    (cond-> attrs
      full-class (assoc :class full-class)
      tab-index? (assoc :tab-index "0"))))


(defn create-component [opts]
  (let [tag (:tag opts)]
    (fn [attrs & children]
      (if (map? attrs)
        ;; w/ attrs
        (let [{:keys [data-soda
                      data-ash]}   attrs
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
