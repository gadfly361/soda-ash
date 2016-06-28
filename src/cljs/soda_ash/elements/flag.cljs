(ns soda-ash.elements.flag
  (:require-macros
   [soda-ash.macros :refer [defcomp]])
  (:require
   [soda-ash.template :as t]))


(defn create-group [m]
  (merge {:ui-name   "flag"
          :only-one? true}
         m))


(def groups
  [;; Types
   (create-group
    {:group-name   "types"
     :group-vector (vector
                    :ae
                    :af
                    :ag
                    :ai
                    :al
                    :am
                    :an
                    :ao
                    :ar
                    :as
                    :at
                    :au
                    :aw
                    :ax
                    :az
                    :ba
                    :bb
                    :bd
                    :be
                    :bf
                    :bg
                    :bh
                    :bi
                    :bj
                    :bm
                    :bn
                    :bo
                    :br
                    :bs
                    :bt
                    :bv
                    :bw
                    :by
                    :bz
                    :ca
                    :cc
                    :cd
                    :cf
                    :cg
                    :ch
                    :ci
                    :ck
                    :cl
                    :cm
                    :cn
                    :co
                    :cr
                    :cs
                    :cu
                    :cv
                    :cx
                    :cy
                    :cz
                    :de
                    :dj
                    :dk
                    :dm
                    :do
                    :dz
                    :ec
                    :ee
                    :eg
                    :eh
                    :er
                    :es
                    :et
                    :eu
                    :fi
                    :fj
                    :fk
                    :fm
                    :fo
                    :fr
                    :ga
                    :gb
                    :gd
                    :ge
                    :gf
                    :gh
                    :gi
                    :gl
                    :gm
                    :gn
                    :gp
                    :gq
                    :gr
                    :gs
                    :gt
                    :gu
                    :gw
                    :gy
                    :hk
                    :hm
                    :hn
                    :hr
                    :ht
                    :hu
                    :id
                    :ie
                    :il
                    :in
                    :io
                    :iq
                    :ir
                    :is
                    :it
                    :jm
                    :jo
                    :jp
                    :ke
                    :kg
                    :kh
                    :ki
                    :km
                    :kn
                    :kp
                    :kr
                    :kw
                    :ky
                    :kz
                    :la
                    :lb
                    :lc
                    :li
                    :lk
                    :lr
                    :ls
                    :lt
                    :lu
                    :lv
                    :ly
                    :ma
                    :mc
                    :md
                    :me
                    :mg
                    :mh
                    :mk
                    :ml
                    :mm
                    :mn
                    :mo
                    :mp
                    :mq
                    :mr
                    :ms
                    :mt
                    :mu
                    :mv
                    :mw
                    :mx
                    :my
                    :mz
                    :na
                    :nc
                    :ne
                    :nf
                    :ng
                    :ni
                    :nl
                    :no
                    :np
                    :nr
                    :nu
                    :nz
                    :om
                    :pa
                    :pe
                    :pf
                    :pg
                    :ph
                    :pk
                    :pl
                    :pm
                    :pn
                    :pr
                    :ps
                    :pt
                    :pw
                    :py
                    :qa
                    :re
                    :ro
                    :rs
                    :ru
                    :rw
                    :sa
                    :sb
                    :sc
                    :sd
                    :se
                    :sg
                    :sh
                    :si
                    :sj
                    :sk
                    :sl
                    :sm
                    :sn
                    :so
                    :sr
                    :st
                    :sv
                    :sy
                    :sz
                    :tc
                    :td
                    :tf
                    :tg
                    :th
                    :tj
                    :tk
                    :tl
                    :tm
                    :tn
                    :to
                    :tr
                    :tt
                    :tv
                    :tw
                    :tz
                    :ua
                    :ug
                    :um
                    :us
                    :uy
                    :uz
                    :va
                    :vc
                    :ve
                    :vg
                    :vi
                    :vn
                    :vu
                    :wf
                    :ws
                    :ye
                    :yt
                    :za
                    :zm)})
   ])


(def opts
  {:tag     :i
   :ui?     false
   :ui-name "flag"
   :groups  groups})


(defcomp "ae" (assoc opts :type :ae))
(defcomp "af" (assoc opts :type :af))
(defcomp "ag" (assoc opts :type :ag))
(defcomp "ai" (assoc opts :type :ai))
(defcomp "al" (assoc opts :type :al))
(defcomp "am" (assoc opts :type :am))
(defcomp "an" (assoc opts :type :an))
(defcomp "ao" (assoc opts :type :ao))
(defcomp "ar" (assoc opts :type :ar))
(defcomp "as" (assoc opts :type :as))
(defcomp "at" (assoc opts :type :at))
(defcomp "au" (assoc opts :type :au))
(defcomp "aw" (assoc opts :type :aw))
(defcomp "ax" (assoc opts :type :ax))
(defcomp "az" (assoc opts :type :az))
(defcomp "ba" (assoc opts :type :ba))
(defcomp "bb" (assoc opts :type :bb))
(defcomp "bd" (assoc opts :type :bd))
(defcomp "be" (assoc opts :type :be))
(defcomp "bf" (assoc opts :type :bf))
(defcomp "bg" (assoc opts :type :bg))
(defcomp "bh" (assoc opts :type :bh))
(defcomp "bi" (assoc opts :type :bi))
(defcomp "bj" (assoc opts :type :bj))
(defcomp "bm" (assoc opts :type :bm))
(defcomp "bn" (assoc opts :type :bn))
(defcomp "bo" (assoc opts :type :bo))
(defcomp "br" (assoc opts :type :br))
(defcomp "bs" (assoc opts :type :bs))
(defcomp "bt" (assoc opts :type :bt))
(defcomp "bv" (assoc opts :type :bv))
(defcomp "bw" (assoc opts :type :bw))
(defcomp "by" (assoc opts :type :by))
(defcomp "bz" (assoc opts :type :bz))
(defcomp "ca" (assoc opts :type :ca))
(defcomp "cc" (assoc opts :type :cc))
(defcomp "cd" (assoc opts :type :cd))
(defcomp "cf" (assoc opts :type :cf))
(defcomp "cg" (assoc opts :type :cg))
(defcomp "ch" (assoc opts :type :ch))
(defcomp "ci" (assoc opts :type :ci))
(defcomp "ck" (assoc opts :type :ck))
(defcomp "cl" (assoc opts :type :cl))
(defcomp "cm" (assoc opts :type :cm))
(defcomp "cn" (assoc opts :type :cn))
(defcomp "co" (assoc opts :type :co))
(defcomp "cr" (assoc opts :type :cr))
(defcomp "cs" (assoc opts :type :cs))
(defcomp "cu" (assoc opts :type :cu))
(defcomp "cv" (assoc opts :type :cv))
(defcomp "cx" (assoc opts :type :cx))
(defcomp "cy" (assoc opts :type :cy))
(defcomp "cz" (assoc opts :type :cz))
(defcomp "de" (assoc opts :type :de))
(defcomp "dj" (assoc opts :type :dj))
(defcomp "dk" (assoc opts :type :dk))
(defcomp "dm" (assoc opts :type :dm))
(defcomp "do" (assoc opts :type :do))
(defcomp "dz" (assoc opts :type :dz))
(defcomp "ec" (assoc opts :type :ec))
(defcomp "ee" (assoc opts :type :ee))
(defcomp "eg" (assoc opts :type :eg))
(defcomp "eh" (assoc opts :type :eh))
(defcomp "er" (assoc opts :type :er))
(defcomp "es" (assoc opts :type :es))
(defcomp "et" (assoc opts :type :et))
(defcomp "eu" (assoc opts :type :eu))
(defcomp "fi" (assoc opts :type :fi))
(defcomp "fj" (assoc opts :type :fj))
(defcomp "fk" (assoc opts :type :fk))
(defcomp "fm" (assoc opts :type :fm))
(defcomp "fo" (assoc opts :type :fo))
(defcomp "fr" (assoc opts :type :fr))
(defcomp "ga" (assoc opts :type :ga))
(defcomp "gb" (assoc opts :type :gb))
(defcomp "gd" (assoc opts :type :gd))
(defcomp "ge" (assoc opts :type :ge))
(defcomp "gf" (assoc opts :type :gf))
(defcomp "gh" (assoc opts :type :gh))
(defcomp "gi" (assoc opts :type :gi))
(defcomp "gl" (assoc opts :type :gl))
(defcomp "gm" (assoc opts :type :gm))
(defcomp "gn" (assoc opts :type :gn))
(defcomp "gp" (assoc opts :type :gp))
(defcomp "gq" (assoc opts :type :gq))
(defcomp "gr" (assoc opts :type :gr))
(defcomp "gs" (assoc opts :type :gs))
(defcomp "gt" (assoc opts :type :gt))
(defcomp "gu" (assoc opts :type :gu))
(defcomp "gw" (assoc opts :type :gw))
(defcomp "gy" (assoc opts :type :gy))
(defcomp "hk" (assoc opts :type :hk))
(defcomp "hm" (assoc opts :type :hm))
(defcomp "hn" (assoc opts :type :hn))
(defcomp "hr" (assoc opts :type :hr))
(defcomp "ht" (assoc opts :type :ht))
(defcomp "hu" (assoc opts :type :hu))
(defcomp "id" (assoc opts :type :id))
(defcomp "ie" (assoc opts :type :ie))
(defcomp "il" (assoc opts :type :il))
(defcomp "in" (assoc opts :type :in))
(defcomp "io" (assoc opts :type :io))
(defcomp "iq" (assoc opts :type :iq))
(defcomp "ir" (assoc opts :type :ir))
(defcomp "is" (assoc opts :type :is))
(defcomp "it" (assoc opts :type :it))
(defcomp "jm" (assoc opts :type :jm))
(defcomp "jo" (assoc opts :type :jo))
(defcomp "jp" (assoc opts :type :jp))
(defcomp "ke" (assoc opts :type :ke))
(defcomp "kg" (assoc opts :type :kg))
(defcomp "kh" (assoc opts :type :kh))
(defcomp "ki" (assoc opts :type :ki))
(defcomp "km" (assoc opts :type :km))
(defcomp "kn" (assoc opts :type :kn))
(defcomp "kp" (assoc opts :type :kp))
(defcomp "kr" (assoc opts :type :kr))
(defcomp "kw" (assoc opts :type :kw))
(defcomp "ky" (assoc opts :type :ky))
(defcomp "kz" (assoc opts :type :kz))
(defcomp "la" (assoc opts :type :la))
(defcomp "lb" (assoc opts :type :lb))
(defcomp "lc" (assoc opts :type :lc))
(defcomp "li" (assoc opts :type :li))
(defcomp "lk" (assoc opts :type :lk))
(defcomp "lr" (assoc opts :type :lr))
(defcomp "ls" (assoc opts :type :ls))
(defcomp "lt" (assoc opts :type :lt))
(defcomp "lu" (assoc opts :type :lu))
(defcomp "lv" (assoc opts :type :lv))
(defcomp "ly" (assoc opts :type :ly))
(defcomp "ma" (assoc opts :type :ma))
(defcomp "mc" (assoc opts :type :mc))
(defcomp "md" (assoc opts :type :md))
(defcomp "me" (assoc opts :type :me))
(defcomp "mg" (assoc opts :type :mg))
(defcomp "mh" (assoc opts :type :mh))
(defcomp "mk" (assoc opts :type :mk))
(defcomp "ml" (assoc opts :type :ml))
(defcomp "mm" (assoc opts :type :mm))
(defcomp "mn" (assoc opts :type :mn))
(defcomp "mo" (assoc opts :type :mo))
(defcomp "mp" (assoc opts :type :mp))
(defcomp "mq" (assoc opts :type :mq))
(defcomp "mr" (assoc opts :type :mr))
(defcomp "ms" (assoc opts :type :ms))
(defcomp "mt" (assoc opts :type :mt))
(defcomp "mu" (assoc opts :type :mu))
(defcomp "mv" (assoc opts :type :mv))
(defcomp "mw" (assoc opts :type :mw))
(defcomp "mx" (assoc opts :type :mx))
(defcomp "my" (assoc opts :type :my))
(defcomp "mz" (assoc opts :type :mz))
(defcomp "na" (assoc opts :type :na))
(defcomp "nc" (assoc opts :type :nc))
(defcomp "ne" (assoc opts :type :ne))
(defcomp "nf" (assoc opts :type :nf))
(defcomp "ng" (assoc opts :type :ng))
(defcomp "ni" (assoc opts :type :ni))
(defcomp "nl" (assoc opts :type :nl))
(defcomp "no" (assoc opts :type :no))
(defcomp "np" (assoc opts :type :np))
(defcomp "nr" (assoc opts :type :nr))
(defcomp "nu" (assoc opts :type :nu))
(defcomp "nz" (assoc opts :type :nz))
(defcomp "om" (assoc opts :type :om))
(defcomp "pa" (assoc opts :type :pa))
(defcomp "pe" (assoc opts :type :pe))
(defcomp "pf" (assoc opts :type :pf))
(defcomp "pg" (assoc opts :type :pg))
(defcomp "ph" (assoc opts :type :ph))
(defcomp "pk" (assoc opts :type :pk))
(defcomp "pl" (assoc opts :type :pl))
(defcomp "pm" (assoc opts :type :pm))
(defcomp "pn" (assoc opts :type :pn))
(defcomp "pr" (assoc opts :type :pr))
(defcomp "ps" (assoc opts :type :ps))
(defcomp "pt" (assoc opts :type :pt))
(defcomp "pw" (assoc opts :type :pw))
(defcomp "py" (assoc opts :type :py))
(defcomp "qa" (assoc opts :type :qa))
(defcomp "re" (assoc opts :type :re))
(defcomp "ro" (assoc opts :type :ro))
(defcomp "rs" (assoc opts :type :rs))
(defcomp "ru" (assoc opts :type :ru))
(defcomp "rw" (assoc opts :type :rw))
(defcomp "sa" (assoc opts :type :sa))
(defcomp "sb" (assoc opts :type :sb))
(defcomp "sc" (assoc opts :type :sc))
(defcomp "sd" (assoc opts :type :sd))
(defcomp "se" (assoc opts :type :se))
(defcomp "sg" (assoc opts :type :sg))
(defcomp "sh" (assoc opts :type :sh))
(defcomp "si" (assoc opts :type :si))
(defcomp "sj" (assoc opts :type :sj))
(defcomp "sk" (assoc opts :type :sk))
(defcomp "sl" (assoc opts :type :sl))
(defcomp "sm" (assoc opts :type :sm))
(defcomp "sn" (assoc opts :type :sn))
(defcomp "so" (assoc opts :type :so))
(defcomp "sr" (assoc opts :type :sr))
(defcomp "st" (assoc opts :type :st))
(defcomp "sv" (assoc opts :type :sv))
(defcomp "sy" (assoc opts :type :sy))
(defcomp "sz" (assoc opts :type :sz))
(defcomp "tc" (assoc opts :type :tc))
(defcomp "td" (assoc opts :type :td))
(defcomp "tf" (assoc opts :type :tf))
(defcomp "tg" (assoc opts :type :tg))
(defcomp "th" (assoc opts :type :th))
(defcomp "tj" (assoc opts :type :tj))
(defcomp "tk" (assoc opts :type :tk))
(defcomp "tl" (assoc opts :type :tl))
(defcomp "tm" (assoc opts :type :tm))
(defcomp "tn" (assoc opts :type :tn))
(defcomp "to" (assoc opts :type :to))
(defcomp "tr" (assoc opts :type :tr))
(defcomp "tt" (assoc opts :type :tt))
(defcomp "tv" (assoc opts :type :tv))
(defcomp "tw" (assoc opts :type :tw))
(defcomp "tz" (assoc opts :type :tz))
(defcomp "ua" (assoc opts :type :ua))
(defcomp "ug" (assoc opts :type :ug))
(defcomp "um" (assoc opts :type :um))
(defcomp "us" (assoc opts :type :us))
(defcomp "uy" (assoc opts :type :uy))
(defcomp "uz" (assoc opts :type :uz))
(defcomp "va" (assoc opts :type :va))
(defcomp "vc" (assoc opts :type :vc))
(defcomp "ve" (assoc opts :type :ve))
(defcomp "vg" (assoc opts :type :vg))
(defcomp "vi" (assoc opts :type :vi))
(defcomp "vn" (assoc opts :type :vn))
(defcomp "vu" (assoc opts :type :vu))
(defcomp "wf" (assoc opts :type :wf))
(defcomp "ws" (assoc opts :type :ws))
(defcomp "ye" (assoc opts :type :ye))
(defcomp "yt" (assoc opts :type :yt))
(defcomp "za" (assoc opts :type :za))
(defcomp "zm" (assoc opts :type :zm))
