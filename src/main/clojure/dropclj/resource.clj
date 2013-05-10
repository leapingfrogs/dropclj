(ns dropclj.resource
  (:import [javax.ws.rs GET Path]))

(defn greet []
  "Yo, mamma!")

(definterface IGreet
  (sayHello []))

(deftype ^{Path {:value "/greet"}} Greeter []
  IGreet
  (^{GET {}} sayHello [_] (greet)))