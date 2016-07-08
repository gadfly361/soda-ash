(ns soda-ash.elements.header-card
  (:require-macros
   [devcards.core :refer [defcard-doc
                          defcard-rg
                          mkdn-pprint-source]])
  (:require
   [devcards.core]
   [reagent.core]
   [soda-ash.core :as sa]
   [soda-ash.helpers :as h]
   [soda-ash.elements.header :as header]))


(def list-keys
  (h/list-keys header/groups))


(defcard-doc
  "# SUMMARY

  ## Types"
  (h/list-types header/types "header" false)

  "## States (*soda*)"
  (list-keys "states")

  "## Variations (*ash*)"
  "### Icon"
  (list-keys "icon")
  "### dividing"
  (list-keys "dividing")
  "### block"
  (list-keys "block")
  "### attached"
  (list-keys "attached")
  "### floating"
  (list-keys "floating")
  "### text alignment"
  (list-keys "text alignment")
  "### colored"
  (list-keys "colored")
  "### inverted"
  (list-keys "inverted")

  "## Content"
  "### image"
  "Use sa/image"
  "### icon"
  "Use sa/icon"
  "### sub"
  "Use .sub.header class ... **not** sa/header-sub"
  )



;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;
;; Types

(defcard-doc
  "
---
# Types"
  (h/list-types header/types "header" false))


(defn type-h1 []
  [sa/header-h1 "h1 header"])

(defcard-doc
  (mkdn-pprint-source type-h1))

(defcard-rg
  [:div
   [type-h1]
   [sa/header-h2 "h2 header"]
   [sa/header-h3 "h3 header"]
   [sa/header-h4 "h4 header"]
   [sa/header-h5 "h5 header"]
   ])


(defn type-huge []
  [sa/header-huge "huge header"])

(defcard-doc
  (mkdn-pprint-source type-huge))

(defcard-rg
  [:div
   [type-huge]
   [sa/header-large "large header"]
   [sa/header-medium "medium header"]
   [sa/header-small "small header"]
   [sa/header-tiny "tiny header"]
   ])


(defn type-sub []
  [sa/header-sub "sub header"])

(defcard-doc
  (mkdn-pprint-source type-sub))

(defcard-rg
   [type-sub])



;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;
;; States

(defcard-doc
  "
---
# States"
  (list-keys "states"))


(defn state-disabled []
  [sa/header-large {:soda :disabled}
   "disabled header"])

(defcard-doc
  (mkdn-pprint-source state-disabled))

(defcard-rg
   [state-disabled])



;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;
;; Variations

(defcard-doc
  "
---
# Variations")

;; ---------------------------
;; icon

(defn variation-icon []
   [sa/header-h2 {:ash [:icon]}
   [sa/icon-settings]
   [:div.content
    "Account Settings"]])

(defcard-doc
  (mkdn-pprint-source variation-icon))

(defcard-rg
   [variation-icon])


;; ---------------------------
;; dividing

(defcard-doc
  "## dividing"
  (list-keys "dividing"))

(defn dividing []
  [:div
   [sa/header-large {:ash [:dividing]}
    "dividing header"]
   "Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do
   eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim
   ad minim veniam, quis nostrud exercitation ullamco laboris nisi ut
   aliquip ex ea commodo consequat. Duis aute irure dolor in
   reprehenderit in voluptate velit esse cillum dolore eu fugiat nulla
   pariatur. Excepteur sint occaecat cupidatat non proident, sunt in
   culpa qui officia deserunt mollit anim id est laborum."
   ])

(defcard-doc
  (mkdn-pprint-source dividing))

(defcard-rg
   [dividing])


;; ---------------------------
;; block

(defcard-doc
  "## block"
  (list-keys "block"))

(defn block []
  [:div
   [sa/header-large {:ash [:block]}
    "block header"]
   "Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do
   eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim
   ad minim veniam, quis nostrud exercitation ullamco laboris nisi ut
   aliquip ex ea commodo consequat. Duis aute irure dolor in
   reprehenderit in voluptate velit esse cillum dolore eu fugiat nulla
   pariatur. Excepteur sint occaecat cupidatat non proident, sunt in
   culpa qui officia deserunt mollit anim id est laborum."
   ])

(defcard-doc
  (mkdn-pprint-source block))

(defcard-rg
   [block])


;; ---------------------------
;; attached

(defcard-doc
  "## attached"
  (list-keys "attached"))

(defn attached []
  [:div
   [sa/header-large {:ash [:top-attached]}
    "top attached header"]

   [sa/segment {:ash [:attached]}
    "Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do
   eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim
   ad minim veniam, quis nostrud exercitation ullamco laboris nisi ut
   aliquip ex ea commodo consequat. Duis aute irure dolor in
   reprehenderit in voluptate velit esse cillum dolore eu fugiat nulla
   pariatur. Excepteur sint occaecat cupidatat non proident, sunt in
   culpa qui officia deserunt mollit anim id est laborum."]

   [sa/header-large {:ash [:attached]}
    "attached header"]

   [sa/segment {:ash [:attached]}
    "Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do
   eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim
   ad minim veniam, quis nostrud exercitation ullamco laboris nisi ut
   aliquip ex ea commodo consequat. Duis aute irure dolor in
   reprehenderit in voluptate velit esse cillum dolore eu fugiat nulla
   pariatur. Excepteur sint occaecat cupidatat non proident, sunt in
   culpa qui officia deserunt mollit anim id est laborum."]

   [sa/header-large {:ash [:bottom-attached]}
    "bottom attached header"]
   ])

(defcard-doc
  (mkdn-pprint-source attached))

(defcard-rg
   [attached])


;; ---------------------------
;; floating

(defcard-doc
  "## floating"
  (list-keys "floating"))

(defn left-floated []
  [:div
   [sa/header-large {:ash [:left-floated]}
    "left floating header"]
   "Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do
   eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim
   ad minim veniam, quis nostrud exercitation ullamco laboris nisi ut
   aliquip ex ea commodo consequat. Duis aute irure dolor in
   reprehenderit in voluptate velit esse cillum dolore eu fugiat nulla
   pariatur. Excepteur sint occaecat cupidatat non proident, sunt in
   culpa qui officia deserunt mollit anim id est laborum."
   ])

(defcard-doc
  (mkdn-pprint-source left-floated))

(defcard-rg
   [left-floated])


(defn right-floated []
  [:div
   [sa/header-large {:ash [:right-floated]}
    "right floating header"]
   "Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do
   eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim
   ad minim veniam, quis nostrud exercitation ullamco laboris nisi ut
   aliquip ex ea commodo consequat. Duis aute irure dolor in
   reprehenderit in voluptate velit esse cillum dolore eu fugiat nulla
   pariatur. Excepteur sint occaecat cupidatat non proident, sunt in
   culpa qui officia deserunt mollit anim id est laborum."
   ])

(defcard-doc
  (mkdn-pprint-source right-floated))

(defcard-rg
   [right-floated])


;; ---------------------------
;; text alignment

(defcard-doc
  "## text alignment"
  (list-keys "text alignment"))

(defn left-aligned []
  [:div
   [sa/header-large {:ash [:left-aligned]}
    "left aligned"]
   "Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do
   eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim
   ad minim veniam, quis nostrud exercitation ullamco laboris nisi ut
   aliquip ex ea commodo consequat. Duis aute irure dolor in
   reprehenderit in voluptate velit esse cillum dolore eu fugiat nulla
   pariatur. Excepteur sint occaecat cupidatat non proident, sunt in
   culpa qui officia deserunt mollit anim id est laborum."
   ])

(defcard-doc
  (mkdn-pprint-source left-aligned))

(defcard-rg
   [left-aligned])


(defn center-aligned []
  [:div
   [sa/header-large {:ash [:center-aligned]}
    "center aligned"]
   "Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do
   eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim
   ad minim veniam, quis nostrud exercitation ullamco laboris nisi ut
   aliquip ex ea commodo consequat. Duis aute irure dolor in
   reprehenderit in voluptate velit esse cillum dolore eu fugiat nulla
   pariatur. Excepteur sint occaecat cupidatat non proident, sunt in
   culpa qui officia deserunt mollit anim id est laborum."
   ])

(defcard-doc
  (mkdn-pprint-source center-aligned))

(defcard-rg
  [center-aligned])


(defn right-aligned []
  [:div
   [sa/header-large {:ash [:right-aligned]}
    "right aligned"]
   "Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do
   eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim
   ad minim veniam, quis nostrud exercitation ullamco laboris nisi ut
   aliquip ex ea commodo consequat. Duis aute irure dolor in
   reprehenderit in voluptate velit esse cillum dolore eu fugiat nulla
   pariatur. Excepteur sint occaecat cupidatat non proident, sunt in
   culpa qui officia deserunt mollit anim id est laborum."
   ])

(defcard-doc
  (mkdn-pprint-source right-aligned))

(defcard-rg
   [right-aligned])


(defn justified []
  [:div
   [sa/header-large {:ash [:justified]}
    "justified header"]
   "Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do
   eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim
   ad minim veniam, quis nostrud exercitation ullamco laboris nisi ut
   aliquip ex ea commodo consequat. Duis aute irure dolor in
   reprehenderit in voluptate velit esse cillum dolore eu fugiat nulla
   pariatur. Excepteur sint occaecat cupidatat non proident, sunt in
   culpa qui officia deserunt mollit anim id est laborum."
   ])

(defcard-doc
  (mkdn-pprint-source justified))

(defcard-rg
   [justified])


;; ---------------------------
;; Colored

(defcard-doc
  "## colored"
  (list-keys "colored"))

(defn colored-red []
  [sa/header-medium {:ash [:red]}
   "red"])

(defcard-doc
  (mkdn-pprint-source colored-red))

(defcard-rg
  [:div
   [colored-red]
   [sa/header-medium {:ash [:orange]} "orange"]
   [sa/header-medium {:ash [:yellow]} "yellow"]
   [sa/header-medium {:ash [:olive]} "olive"]
   [sa/header-medium {:ash [:green]} "green"]
   [sa/header-medium {:ash [:teal]} "teal"]
   [sa/header-medium {:ash [:blue]} "blue"]
   [sa/header-medium {:ash [:violet]} "violet"]
   [sa/header-medium {:ash [:purple]} "purple"]
   [sa/header-medium {:ash [:pink]} "pink"]
   [sa/header-medium {:ash [:brown]} "brown"]
   [sa/header-medium {:ash [:grey]} "grey"]
   ])


;; ---------------------------
;; Inverted

(defcard-doc
  "## inverted"
  (list-keys "inverted"))

(defn inverted []
  [sa/segment {:ash [:inverted]}
   [sa/header-medium {:ash [:inverted]}
    "inverted header"]])

(defcard-doc
  (mkdn-pprint-source inverted))

(defcard-rg
  [inverted])



;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;
;; Contents

(defcard-doc
  "
---
# Contents")

;; ---------------------------
;; image

(defcard-doc
  "## image"
  "Use sa/image")

(defn content-image []
  [sa/header-h2 {:ash [:image]}
   [sa/image {:src "/images/gadfly.png"}]
   [:div.content
    "Gadfly361"]])

(defcard-doc
  (mkdn-pprint-source content-image))

(defcard-rg
   [content-image])


;; ---------------------------
;; icon

(defcard-doc
  "## icon"
  "Use sa/icon")

(defn content-icon []
  [sa/header-h2
   [sa/icon-star]
   [:div.content
    "Star"]])

(defcard-doc
  (mkdn-pprint-source content-icon))

(defcard-rg
   [content-icon])


;; ---------------------------
;; subheader

(defcard-doc
  "## subheader"
  "Use .sub.header class ... **not** sa/header-sub")

(defn content-subheader []
  [sa/header-h2
   "Account Settings"
   [:div.sub.header
    "Manage your account settings and set e-mail preferences"]])

(defcard-doc
  (mkdn-pprint-source content-subheader))

(defcard-rg
   [content-subheader])
