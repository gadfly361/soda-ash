## 0.1.0-beta

* adds the following elements
  * list
  * rail
  * step
* remove :group? and replace with plural version of the element.<sup>1</sup> In other words, adds the following:
  * buttons
  * icons
  * images
  * labels
  * segments

<sup>1</sup> Breaking change. Example for how to update affected elements:

```
;; 0.1.0-alpha2
[s/button {:soda {:tag :div
                  :group? true
                  :color :red}}
  ... ]

;; 0.1.0-beta
[s/buttons {:soda {:color :red}} ;; <-- note the extra "s"
  ... ]
```


## 0.1.0-alpha2 [source](https://github.com/gadfly361/soda-ash/tree/4f266c3d3a9dbca240238a3c6f3d2f62cf80586a)

* initial release
* targets Semantic UI version 2.1.8 and Reagent 0.5.1

## 0.1.0-alpha1

* broken release (forgot to set :source-paths)

## 0.1.0-alpha

* broken release (forgot to set :source-paths)
