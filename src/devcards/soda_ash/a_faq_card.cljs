(ns soda-ash.a-faq-card
  (:require-macros [devcards.core :refer [defcard-doc
                                          defcard-rg
                                          mkdn-pprint-source]])
  (:require [devcards.core]
            [devcards.util.edn-renderer :as edn]
            [reagent.core :as reagent]
            [soda-ash.element :as s]))


(defcard-doc
  "
[back](#!/soda_ash.an_overview_card)

#  What is soda-ash?

Soda-ash is an interface between clojurescript's
[reagent](https://github.com/reagent-project/reagent) and [Semantic
UI](http://semantic-ui.com/).

# What is `:soda`?

`:soda` is a special attribute that is *added* to the normal attribute
map, and **replaces** the `:class` attribute. `:soda` takes a hash-map
of unordered key-value pairs.

For example, let's take a look at an image.")

(defn image []
  [s/image {:soda {:size :small} ;; <-- attention
            :src "images/wireframe/image.png"}]

  ;; <img src="images/wireframe/image.png" class="ui small image">
  )

(defcard-rg
  [image])

(defcard-doc
  (mkdn-pprint-source image)
  "
As you can see, `:soda` is added to the normal attribute map.  The
resulting class is `ui small image`. This is because the base class
for the `s/image` element is `ui small` and the `{:size :small}` soda
adds the `small` class.

# How does the attribute map work with `:soda`?

Continuing with the image example above, `:src` or any other normal
attribute is defined *alongside* `:soda` and not inside `:soda`'s
hash-map.  For example, the following **does not** work.
  ")

(defn image-bad []
  [s/image {:soda {:size :small
                   :src "images/wireframe/image.png"  ;; <-- attention (don't do this)
                   }}])

(defcard-doc
  (mkdn-pprint-source image-bad)
  "
This will not render. Instead, soda-ash will throw an error letting
you know the key-value pair that isn't accepted.  If you open up the
browser's console, you will see the following error message.

```
Uncaught Error: Soda-ash :src images/wireframe/image.png doesn't exist for image element
```
  ")


(defcard-doc
  "
# If `:soda` replaces `:class`, how do I add my own class?

Soda-ash gives you an escape hatch to add your own class, with `:add-class`.
")


(defn image-add-class []
  [s/image {:soda {:size :small
                   :add-class "gadfly"} ;; <-- attention
            :src "images/wireframe/image.png"}]

  ;; <img src="images/wireframe/image.png" class="ui small gadfly image">
  )

(defcard-doc
  (mkdn-pprint-source image-add-class))


(defcard-doc
  "
# How do I make soda-ash reactive?

By default, soda-ash is **not** reactive.  The `:soda`
hash-map replaces `:class` when the component <u>*mounts*</u>, and will
**not** update on render.

To make soda-ash reactive, you need to add `:ratom` and `:path` to your `:soda`.
")

(defonce app-state (reagent/atom {}))

(defn image-reactive []
  [s/image {:soda {:ratom app-state ;; <-- attention
                   :path :foo ;; <-- attention
                   :size :small}
            :src "images/wireframe/image.png"}])

(defn wrap-element [ratom element]
  [:div
   (if (vector? element) element [element])
   [:div [:strong "app-state"]]
   (edn/html-edn @ratom)])

(defcard-doc
  (mkdn-pprint-source app-state)
  (mkdn-pprint-source image-reactive))

(defcard-rg
  [wrap-element app-state
   [image-reactive]])

(defn size->tiny []
  [s/button {:on-click #(swap! app-state assoc-in [:foo :soda :size] :tiny)}
   "tiny"])

(defn size->small []
  [s/button {:on-click #(swap! app-state assoc-in [:foo :soda :size] :small)}
   "Small"])

(defcard-doc
  "
As you can see, your `:soda` is added to your `:ratom` (i.e.,
`app-state`) at the specified `:path` (i.e., `:foo`). Now your element
is reactive! If you `swap!` your `:soda` in the ratom, the element's
class will update.
"
  (mkdn-pprint-source size->tiny)
  (mkdn-pprint-source size->small))

(defcard-rg
  [wrap-element app-state
   [:div
    [image-reactive]
    [:br]
    [size->tiny]
    [size->small]]])


(defcard-doc
  "
# How do I read the docs?

Let's look at a subset of the docs for the `image` element:

---
# image

* **base class** ui image
* **default tag** :img
* **:state** :hidden | :disabled
* **variations**
    :rounded? | :size |

where

* **:size** :mini | :tiny | :small | :medium | :large | :big | :huge | :massive

---

* The **base class** let's you know what the class will be if you
don't pass in any `:soda` to the attribute map.
* Every element has a tag. You can set this by passing `:tag` to your
  `:soda` (i.e., `{:soda {:tag :div}}`). However, if`:tag` is not set,
  then it will revert to the **default tag**.
* Many elements can have `:state`. For example `{:soda {:state :disabled}}`.
* Most elements have variations.  For example, an image can be rounded
  and vary in size `{:soda {:rounded? true :size :massive}}`

# What is `h/fake-content` in the docs?

A lot of elements need some content to look as intended ... so
`h/fake-content` is just some lorem ipsum.

```
(defn fake-content []
  [:div
   \"Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do
  eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim
  ad minim veniam, quis nostrud exercitation ullamco laboris nisi ut
  aliquip ex ea commodo consequat. Duis aute irure dolor in
  reprehenderit in voluptate velit esse cillum dolore eu fugiat nulla
  pariatur. Excepteur sint occaecat cupidatat non proident, sunt in
  culpa qui officia deserunt mollit anim id est laborum.\"])
```

# Do I always have to pass in an attribute map?

For the time being ... yes. :(

```
[s/button {} ;; <-- note the empty attribute map
  \"This works\"]
```

```
[s/button ;; <-- not the lack of attribute map
  \"This doesn't work\"]
```
  ")
