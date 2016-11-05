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

(defcard-doc
  "Require the following:
   ```
  [soda-ash.element :as se]
  [soda-ash.content :as sco]
  ```")



;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;
;; Types

(defcard-doc
  "
---
# Types"
  (h/list-types header/opts))


(defcard-doc
  "**Page Headers** (rem)"
  "Headers may be oriented to give the hierarchyu of a section in the
  context of the page")

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


(defcard-doc
  "**Content Headers** (em)"
  "Headers may be oriented to give the importance of a section in the
  context of the content that surrounds it")

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



(defcard-doc
  "**Icon Headers**"
  "A header can be formatted to emphasize an icon")

(defn type-icon []
  [se/header-huge-icon
   [se/icon-settings]
   [sco/content
    "Icon Header"]])

(defcard-doc
  (mkdn-pprint-source type-icon))

(defcard-rg icon
   [type-icon])



(defcard-doc
  "**Sub Headers**"
  "Headers may be formatted to label smaller or de-emphasized content")

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


(defcard-doc
  "**Disabled**"
  "A header can show that it is inactive")

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

;; (defn variation-icon []
;;    [se/header-h2 {:data-ash [:icon]}
;;    [se/icon-settings]
;;    [sco/content
;;     "Account Settings"]])

;; (defcard-doc
;;   (mkdn-pprint-source variation-icon))

;; (defcard-rg icon
;;    [variation-icon])


(defcard-doc
  "**Dividing**"
  "A header can be formatted to divide itself from the content below
  it"
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



(defcard-doc
  "**Block**"
  "A header can be formatted to appear inside a content block"
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



(defcard-doc
  "**Attached**"
  "A header can be attached to other content, like a segment"
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



(defcard-doc
  "**Floating**"
  "A header can sit to the left or right of other content"
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



(defcard-doc
  "**Text Alignment**"
  "A header can have its text aligned to a side"
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



(defcard-doc
  "**Colored**"
  "A header can be formatted with different colors"
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



(defcard-doc
  "**Inverted**"
  "A header can have its colors inverted for contrast"
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

(defcard-doc
  "**Image**"
  "A header may contain an image")

(defn content-image []
  [se/header-h2
   [se/image {:src "images/gadfly.png"}]
   [sco/content
    "Gadfly361"]])

(defcard-doc
  (mkdn-pprint-source content-image))

(defcard-rg image
   [content-image])



(defcard-doc
  "**Icon**"
  "A header may contain an icon")

(defn content-icon []
  [se/header-h2
   [se/icon-star]
   [sco/content
    "Star"]])

(defcard-doc
  (mkdn-pprint-source content-icon))

(defcard-rg icon
   [content-icon])



(defcard-doc
  "**Subheader**"
  "Headers may contain subheaders"
  "*Note: Use `sco/sub-header` ... **not** `se/header-sub`*")

(defn content-subheader []
  [se/header-h2
   "Account Settings"
   [sco/sub-header
    "Manage your account settings and set e-mail preferences"]])

(defcard-doc
  (mkdn-pprint-source content-subheader))

(defcard-rg subheader
   [content-subheader])
