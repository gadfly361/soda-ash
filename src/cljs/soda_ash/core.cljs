(ns soda-ash.core
  (:require
   [soda-ash.helpers :as h]
   [soda-ash.elements.button :as button]
   [soda-ash.elements.container :as container]
   [soda-ash.elements.divider :as divider]
   [soda-ash.elements.flag :as flag]
   [soda-ash.elements.header :as header]
   ))


;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;
;; ELEMENTS
;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;

;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;
;; button

(def button' button/class)
(def button button/component)

(def button-primary' button/class-primary)
(def button-primary button/component-primary)

(def button-secondary' button/class-secondary)
(def button-secondary button/component-secondary)

(def button-animated' button/class-animated)
(def button-animated button/component-animated)

(def button-vertical-animated' button/class-vertical-animated)
(def button-vertical-animated button/component-vertical-animated)

(def button-animated-fade' button/class-animated-fade)
(def button-animated-fade button/component-animated-fade)

(def button-labeled' button/class-labeled)
(def button-labeled button/component-labeled)

(def button-left-labeled' button/class-left-labeled)
(def button-left-labeled button/component-left-labeled)

(def button-icon' button/class-icon)
(def button-icon button/component-icon)

(def button-labeled-icon' button/class-labeled-icon)
(def button-labeled-icon button/component-labeled-icon)

(def button-right-labeled-icon' button/class-right-labeled-icon)
(def button-right-labeled-icon button/component-right-labeled-icon)

(def button-basic' button/class-basic)
(def button-basic button/component-basic)

(def button-inverted' button/class-inverted)
(def button-inverted button/component-inverted)

(def button-inverted-basic' button/class-inverted-basic)
(def button-inverted-basic button/component-inverted-basic)



;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;
;; container

(def container' container/class)
(def container container/component)

(def container-text' container/class-text)
(def container-text container/component-text)



;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;
;; divider

(def divider' divider/class)
(def divider divider/component)

(def divider-vertical' divider/class-vertical)
(def divider-vertical divider/component-vertical)

(def divider-horizontal' divider/class-horizontal)
(def divider-horizontal divider/component-horizontal)

(def divider-horizontal-header' divider/class-horizontal-header)
(def divider-horizontal-header divider/component-horizontal-header)


;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;
;; flag

(def flag-ae' flag/class-ae)
(def flag-ae flag/component-ae)

(def flag-af' flag/class-af)
(def flag-af flag/component-af)

(def flag-ag' flag/class-ag)
(def flag-ag flag/component-ag)

(def flag-ai' flag/class-ai)
(def flag-ai flag/component-ai)

(def flag-al' flag/class-al)
(def flag-al flag/component-al)

(def flag-am' flag/class-am)
(def flag-am flag/component-am)

(def flag-an' flag/class-an)
(def flag-an flag/component-an)

(def flag-ao' flag/class-ao)
(def flag-ao flag/component-ao)

(def flag-ar' flag/class-ar)
(def flag-ar flag/component-ar)

(def flag-as' flag/class-as)
(def flag-as flag/component-as)

(def flag-at' flag/class-at)
(def flag-at flag/component-at)

(def flag-au' flag/class-au)
(def flag-au flag/component-au)

(def flag-aw' flag/class-aw)
(def flag-aw flag/component-aw)

(def flag-ax' flag/class-ax)
(def flag-ax flag/component-ax)

(def flag-az' flag/class-az)
(def flag-az flag/component-az)

(def flag-ba' flag/class-ba)
(def flag-ba flag/component-ba)

(def flag-bb' flag/class-bb)
(def flag-bb flag/component-bb)

(def flag-bd' flag/class-bd)
(def flag-bd flag/component-bd)

(def flag-be' flag/class-be)
(def flag-be flag/component-be)

(def flag-bf' flag/class-bf)
(def flag-bf flag/component-bf)

(def flag-bg' flag/class-bg)
(def flag-bg flag/component-bg)

(def flag-bh' flag/class-bh)
(def flag-bh flag/component-bh)

(def flag-bi' flag/class-bi)
(def flag-bi flag/component-bi)

(def flag-bj' flag/class-bj)
(def flag-bj flag/component-bj)

(def flag-bm' flag/class-bm)
(def flag-bm flag/component-bm)

(def flag-bn' flag/class-bn)
(def flag-bn flag/component-bn)

(def flag-bo' flag/class-bo)
(def flag-bo flag/component-bo)

(def flag-br' flag/class-br)
(def flag-br flag/component-br)

(def flag-bs' flag/class-bs)
(def flag-bs flag/component-bs)

(def flag-bt' flag/class-bt)
(def flag-bt flag/component-bt)

(def flag-bv' flag/class-bv)
(def flag-bv flag/component-bv)

(def flag-bw' flag/class-bw)
(def flag-bw flag/component-bw)

(def flag-by' flag/class-by)
(def flag-by flag/component-by)

(def flag-bz' flag/class-bz)
(def flag-bz flag/component-bz)

(def flag-ca' flag/class-ca)
(def flag-ca flag/component-ca)

(def flag-cc' flag/class-cc)
(def flag-cc flag/component-cc)

(def flag-cd' flag/class-cd)
(def flag-cd flag/component-cd)

(def flag-cf' flag/class-cf)
(def flag-cf flag/component-cf)

(def flag-cg' flag/class-cg)
(def flag-cg flag/component-cg)

(def flag-ch' flag/class-ch)
(def flag-ch flag/component-ch)

(def flag-ci' flag/class-ci)
(def flag-ci flag/component-ci)

(def flag-ck' flag/class-ck)
(def flag-ck flag/component-ck)

(def flag-cl' flag/class-cl)
(def flag-cl flag/component-cl)

(def flag-cm' flag/class-cm)
(def flag-cm flag/component-cm)

(def flag-cn' flag/class-cn)
(def flag-cn flag/component-cn)

(def flag-co' flag/class-co)
(def flag-co flag/component-co)

(def flag-cr' flag/class-cr)
(def flag-cr flag/component-cr)

(def flag-cs' flag/class-cs)
(def flag-cs flag/component-cs)

(def flag-cu' flag/class-cu)
(def flag-cu flag/component-cu)

(def flag-cv' flag/class-cv)
(def flag-cv flag/component-cv)

(def flag-cx' flag/class-cx)
(def flag-cx flag/component-cx)

(def flag-cy' flag/class-cy)
(def flag-cy flag/component-cy)

(def flag-cz' flag/class-cz)
(def flag-cz flag/component-cz)

(def flag-de' flag/class-de)
(def flag-de flag/component-de)

(def flag-dj' flag/class-dj)
(def flag-dj flag/component-dj)

(def flag-dk' flag/class-dk)
(def flag-dk flag/component-dk)

(def flag-dm' flag/class-dm)
(def flag-dm flag/component-dm)

(def flag-do' flag/class-do)
(def flag-do flag/component-do)

(def flag-dz' flag/class-dz)
(def flag-dz flag/component-dz)

(def flag-ec' flag/class-ec)
(def flag-ec flag/component-ec)

(def flag-ee' flag/class-ee)
(def flag-ee flag/component-ee)

(def flag-eg' flag/class-eg)
(def flag-eg flag/component-eg)

(def flag-eh' flag/class-eh)
(def flag-eh flag/component-eh)

(def flag-er' flag/class-er)
(def flag-er flag/component-er)

(def flag-es' flag/class-es)
(def flag-es flag/component-es)

(def flag-et' flag/class-et)
(def flag-et flag/component-et)

(def flag-eu' flag/class-eu)
(def flag-eu flag/component-eu)

(def flag-fi' flag/class-fi)
(def flag-fi flag/component-fi)

(def flag-fj' flag/class-fj)
(def flag-fj flag/component-fj)

(def flag-fk' flag/class-fk)
(def flag-fk flag/component-fk)

(def flag-fm' flag/class-fm)
(def flag-fm flag/component-fm)

(def flag-fo' flag/class-fo)
(def flag-fo flag/component-fo)

(def flag-fr' flag/class-fr)
(def flag-fr flag/component-fr)

(def flag-ga' flag/class-ga)
(def flag-ga flag/component-ga)

(def flag-gb' flag/class-gb)
(def flag-gb flag/component-gb)

(def flag-gd' flag/class-gd)
(def flag-gd flag/component-gd)

(def flag-ge' flag/class-ge)
(def flag-ge flag/component-ge)

(def flag-gf' flag/class-gf)
(def flag-gf flag/component-gf)

(def flag-gh' flag/class-gh)
(def flag-gh flag/component-gh)

(def flag-gi' flag/class-gi)
(def flag-gi flag/component-gi)

(def flag-gl' flag/class-gl)
(def flag-gl flag/component-gl)

(def flag-gm' flag/class-gm)
(def flag-gm flag/component-gm)

(def flag-gn' flag/class-gn)
(def flag-gn flag/component-gn)

(def flag-gp' flag/class-gp)
(def flag-gp flag/component-gp)

(def flag-gq' flag/class-gq)
(def flag-gq flag/component-gq)

(def flag-gr' flag/class-gr)
(def flag-gr flag/component-gr)

(def flag-gs' flag/class-gs)
(def flag-gs flag/component-gs)

(def flag-gt' flag/class-gt)
(def flag-gt flag/component-gt)

(def flag-gu' flag/class-gu)
(def flag-gu flag/component-gu)

(def flag-gw' flag/class-gw)
(def flag-gw flag/component-gw)

(def flag-gy' flag/class-gy)
(def flag-gy flag/component-gy)

(def flag-hk' flag/class-hk)
(def flag-hk flag/component-hk)

(def flag-hm' flag/class-hm)
(def flag-hm flag/component-hm)

(def flag-hn' flag/class-hn)
(def flag-hn flag/component-hn)

(def flag-hr' flag/class-hr)
(def flag-hr flag/component-hr)

(def flag-ht' flag/class-ht)
(def flag-ht flag/component-ht)

(def flag-hu' flag/class-hu)
(def flag-hu flag/component-hu)

(def flag-id' flag/class-id)
(def flag-id flag/component-id)

(def flag-ie' flag/class-ie)
(def flag-ie flag/component-ie)

(def flag-il' flag/class-il)
(def flag-il flag/component-il)

(def flag-in' flag/class-in)
(def flag-in flag/component-in)

(def flag-io' flag/class-io)
(def flag-io flag/component-io)

(def flag-iq' flag/class-iq)
(def flag-iq flag/component-iq)

(def flag-ir' flag/class-ir)
(def flag-ir flag/component-ir)

(def flag-is' flag/class-is)
(def flag-is flag/component-is)

(def flag-it' flag/class-it)
(def flag-it flag/component-it)

(def flag-jm' flag/class-jm)
(def flag-jm flag/component-jm)

(def flag-jo' flag/class-jo)
(def flag-jo flag/component-jo)

(def flag-jp' flag/class-jp)
(def flag-jp flag/component-jp)

(def flag-ke' flag/class-ke)
(def flag-ke flag/component-ke)

(def flag-kg' flag/class-kg)
(def flag-kg flag/component-kg)

(def flag-kh' flag/class-kh)
(def flag-kh flag/component-kh)

(def flag-ki' flag/class-ki)
(def flag-ki flag/component-ki)

(def flag-km' flag/class-km)
(def flag-km flag/component-km)

(def flag-kn' flag/class-kn)
(def flag-kn flag/component-kn)

(def flag-kp' flag/class-kp)
(def flag-kp flag/component-kp)

(def flag-kr' flag/class-kr)
(def flag-kr flag/component-kr)

(def flag-kw' flag/class-kw)
(def flag-kw flag/component-kw)

(def flag-ky' flag/class-ky)
(def flag-ky flag/component-ky)

(def flag-kz' flag/class-kz)
(def flag-kz flag/component-kz)

(def flag-la' flag/class-la)
(def flag-la flag/component-la)

(def flag-lb' flag/class-lb)
(def flag-lb flag/component-lb)

(def flag-lc' flag/class-lc)
(def flag-lc flag/component-lc)

(def flag-li' flag/class-li)
(def flag-li flag/component-li)

(def flag-lk' flag/class-lk)
(def flag-lk flag/component-lk)

(def flag-lr' flag/class-lr)
(def flag-lr flag/component-lr)

(def flag-ls' flag/class-ls)
(def flag-ls flag/component-ls)

(def flag-lt' flag/class-lt)
(def flag-lt flag/component-lt)

(def flag-lu' flag/class-lu)
(def flag-lu flag/component-lu)

(def flag-lv' flag/class-lv)
(def flag-lv flag/component-lv)

(def flag-ly' flag/class-ly)
(def flag-ly flag/component-ly)

(def flag-ma' flag/class-ma)
(def flag-ma flag/component-ma)

(def flag-mc' flag/class-mc)
(def flag-mc flag/component-mc)

(def flag-md' flag/class-md)
(def flag-md flag/component-md)

(def flag-me' flag/class-me)
(def flag-me flag/component-me)

(def flag-mg' flag/class-mg)
(def flag-mg flag/component-mg)

(def flag-mh' flag/class-mh)
(def flag-mh flag/component-mh)

(def flag-mk' flag/class-mk)
(def flag-mk flag/component-mk)

(def flag-ml' flag/class-ml)
(def flag-ml flag/component-ml)

(def flag-mm' flag/class-mm)
(def flag-mm flag/component-mm)

(def flag-mn' flag/class-mn)
(def flag-mn flag/component-mn)

(def flag-mo' flag/class-mo)
(def flag-mo flag/component-mo)

(def flag-mp' flag/class-mp)
(def flag-mp flag/component-mp)

(def flag-mq' flag/class-mq)
(def flag-mq flag/component-mq)

(def flag-mr' flag/class-mr)
(def flag-mr flag/component-mr)

(def flag-ms' flag/class-ms)
(def flag-ms flag/component-ms)

(def flag-mt' flag/class-mt)
(def flag-mt flag/component-mt)

(def flag-mu' flag/class-mu)
(def flag-mu flag/component-mu)

(def flag-mv' flag/class-mv)
(def flag-mv flag/component-mv)

(def flag-mw' flag/class-mw)
(def flag-mw flag/component-mw)

(def flag-mx' flag/class-mx)
(def flag-mx flag/component-mx)

(def flag-my' flag/class-my)
(def flag-my flag/component-my)

(def flag-mz' flag/class-mz)
(def flag-mz flag/component-mz)

(def flag-na' flag/class-na)
(def flag-na flag/component-na)

(def flag-nc' flag/class-nc)
(def flag-nc flag/component-nc)

(def flag-ne' flag/class-ne)
(def flag-ne flag/component-ne)

(def flag-nf' flag/class-nf)
(def flag-nf flag/component-nf)

(def flag-ng' flag/class-ng)
(def flag-ng flag/component-ng)

(def flag-ni' flag/class-ni)
(def flag-ni flag/component-ni)

(def flag-nl' flag/class-nl)
(def flag-nl flag/component-nl)

(def flag-no' flag/class-no)
(def flag-no flag/component-no)

(def flag-np' flag/class-np)
(def flag-np flag/component-np)

(def flag-nr' flag/class-nr)
(def flag-nr flag/component-nr)

(def flag-nu' flag/class-nu)
(def flag-nu flag/component-nu)

(def flag-nz' flag/class-nz)
(def flag-nz flag/component-nz)

(def flag-om' flag/class-om)
(def flag-om flag/component-om)

(def flag-pa' flag/class-pa)
(def flag-pa flag/component-pa)

(def flag-pe' flag/class-pe)
(def flag-pe flag/component-pe)

(def flag-pf' flag/class-pf)
(def flag-pf flag/component-pf)

(def flag-pg' flag/class-pg)
(def flag-pg flag/component-pg)

(def flag-ph' flag/class-ph)
(def flag-ph flag/component-ph)

(def flag-pk' flag/class-pk)
(def flag-pk flag/component-pk)

(def flag-pl' flag/class-pl)
(def flag-pl flag/component-pl)

(def flag-pm' flag/class-pm)
(def flag-pm flag/component-pm)

(def flag-pn' flag/class-pn)
(def flag-pn flag/component-pn)

(def flag-pr' flag/class-pr)
(def flag-pr flag/component-pr)

(def flag-ps' flag/class-ps)
(def flag-ps flag/component-ps)

(def flag-pt' flag/class-pt)
(def flag-pt flag/component-pt)

(def flag-pw' flag/class-pw)
(def flag-pw flag/component-pw)

(def flag-py' flag/class-py)
(def flag-py flag/component-py)

(def flag-qa' flag/class-qa)
(def flag-qa flag/component-qa)

(def flag-re' flag/class-re)
(def flag-re flag/component-re)

(def flag-ro' flag/class-ro)
(def flag-ro flag/component-ro)

(def flag-rs' flag/class-rs)
(def flag-rs flag/component-rs)

(def flag-ru' flag/class-ru)
(def flag-ru flag/component-ru)

(def flag-rw' flag/class-rw)
(def flag-rw flag/component-rw)

(def flag-sa' flag/class-sa)
(def flag-sa flag/component-sa)

(def flag-sb' flag/class-sb)
(def flag-sb flag/component-sb)

(def flag-sc' flag/class-sc)
(def flag-sc flag/component-sc)

(def flag-sd' flag/class-sd)
(def flag-sd flag/component-sd)

(def flag-se' flag/class-se)
(def flag-se flag/component-se)

(def flag-sg' flag/class-sg)
(def flag-sg flag/component-sg)

(def flag-sh' flag/class-sh)
(def flag-sh flag/component-sh)

(def flag-si' flag/class-si)
(def flag-si flag/component-si)

(def flag-sj' flag/class-sj)
(def flag-sj flag/component-sj)

(def flag-sk' flag/class-sk)
(def flag-sk flag/component-sk)

(def flag-sl' flag/class-sl)
(def flag-sl flag/component-sl)

(def flag-sm' flag/class-sm)
(def flag-sm flag/component-sm)

(def flag-sn' flag/class-sn)
(def flag-sn flag/component-sn)

(def flag-so' flag/class-so)
(def flag-so flag/component-so)

(def flag-sr' flag/class-sr)
(def flag-sr flag/component-sr)

(def flag-st' flag/class-st)
(def flag-st flag/component-st)

(def flag-sv' flag/class-sv)
(def flag-sv flag/component-sv)

(def flag-sy' flag/class-sy)
(def flag-sy flag/component-sy)

(def flag-sz' flag/class-sz)
(def flag-sz flag/component-sz)

(def flag-tc' flag/class-tc)
(def flag-tc flag/component-tc)

(def flag-td' flag/class-td)
(def flag-td flag/component-td)

(def flag-tf' flag/class-tf)
(def flag-tf flag/component-tf)

(def flag-tg' flag/class-tg)
(def flag-tg flag/component-tg)

(def flag-th' flag/class-th)
(def flag-th flag/component-th)

(def flag-tj' flag/class-tj)
(def flag-tj flag/component-tj)

(def flag-tk' flag/class-tk)
(def flag-tk flag/component-tk)

(def flag-tl' flag/class-tl)
(def flag-tl flag/component-tl)

(def flag-tm' flag/class-tm)
(def flag-tm flag/component-tm)

(def flag-tn' flag/class-tn)
(def flag-tn flag/component-tn)

(def flag-to' flag/class-to)
(def flag-to flag/component-to)

(def flag-tr' flag/class-tr)
(def flag-tr flag/component-tr)

(def flag-tt' flag/class-tt)
(def flag-tt flag/component-tt)

(def flag-tv' flag/class-tv)
(def flag-tv flag/component-tv)

(def flag-tw' flag/class-tw)
(def flag-tw flag/component-tw)

(def flag-tz' flag/class-tz)
(def flag-tz flag/component-tz)

(def flag-ua' flag/class-ua)
(def flag-ua flag/component-ua)

(def flag-ug' flag/class-ug)
(def flag-ug flag/component-ug)

(def flag-um' flag/class-um)
(def flag-um flag/component-um)

(def flag-us' flag/class-us)
(def flag-us flag/component-us)

(def flag-uy' flag/class-uy)
(def flag-uy flag/component-uy)

(def flag-uz' flag/class-uz)
(def flag-uz flag/component-uz)

(def flag-va' flag/class-va)
(def flag-va flag/component-va)

(def flag-vc' flag/class-vc)
(def flag-vc flag/component-vc)

(def flag-ve' flag/class-ve)
(def flag-ve flag/component-ve)

(def flag-vg' flag/class-vg)
(def flag-vg flag/component-vg)

(def flag-vi' flag/class-vi)
(def flag-vi flag/component-vi)

(def flag-vn' flag/class-vn)
(def flag-vn flag/component-vn)

(def flag-vu' flag/class-vu)
(def flag-vu flag/component-vu)

(def flag-wf' flag/class-wf)
(def flag-wf flag/component-wf)

(def flag-ws' flag/class-ws)
(def flag-ws flag/component-ws)

(def flag-ye' flag/class-ye)
(def flag-ye flag/component-ye)

(def flag-yt' flag/class-yt)
(def flag-yt flag/component-yt)

(def flag-za' flag/class-za)
(def flag-za flag/component-za)

(def flag-zm' flag/class-zm)
(def flag-zm flag/component-zm)



;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;
;; header

(def header-h1' header/class-h1)
(def header-h1 header/component-h1)

(def header-h2' header/class-h2)
(def header-h2 header/component-h2)

(def header-h3' header/class-h3)
(def header-h3 header/component-h3)

(def header-h4' header/class-h4)
(def header-h4 header/component-h4)

(def header-h5' header/class-h5)
(def header-h5 header/component-h5)

(def header-huge' header/class-huge)
(def header-huge header/component-huge)

(def header-large' header/class-large)
(def header-large header/component-large)

(def header-medium' header/class-medium)
(def header-medium header/component-medium)

(def header-small' header/class-small)
(def header-small header/component-small)

(def header-tiny' header/class-tiny)
(def header-tiny header/component-tiny)

(def header-icon' header/class-icon)
(def header-icon header/component-icon)

(def header-sub' header/class-sub)
(def header-sub header/component-sub)
