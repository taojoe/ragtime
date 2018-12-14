(defproject com.github.taojoe/ragtime.jdbc "0.7.2"
  :description "Ragtime migrations for JDBC"
  :url "https://github.com/taojoe/ragtime"
  :scm {:dir ".."}
  :license {:name "Eclipse Public License"
            :url "http://www.eclipse.org/legal/epl-v10.html"}
  :dependencies [[org.clojure/clojure "1.8.0"]
                 [org.clojure/java.jdbc "0.5.8"]
                 [com.github.taojoe/ragtime.core "0.7.2"]
                 [resauce "0.1.0"]]
  :profiles
  {:dev {:dependencies [[com.h2database/h2 "1.3.160"]]}})
