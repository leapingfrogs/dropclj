(ns dropclj.core
  (:require [dropclj.resource :refer :all ])
  (:gen-class :extends dropclj.DropcljService))

(defn -cljrun [_ env]
  (.addResource env (dropclj.resource.Greeter.)))

(defn -main [& args]
  (.run (dropclj.core.) (into-array String args)))
