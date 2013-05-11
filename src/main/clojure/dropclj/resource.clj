(ns dropclj.resource
  (:import [javax.ws.rs GET Path PathParam]))

(defn greet [name]
  (str "Yo, " name "!"))

(definterface IGreet
  (sayHello [^String name]))

(deftype ^{Path {:value "/greet/{name}"}} Greeter []
  IGreet
  (^{GET {}} sayHello [_ ^{PathParam {:value "name"}} ^String name] (greet name)))