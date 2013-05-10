(ns dropclj.core
  (:require [dropclj.resource :refer :all ])
  (:gen-class :extends dropclj.DropcljService))

(defn -cljrun [_ env]
  (.addResource env (dropclj.resource.Greeter.)))

(defn -main
  [& args]
  ;; work around dangerous default behaviour in Clojure
  (alter-var-root #'*read-eval* (constantly false))
  (.run (dropclj.core.) (into-array String args)))
