(defproject onenote-cli "0.1.0-SNAPSHOT"
    :description "A command line interface for Microsoft OneNote"
    :url "https://github.com/serialoverflow/onenote-cli"
    :license {:name "MIT"
              :url  "https://opensource.org/licenses/MIT"}
    :dependencies [
                   [org.clojure/clojure "1.8.0"]
                   [org.clojure/tools.cli "0.3.5"]
                   [clj-http "3.1.0"]
                   ]
    :main onenote-cli.core
    :aot :all
    :bin {:name "onenote-cli"})

