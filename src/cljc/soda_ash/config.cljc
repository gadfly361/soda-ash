(ns soda-ash.config)


(def options
  (atom {;; Relay issues as :warnings | :errors | :none
         :issues-as :warnings}))
