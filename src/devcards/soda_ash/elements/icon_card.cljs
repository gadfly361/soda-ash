(ns soda-ash.elements.icon-card
  (:require-macros
   [devcards.core :refer [defcard-doc
                          defcard-rg
                          mkdn-pprint-source]])
  (:require
   [reagent.core :as reagent]
   [soda-ash.core :as sa]
   [soda-ash.elements.icon :as icon]
   [clojure.string :as string]))


(defn list-keys [group-name]
  (->> icon/groups
       (filter #(= group-name
                   (:group-name %)))
       first
       :group-set
       (string/join ", ")))


(defcard-doc
  "# SUMMARY

  ## Types"
  "Go to `Types` section for the list"

  "## States (*soda*)"
  (list-keys "states")

  "## Variations (*ash*)"
  "### fitted"
  (list-keys "fitted")
  "### size"
  (list-keys "size")
  "### link"
  (list-keys "link")
  "### flipped"
  (list-keys "flipped")
  "### rotated"
  (list-keys "rotated")
  "### circular"
  (list-keys "circular")
  "### bordered"
  (list-keys "bordered")
  "### colored"
  (list-keys "colored")
  "### inverted"
  (list-keys "inverted")
  )



;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;
;; Types

(defcard-doc
  "
---
# Types"
  (list-keys "types"))


(defn type-alarm []
  [sa/icon-alarm])

(defcard-doc
  (mkdn-pprint-source type-alarm))

(defcard-rg
  [:div
   [type-alarm]
   [sa/icon-alarm-slash]
   [sa/icon-alarm-outline]
   [sa/icon-alarm-slash-outline]
   [sa/icon-at]
   [sa/icon-browser]
   [sa/icon-bug]
   [sa/icon-calendar-outline]
   [sa/icon-calendar]
   [sa/icon-cloud]
   [sa/icon-comment]
   [sa/icon-comments]
   [sa/icon-comment-outline]
   [sa/icon-comments-outline]
   [sa/icon-copyright]
   [sa/icon-dashboard]
   [sa/icon-dropdown]
   [sa/icon-external-square]
   [sa/icon-external]
   [sa/icon-eyedropper]
   [sa/icon-feed]
   [sa/icon-find]
   [sa/icon-heartbeat]
   [sa/icon-history]
   [sa/icon-home]
   [sa/icon-idea]
   [sa/icon-inbox]
   [sa/icon-lab]
   [sa/icon-mail]
   [sa/icon-mail-outline]
   [sa/icon-mail-square]
   [sa/icon-map]
   [sa/icon-options]
   [sa/icon-paint-brush]
   [sa/icon-payment]
   [sa/icon-phone]
   [sa/icon-phone-square]
   [sa/icon-privacy]
   [sa/icon-protect]
   [sa/icon-search]
   [sa/icon-setting]
   [sa/icon-settings]
   [sa/icon-shop]
   [sa/icon-sidebar]
   [sa/icon-signal]
   [sa/icon-sitemap]
   [sa/icon-tag]
   [sa/icon-tags]
   [sa/icon-tasks]
   [sa/icon-terminal]
   [sa/icon-text-telephone]
   [sa/icon-ticket]
   [sa/icon-trophy]
   [sa/icon-wifi]

   [sa/icon-adjust]
   [sa/icon-add-user]
   [sa/icon-add-to-cart]
   [sa/icon-archive]
   [sa/icon-ban]
   [sa/icon-bookmark]
   [sa/icon-call]
   [sa/icon-call-square]
   [sa/icon-cloud-download]
   [sa/icon-cloud-upload]
   [sa/icon-compress]
   [sa/icon-configure]
   [sa/icon-download]
   [sa/icon-edit]
   [sa/icon-erase]
   [sa/icon-exchange]
   [sa/icon-external-share]
   [sa/icon-expand]
   [sa/icon-filter]
   [sa/icon-flag]
   [sa/icon-flag-outline]
   [sa/icon-forward-mail]
   [sa/icon-hide]
   [sa/icon-in-cart]
   [sa/icon-lock]
   [sa/icon-pin]
   [sa/icon-print]
   [sa/icon-random]
   [sa/icon-recycle]
   [sa/icon-refresh]
   [sa/icon-remove-bookmark]
   [sa/icon-remove-user]
   [sa/icon-repeat]
   [sa/icon-reply-all]
   [sa/icon-reply]
   [sa/icon-retweet]
   [sa/icon-send]
   [sa/icon-send-outline]
   [sa/icon-share-alternate]
   [sa/icon-share-alternate-square]
   [sa/icon-share]
   [sa/icon-share-square]
   [sa/icon-sign-in]
   [sa/icon-sign-out]
   [sa/icon-theme]
   [sa/icon-translate]
   [sa/icon-undo]
   [sa/icon-unhide]
   [sa/icon-unlock-alternate]
   [sa/icon-unlock]
   [sa/icon-upload]
   [sa/icon-wait]
   [sa/icon-wizard]
   [sa/icon-write]
   [sa/icon-write-square]

   [sa/icon-announcement]
   [sa/icon-birthday]
   [sa/icon-help]
   [sa/icon-help-circle]
   [sa/icon-info]
   [sa/icon-info-circle]
   [sa/icon-warning]
   [sa/icon-warning-circle]
   [sa/icon-warning-sign]

   [sa/icon-child]
   [sa/icon-doctor]
   [sa/icon-handicap]
   [sa/icon-spy]
   [sa/icon-student]
   [sa/icon-user]
   [sa/icon-users]

   [sa/icon-female]
   [sa/icon-gay]
   [sa/icon-heterosexual]
   [sa/icon-intergender]
   [sa/icon-lesbian]
   [sa/icon-male]
   [sa/icon-man]
   [sa/icon-neuter]
   [sa/icon-non-binary-transgender]
   [sa/icon-transgender]
   [sa/icon-other-gender]
   [sa/icon-other-gender-horizontal]
   [sa/icon-other-gender-vertical]
   [sa/icon-woman]

   [sa/icon-grid-layout]
   [sa/icon-list-layout]
   [sa/icon-block-layout]
   [sa/icon-zoom]
   [sa/icon-zoom-out]
   [sa/icon-resize-vertical]
   [sa/icon-resize-horizontal]
   [sa/icon-maximize]
   [sa/icon-crop]

   [sa/icon-anchor]
   [sa/icon-bar]
   [sa/icon-bomb]
   [sa/icon-book]
   [sa/icon-bullseye]
   [sa/icon-calculator]
   [sa/icon-checkered-flag]
   [sa/icon-cocktail]
   [sa/icon-diamond]
   [sa/icon-fax]
   [sa/icon-fire-extinguisher]
   [sa/icon-fire]
   [sa/icon-gift]
   [sa/icon-leaf]
   [sa/icon-legal]
   [sa/icon-lemon]
   [sa/icon-life-ring]
   [sa/icon-lightning]
   [sa/icon-magnet]
   [sa/icon-money]
   [sa/icon-moon]
   [sa/icon-plane]
   [sa/icon-puzzle]
   [sa/icon-rain]
   [sa/icon-road]
   [sa/icon-rocket]
   [sa/icon-shipping]
   [sa/icon-soccer]
   [sa/icon-suitcase]
   [sa/icon-sun]
   [sa/icon-travel]
   [sa/icon-treatment]
   [sa/icon-world]

   [sa/icon-asterisk]
   [sa/icon-certificate]
   [sa/icon-circle]
   [sa/icon-circle-notched]
   [sa/icon-circle-thin]
   [sa/icon-crosshairs]
   [sa/icon-cube]
   [sa/icon-cubes]
   [sa/icon-ellipsis-horizontal]
   [sa/icon-ellipsis-vertical]
   [sa/icon-quote-left]
   [sa/icon-quote-right]
   [sa/icon-spinner]
   [sa/icon-square]
   [sa/icon-square-outline]

   [sa/icon-add-circle]
   [sa/icon-add-square]
   [sa/icon-check-circle]
   [sa/icon-check-circle-outline]
   [sa/icon-check-square]
   [sa/icon-checkmark-box]
   [sa/icon-checkmark]
   [sa/icon-minus-circle]
   [sa/icon-minus]
   [sa/icon-minus-square]
   [sa/icon-minus-square-outline]
   [sa/icon-move]
   [sa/icon-plus]
   [sa/icon-plus-square-outline]
   [sa/icon-radio]
   [sa/icon-remove-circle]
   [sa/icon-remove-circle-outline]
   [sa/icon-remove]
   [sa/icon-selected-radio]
   [sa/icon-toggle-off]
   [sa/icon-toggle-on]

   [sa/icon-area-chart]
   [sa/icon-bar-chart]
   [sa/icon-camera-retro]
   [sa/icon-newspaper]
   [sa/icon-film]
   [sa/icon-line-chart]
   [sa/icon-photo]
   [sa/icon-pie-chart]
   [sa/icon-sound]

   [sa/icon-angle-double-down]
   [sa/icon-angle-double-left]
   [sa/icon-angle-double-right]
   [sa/icon-angle-double-up]
   [sa/icon-angle-down]
   [sa/icon-angle-left]
   [sa/icon-angle-right]
   [sa/icon-angle-up]
   [sa/icon-arrow-circle-down]
   [sa/icon-arrow-circle-left]
   [sa/icon-arrow-circle-outline-down]
   [sa/icon-arrow-circle-outline-left]
   [sa/icon-arrow-circle-outline-right]
   [sa/icon-arrow-circle-outline-up]
   [sa/icon-arrow-circle-right]
   [sa/icon-arrow-circle-up]
   [sa/icon-arrow-down]
   [sa/icon-arrow-left]
   [sa/icon-arrow-right]
   [sa/icon-arrow-up]
   [sa/icon-caret-down]
   [sa/icon-caret-left]
   [sa/icon-caret-right]
   [sa/icon-caret-up]
   [sa/icon-chevron-circle-down]
   [sa/icon-chevron-circle-left]
   [sa/icon-chevron-circle-right]
   [sa/icon-chevron-circle-up]
   [sa/icon-chevron-down]
   [sa/icon-chevron-left]
   [sa/icon-chevron-right]
   [sa/icon-chevron-up]
   [sa/icon-long-arrow-down]
   [sa/icon-long-arrow-left]
   [sa/icon-long-arrow-right]
   [sa/icon-long-arrow-up]
   [sa/icon-pointing-down]
   [sa/icon-pointing-left]
   [sa/icon-pointing-right]
   [sa/icon-pointing-up]
   [sa/icon-toggle-down]
   [sa/icon-toggle-left]
   [sa/icon-toggle-right]
   [sa/icon-toggle-up]

   [sa/icon-desktop]
   [sa/icon-disk-outline]
   [sa/icon-file-archive-outline]
   [sa/icon-file-audio-outline]
   [sa/icon-file-code-outline]
   [sa/icon-file-excel-outline]
   [sa/icon-file]
   [sa/icon-file-image-outline]
   [sa/icon-file-outline]
   [sa/icon-file-pdf-outline]
   [sa/icon-file-powerpoint-outline]
   [sa/icon-file-text]
   [sa/icon-file-text-outline]
   [sa/icon-file-video-outline]
   [sa/icon-file-word-outline]
   [sa/icon-folder]
   [sa/icon-folder-open]
   [sa/icon-folder-open-outline]
   [sa/icon-folder-outline]
   [sa/icon-game]
   [sa/icon-keyboard]
   [sa/icon-laptop]
   [sa/icon-level-down]
   [sa/icon-level-up]
   [sa/icon-mobile]
   [sa/icon-power]
   [sa/icon-plug]
   [sa/icon-tablet]
   [sa/icon-trash]
   [sa/icon-trash-outline]

   [sa/icon-barcode]
   [sa/icon-css3]
   [sa/icon-database]
   [sa/icon-fork]
   [sa/icon-html5]
   [sa/icon-openid]
   [sa/icon-qrcode]
   [sa/icon-rss]
   [sa/icon-rss-square]
   [sa/icon-server]

   [sa/icon-empty-heart]
   [sa/icon-empty-star]
   [sa/icon-frown]
   [sa/icon-heart]
   [sa/icon-meh]
   [sa/icon-smile]
   [sa/icon-star-half-empty]
   [sa/icon-star-half]
   [sa/icon-star]
   [sa/icon-thumbs-down]
   [sa/icon-thumbs-outline-down]
   [sa/icon-thumbs-outline-up]
   [sa/icon-thumbs-up]

   [sa/icon-backward]
   [sa/icon-eject]
   [sa/icon-fast-backward]
   [sa/icon-fast-forward]
   [sa/icon-forward]
   [sa/icon-music]
   [sa/icon-mute]
   [sa/icon-pause]
   [sa/icon-play]
   [sa/icon-record]
   [sa/icon-step-backward]
   [sa/icon-step-forward]
   [sa/icon-stop]
   [sa/icon-unmute]
   [sa/icon-video-play]
   [sa/icon-video-play-outline]
   [sa/icon-volume-down]
   [sa/icon-volume-off]
   [sa/icon-volume-up]

   [sa/icon-building]
   [sa/icon-building-outline]
   [sa/icon-car]
   [sa/icon-coffee]
   [sa/icon-emergency]
   [sa/icon-first-aid]
   [sa/icon-food]
   [sa/icon-h]
   [sa/icon-hospital]
   [sa/icon-location-arrow]
   [sa/icon-marker]
   [sa/icon-military]
   [sa/icon-paw]
   [sa/icon-space-shuttle]
   [sa/icon-spoon]
   [sa/icon-taxi]
   [sa/icon-tree]
   [sa/icon-university]

   [sa/icon-columns]
   [sa/icon-sort-alphabet-ascending]
   [sa/icon-sort-alphabet-descending]
   [sa/icon-sort-ascending]
   [sa/icon-sort-content-ascending]
   [sa/icon-sort-content-descending]
   [sa/icon-sort-descending]
   [sa/icon-sort]
   [sa/icon-sort-numeric-ascending]
   [sa/icon-sort-numeric-descending]
   [sa/icon-table]

   [sa/icon-align-center]
   [sa/icon-align-justify]
   [sa/icon-align-left]
   [sa/icon-align-right]
   [sa/icon-attach]
   [sa/icon-bold]
   [sa/icon-copy]
   [sa/icon-cut]
   [sa/icon-font]
   [sa/icon-header]
   [sa/icon-indent]
   [sa/icon-italic]
   [sa/icon-linkify]
   [sa/icon-list]
   [sa/icon-ordered-list]
   [sa/icon-outdent]
   [sa/icon-paragraph]
   [sa/icon-paste]
   [sa/icon-save]
   [sa/icon-strikethrough]
   [sa/icon-subscript]
   [sa/icon-superscript]
   [sa/icon-text-height]
   [sa/icon-text-width]
   [sa/icon-underline]
   [sa/icon-unlink]
   [sa/icon-unordered-list]

   [sa/icon-dollar]
   [sa/icon-euro]
   [sa/icon-lira]
   [sa/icon-pound]
   [sa/icon-ruble]
   [sa/icon-rupee]
   [sa/icon-won]
   [sa/icon-shekel]
   [sa/icon-yen]

   [sa/icon-american-express]
   [sa/icon-discover]
   [sa/icon-google-wallet]
   [sa/icon-mastercard]
   [sa/icon-paypal-card]
   [sa/icon-paypal]
   [sa/icon-stripe]
   [sa/icon-visa]

   [sa/icon-adn]
   [sa/icon-android]
   [sa/icon-angellist]
   [sa/icon-apple]
   [sa/icon-behance]
   [sa/icon-behance-square]
   [sa/icon-bitbucket]
   [sa/icon-bitbucket-square]
   [sa/icon-bitcoin]
   [sa/icon-buysellads]
   [sa/icon-codepen]
   [sa/icon-connectdevelop]
   [sa/icon-dashcube]
   [sa/icon-delicious]
   [sa/icon-deviantart]
   [sa/icon-digg]
   [sa/icon-dribbble]
   [sa/icon-dropbox]
   [sa/icon-drupal]
   [sa/icon-empire]
   [sa/icon-facebook]
   [sa/icon-facebook-square]
   [sa/icon-flickr]
   [sa/icon-forumbee]
   [sa/icon-foursquare]
   [sa/icon-git]
   [sa/icon-git-square]
   [sa/icon-github-alternate]
   [sa/icon-github]
   [sa/icon-github-square]
   [sa/icon-gittip]
   [sa/icon-google]
   [sa/icon-google-plus]
   [sa/icon-google-plus-square]
   [sa/icon-hacker-news]
   [sa/icon-instagram]
   [sa/icon-ioxhost]
   [sa/icon-joomla]
   [sa/icon-jsfiddle]
   [sa/icon-lastfm]
   [sa/icon-lastfm-square]
   [sa/icon-leanpub]
   [sa/icon-linkedin]
   [sa/icon-linkedin-square]
   [sa/icon-linux]
   [sa/icon-maxcdn]
   [sa/icon-meanpath]
   [sa/icon-medium]
   [sa/icon-pagelines]
   [sa/icon-pied-piper-alternate]
   [sa/icon-pied-piper]
   [sa/icon-pinterest]
   [sa/icon-pinterest-square]
   [sa/icon-qq]
   [sa/icon-rebel]
   [sa/icon-reddit]
   [sa/icon-reddit-square]
   [sa/icon-renren]
   [sa/icon-sellsy]
   [sa/icon-shirtsinbulk]
   [sa/icon-simplybuilt]
   [sa/icon-skyatlas]
   [sa/icon-skype]
   [sa/icon-slack]
   [sa/icon-slideshare]
   [sa/icon-soundcloud]
   [sa/icon-spotify]
   [sa/icon-stack-exchange]
   [sa/icon-stack-overflow]
   [sa/icon-steam]
   [sa/icon-steam-square]
   [sa/icon-stumbleupon-circle]
   [sa/icon-stumbleupon]
   [sa/icon-tencent-weibo]
   [sa/icon-trello]
   [sa/icon-tumblr]
   [sa/icon-tumblr-square]
   [sa/icon-twitch]
   [sa/icon-twitter]
   [sa/icon-twitter-square]
   [sa/icon-viacoin]
   [sa/icon-vimeo]
   [sa/icon-vine]
   [sa/icon-vk]
   [sa/icon-wechat]
   [sa/icon-weibo]
   [sa/icon-whatsapp]
   [sa/icon-windows]
   [sa/icon-wordpress]
   [sa/icon-xing]
   [sa/icon-xing-square]
   [sa/icon-yahoo]
   [sa/icon-yelp]
   [sa/icon-youtube]
   [sa/icon-youtube-play]
   [sa/icon-youtube-square]
   ])



;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;
;; States

(defcard-doc
  "
---
# States"
  (list-keys "states"))


(defn state-disabled []
  [sa/icon-alarm {:soda :disabled}])

(defcard-doc
  (mkdn-pprint-source state-disabled))

(defcard-rg
  [state-disabled])


(defn state-loading []
  [sa/icon-alarm {:soda :loading}])

(defcard-doc
  (mkdn-pprint-source state-loading))

(defcard-rg
  [state-loading])



;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;
;; Variations

(defcard-doc
  "
---
# Variations")


;; ---------------------------
;; Fitted

(defcard-doc
  "## Fitted"
  (list-keys "fitted"))


(defn fitted []
  [:div
   "Tigh spacing "
   [sa/icon-alarm {:ash [:fitted]}]
   " tight spacing"
   ])

(defcard-doc
  (mkdn-pprint-source fitted))

(defcard-rg
  [fitted])


;; ---------------------------
;; Size

(defcard-doc
  "## Size"
  (list-keys "size"))

(defn size-mini []
  [sa/icon-alarm {:ash [:mini]}])

(defcard-doc
  (mkdn-pprint-source size-mini))

(defcard-rg
  [:div
   [size-mini]
   [sa/icon-alarm {:ash [:tiny]}]
   [sa/icon-alarm {:ash [:small]}]
   [sa/icon-alarm]
   [sa/icon-alarm {:ash [:large]}]
   [sa/icon-alarm {:ash [:big]}]
   [sa/icon-alarm {:ash [:huge]}]
   [sa/icon-alarm {:ash [:massive]}]])


;; ---------------------------
;; Link

(defcard-doc
  "## Link"
  (list-keys "link"))

(defn link []
  [sa/icon-alarm {:ash [:link]}])

(defcard-doc
  (mkdn-pprint-source link))

(defcard-rg
  [link])


;; ---------------------------
;; Flipped

(defcard-doc
  "## Flipped"
  (list-keys "flipped"))

(defn flipped []
  [:div
   [sa/icon-in-cart]
   [sa/icon-in-cart {:ash [:horizontally-flipped]}]
   [sa/icon-in-cart {:ash [:vertically-flipped]}]])

(defcard-doc
  (mkdn-pprint-source flipped))

(defcard-rg
  [flipped])


;; ---------------------------
;; Rotated

(defcard-doc
  "## Rotated"
  (list-keys "rotated"))

(defn rotated []
  [:div
   [sa/icon-in-cart]
   [sa/icon-in-cart {:ash [:clockwise-rotated]}]
   [sa/icon-in-cart {:ash [:counterclockwise-rotated]}]])

(defcard-doc
  (mkdn-pprint-source rotated))

(defcard-rg
  [rotated])


;; ---------------------------
;; Circular

(defcard-doc
  "## Circular"
  (list-keys "circular"))

(defn circular []
  [sa/icon-in-cart {:ash [:circular]}])

(defcard-doc
  (mkdn-pprint-source circular))

(defcard-rg
  [circular])


;; ---------------------------
;; Bordered

(defcard-doc
  "## Bordered"
  (list-keys "bordered"))

(defn bordered []
  [sa/icon-in-cart {:ash [:bordered]}])

(defcard-doc
  (mkdn-pprint-source bordered))

(defcard-rg
  [bordered])


;; ---------------------------
;; Colored

(defcard-doc
  "## colored"
  (list-keys "colored"))

(defn colored-red []
  [sa/icon-in-cart {:ash [:red]}])

(defcard-doc
  (mkdn-pprint-source colored-red))

(defcard-rg
  [:div
   [colored-red]
   [sa/icon-in-cart {:ash [:orange]}]
   [sa/icon-in-cart {:ash [:yellow]}]
   [sa/icon-in-cart {:ash [:olive]}]
   [sa/icon-in-cart {:ash [:green]}]
   [sa/icon-in-cart {:ash [:teal]}]
   [sa/icon-in-cart {:ash [:blue]}]
   [sa/icon-in-cart {:ash [:violet]}]
   [sa/icon-in-cart {:ash [:purple]}]
   [sa/icon-in-cart {:ash [:pink]}]
   [sa/icon-in-cart {:ash [:brown]}]
   [sa/icon-in-cart {:ash [:grey]}]
   [sa/icon-in-cart {:ash [:black]}]
   ])


;; ---------------------------
;; Inverted

(defcard-doc
  "## Inverted"
  (list-keys "inverted"))

;; TODO: update this when segment is ready
(defn inverted []
  [:div.ui.inverted.segment
   [sa/icon-in-cart {:ash [:inverted]}]])

(defcard-doc
  (mkdn-pprint-source inverted))

(defcard-rg
  [inverted])
