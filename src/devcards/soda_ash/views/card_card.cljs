(ns soda-ash.views.card-card
  (:require-macros
   [devcards.core :refer [defcard-doc
                          defcard-rg
                          mkdn-pprint-source]])
  (:require
   [devcards.core]
   [reagent.core]
   [soda-ash.view :as sv]
   [soda-ash.helpers :as h]
   [soda-ash.element :as se]
   [soda-ash.content :as sco]
   [soda-ash.views.card :as card]
   [soda-ash.views.cards :as cards]))


(def list-keys
  (h/list-keys card/variations))

(def list-cards-keys
  (h/list-keys cards/variations))


(defcard-doc
  (h/devcard-docs card/opts))

(defcard-doc
  (h/devcard-docs cards/opts))


;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;
;; Types

(defcard-doc
  "
---
# Card Types"
  (h/list-types card/opts))

(defn type-default []
  [sv/card
   [sco/image
    [:img {:src "/images/ubuntu.png"}]]
   [sco/content
    [sco/header "Ubuntu"]
    [sco/s-meta "Started 2004"]
    [sco/description
     "Debian-based Linux operating system"]]
   [sco/content-extra
    [:a {:href "https://wiki.ubuntu.com/Releases"
         :target "_blank"}
     [se/icon-linux]
     "Releases"]]
   ])

(defcard-doc
  (mkdn-pprint-source type-default))

(defcard-rg
  [type-default])


(defn type-default2 []
  [sv/card
   [sco/content
    [sco/s-meta {:ash [:right-floated]} "14h"]
    [se/image {:ash [:avatar]
               :src "/images/gadfly.png"}
     "Gadlfy361"]]

   [sco/image
    [:img {:src "/images/square-image.png"}]]

   [sco/content
    [:span.right.floated
     [se/icon-empty-heart]
     "17 likes"]

    [:span
     [se/icon-comment]
     "3 comments"]]

   [sco/content-extra
    [se/input {:ash [:left-icon
                     :large
                     :transparent
                     :fluid]}
     [se/icon-empty-heart]
     [:input {:type        "text"
              :placeholder "Add Comment..."}]]]
   ])

(defcard-doc
  (mkdn-pprint-source type-default2))

(defcard-rg
  [type-default2])



(defcard-doc
  "
---
# Cards Types"
  (h/list-types cards/opts))


(defn cards-type-default []
  [sv/cards

   [sco/card
    [sco/content
     [se/image {:ash [:mini
                      :right-floated]
                :src "/images/gadfly.png"}]
     [sco/header "Gadfly361"]
     [sco/s-meta "Friends of Escherize"]
     [sco/description
      "Gadfly361 requested permission to view your contact details"]]
     [sco/content-extra
      [se/buttons {:ash [:two]}
       [se/button-basic {:ash [:green]}
        "Approve"]
       [se/button-basic {:ash [:red]}
        "Decline"]]]]

   [sco/card
    [sco/content
     [se/image {:ash [:mini
                      :right-floated
                      :rounded]
                :src "/images/escherize.jpg"}]
     [sco/header "Escherize"]
     [sco/s-meta "New Member"]
     [sco/description
      "Escherize wants to add you the the group "
      [:b "best friends"]]]
    [sco/content-extra
     [se/buttons {:ash [:two]}
      [se/button-basic {:ash [:green]}
       "Approve"]
      [se/button-basic {:ash [:red]}
       "Decline"]]]]

   ])

(defcard-doc
  (mkdn-pprint-source cards-type-default))

(defcard-rg
  [cards-type-default])



;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;
;; Content

(defcard-doc
  "
---
# Content")

(defcard-doc
  "## content block")

(defn content-block []
  [sv/card
   [sco/image
    [:img {:src "/images/ubuntu.png"}]]
   [sco/content ;; <-- attention
    [sco/header "Ubuntu"]
    [sco/s-meta "Started 2004"]
    [sco/description
     "Debian-based Linux operating system"]]
   [sco/content-extra
    [:a {:href "https://wiki.ubuntu.com/Releases"
         :target "_blank"}
     [se/icon-linux]
     "Releases"]]
   ])

(defcard-doc
  (mkdn-pprint-source content-block))

(defcard-rg
  [content-block])


(defcard-doc
  "## image")

(defn content-image []
  [sv/card
   [sco/image ;; <-- attention
    [:img {:src "/images/ubuntu.png"}]]
   [sco/content
    [sco/header "Ubuntu"]
    [sco/s-meta "Started 2004"]
    [sco/description
     "Debian-based Linux operating system"]]
   [sco/content-extra
    [:a {:href "https://wiki.ubuntu.com/Releases"
         :target "_blank"}
     [se/icon-linux]
     "Releases"]]
   ])

(defcard-doc
  (mkdn-pprint-source content-image))

(defcard-rg
  [content-image])


;; TODO: update once dimmer is available
(defn content-image-hover []
  [sv/card
   "TODO: add blurring image"
   ])

(defcard-doc
  (mkdn-pprint-source content-image-hover))

(defcard-rg
  [content-image-hover])


(defcard-doc
  "## header")

(defn content-header []
  [sv/card
   [sco/image
    [:img {:src "/images/ubuntu.png"}]]
   [sco/content
    [sco/header "Ubuntu"] ;; <-- attention
    [sco/s-meta "Started 2004"]
    [sco/description
     "Debian-based Linux operating system"]]
   [sco/content-extra
    [:a {:href "https://wiki.ubuntu.com/Releases"
         :target "_blank"}
     [se/icon-linux]
     "Releases"]]
   ])

(defcard-doc
  (mkdn-pprint-source content-header))

(defcard-rg
  [content-header])


(defcard-doc
  "## metadata")

(defn content-metadata []
  [sv/card
   [sco/image
    [:img {:src "/images/ubuntu.png"}]]
   [sco/content
    [sco/header "Ubuntu"]
    [sco/s-meta "Started 2004"] ;; <-- attention
    [sco/description
     "Debian-based Linux operating system"]]
   [sco/content-extra
    [:a {:href "https://wiki.ubuntu.com/Releases"
         :target "_blank"}
     [se/icon-linux]
     "Releases"]]
   ])

(defcard-doc
  (mkdn-pprint-source content-metadata))

(defcard-rg
  [content-metadata])


(defcard-doc
  "## link"
  "A card can contain links as images, headers, or inside content.")

(defn content-links []
  [sv/card
   [sco/image-link {:href "http://www.ubuntu.com/" ;; <-- attention 1 of 3
                    :target "_blank"}
    [:img {:src "/images/ubuntu.png"}]]
   [sco/content
    [sco/header-link {:href "http://www.ubuntu.com/"  ;; <-- attention 2 of 3
                      :target "_blank"}
     "Ubuntu"]
    [sco/s-meta "Started 2004"]
    [sco/description
     "Debian-based Linux operating system"]]
   [sco/content-extra
    [:a {:href "https://wiki.ubuntu.com/Releases" ;; <--attention 3 of 3
         :target "_blank"}
     [se/icon-linux]
     "Releases"]]
   ])

(defcard-doc
  (mkdn-pprint-source content-links))

(defcard-rg
  [content-links])


(defcard-doc
  "## button")

(defn content-button []
  [sv/card
   [sco/content
    [sco/header "Gadfly361"]
    [sco/description "Gadfly361 is a clojurescript developer."]]
   [se/button {:ash [:bottom-attached
                     :green]}
    [se/icon-plus]
    "Add Friend"]
   ])

(defcard-doc
  (mkdn-pprint-source content-button))

(defcard-rg
  [content-button])


(defcard-doc
  "## approval"
  "A card can contain a like or start action")

(defn content-approval []
  [sv/card
   [sco/image
    [:img {:src "/images/ubuntu.png"}]]
   [sco/content
    [sco/header "Ubuntu"]
    [sco/s-meta "Started 2004"]
    [sco/description
     "Debian-based Linux operating system"]]

   [sco/content-extra
    [:span.left.floated
     [se/icon-like]
     "Like"]
    [:span.right.floated
     [se/icon-star]
     "Favorite"]]])

(defcard-doc
  (mkdn-pprint-source content-approval))

(defcard-rg
  [content-approval])


(defcard-doc
  "## description")

(defn content-description []
  [sv/card
   [sco/image
    [:img {:src "/images/ubuntu.png"}]]
   [sco/content
    [sco/header "Ubuntu"]
    [sco/s-meta "Started 2004"]
    [sco/description ;; <-- attention
     "Debian-based Linux operating system"]]
   [sco/content-extra
    [:a {:href "https://wiki.ubuntu.com/Releases"
         :target "_blank"}
     [se/icon-linux]
     "Releases"]]
   ])

(defcard-doc
  (mkdn-pprint-source content-description))

(defcard-rg
  [content-description])


(defcard-doc
  "## extra content")

(defn content-extra []
  [sv/card
   [sco/image
    [:img {:src "/images/ubuntu.png"}]]
   [sco/content
    [sco/header "Ubuntu"]
    [sco/s-meta "Started 2004"]
    [sco/description
     "Debian-based Linux operating system"]]
   [sco/content-extra  ;; <-- attention
    [:a {:href "https://wiki.ubuntu.com/Releases"
         :target "_blank"}
     [se/icon-linux]
     "Releases"]]
   ])

(defcard-doc
  (mkdn-pprint-source content-extra))

(defcard-rg
  [content-extra])



;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;
;; Variations

(defcard-doc
  "## fluid"
  (list-keys "fluid"))

(defn variation-fluid []
  [sv/card {:ash [:fluid]}
   [sco/image
    [:img {:src "/images/ubuntu.png"}]]
   [sco/content
    [sco/header "Ubuntu"]
    [sco/s-meta "Started 2004"]
    [sco/description
     "Debian-based Linux operating system"]]
   [sco/content-extra
    [:a {:href   "https://wiki.ubuntu.com/Releases"
         :target "_blank"}
     [se/icon-linux]
     "Releases"]]
   ])

(defcard-doc
  (mkdn-pprint-source variation-fluid))

(defcard-rg
  [variation-fluid])


(defcard-doc
  "## centered"
  (list-keys "centered"))

(defn variation-centered []
  [sv/card {:ash [:centered]}
   [sco/image
    [:img {:src "/images/ubuntu.png"}]]
   [sco/content
    [sco/header "Ubuntu"]
    [sco/s-meta "Started 2004"]
    [sco/description
     "Debian-based Linux operating system"]]
   [sco/content-extra
    [:a {:href   "https://wiki.ubuntu.com/Releases"
         :target "_blank"}
     [se/icon-linux]
     "Releases"]]
   ])

(defcard-doc
  (mkdn-pprint-source variation-centered))

(defcard-rg
  [variation-centered])


(defcard-doc
  "## raised"
  (list-keys "raised"))

(defn variation-raised []
  [sv/card {:ash [:raised]}
   [sco/image
    [:img {:src "/images/ubuntu.png"}]]
   [sco/content
    [sco/header "Ubuntu"]
    [sco/s-meta "Started 2004"]
    [sco/description
     "Debian-based Linux operating system"]]
   [sco/content-extra
    [:a {:href   "https://wiki.ubuntu.com/Releases"
         :target "_blank"}
     [se/icon-linux]
     "Releases"]]
   ])

(defcard-doc
  (mkdn-pprint-source variation-raised))

(defcard-rg
  [variation-raised])


(defcard-doc
  "## link"
  (list-keys "link"))

(defn variation-link []
  [sv/card {:ash [:link]}
   [sco/image
    [:img {:src "/images/ubuntu.png"}]]
   [sco/content
    [sco/header "Ubuntu"]
    [sco/s-meta "Started 2004"]
    [sco/description
     "Debian-based Linux operating system"]]
   [sco/content-extra
    [:a {:href   "https://wiki.ubuntu.com/Releases"
         :target "_blank"}
     [se/icon-linux]
     "Releases"]]
   ])

(defcard-doc
  (mkdn-pprint-source variation-link))

(defcard-rg
  [variation-link])


;; TODO: floated content
;; TODO: text alignment


(defcard-doc
  "## colored"
  (list-keys "colored"))

(defn variation-colored []
  [sv/cards {:ash [:four]}
   [sco/card-link {:ash [:red]}
    [sco/image
     [:img {:src "/images/square-image.png"}]]]

   [sco/card-link {:ash [:orange]}
    [sco/image
     [:img {:src "/images/square-image.png"}]]]

   [sco/card-link {:ash [:yellow]}
    [sco/image
     [:img {:src "/images/square-image.png"}]]]

   [sco/card-link {:ash [:olive]}
    [sco/image
     [:img {:src "/images/square-image.png"}]]]

   [sco/card-link {:ash [:green]}
    [sco/image
     [:img {:src "/images/square-image.png"}]]]

   [sco/card-link {:ash [:teal]}
    [sco/image
     [:img {:src "/images/square-image.png"}]]]

   [sco/card-link {:ash [:blue]}
    [sco/image
     [:img {:src "/images/square-image.png"}]]]

   [sco/card-link {:ash [:violet]}
    [sco/image
     [:img {:src "/images/square-image.png"}]]]

   [sco/card-link {:ash [:purple]}
    [sco/image
     [:img {:src "/images/square-image.png"}]]]

   [sco/card-link {:ash [:pink]}
    [sco/image
     [:img {:src "/images/square-image.png"}]]]

   [sco/card-link {:ash [:brown]}
    [sco/image
     [:img {:src "/images/square-image.png"}]]]

   [sco/card-link {:ash [:grey]}
    [sco/image
     [:img {:src "/images/square-image.png"}]]]

   [sco/card-link {:ash [:black]}
    [sco/image
     [:img {:src "/images/square-image.png"}]]]
   ])

(defcard-doc
  (mkdn-pprint-source variation-colored))

(defcard-rg
  [variation-colored])



(defcard-doc
  "## column count"
  (list-cards-keys "count"))

(defn variation-count []
  [sv/cards {:ash [:three]}
   [sco/card
    [sco/image
     [:img {:src "/images/square-image.png"}]]]

   [sco/card
    [sco/image
     [:img {:src "/images/square-image.png"}]]]

   [sco/card
    [sco/image
     [:img {:src "/images/square-image.png"}]]]

   [sco/card
    [sco/image
     [:img {:src "/images/square-image.png"}]]]

   [sco/card
    [sco/image
     [:img {:src "/images/square-image.png"}]]]

   [sco/card
    [sco/image
     [:img {:src "/images/square-image.png"}]]]
   ])

(defcard-doc
  (mkdn-pprint-source variation-count))

(defcard-rg
  [variation-count])


(defcard-doc
  "## stackable"
  (list-cards-keys "stackable"))

(defn variation-stackable []
  [sv/cards {:ash [:three
                   :stackable]}
   [sco/card
    [sco/image
     [:img {:src "/images/square-image.png"}]]]

   [sco/card
    [sco/image
     [:img {:src "/images/square-image.png"}]]]

   [sco/card
    [sco/image
     [:img {:src "/images/square-image.png"}]]]

   [sco/card
    [sco/image
     [:img {:src "/images/square-image.png"}]]]

   [sco/card
    [sco/image
     [:img {:src "/images/square-image.png"}]]]

   [sco/card
    [sco/image
     [:img {:src "/images/square-image.png"}]]]
   ])

(defcard-doc
  (mkdn-pprint-source variation-stackable))

(defcard-rg
  [variation-stackable])


(defcard-doc
  "## doubling"
  (list-cards-keys "doubling"))

(defn variation-doubling []
  [sv/cards {:ash [:three
                   :doubling]}
   [sco/card
    [sco/image
     [:img {:src "/images/square-image.png"}]]]

   [sco/card
    [sco/image
     [:img {:src "/images/square-image.png"}]]]

   [sco/card
    [sco/image
     [:img {:src "/images/square-image.png"}]]]

   [sco/card
    [sco/image
     [:img {:src "/images/square-image.png"}]]]

   [sco/card
    [sco/image
     [:img {:src "/images/square-image.png"}]]]

   [sco/card
    [sco/image
     [:img {:src "/images/square-image.png"}]]]
   ])

(defcard-doc
  (mkdn-pprint-source variation-doubling))

(defcard-rg
  [variation-doubling])
