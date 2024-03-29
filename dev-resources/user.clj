(ns user
  (:require
    [api-clojure-graphql-test.schema :as s]
    [com.walmartlabs.lacinia :as lacinia])
  )

(def schema (s/load-schema))

(defn q
  [query-string]
  (lacinia/execute schema query-string nil nil)
  )
