(ns soda-ash.elements.icon
  (:require-macros
   [soda-ash.macros :refer [defcomp]])
  (:require
   [soda-ash.template :as t]))


(defn create-group [m]
  (merge {:ui-name   "icon"
          :only-one? true}
         m))


(def types
  [:alarm
   :alarm-slash
   :alarm-outline
   :alarm-slash-outline
   :at
   :browser
   :bug
   :calendar-outline
   :calendar
   :cloud
   :comment
   :comments
   :comment-outline
   :comments-outline
   :copyright
   :dashboard
   :dropdown
   :external-square
   :external
   :eyedropper
   :feed
   :find
   :heartbeat
   :history
   :home
   :idea
   :inbox
   :lab
   :mail
   :mail-outline
   :mail-square
   :map
   :options
   :paint-brush
   :payment
   :phone
   :phone-square
   :privacy
   :protect
   :search
   :setting
   :settings
   :shop
   :sidebar
   :signal
   :sitemap
   :tag
   :tags
   :tasks
   :terminal
   :text-telephone
   :ticket
   :trophy
   :wifi

   :adjust
   :add-user
   :add-to-cart
   :archive
   :ban
   :bookmark
   :call
   :call-square
   :cloud-download
   :cloud-upload
   :compress
   :configure
   :download
   :edit
   :erase
   :exchange
   :external-share
   :expand
   :filter
   :flag
   :flag-outline
   :forward-mail
   :hide
   :in-cart
   :lock
   :pin
   :print
   :random
   :recycle
   :refresh
   :remove-bookmark
   :remove-user
   :repeat
   :reply-all
   :reply
   :retweet
   :send
   :send-outline
   :share-alternate
   :share-alternate-square
   :share
   :share-square
   :sign-in
   :sign-out
   :theme
   :translate
   :undo
   :unhide
   :unlock-alternate
   :unlock
   :upload
   :wait
   :wizard
   :write
   :write-square

   :announcement
   :birthday
   :help
   :help-circle
   :info
   :info-circle
   :warning
   :warning-circle
   :warning-sign

   :child
   :doctor
   :handicap
   :spy
   :student
   :user
   :users

   :female
   :gay
   :heterosexual
   :intergender
   :lesbian
   :male
   :man
   :neuter
   :non-binary-transgender
   :transgender
   :other-gender
   :other-gender-horizontal
   :other-gender-vertical
   :woman

   :grid-layout
   :list-layout
   :block-layout
   :zoom
   :zoom-out
   :resize-vertical
   :resize-horizontal
   :maximize
   :crop

   :anchor
   :bar
   :bomb
   :book
   :bullseye
   :calculator
   :checkered-flag
   :cocktail
   :diamond
   :fax
   :fire-extinguisher
   :fire
   :gift
   :leaf
   :legal
   :lemon
   :life-ring
   :lightning
   :magnet
   :money
   :moon
   :plane
   :puzzle
   :rain
   :road
   :rocket
   :shipping
   :soccer
   :suitcase
   :sun
   :travel
   :treatment
   :world

   :asterisk
   :certificate
   :circle
   :circle-notched
   :circle-thin
   :crosshairs
   :cube
   :cubes
   :ellipsis-horizontal
   :ellipsis-vertical
   :quote-left
   :quote-right
   :spinner
   :square
   :square-outline

   :add-circle
   :add-square
   :check-circle
   :check-circle-outline
   :check-square
   :checkmark-box
   :checkmark
   :minus-circle
   :minus
   :minus-square
   :minus-square-outline
   :move
   :plus
   :plus-square-outline
   :radio
   :remove-circle
   :remove-circle-outline
   :remove
   :selected-radio
   :toggle-off
   :toggle-on

   :area-chart
   :bar-chart
   :camera-retro
   :newspaper
   :film
   :line-chart
   :photo
   :pie-chart
   :sound

   :angle-double-down
   :angle-double-left
   :angle-double-right
   :angle-double-up
   :angle-down
   :angle-left
   :angle-right
   :angle-up
   :arrow-circle-down
   :arrow-circle-left
   :arrow-circle-outline-down
   :arrow-circle-outline-left
   :arrow-circle-outline-right
   :arrow-circle-outline-up
   :arrow-circle-right
   :arrow-circle-up
   :arrow-down
   :arrow-left
   :arrow-right
   :arrow-up
   :caret-down
   :caret-left
   :caret-right
   :caret-up
   :chevron-circle-down
   :chevron-circle-left
   :chevron-circle-right
   :chevron-circle-up
   :chevron-down
   :chevron-left
   :chevron-right
   :chevron-up
   :long-arrow-down
   :long-arrow-left
   :long-arrow-right
   :long-arrow-up
   :pointing-down
   :pointing-left
   :pointing-right
   :pointing-up
   :toggle-down
   :toggle-left
   :toggle-right
   :toggle-up

   :desktop
   :disk-outline
   :file-archive-outline
   :file-audio-outline
   :file-code-outline
   :file-excel-outline
   :file
   :file-image-outline
   :file-outline
   :file-pdf-outline
   :file-powerpoint-outline
   :file-text
   :file-text-outline
   :file-video-outline
   :file-word-outline
   :folder
   :folder-open
   :folder-open-outline
   :folder-outline
   :game
   :keyboard
   :laptop
   :level-down
   :level-up
   :mobile
   :power
   :plug
   :tablet
   :trash
   :trash-outline

   :barcode
   :css3
   :database
   :fork
   :html5
   :openid
   :qrcode
   :rss
   :rss-square
   :server

   :empty-heart
   :empty-star
   :frown
   :heart
   :meh
   :smile
   :star-half-empty
   :star-half
   :star
   :thumbs-down
   :thumbs-outline-down
   :thumbs-outline-up
   :thumbs-up

   :backward
   :eject
   :fast-backward
   :fast-forward
   :forward
   :music
   :mute
   :pause
   :play
   :record
   :step-backward
   :step-forward
   :stop
   :unmute
   :video-play
   :video-play-outline
   :volume-down
   :volume-off
   :volume-up

   :building
   :building-outline
   :car
   :coffee
   :emergency
   :first-aid
   :food
   :h
   :hospital
   :location-arrow
   :marker
   :military
   :paw
   :space-shuttle
   :spoon
   :taxi
   :tree
   :university

   :columns
   :sort-alphabet-ascending
   :sort-alphabet-descending
   :sort-ascending
   :sort-content-ascending
   :sort-content-descending
   :sort-descending
   :sort
   :sort-numeric-ascending
   :sort-numeric-descending
   :table

   :align-center
   :align-justify
   :align-left
   :align-right
   :attach
   :bold
   :copy
   :cut
   :font
   :header
   :indent
   :italic
   :linkify
   :list
   :ordered-list
   :outdent
   :paragraph
   :paste
   :save
   :strikethrough
   :subscript
   :superscript
   :text-height
   :text-width
   :underline
   :unlink
   :unordered-list

   :dollar
   :euro
   :lira
   :pound
   :ruble
   :rupee
   :won
   :shekel
   :yen

   :american-express
   :discover
   :google-wallet
   :mastercard
   :paypal-card
   :paypal
   :stripe
   :visa

   :adn
   :android
   :angellist
   :apple
   :behance
   :behance-square
   :bitbucket
   :bitbucket-square
   :bitcoin
   :buysellads
   :codepen
   :connectdevelop
   :dashcube
   :delicious
   :deviantart
   :digg
   :dribbble
   :dropbox
   :drupal
   :empire
   :facebook
   :facebook-square
   :flickr
   :forumbee
   :foursquare
   :git
   :git-square
   :github-alternate
   :github
   :github-square
   :gittip
   :google
   :google-plus
   :google-plus-square
   :hacker-news
   :instagram
   :ioxhost
   :joomla
   :jsfiddle
   :lastfm
   :lastfm-square
   :leanpub
   :linkedin
   :linkedin-square
   :linux
   :maxcdn
   :meanpath
   :medium
   :pagelines
   :pied-piper-alternate
   :pied-piper
   :pinterest
   :pinterest-square
   :qq
   :rebel
   :reddit
   :reddit-square
   :renren
   :sellsy
   :shirtsinbulk
   :simplybuilt
   :skyatlas
   :skype
   :slack
   :slideshare
   :soundcloud
   :spotify
   :stack-exchange
   :stack-overflow
   :steam
   :steam-square
   :stumbleupon-circle
   :stumbleupon
   :tencent-weibo
   :trello
   :tumblr
   :tumblr-square
   :twitch
   :twitter
   :twitter-square
   :viacoin
   :vimeo
   :vine
   :vk
   :wechat
   :weibo
   :whatsapp
   :windows
   :wordpress
   :xing
   :xing-square
   :yahoo
   :yelp
   :youtube
   :youtube-play
   :youtube-square])


(def groups
  [;; States
   (create-group
    {:group-name   "states"
     :group-vector (vector
                    :disabled
                    :loading)})

   ;; Variations
   (create-group
    {:group-name   "fitted"
     :group-vector (vector
                    :fitted)})

   (create-group
    {:group-name   "size"
     :group-vector (vector
                    :mini
                    :tiny
                    :small
                    ;;
                    :large
                    :big
                    :huge
                    :massive)})

   (create-group
    {:group-name   "link"
     :group-vector (vector
                    :link)})

   (create-group
    {:group-name   "flipped"
     :group-vector (vector
                    :horizontally-flipped
                    :vertically-flipped)})

   (create-group
    {:group-name   "rotated"
     :group-vector (vector
                    :clockwise-rotated
                    :counterclockwise-rotated)})

   (create-group
    {:group-name   "circular"
     :group-vector (vector
                    :circular)})

   (create-group
    {:group-name   "bordered"
     :group-vector (vector
                    :bordered)})

   (create-group
    {:group-name   "colored"
     :group-vector (vector
                    :red
                    :orange
                    :yellow
                    :olive
                    :green
                    :teal
                    :blue
                    :violet
                    :purple
                    :pink
                    :brown
                    :grey
                    :black)})

   (create-group
    {:group-name   "inverted"
     :group-vector (vector
                    :inverted)})

   (create-group
    {:group-name   "corner"
     :group-vector (vector
                    :corner)})
   ])


(def opts
  {:tag     :i
   :ui?     false
   :ui-name "icon"
   :groups  groups})


(defcomp "alarm" (assoc opts :type :alarm))
(defcomp "alarm-slash" (assoc opts :type :alarm-slash))
(defcomp "alarm-outline" (assoc opts :type :alarm-outline))
(defcomp "alarm-slash-outline" (assoc opts :type :alarm-slash-outline))
(defcomp "at" (assoc opts :type :at))
(defcomp "browser" (assoc opts :type :browser))
(defcomp "bug" (assoc opts :type :bug))
(defcomp "calendar-outline" (assoc opts :type :calendar-outline))
(defcomp "calendar" (assoc opts :type :calendar))
(defcomp "cloud" (assoc opts :type :cloud))
(defcomp "comment" (assoc opts :type :comment))
(defcomp "comments" (assoc opts :type :comments))
(defcomp "comment-outline" (assoc opts :type :comment-outline))
(defcomp "comments-outline" (assoc opts :type :comments-outline))
(defcomp "copyright" (assoc opts :type :copyright))
(defcomp "dashboard" (assoc opts :type :dashboard))
(defcomp "dropdown" (assoc opts :type :dropdown))
(defcomp "external-square" (assoc opts :type :external-square))
(defcomp "external" (assoc opts :type :external))
(defcomp "eyedropper" (assoc opts :type :eyedropper))
(defcomp "feed" (assoc opts :type :feed))
(defcomp "find" (assoc opts :type :find))
(defcomp "heartbeat" (assoc opts :type :heartbeat))
(defcomp "history" (assoc opts :type :history))
(defcomp "home" (assoc opts :type :home))
(defcomp "idea" (assoc opts :type :idea))
(defcomp "inbox" (assoc opts :type :inbox))
(defcomp "lab" (assoc opts :type :lab))
(defcomp "mail" (assoc opts :type :mail))
(defcomp "mail-outline" (assoc opts :type :mail-outline))
(defcomp "mail-square" (assoc opts :type :mail-square))
(defcomp "map" (assoc opts :type :map))
(defcomp "options" (assoc opts :type :options))
(defcomp "paint-brush" (assoc opts :type :paint-brush))
(defcomp "payment" (assoc opts :type :payment))
(defcomp "phone" (assoc opts :type :phone))
(defcomp "phone-square" (assoc opts :type :phone-square))
(defcomp "privacy" (assoc opts :type :privacy))
(defcomp "protect" (assoc opts :type :protect))
(defcomp "search" (assoc opts :type :search))
(defcomp "setting" (assoc opts :type :setting))
(defcomp "settings" (assoc opts :type :settings))
(defcomp "shop" (assoc opts :type :shop))
(defcomp "sidebar" (assoc opts :type :sidebar))
(defcomp "signal" (assoc opts :type :signal))
(defcomp "sitemap" (assoc opts :type :sitemap))
(defcomp "tag" (assoc opts :type :tag))
(defcomp "tags" (assoc opts :type :tags))
(defcomp "tasks" (assoc opts :type :tasks))
(defcomp "terminal" (assoc opts :type :terminal))
(defcomp "text-telephone" (assoc opts :type :text-telephone))
(defcomp "ticket" (assoc opts :type :ticket))
(defcomp "trophy" (assoc opts :type :trophy))
(defcomp "wifi" (assoc opts :type :wifi))

(defcomp "adjust" (assoc opts :type :adjust))
(defcomp "add-user" (assoc opts :type :add-user))
(defcomp "add-to-cart" (assoc opts :type :add-to-cart))
(defcomp "archive" (assoc opts :type :archive))
(defcomp "ban" (assoc opts :type :ban))
(defcomp "bookmark" (assoc opts :type :bookmark))
(defcomp "call" (assoc opts :type :call))
(defcomp "call-square" (assoc opts :type :call-square))
(defcomp "cloud-download" (assoc opts :type :cloud-download))
(defcomp "cloud-upload" (assoc opts :type :cloud-upload))
(defcomp "compress" (assoc opts :type :compress))
(defcomp "configure" (assoc opts :type :configure))
(defcomp "download" (assoc opts :type :download))
(defcomp "edit" (assoc opts :type :edit))
(defcomp "erase" (assoc opts :type :erase))
(defcomp "exchange" (assoc opts :type :exchange))
(defcomp "external-share" (assoc opts :type :external-share))
(defcomp "expand" (assoc opts :type :expand))
(defcomp "filter" (assoc opts :type :filter))
(defcomp "flag" (assoc opts :type :flag))
(defcomp "flag-outline" (assoc opts :type :flag-outline))
(defcomp "forward-mail" (assoc opts :type :forward-mail))
(defcomp "hide" (assoc opts :type :hide))
(defcomp "in-cart" (assoc opts :type :in-cart))
(defcomp "lock" (assoc opts :type :lock))
(defcomp "pin" (assoc opts :type :pin))
(defcomp "print" (assoc opts :type :print))
(defcomp "random" (assoc opts :type :random))
(defcomp "recycle" (assoc opts :type :recycle))
(defcomp "refresh" (assoc opts :type :refresh))
(defcomp "remove-bookmark" (assoc opts :type :remove-bookmark))
(defcomp "remove-user" (assoc opts :type :remove-user))
(defcomp "repeat" (assoc opts :type :repeat))
(defcomp "reply-all" (assoc opts :type :reply-all))
(defcomp "reply" (assoc opts :type :reply))
(defcomp "retweet" (assoc opts :type :retweet))
(defcomp "send" (assoc opts :type :send))
(defcomp "send-outline" (assoc opts :type :send-outline))
(defcomp "share-alternate" (assoc opts :type :share-alternate))
(defcomp "share-alternate-square" (assoc opts :type :share-alternate-square))
(defcomp "share" (assoc opts :type :share))
(defcomp "share-square" (assoc opts :type :share-square))
(defcomp "sign-in" (assoc opts :type :sign-in))
(defcomp "sign-out" (assoc opts :type :sign-out))
(defcomp "theme" (assoc opts :type :theme))
(defcomp "translate" (assoc opts :type :translate))
(defcomp "undo" (assoc opts :type :undo))
(defcomp "unhide" (assoc opts :type :unhide))
(defcomp "unlock-alternate" (assoc opts :type :unlock-alternate))
(defcomp "unlock" (assoc opts :type :unlock))
(defcomp "upload" (assoc opts :type :upload))
(defcomp "wait" (assoc opts :type :wait))
(defcomp "wizard" (assoc opts :type :wizard))
(defcomp "write" (assoc opts :type :write))
(defcomp "write-square" (assoc opts :type :write-square))

(defcomp "announcement" (assoc opts :type :announcement))
(defcomp "birthday" (assoc opts :type :birthday))
(defcomp "help" (assoc opts :type :help))
(defcomp "help-circle" (assoc opts :type :help-circle))
(defcomp "info" (assoc opts :type :info))
(defcomp "info-circle" (assoc opts :type :info-circle))
(defcomp "warning" (assoc opts :type :warning))
(defcomp "warning-circle" (assoc opts :type :warning-circle))
(defcomp "warning-sign" (assoc opts :type :warning-sign))

(defcomp "child" (assoc opts :type :child))
(defcomp "doctor" (assoc opts :type :doctor))
(defcomp "handicap" (assoc opts :type :handicap))
(defcomp "spy" (assoc opts :type :spy))
(defcomp "student" (assoc opts :type :student))
(defcomp "user" (assoc opts :type :user))
(defcomp "users" (assoc opts :type :users))

(defcomp "female" (assoc opts :type :female))
(defcomp "gay" (assoc opts :type :gay))
(defcomp "heterosexual" (assoc opts :type :heterosexual))
(defcomp "intergender" (assoc opts :type :intergender))
(defcomp "lesbian" (assoc opts :type :lesbian))
(defcomp "male" (assoc opts :type :male))
(defcomp "man" (assoc opts :type :man))
(defcomp "neuter" (assoc opts :type :neuter))
(defcomp "non-binary-transgender" (assoc opts :type :non-binary-transgender))
(defcomp "transgender" (assoc opts :type :transgender))
(defcomp "other-gender" (assoc opts :type :other-gender))
(defcomp "other-gender-horizontal" (assoc opts :type :other-gender-horizontal))
(defcomp "other-gender-vertical" (assoc opts :type :other-gender-vertical))
(defcomp "woman" (assoc opts :type :woman))

(defcomp "grid-layout" (assoc opts :type :grid-layout))
(defcomp "list-layout" (assoc opts :type :list-layout))
(defcomp "block-layout" (assoc opts :type :block-layout))
(defcomp "zoom" (assoc opts :type :zoom))
(defcomp "zoom-out" (assoc opts :type :zoom-out))
(defcomp "resize-vertical" (assoc opts :type :resize-vertical))
(defcomp "resize-horizontal" (assoc opts :type :resize-horizontal))
(defcomp "maximize" (assoc opts :type :maximize))
(defcomp "crop" (assoc opts :type :crop))

(defcomp "anchor" (assoc opts :type :anchor))
(defcomp "bar" (assoc opts :type :bar))
(defcomp "bomb" (assoc opts :type :bomb))
(defcomp "book" (assoc opts :type :book))
(defcomp "bullseye" (assoc opts :type :bullseye))
(defcomp "calculator" (assoc opts :type :calculator))
(defcomp "checkered-flag" (assoc opts :type :checkered-flag))
(defcomp "cocktail" (assoc opts :type :cocktail))
(defcomp "diamond" (assoc opts :type :diamond))
(defcomp "fax" (assoc opts :type :fax))
(defcomp "fire-extinguisher" (assoc opts :type :fire-extinguisher))
(defcomp "fire" (assoc opts :type :fire))
(defcomp "gift" (assoc opts :type :gift))
(defcomp "leaf" (assoc opts :type :leaf))
(defcomp "legal" (assoc opts :type :legal))
(defcomp "lemon" (assoc opts :type :lemon))
(defcomp "life-ring" (assoc opts :type :life-ring))
(defcomp "lightning" (assoc opts :type :lightning))
(defcomp "magnet" (assoc opts :type :magnet))
(defcomp "money" (assoc opts :type :money))
(defcomp "moon" (assoc opts :type :moon))
(defcomp "plane" (assoc opts :type :plane))
(defcomp "puzzle" (assoc opts :type :puzzle))
(defcomp "rain" (assoc opts :type :rain))
(defcomp "road" (assoc opts :type :road))
(defcomp "rocket" (assoc opts :type :rocket))
(defcomp "shipping" (assoc opts :type :shipping))
(defcomp "soccer" (assoc opts :type :soccer))
(defcomp "suitcase" (assoc opts :type :suitcase))
(defcomp "sun" (assoc opts :type :sun))
(defcomp "travel" (assoc opts :type :travel))
(defcomp "treatment" (assoc opts :type :treatment))
(defcomp "world" (assoc opts :type :world))

(defcomp "asterisk" (assoc opts :type :asterisk))
(defcomp "certificate" (assoc opts :type :certificate))
(defcomp "circle" (assoc opts :type :circle))
(defcomp "circle-notched" (assoc opts :type :circle-notched))
(defcomp "circle-thin" (assoc opts :type :circle-thin))
(defcomp "crosshairs" (assoc opts :type :crosshairs))
(defcomp "cube" (assoc opts :type :cube))
(defcomp "cubes" (assoc opts :type :cubes))
(defcomp "ellipsis-horizontal" (assoc opts :type :ellipsis-horizontal))
(defcomp "ellipsis-vertical" (assoc opts :type :ellipsis-vertical))
(defcomp "quote-left" (assoc opts :type :quote-left))
(defcomp "quote-right" (assoc opts :type :quote-right))
(defcomp "spinner" (assoc opts :type :spinner))
(defcomp "square" (assoc opts :type :square))
(defcomp "square-outline" (assoc opts :type :square-outline))

(defcomp "add-circle" (assoc opts :type :add-circle))
(defcomp "add-square" (assoc opts :type :add-square))
(defcomp "check-circle" (assoc opts :type :check-circle))
(defcomp "check-circle-outline" (assoc opts :type :check-circle-outline))
(defcomp "check-square" (assoc opts :type :check-square))
(defcomp "checkmark-box" (assoc opts :type :checkmark-box))
(defcomp "checkmark" (assoc opts :type :checkmark))
(defcomp "minus-circle" (assoc opts :type :minus-circle))
(defcomp "minus" (assoc opts :type :minus))
(defcomp "minus-square" (assoc opts :type :minus-square))
(defcomp "minus-square-outline" (assoc opts :type :minus-square-outline))
(defcomp "move" (assoc opts :type :move))
(defcomp "plus" (assoc opts :type :plus))
(defcomp "plus-square-outline" (assoc opts :type :plus-square-outline))
(defcomp "radio" (assoc opts :type :radio))
(defcomp "remove-circle" (assoc opts :type :remove-circle))
(defcomp "remove-circle-outline" (assoc opts :type :remove-circle-outline))
(defcomp "remove" (assoc opts :type :remove))
(defcomp "selected-radio" (assoc opts :type :selected-radio))
(defcomp "toggle-off" (assoc opts :type :toggle-off))
(defcomp "toggle-on" (assoc opts :type :toggle-on))

(defcomp "area-chart" (assoc opts :type :area-chart))
(defcomp "bar-chart" (assoc opts :type :bar-chart))
(defcomp "camera-retro" (assoc opts :type :camera-retro))
(defcomp "newspaper" (assoc opts :type :newspaper))
(defcomp "film" (assoc opts :type :film))
(defcomp "line-chart" (assoc opts :type :line-chart))
(defcomp "photo" (assoc opts :type :photo))
(defcomp "pie-chart" (assoc opts :type :pie-chart))
(defcomp "sound" (assoc opts :type :sound))

(defcomp "angle-double-down" (assoc opts :type :angle-double-down))
(defcomp "angle-double-left" (assoc opts :type :angle-double-left))
(defcomp "angle-double-right" (assoc opts :type :angle-double-right))
(defcomp "angle-double-up" (assoc opts :type :angle-double-up))
(defcomp "angle-down" (assoc opts :type :angle-down))
(defcomp "angle-left" (assoc opts :type :angle-left))
(defcomp "angle-right" (assoc opts :type :angle-right))
(defcomp "angle-up" (assoc opts :type :angle-up))
(defcomp "arrow-circle-down" (assoc opts :type :arrow-circle-down))
(defcomp "arrow-circle-left" (assoc opts :type :arrow-circle-left))
(defcomp "arrow-circle-outline-down" (assoc opts :type :arrow-circle-outline-down))
(defcomp "arrow-circle-outline-left" (assoc opts :type :arrow-circle-outline-left))
(defcomp "arrow-circle-outline-right" (assoc opts :type :arrow-circle-outline-right))
(defcomp "arrow-circle-outline-up" (assoc opts :type :arrow-circle-outline-up))
(defcomp "arrow-circle-right" (assoc opts :type :arrow-circle-right))
(defcomp "arrow-circle-up" (assoc opts :type :arrow-circle-up))
(defcomp "arrow-down" (assoc opts :type :arrow-down))
(defcomp "arrow-left" (assoc opts :type :arrow-left))
(defcomp "arrow-right" (assoc opts :type :arrow-right))
(defcomp "arrow-up" (assoc opts :type :arrow-up))
(defcomp "caret-down" (assoc opts :type :caret-down))
(defcomp "caret-left" (assoc opts :type :caret-left))
(defcomp "caret-right" (assoc opts :type :caret-right))
(defcomp "caret-up" (assoc opts :type :caret-up))
(defcomp "chevron-circle-down" (assoc opts :type :chevron-circle-down))
(defcomp "chevron-circle-left" (assoc opts :type :chevron-circle-left))
(defcomp "chevron-circle-right" (assoc opts :type :chevron-circle-right))
(defcomp "chevron-circle-up" (assoc opts :type :chevron-circle-up))
(defcomp "chevron-down" (assoc opts :type :chevron-down))
(defcomp "chevron-left" (assoc opts :type :chevron-left))
(defcomp "chevron-right" (assoc opts :type :chevron-right))
(defcomp "chevron-up" (assoc opts :type :chevron-up))
(defcomp "long-arrow-down" (assoc opts :type :long-arrow-down))
(defcomp "long-arrow-left" (assoc opts :type :long-arrow-left))
(defcomp "long-arrow-right" (assoc opts :type :long-arrow-right))
(defcomp "long-arrow-up" (assoc opts :type :long-arrow-up))
(defcomp "pointing-down" (assoc opts :type :pointing-down))
(defcomp "pointing-left" (assoc opts :type :pointing-left))
(defcomp "pointing-right" (assoc opts :type :pointing-right))
(defcomp "pointing-up" (assoc opts :type :pointing-up))
(defcomp "toggle-down" (assoc opts :type :toggle-down))
(defcomp "toggle-left" (assoc opts :type :toggle-left))
(defcomp "toggle-right" (assoc opts :type :toggle-right))
(defcomp "toggle-up" (assoc opts :type :toggle-up))

(defcomp "desktop" (assoc opts :type :desktop))
(defcomp "disk-outline" (assoc opts :type :disk-outline))
(defcomp "file-archive-outline" (assoc opts :type :file-archive-outline))
(defcomp "file-audio-outline" (assoc opts :type :file-audio-outline))
(defcomp "file-code-outline" (assoc opts :type :file-code-outline))
(defcomp "file-excel-outline" (assoc opts :type :file-excel-outline))
(defcomp "file" (assoc opts :type :file))
(defcomp "file-image-outline" (assoc opts :type :file-image-outline))
(defcomp "file-outline" (assoc opts :type :file-outline))
(defcomp "file-pdf-outline" (assoc opts :type :file-pdf-outline))
(defcomp "file-powerpoint-outline" (assoc opts :type :file-powerpoint-outline))
(defcomp "file-text" (assoc opts :type :file-text))
(defcomp "file-text-outline" (assoc opts :type :file-text-outline))
(defcomp "file-video-outline" (assoc opts :type :file-video-outline))
(defcomp "file-word-outline" (assoc opts :type :file-word-outline))
(defcomp "folder" (assoc opts :type :folder))
(defcomp "folder-open" (assoc opts :type :folder-open))
(defcomp "folder-open-outline" (assoc opts :type :folder-open-outline))
(defcomp "folder-outline" (assoc opts :type :folder-outline))
(defcomp "game" (assoc opts :type :game))
(defcomp "keyboard" (assoc opts :type :keyboard))
(defcomp "laptop" (assoc opts :type :laptop))
(defcomp "level-down" (assoc opts :type :level-down))
(defcomp "level-up" (assoc opts :type :level-up))
(defcomp "mobile" (assoc opts :type :mobile))
(defcomp "power" (assoc opts :type :power))
(defcomp "plug" (assoc opts :type :plug))
(defcomp "tablet" (assoc opts :type :tablet))
(defcomp "trash" (assoc opts :type :trash))
(defcomp "trash-outline" (assoc opts :type :trash-outline))

(defcomp "barcode" (assoc opts :type :barcode))
(defcomp "css3" (assoc opts :type :css3))
(defcomp "database" (assoc opts :type :database))
(defcomp "fork" (assoc opts :type :fork))
(defcomp "html5" (assoc opts :type :html5))
(defcomp "openid" (assoc opts :type :openid))
(defcomp "qrcode" (assoc opts :type :qrcode))
(defcomp "rss" (assoc opts :type :rss))
(defcomp "rss-square" (assoc opts :type :rss-square))
(defcomp "server" (assoc opts :type :server))

(defcomp "empty-heart" (assoc opts :type :empty-heart))
(defcomp "empty-star" (assoc opts :type :empty-star))
(defcomp "frown" (assoc opts :type :frown))
(defcomp "heart" (assoc opts :type :heart))
(defcomp "meh" (assoc opts :type :meh))
(defcomp "smile" (assoc opts :type :smile))
(defcomp "star-half-empty" (assoc opts :type :star-half-empty))
(defcomp "star-half" (assoc opts :type :star-half))
(defcomp "star" (assoc opts :type :star))
(defcomp "thumbs-down" (assoc opts :type :thumbs-down))
(defcomp "thumbs-outline-down" (assoc opts :type :thumbs-outline-down))
(defcomp "thumbs-outline-up" (assoc opts :type :thumbs-outline-up))
(defcomp "thumbs-up" (assoc opts :type :thumbs-up))

(defcomp "backward" (assoc opts :type :backward))
(defcomp "eject" (assoc opts :type :eject))
(defcomp "fast-backward" (assoc opts :type :fast-backward))
(defcomp "fast-forward" (assoc opts :type :fast-forward))
(defcomp "forward" (assoc opts :type :forward))
(defcomp "music" (assoc opts :type :music))
(defcomp "mute" (assoc opts :type :mute))
(defcomp "pause" (assoc opts :type :pause))
(defcomp "play" (assoc opts :type :play))
(defcomp "record" (assoc opts :type :record))
(defcomp "step-backward" (assoc opts :type :step-backward))
(defcomp "step-forward" (assoc opts :type :step-forward))
(defcomp "stop" (assoc opts :type :stop))
(defcomp "unmute" (assoc opts :type :unmute))
(defcomp "video-play" (assoc opts :type :video-play))
(defcomp "video-play-outline" (assoc opts :type :video-play-outline))
(defcomp "volume-down" (assoc opts :type :volume-down))
(defcomp "volume-off" (assoc opts :type :volume-off))
(defcomp "volume-up" (assoc opts :type :volume-up))

(defcomp "building" (assoc opts :type :building))
(defcomp "building-outline" (assoc opts :type :building-outline))
(defcomp "car" (assoc opts :type :car))
(defcomp "coffee" (assoc opts :type :coffee))
(defcomp "emergency" (assoc opts :type :emergency))
(defcomp "first-aid" (assoc opts :type :first-aid))
(defcomp "food" (assoc opts :type :food))
(defcomp "h" (assoc opts :type :h))
(defcomp "hospital" (assoc opts :type :hospital))
(defcomp "location-arrow" (assoc opts :type :location-arrow))
(defcomp "marker" (assoc opts :type :marker))
(defcomp "military" (assoc opts :type :military))
(defcomp "paw" (assoc opts :type :paw))
(defcomp "space-shuttle" (assoc opts :type :space-shuttle))
(defcomp "spoon" (assoc opts :type :spoon))
(defcomp "taxi" (assoc opts :type :taxi))
(defcomp "tree" (assoc opts :type :tree))
(defcomp "university" (assoc opts :type :university))

(defcomp "columns" (assoc opts :type :columns))
(defcomp "sort-alphabet-ascending" (assoc opts :type :sort-alphabet-ascending))
(defcomp "sort-alphabet-descending" (assoc opts :type :sort-alphabet-descending))
(defcomp "sort-ascending" (assoc opts :type :sort-ascending))
(defcomp "sort-content-ascending" (assoc opts :type :sort-content-ascending))
(defcomp "sort-content-descending" (assoc opts :type :sort-content-descending))
(defcomp "sort-descending" (assoc opts :type :sort-descending))
(defcomp "sort" (assoc opts :type :sort))
(defcomp "sort-numeric-ascending" (assoc opts :type :sort-numeric-ascending))
(defcomp "sort-numeric-descending" (assoc opts :type :sort-numeric-descending))
(defcomp "table" (assoc opts :type :table))

(defcomp "align-center" (assoc opts :type :align-center))
(defcomp "align-justify" (assoc opts :type :align-justify))
(defcomp "align-left" (assoc opts :type :align-left))
(defcomp "align-right" (assoc opts :type :align-right))
(defcomp "attach" (assoc opts :type :attach))
(defcomp "bold" (assoc opts :type :bold))
(defcomp "copy" (assoc opts :type :copy))
(defcomp "cut" (assoc opts :type :cut))
(defcomp "font" (assoc opts :type :font))
(defcomp "header" (assoc opts :type :header))
(defcomp "indent" (assoc opts :type :indent))
(defcomp "italic" (assoc opts :type :italic))
(defcomp "linkify" (assoc opts :type :linkify))
(defcomp "list" (assoc opts :type :list))
(defcomp "ordered-list" (assoc opts :type :ordered-list))
(defcomp "outdent" (assoc opts :type :outdent))
(defcomp "paragraph" (assoc opts :type :paragraph))
(defcomp "paste" (assoc opts :type :paste))
(defcomp "save" (assoc opts :type :save))
(defcomp "strikethrough" (assoc opts :type :strikethrough))
(defcomp "subscript" (assoc opts :type :subscript))
(defcomp "superscript" (assoc opts :type :superscript))
(defcomp "text-height" (assoc opts :type :text-height))
(defcomp "text-width" (assoc opts :type :text-width))
(defcomp "underline" (assoc opts :type :underline))
(defcomp "unlink" (assoc opts :type :unlink))
(defcomp "unordered-list" (assoc opts :type :unordered-list))

(defcomp "dollar" (assoc opts :type :dollar))
(defcomp "euro" (assoc opts :type :euro))
(defcomp "lira" (assoc opts :type :lira))
(defcomp "pound" (assoc opts :type :pound))
(defcomp "ruble" (assoc opts :type :ruble))
(defcomp "rupee" (assoc opts :type :rupee))
(defcomp "won" (assoc opts :type :won))
(defcomp "shekel" (assoc opts :type :shekel))
(defcomp "yen" (assoc opts :type :yen))

(defcomp "american-express" (assoc opts :type :american-express))
(defcomp "discover" (assoc opts :type :discover))
(defcomp "google-wallet" (assoc opts :type :google-wallet))
(defcomp "mastercard" (assoc opts :type :mastercard))
(defcomp "paypal-card" (assoc opts :type :paypal-card))
(defcomp "paypal" (assoc opts :type :paypal))
(defcomp "stripe" (assoc opts :type :stripe))
(defcomp "visa" (assoc opts :type :visa))

(defcomp "adn" (assoc opts :type :adn))
(defcomp "android" (assoc opts :type :android))
(defcomp "angellist" (assoc opts :type :angellist))
(defcomp "apple" (assoc opts :type :apple))
(defcomp "behance" (assoc opts :type :behance))
(defcomp "behance-square" (assoc opts :type :behance-square))
(defcomp "bitbucket" (assoc opts :type :bitbucket))
(defcomp "bitbucket-square" (assoc opts :type :bitbucket-square))
(defcomp "bitcoin" (assoc opts :type :bitcoin))
(defcomp "buysellads" (assoc opts :type :buysellads))
(defcomp "codepen" (assoc opts :type :codepen))
(defcomp "connectdevelop" (assoc opts :type :connectdevelop))
(defcomp "dashcube" (assoc opts :type :dashcube))
(defcomp "delicious" (assoc opts :type :delicious))
(defcomp "deviantart" (assoc opts :type :deviantart))
(defcomp "digg" (assoc opts :type :digg))
(defcomp "dribbble" (assoc opts :type :dribbble))
(defcomp "dropbox" (assoc opts :type :dropbox))
(defcomp "drupal" (assoc opts :type :drupal))
(defcomp "empire" (assoc opts :type :empire))
(defcomp "facebook" (assoc opts :type :facebook))
(defcomp "facebook-square" (assoc opts :type :facebook-square))
(defcomp "flickr" (assoc opts :type :flickr))
(defcomp "forumbee" (assoc opts :type :forumbee))
(defcomp "foursquare" (assoc opts :type :foursquare))
(defcomp "git" (assoc opts :type :git))
(defcomp "git-square" (assoc opts :type :git-square))
(defcomp "github-alternate" (assoc opts :type :github-alternate))
(defcomp "github" (assoc opts :type :github))
(defcomp "github-square" (assoc opts :type :github-square))
(defcomp "gittip" (assoc opts :type :gittip))
(defcomp "google" (assoc opts :type :google))
(defcomp "google-plus" (assoc opts :type :google-plus))
(defcomp "google-plus-square" (assoc opts :type :google-plus-square))
(defcomp "hacker-news" (assoc opts :type :hacker-news))
(defcomp "instagram" (assoc opts :type :instagram))
(defcomp "ioxhost" (assoc opts :type :ioxhost))
(defcomp "joomla" (assoc opts :type :joomla))
(defcomp "jsfiddle" (assoc opts :type :jsfiddle))
(defcomp "lastfm" (assoc opts :type :lastfm))
(defcomp "lastfm-square" (assoc opts :type :lastfm-square))
(defcomp "leanpub" (assoc opts :type :leanpub))
(defcomp "linkedin" (assoc opts :type :linkedin))
(defcomp "linkedin-square" (assoc opts :type :linkedin-square))
(defcomp "linux" (assoc opts :type :linux))
(defcomp "maxcdn" (assoc opts :type :maxcdn))
(defcomp "meanpath" (assoc opts :type :meanpath))
(defcomp "medium" (assoc opts :type :medium))
(defcomp "pagelines" (assoc opts :type :pagelines))
(defcomp "pied-piper-alternate" (assoc opts :type :pied-piper-alternate))
(defcomp "pied-piper" (assoc opts :type :pied-piper))
(defcomp "pinterest" (assoc opts :type :pinterest))
(defcomp "pinterest-square" (assoc opts :type :pinterest-square))
(defcomp "qq" (assoc opts :type :qq))
(defcomp "rebel" (assoc opts :type :rebel))
(defcomp "reddit" (assoc opts :type :reddit))
(defcomp "reddit-square" (assoc opts :type :reddit-square))
(defcomp "renren" (assoc opts :type :renren))
(defcomp "sellsy" (assoc opts :type :sellsy))
(defcomp "shirtsinbulk" (assoc opts :type :shirtsinbulk))
(defcomp "simplybuilt" (assoc opts :type :simplybuilt))
(defcomp "skyatlas" (assoc opts :type :skyatlas))
(defcomp "skype" (assoc opts :type :skype))
(defcomp "slack" (assoc opts :type :slack))
(defcomp "slideshare" (assoc opts :type :slideshare))
(defcomp "soundcloud" (assoc opts :type :soundcloud))
(defcomp "spotify" (assoc opts :type :spotify))
(defcomp "stack-exchange" (assoc opts :type :stack-exchange))
(defcomp "stack-overflow" (assoc opts :type :stack-overflow))
(defcomp "steam" (assoc opts :type :steam))
(defcomp "steam-square" (assoc opts :type :steam-square))
(defcomp "stumbleupon-circle" (assoc opts :type :stumbleupon-circle))
(defcomp "stumbleupon" (assoc opts :type :stumbleupon))
(defcomp "tencent-weibo" (assoc opts :type :tencent-weibo))
(defcomp "trello" (assoc opts :type :trello))
(defcomp "tumblr" (assoc opts :type :tumblr))
(defcomp "tumblr-square" (assoc opts :type :tumblr-square))
(defcomp "twitch" (assoc opts :type :twitch))
(defcomp "twitter" (assoc opts :type :twitter))
(defcomp "twitter-square" (assoc opts :type :twitter-square))
(defcomp "viacoin" (assoc opts :type :viacoin))
(defcomp "vimeo" (assoc opts :type :vimeo))
(defcomp "vine" (assoc opts :type :vine))
(defcomp "vk" (assoc opts :type :vk))
(defcomp "wechat" (assoc opts :type :wechat))
(defcomp "weibo" (assoc opts :type :weibo))
(defcomp "whatsapp" (assoc opts :type :whatsapp))
(defcomp "windows" (assoc opts :type :windows))
(defcomp "wordpress" (assoc opts :type :wordpress))
(defcomp "xing" (assoc opts :type :xing))
(defcomp "xing-square" (assoc opts :type :xing-square))
(defcomp "yahoo" (assoc opts :type :yahoo))
(defcomp "yelp" (assoc opts :type :yelp))
(defcomp "youtube" (assoc opts :type :youtube))
(defcomp "youtube-play" (assoc opts :type :youtube-play))
(defcomp "youtube-square" (assoc opts :type :youtube-square))
