(ns soda-ash.runner
  (:require
   [doo.runner :refer-macros [doo-tests]]
   [soda-ash.elements.header-test]
   [soda-ash.elements.helpers-test]
   [soda-ash.elements.icon-test]
   [soda-ash.elements.label-test]))


(doo-tests
 'soda-ash.elements.header-test
 'soda-ash.elements.helpers-test
 'soda-ash.elements.icon-test
 'soda-ash.elements.label-test)
