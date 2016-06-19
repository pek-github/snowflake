(defproject snowflake "0.1.0-SNAPSHOT"
  :description "Snowflake service implementation. Snowflake was designed and released by Twitter in 2010"
  :url "https://github.com/pek-github/snowflake"
  :plugins [[lein-ring "0.9.7"]]
  :ring {:handler snowflake.core/handler}
  :license {:name "Apache License, Version 2.0"
            :url "http://www.apache.org/licenses/LICENSE-2.0"}
  :dependencies [[org.clojure/clojure "1.7.0"]
                 [ring/ring-core "1.5.0"] 
                 [ring/ring-jetty-adapter "1.5.0"]
                 [clj-time "0.12.0"]] 
  :main snowflake.core)
