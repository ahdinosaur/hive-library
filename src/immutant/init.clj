(ns immutant.init
  ;(:use hive-library.core)
  
  (:require [immutant.messaging :as messaging]
            [immutant.web :as web]
            [immutant.util :as util]
            [noir.server :as server]))

;; This file will be loaded when the application is deployed to Immutant, and
;; can be used to start services your app needs. Examples:

;; To start a Noir app:
(server/load-views (util/app-relative "src/{{nested-dirs}}/views"))
(web/start "/" (server/gen-handler {:mode :dev :ns 'hive-library}))
