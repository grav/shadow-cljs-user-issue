(ns cljs.user
  #_(:require [datahike.api :as dh]
              [datascript.core :as ds]
              [clojure.core.async :as async :refer [go <!]]
              [portal.web :as p]
              [dfun.web :as web]))

(comment

  (do
    ;; opens new pop-up (if popups are allowed)
    (p/open)
    ;; Add portal as a tap> target
    (add-tap #'p/submit)))

(defn foo [] 43)


(comment
  42)

(comment
  (go (tap>
        (<! (d/hq '[:find ?e ?v ?p
                    #_#_#_:in $ ?a
                    :where
                    [?e :artist-name ?v]
                    [?e :plays ?p]
                    #_[?e :age ?a]]
                 @(:!conn @web/!app-state)
                 45)))))

(comment
  (go
    (<! (dh/transact (:!conn @web/!app-state) [{:artist-name (str "niels-" (rand-int 100000))}]))
    (<! (web/update-state! (:!conn @web/!app-state)))))