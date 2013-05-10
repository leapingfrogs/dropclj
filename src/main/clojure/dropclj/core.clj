(ns dropclj.core
  (:gen-class
    :extends dropclj.DropcljService))
;    :methods [[cljrun [com.yammer.dropwizard.config.Environment] Void]]))

(defn -cljrun [_ env]
  (.addResource env (dropclj.HelloResource.))
  (println (str "Here: " env)))

(defn -main
  [& args]
  ;; work around dangerous default behaviour in Clojure
  (alter-var-root #'*read-eval* (constantly false))
  (.run (dropclj.core.) (into-array String args)))
