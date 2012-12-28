(defproject hive-library "0.1.0-SNAPSHOT"
            :description "FIXME: write this!"
            :dependencies [[org.clojure/clojure "1.4.0"]
                           [noir "1.3.0-beta3"]
                           [com.ashafa/clutch "0.4.0-RC1"]]
            :main hive-library.server
            :immutant {:context-path "/library"})

