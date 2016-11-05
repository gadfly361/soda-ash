(ns soda-ash.elements.icon-card
  (:require-macros
   [devcards.core :refer [defcard-doc
                          defcard-rg
                          mkdn-pprint-source]])
  (:require
   [devcards.core]
   [reagent.core]
   [soda-ash.element :as se]
   [soda-ash.helpers :as h]
   [soda-ash.elements.icon :as icon]))


(def list-keys
  (h/list-keys icon/variations))


(defcard-doc
  (h/devcard-docs icon/opts))

(defcard-doc
  "Require the following:
   ```
  [soda-ash.element :as se]
  ```")


;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;
;; Types

(defcard-doc
  "
---
# Icon Types"
  (h/list-types icon/opts))


(defcard-doc
  "**Icons**")

(defn type-alarm []
  [se/icon-alarm])

(defcard-doc
  (mkdn-pprint-source type-alarm))

(defcard-rg icons
  [:div
   [type-alarm]
   [se/icon-alarm-slash]
   [se/icon-alarm-outline]
   [se/icon-alarm-slash-outline]
   [se/icon-at]
   [se/icon-browser]
   [se/icon-bug]
   [se/icon-calendar-outline]
   [se/icon-calendar]
   [se/icon-cloud]
   [se/icon-comment]
   [se/icon-comments]
   [se/icon-comment-outline]
   [se/icon-comments-outline]
   [se/icon-copyright]
   [se/icon-dashboard]
   [se/icon-dropdown]
   [se/icon-external-square]
   [se/icon-external]
   [se/icon-eyedropper]
   [se/icon-feed]
   [se/icon-find]
   [se/icon-heartbeat]
   [se/icon-history]
   [se/icon-home]
   [se/icon-idea]
   [se/icon-inbox]
   [se/icon-lab]
   [se/icon-mail]
   [se/icon-mail-outline]
   [se/icon-mail-square]
   [se/icon-map]
   [se/icon-options]
   [se/icon-paint-brush]
   [se/icon-payment]
   [se/icon-phone]
   [se/icon-phone-square]
   [se/icon-privacy]
   [se/icon-protect]
   [se/icon-search]
   [se/icon-setting]
   [se/icon-settings]
   [se/icon-shop]
   [se/icon-sidebar]
   [se/icon-signal]
   [se/icon-sitemap]
   [se/icon-tag]
   [se/icon-tags]
   [se/icon-tasks]
   [se/icon-terminal]
   [se/icon-text-telephone]
   [se/icon-ticket]
   [se/icon-trophy]
   [se/icon-wifi]

   [se/icon-adjust]
   [se/icon-add-user]
   [se/icon-add-to-cart]
   [se/icon-archive]
   [se/icon-ban]
   [se/icon-bookmark]
   [se/icon-call]
   [se/icon-call-square]
   [se/icon-cloud-download]
   [se/icon-cloud-upload]
   [se/icon-compress]
   [se/icon-configure]
   [se/icon-download]
   [se/icon-edit]
   [se/icon-erase]
   [se/icon-exchange]
   [se/icon-external-share]
   [se/icon-expand]
   [se/icon-filter]
   [se/icon-flag]
   [se/icon-flag-outline]
   [se/icon-forward-mail]
   [se/icon-hide]
   [se/icon-in-cart]
   [se/icon-lock]
   [se/icon-pin]
   [se/icon-print]
   [se/icon-random]
   [se/icon-recycle]
   [se/icon-refresh]
   [se/icon-remove-bookmark]
   [se/icon-remove-user]
   [se/icon-repeat]
   [se/icon-reply-all]
   [se/icon-reply]
   [se/icon-retweet]
   [se/icon-send]
   [se/icon-send-outline]
   [se/icon-share-alternate]
   [se/icon-share-alternate-square]
   [se/icon-share]
   [se/icon-share-square]
   [se/icon-sign-in]
   [se/icon-sign-out]
   [se/icon-theme]
   [se/icon-translate]
   [se/icon-undo]
   [se/icon-unhide]
   [se/icon-unlock-alternate]
   [se/icon-unlock]
   [se/icon-upload]
   [se/icon-wait]
   [se/icon-wizard]
   [se/icon-write]
   [se/icon-write-square]

   [se/icon-announcement]
   [se/icon-birthday]
   [se/icon-help]
   [se/icon-help-circle]
   [se/icon-info]
   [se/icon-info-circle]
   [se/icon-warning]
   [se/icon-warning-circle]
   [se/icon-warning-sign]

   [se/icon-child]
   [se/icon-doctor]
   [se/icon-handicap]
   [se/icon-spy]
   [se/icon-student]
   [se/icon-user]
   [se/icon-users]

   [se/icon-female]
   [se/icon-gay]
   [se/icon-heterosexual]
   [se/icon-intergender]
   [se/icon-lesbian]
   [se/icon-male]
   [se/icon-man]
   [se/icon-neuter]
   [se/icon-non-binary-transgender]
   [se/icon-transgender]
   [se/icon-other-gender]
   [se/icon-other-gender-horizontal]
   [se/icon-other-gender-vertical]
   [se/icon-woman]

   [se/icon-grid-layout]
   [se/icon-list-layout]
   [se/icon-block-layout]
   [se/icon-zoom]
   [se/icon-zoom-out]
   [se/icon-resize-vertical]
   [se/icon-resize-horizontal]
   [se/icon-maximize]
   [se/icon-crop]

   [se/icon-anchor]
   [se/icon-bar]
   [se/icon-bomb]
   [se/icon-book]
   [se/icon-bullseye]
   [se/icon-calculator]
   [se/icon-checkered-flag]
   [se/icon-cocktail]
   [se/icon-diamond]
   [se/icon-fax]
   [se/icon-fire-extinguisher]
   [se/icon-fire]
   [se/icon-gift]
   [se/icon-leaf]
   [se/icon-legal]
   [se/icon-lemon]
   [se/icon-life-ring]
   [se/icon-lightning]
   [se/icon-magnet]
   [se/icon-money]
   [se/icon-moon]
   [se/icon-plane]
   [se/icon-puzzle]
   [se/icon-rain]
   [se/icon-road]
   [se/icon-rocket]
   [se/icon-shipping]
   [se/icon-soccer]
   [se/icon-suitcase]
   [se/icon-sun]
   [se/icon-travel]
   [se/icon-treatment]
   [se/icon-world]

   [se/icon-asterisk]
   [se/icon-certificate]
   [se/icon-circle]
   [se/icon-circle-notched]
   [se/icon-circle-thin]
   [se/icon-crosshairs]
   [se/icon-cube]
   [se/icon-cubes]
   [se/icon-ellipsis-horizontal]
   [se/icon-ellipsis-vertical]
   [se/icon-quote-left]
   [se/icon-quote-right]
   [se/icon-spinner]
   [se/icon-square]
   [se/icon-square-outline]

   [se/icon-add-circle]
   [se/icon-add-square]
   [se/icon-check-circle]
   [se/icon-check-circle-outline]
   [se/icon-check-square]
   [se/icon-checkmark-box]
   [se/icon-checkmark]
   [se/icon-minus-circle]
   [se/icon-minus]
   [se/icon-minus-square]
   [se/icon-minus-square-outline]
   [se/icon-move]
   [se/icon-plus]
   [se/icon-plus-square-outline]
   [se/icon-radio]
   [se/icon-remove-circle]
   [se/icon-remove-circle-outline]
   [se/icon-remove]
   [se/icon-selected-radio]
   [se/icon-toggle-off]
   [se/icon-toggle-on]

   [se/icon-area-chart]
   [se/icon-bar-chart]
   [se/icon-camera-retro]
   [se/icon-newspaper]
   [se/icon-film]
   [se/icon-line-chart]
   [se/icon-photo]
   [se/icon-pie-chart]
   [se/icon-sound]

   [se/icon-angle-double-down]
   [se/icon-angle-double-left]
   [se/icon-angle-double-right]
   [se/icon-angle-double-up]
   [se/icon-angle-down]
   [se/icon-angle-left]
   [se/icon-angle-right]
   [se/icon-angle-up]
   [se/icon-arrow-circle-down]
   [se/icon-arrow-circle-left]
   [se/icon-arrow-circle-outline-down]
   [se/icon-arrow-circle-outline-left]
   [se/icon-arrow-circle-outline-right]
   [se/icon-arrow-circle-outline-up]
   [se/icon-arrow-circle-right]
   [se/icon-arrow-circle-up]
   [se/icon-arrow-down]
   [se/icon-arrow-left]
   [se/icon-arrow-right]
   [se/icon-arrow-up]
   [se/icon-caret-down]
   [se/icon-caret-left]
   [se/icon-caret-right]
   [se/icon-caret-up]
   [se/icon-chevron-circle-down]
   [se/icon-chevron-circle-left]
   [se/icon-chevron-circle-right]
   [se/icon-chevron-circle-up]
   [se/icon-chevron-down]
   [se/icon-chevron-left]
   [se/icon-chevron-right]
   [se/icon-chevron-up]
   [se/icon-long-arrow-down]
   [se/icon-long-arrow-left]
   [se/icon-long-arrow-right]
   [se/icon-long-arrow-up]
   [se/icon-pointing-down]
   [se/icon-pointing-left]
   [se/icon-pointing-right]
   [se/icon-pointing-up]
   [se/icon-toggle-down]
   [se/icon-toggle-left]
   [se/icon-toggle-right]
   [se/icon-toggle-up]

   [se/icon-desktop]
   [se/icon-disk-outline]
   [se/icon-file-archive-outline]
   [se/icon-file-audio-outline]
   [se/icon-file-code-outline]
   [se/icon-file-excel-outline]
   [se/icon-file]
   [se/icon-file-image-outline]
   [se/icon-file-outline]
   [se/icon-file-pdf-outline]
   [se/icon-file-powerpoint-outline]
   [se/icon-file-text]
   [se/icon-file-text-outline]
   [se/icon-file-video-outline]
   [se/icon-file-word-outline]
   [se/icon-folder]
   [se/icon-folder-open]
   [se/icon-folder-open-outline]
   [se/icon-folder-outline]
   [se/icon-game]
   [se/icon-keyboard]
   [se/icon-laptop]
   [se/icon-level-down]
   [se/icon-level-up]
   [se/icon-mobile]
   [se/icon-power]
   [se/icon-plug]
   [se/icon-tablet]
   [se/icon-trash]
   [se/icon-trash-outline]

   [se/icon-barcode]
   [se/icon-css3]
   [se/icon-database]
   [se/icon-fork]
   [se/icon-html5]
   [se/icon-openid]
   [se/icon-qrcode]
   [se/icon-rss]
   [se/icon-rss-square]
   [se/icon-server]

   [se/icon-empty-heart]
   [se/icon-empty-star]
   [se/icon-frown]
   [se/icon-heart]
   [se/icon-meh]
   [se/icon-smile]
   [se/icon-star-half-empty]
   [se/icon-star-half]
   [se/icon-star]
   [se/icon-thumbs-down]
   [se/icon-thumbs-outline-down]
   [se/icon-thumbs-outline-up]
   [se/icon-thumbs-up]

   [se/icon-backward]
   [se/icon-eject]
   [se/icon-fast-backward]
   [se/icon-fast-forward]
   [se/icon-forward]
   [se/icon-music]
   [se/icon-mute]
   [se/icon-pause]
   [se/icon-play]
   [se/icon-record]
   [se/icon-step-backward]
   [se/icon-step-forward]
   [se/icon-stop]
   [se/icon-unmute]
   [se/icon-video-play]
   [se/icon-video-play-outline]
   [se/icon-volume-down]
   [se/icon-volume-off]
   [se/icon-volume-up]

   [se/icon-building]
   [se/icon-building-outline]
   [se/icon-car]
   [se/icon-coffee]
   [se/icon-emergency]
   [se/icon-first-aid]
   [se/icon-food]
   [se/icon-h]
   [se/icon-hospital]
   [se/icon-location-arrow]
   [se/icon-marker]
   [se/icon-military]
   [se/icon-paw]
   [se/icon-space-shuttle]
   [se/icon-spoon]
   [se/icon-taxi]
   [se/icon-tree]
   [se/icon-university]

   [se/icon-columns]
   [se/icon-sort-alphabet-ascending]
   [se/icon-sort-alphabet-descending]
   [se/icon-sort-ascending]
   [se/icon-sort-content-ascending]
   [se/icon-sort-content-descending]
   [se/icon-sort-descending]
   [se/icon-sort]
   [se/icon-sort-numeric-ascending]
   [se/icon-sort-numeric-descending]
   [se/icon-table]

   [se/icon-align-center]
   [se/icon-align-justify]
   [se/icon-align-left]
   [se/icon-align-right]
   [se/icon-attach]
   [se/icon-bold]
   [se/icon-copy]
   [se/icon-cut]
   [se/icon-font]
   [se/icon-header]
   [se/icon-indent]
   [se/icon-italic]
   [se/icon-linkify]
   [se/icon-list]
   [se/icon-ordered-list]
   [se/icon-outdent]
   [se/icon-paragraph]
   [se/icon-paste]
   [se/icon-save]
   [se/icon-strikethrough]
   [se/icon-subscript]
   [se/icon-superscript]
   [se/icon-text-height]
   [se/icon-text-width]
   [se/icon-underline]
   [se/icon-unlink]
   [se/icon-unordered-list]

   [se/icon-dollar]
   [se/icon-euro]
   [se/icon-lira]
   [se/icon-pound]
   [se/icon-ruble]
   [se/icon-rupee]
   [se/icon-won]
   [se/icon-shekel]
   [se/icon-yen]

   [se/icon-american-express]
   [se/icon-discover]
   [se/icon-google-wallet]
   [se/icon-mastercard]
   [se/icon-paypal-card]
   [se/icon-paypal]
   [se/icon-stripe]
   [se/icon-visa]

   [se/icon-adn]
   [se/icon-android]
   [se/icon-angellist]
   [se/icon-apple]
   [se/icon-behance]
   [se/icon-behance-square]
   [se/icon-bitbucket]
   [se/icon-bitbucket-square]
   [se/icon-bitcoin]
   [se/icon-buysellads]
   [se/icon-codepen]
   [se/icon-connectdevelop]
   [se/icon-dashcube]
   [se/icon-delicious]
   [se/icon-deviantart]
   [se/icon-digg]
   [se/icon-dribbble]
   [se/icon-dropbox]
   [se/icon-drupal]
   [se/icon-empire]
   [se/icon-facebook]
   [se/icon-facebook-square]
   [se/icon-flickr]
   [se/icon-forumbee]
   [se/icon-foursquare]
   [se/icon-git]
   [se/icon-git-square]
   [se/icon-github-alternate]
   [se/icon-github]
   [se/icon-github-square]
   [se/icon-gittip]
   [se/icon-google]
   [se/icon-google-plus]
   [se/icon-google-plus-square]
   [se/icon-hacker-news]
   [se/icon-instagram]
   [se/icon-ioxhost]
   [se/icon-joomla]
   [se/icon-jsfiddle]
   [se/icon-lastfm]
   [se/icon-lastfm-square]
   [se/icon-leanpub]
   [se/icon-linkedin]
   [se/icon-linkedin-square]
   [se/icon-linux]
   [se/icon-maxcdn]
   [se/icon-meanpath]
   [se/icon-medium]
   [se/icon-pagelines]
   [se/icon-pied-piper-alternate]
   [se/icon-pied-piper]
   [se/icon-pinterest]
   [se/icon-pinterest-square]
   [se/icon-qq]
   [se/icon-rebel]
   [se/icon-reddit]
   [se/icon-reddit-square]
   [se/icon-renren]
   [se/icon-sellsy]
   [se/icon-shirtsinbulk]
   [se/icon-simplybuilt]
   [se/icon-skyatlas]
   [se/icon-skype]
   [se/icon-slack]
   [se/icon-slideshare]
   [se/icon-soundcloud]
   [se/icon-spotify]
   [se/icon-stack-exchange]
   [se/icon-stack-overflow]
   [se/icon-steam]
   [se/icon-steam-square]
   [se/icon-stumbleupon-circle]
   [se/icon-stumbleupon]
   [se/icon-tencent-weibo]
   [se/icon-trello]
   [se/icon-tumblr]
   [se/icon-tumblr-square]
   [se/icon-twitch]
   [se/icon-twitter]
   [se/icon-twitter-square]
   [se/icon-viacoin]
   [se/icon-vimeo]
   [se/icon-vine]
   [se/icon-vk]
   [se/icon-wechat]
   [se/icon-weibo]
   [se/icon-whatsapp]
   [se/icon-windows]
   [se/icon-wordpress]
   [se/icon-xing]
   [se/icon-xing-square]
   [se/icon-yahoo]
   [se/icon-yelp]
   [se/icon-youtube]
   [se/icon-youtube-play]
   [se/icon-youtube-square]
   ])



;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;
;; States

(defcard-doc
  "
---
# States"
  (list-keys "states"))


(defcard-doc
  "**Disabled**"
  "An icon can show that it is disabled")

(defn state-disabled []
  [se/icon-alarm {:data-soda :disabled}])

(defcard-doc
  (mkdn-pprint-source state-disabled))

(defcard-rg disabled
  [state-disabled])



(defcard-doc
  "**Loading**"
  "An icon be used as a simple loader")

(defn state-loading []
  [se/icon-alarm {:data-soda :loading}])

(defcard-doc
  (mkdn-pprint-source state-loading))

(defcard-rg loading
  [state-loading])



;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;
;; Variations

(defcard-doc
  "
---
# Icon Variations")



(defcard-doc
  "**Fitted**"
  "An icon can be fitted, without any space to the left or right of
  it"
  (list-keys "fitted"))

(defn fitted []
  [:div
   "Tigh spacing "
   [se/icon-alarm {:data-ash [:fitted]}]
   " tight spacing"
   ])

(defcard-doc
  (mkdn-pprint-source fitted))

(defcard-rg fitted
  [fitted])



(defcard-doc
  "**Size**"
  "An icon can vary in size"
  (list-keys "size"))

(defn size-mini []
  [se/icon-alarm {:data-ash [:mini]}])

(defcard-doc
  (mkdn-pprint-source size-mini))

(defcard-rg size
  [:div
   [size-mini]
   [se/icon-alarm {:data-ash [:tiny]}]
   [se/icon-alarm {:data-ash [:small]}]
   [se/icon-alarm]
   [se/icon-alarm {:data-ash [:large]}]
   [se/icon-alarm {:data-ash [:big]}]
   [se/icon-alarm {:data-ash [:huge]}]
   [se/icon-alarm {:data-ash [:massive]}]])



(defcard-doc
  "**Link**"
  "An icon can be formatted as a link"
  (list-keys "link"))

(defn link []
  [se/icon-alarm {:data-ash [:link]}])

(defcard-doc
  (mkdn-pprint-source link))

(defcard-rg link
  [link])



(defcard-doc
  "**Flipped**"
  "An icon can be flipped"
  (list-keys "flipped"))

(defn flipped []
  [:div
   [se/icon-in-cart]
   [se/icon-in-cart {:data-ash [:horizontally-flipped]}]
   [se/icon-in-cart {:data-ash [:vertically-flipped]}]])

(defcard-doc
  (mkdn-pprint-source flipped))

(defcard-rg flipped
  [flipped])



(defcard-doc
  "**Rotated**"
  "An icon can be rotated"
  (list-keys "rotated"))

(defn rotated []
  [:div
   [se/icon-in-cart]
   [se/icon-in-cart {:data-ash [:clockwise-rotated]}]
   [se/icon-in-cart {:data-ash [:counterclockwise-rotated]}]])

(defcard-doc
  (mkdn-pprint-source rotated))

(defcard-rg rotated
  [rotated])



(defcard-doc
  "**Circular**"
  "An icon can be formatted to appear circular"
  (list-keys "circular"))

(defn circular []
  [se/icon-in-cart {:data-ash [:circular]}])

(defcard-doc
  (mkdn-pprint-source circular))

(defcard-rg circular
  [circular])



(defcard-doc
  "**Bordered**"
  "An icon can be formatted to appear bordered"
  (list-keys "bordered"))

(defn bordered []
  [se/icon-in-cart {:data-ash [:bordered]}])

(defcard-doc
  (mkdn-pprint-source bordered))

(defcard-rg borderd
  [bordered])



(defcard-doc
  "**Colored**"
  "An icon can be formatted with different colors"
  (list-keys "colored"))

(defn colored-red []
  [se/icon-in-cart {:data-ash [:red]}])

(defcard-doc
  (mkdn-pprint-source colored-red))

(defcard-rg colored
  [:div
   [colored-red]
   [se/icon-in-cart {:data-ash [:orange]}]
   [se/icon-in-cart {:data-ash [:yellow]}]
   [se/icon-in-cart {:data-ash [:olive]}]
   [se/icon-in-cart {:data-ash [:green]}]
   [se/icon-in-cart {:data-ash [:teal]}]
   [se/icon-in-cart {:data-ash [:blue]}]
   [se/icon-in-cart {:data-ash [:violet]}]
   [se/icon-in-cart {:data-ash [:purple]}]
   [se/icon-in-cart {:data-ash [:pink]}]
   [se/icon-in-cart {:data-ash [:brown]}]
   [se/icon-in-cart {:data-ash [:grey]}]
   [se/icon-in-cart {:data-ash [:black]}]
   ])



(defcard-doc
  "**Inverted**"
  "An icon can have its colors inverted for contrast"
  (list-keys "inverted"))

(defn inverted []
  [se/segment {:data-ash [:inverted]}
   [se/icon-in-cart {:data-ash [:inverted :inverted]}]
   [se/icon-in-cart {:data-ash [:inverted :orange]}]
   [se/icon-in-cart {:data-ash [:inverted :yellow]}]
   [se/icon-in-cart {:data-ash [:inverted :olive]}]
   [se/icon-in-cart {:data-ash [:inverted :green]}]
   [se/icon-in-cart {:data-ash [:inverted :teal]}]
   [se/icon-in-cart {:data-ash [:inverted :blue]}]
   [se/icon-in-cart {:data-ash [:inverted :violet]}]
   [se/icon-in-cart {:data-ash [:inverted :purple]}]
   [se/icon-in-cart {:data-ash [:inverted :pink]}]
   [se/icon-in-cart {:data-ash [:inverted :brown]}]
   [se/icon-in-cart {:data-ash [:inverted :grey]}]
   [se/icon-in-cart {:data-ash [:inverted :black]}]
   ])

(defcard-doc
  (mkdn-pprint-source inverted))

(defcard-rg inverted
  [inverted])



(defcard-doc
  "**Corner**"
  "A group of icons can display a smaller icon"
  (list-keys "corner"))

(defn corner []
  [se/header-h2
   [se/icons {:data-ash [:large]}
    [se/icon-twitter]
    [se/icon-plus {:data-ash [:inverted
                         :corner]}]]
   "Add on Twitter"])

(defcard-doc
  (mkdn-pprint-source corner))

(defcard-rg corner
  [corner])
