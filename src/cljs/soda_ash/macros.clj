(ns soda-ash.macros)


(defmacro defcomp
  "For use in implementation namepsaces"
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


(defmacro defc
  "For use in core namepsace"
  [comp-name type]
  `(do
     (def ~(if type
             (symbol (str comp-name "-" type "'"))
             (symbol (str comp-name "'")))
       ~(if type
          (symbol (str comp-name "/class-" type))
          (symbol (str comp-name "/class"))))

     (def ~(if type
             (symbol (str comp-name "-" type))
             (symbol (str comp-name)))
       ~(if type
          (symbol (str comp-name "/component-" type))
          (symbol (str comp-name "/component"))))
     ))
