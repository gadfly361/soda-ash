(ns soda-ash.elements.header-card
  (:require-macros
   [devcards.core :refer [defcard-doc
                          defcard-rg
                          mkdn-pprint-source]])
  (:require
   [devcards.core]
   [reagent.core]
   [soda-ash.element :as se]
   [soda-ash.content :as sco]
   [soda-ash.helpers :as h]
   [soda-ash.elements.header :as header]))


(def list-keys
  (h/list-keys header/variations))


(defcard-doc
  (h/devcard-docs header/opts))



;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;
;; Types

(defcard-doc
  "
---
# Types"
  (h/list-types header/opts))


(defn type-h1 []
  [se/header-h1 "h1 header"])

(defcard-doc
  (mkdn-pprint-source type-h1))

(defcard-rg h1
  [:div
   [type-h1]
   [se/header-h2 "h2 header"]
   [se/header-h3 "h3 header"]
   [se/header-h4 "h4 header"]
   [se/header-h5 "h5 header"]
   ])


(defn type-huge []
  [se/header-huge "huge header"])

(defcard-doc
  (mkdn-pprint-source type-huge))

(defcard-rg huge
  [:div
   [type-huge]
   [se/header-large "large header"]
   [se/header-medium "medium header"]
   [se/header-small "small header"]
   [se/header-tiny "tiny header"]
   ])


(defn type-sub []
  [se/header-sub "sub header"])

(defcard-doc
  (mkdn-pprint-source type-sub))

(defcard-rg sub
   [type-sub])



;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;
;; States

(defcard-doc
  "
---
# States"
  (list-keys "states"))


(defn state-disabled []
  [se/header-large {:data-soda :disabled}
   "disabled header"])

(defcard-doc
  (mkdn-pprint-source state-disabled))

(defcard-rg disabled
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
   [se/header-h2 {:data-ash [:icon]}
   [se/icon-settings]
   [sco/content
    "Account Settings"]])

(defcard-doc
  (mkdn-pprint-source variation-icon))

(defcard-rg icon
   [variation-icon])


;; ---------------------------
;; dividing

(defcard-doc
  "## dividing"
  (list-keys "dividing"))

(defn dividing []
  [:div
   [se/header-large {:data-ash [:dividing]}
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

(defcard-rg dividing
   [dividing])


;; ---------------------------
;; block

(defcard-doc
  "## block"
  (list-keys "block"))

(defn block []
  [:div
   [se/header-large {:data-ash [:block]}
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

(defcard-rg block
   [block])


;; ---------------------------
;; attached

(defcard-doc
  "## attached"
  (list-keys "attached"))

(defn attached []
  [:div
   [se/header-large {:data-ash [:top-attached]}
    "top attached header"]

   [se/segment {:data-ash [:attached]}
    "Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do
   eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim
   ad minim veniam, quis nostrud exercitation ullamco laboris nisi ut
   aliquip ex ea commodo consequat. Duis aute irure dolor in
   reprehenderit in voluptate velit esse cillum dolore eu fugiat nulla
   pariatur. Excepteur sint occaecat cupidatat non proident, sunt in
   culpa qui officia deserunt mollit anim id est laborum."]

   [se/header-large {:data-ash [:attached]}
    "attached header"]

   [se/segment {:data-ash [:attached]}
    "Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do
   eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim
   ad minim veniam, quis nostrud exercitation ullamco laboris nisi ut
   aliquip ex ea commodo consequat. Duis aute irure dolor in
   reprehenderit in voluptate velit esse cillum dolore eu fugiat nulla
   pariatur. Excepteur sint occaecat cupidatat non proident, sunt in
   culpa qui officia deserunt mollit anim id est laborum."]

   [se/header-large {:data-ash [:bottom-attached]}
    "bottom attached header"]
   ])

(defcard-doc
  (mkdn-pprint-source attached))

(defcard-rg attached
   [attached])


;; ---------------------------
;; floating

(defcard-doc
  "## floating"
  (list-keys "floating"))

(defn left-floated []
  [:div
   [se/header-large {:data-ash [:left-floated]}
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

(defcard-rg left-floated
   [left-floated])


(defn right-floated []
  [:div
   [se/header-large {:data-ash [:right-floated]}
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

(defcard-rg right-floated
   [right-floated])


;; ---------------------------
;; text alignment

(defcard-doc
  "## text alignment"
  (list-keys "text alignment"))

(defn left-aligned []
  [:div
   [se/header-large {:data-ash [:left-aligned]}
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

(defcard-rg left-aligned
   [left-aligned])


(defn center-aligned []
  [:div
   [se/header-large {:data-ash [:center-aligned]}
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

(defcard-rg center-aligned
  [center-aligned])


(defn right-aligned []
  [:div
   [se/header-large {:data-ash [:right-aligned]}
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

(defcard-rg right-aligned
   [right-aligned])


(defn justified []
  [:div
   [se/header-large {:data-ash [:justified]}
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

(defcard-rg justified
   [justified])


;; ---------------------------
;; Colored

(defcard-doc
  "## colored"
  (list-keys "colored"))

(defn colored-red []
  [se/header-medium {:data-ash [:red]}
   "red"])

(defcard-doc
  (mkdn-pprint-source colored-red))

(defcard-rg colored
  [:div
   [colored-red]
   [se/header-medium {:data-ash [:orange]} "orange"]
   [se/header-medium {:data-ash [:yellow]} "yellow"]
   [se/header-medium {:data-ash [:olive]} "olive"]
   [se/header-medium {:data-ash [:green]} "green"]
   [se/header-medium {:data-ash [:teal]} "teal"]
   [se/header-medium {:data-ash [:blue]} "blue"]
   [se/header-medium {:data-ash [:violet]} "violet"]
   [se/header-medium {:data-ash [:purple]} "purple"]
   [se/header-medium {:data-ash [:pink]} "pink"]
   [se/header-medium {:data-ash [:brown]} "brown"]
   [se/header-medium {:data-ash [:grey]} "grey"]
   ])


;; ---------------------------
;; Inverted

(defcard-doc
  "## inverted"
  (list-keys "inverted"))

(defn inverted []
  [se/segment {:data-ash [:inverted]}
   [se/header-medium {:data-ash [:inverted]}
    "inverted header"]])

(defcard-doc
  (mkdn-pprint-source inverted))

(defcard-rg inverted
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
  "## image")

(defn content-image []
  [se/header-h2
   [se/image {:src "images/gadfly.png"}]
   [sco/content
    "Gadfly361"]])

(defcard-doc
  (mkdn-pprint-source content-image))

(defcard-rg image
   [content-image])


;; ---------------------------
;; icon

(defcard-doc
  "## icon")

(defn content-icon []
  [se/header-h2
   [se/icon-star]
   [sco/content
    "Star"]])

(defcard-doc
  (mkdn-pprint-source content-icon))

(defcard-rg icon
   [content-icon])


;; ---------------------------
;; subheader

(defcard-doc
  "## subheader"
  "Use sco/sub-header ... **not** se/header-sub")

(defn content-subheader []
  [se/header-h2
   "Account Settings"
   [sco/sub-header
    "Manage your account settings and set e-mail preferences"]])

(defcard-doc
  (mkdn-pprint-source content-subheader))

(defcard-rg subheader
   [content-subheader])
