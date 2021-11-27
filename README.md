# nbb-protocol-issue
```shell
nbb eg.cljs

----- Error --------------------------------------
Message:  No protocol method IDeref.-deref defined for type null:
Location: /home/foo/nbb-protocol-issue/eg.cljs:6:1

----- Context ------------------------------------
2:   (:require ["@pulumi/pulumi" :as p]
3:             [goog.object]))
4:
5:
6: (extend-protocol ILookup
    ^--- No protocol method IDeref.-deref defined for type null:
7:   p/resource
8:   (-lookup
9:     ([o k]
10:      (if-some [v (goog.object/get o (clj->js k))]
11:        v

----- Stack trace --------------------------------
eg - /home/foo/nbb-protocol-issue/eg.cljs:6:1

No protocol method IDeref.-deref defined for type null:

```
