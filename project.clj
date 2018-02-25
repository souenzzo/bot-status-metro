(defproject bot "0.1.0-SNAPSHOT"
  :description "FIXME: write description"
  :url "http://example.com/FIXME"

  :license {:name "Eclipse Public License"
            :url "http://www.eclipse.org/legal/epl-v10.html"}

  :dependencies [[org.clojure/clojure "1.8.0"]
                 [environ             "1.1.0"]
                 [morse               "0.2.4"]
                 [clj-http            "3.7.0"]
                 [org.clojure/data.json "0.2.6"]
                 [clj-time            "0.14.2"]]

  :plugins [[lein-environ "1.1.0"]]

  :main ^:skip-aot bot.core
  :target-path "target/%s"

  :profiles {:uberjar {:aot :all}})
