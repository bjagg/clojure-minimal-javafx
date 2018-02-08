(defproject clojure-minimal-javafx "1.0"
  :description "Code a minimal JavaFX application."
  :url "http://github.com/bjagg/clojure-minimal-javafx"
  :license {:name "Eclipse Public License"
            :url "http://www.eclipse.org/legal/epl-v10.html"}
  :dependencies [[org.clojure/clojure "1.8.0"]]
  :main clojure-minimal-javafx.core
  :aot [clojure-minimal-javafx.core]
  :profiles {:uberjar {:aot :all}})
