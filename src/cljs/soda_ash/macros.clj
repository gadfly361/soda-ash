(ns soda-ash.macros)


(defmacro defcomp
  [symbol-name options]
  `(do
     (def ~(if (= "default" symbol-name)
             (symbol "class")
             (symbol (str "class-" symbol-name)))
       (partial t/create-class ~options))
     (def ~(if (= "default" symbol-name)
             (symbol "component")
             (symbol (str "component-" symbol-name)))
       (t/create-component ~options))))
