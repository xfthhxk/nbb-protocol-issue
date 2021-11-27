(ns eg
  (:require ["@pulumi/pulumi" :as p]
            [goog.object]))

(extend-protocol ILookup
  p/resource
  (-lookup
    ([o k]
     (if-some [v (goog.object/get o (clj->js k))]
       v
       (throw (ex-info "No such key in Resource" {:key k}))))
    ([o k not-found]
     (if-some [v (goog.object/get o (clj->js k))]
       v
       not-found))))
