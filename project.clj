(defproject dropclj "0.1.0-SNAPSHOT"
  :description "FIXME: write description"
  :url "http://example.com/FIXME"
  :license {:name "Eclipse Public License"
            :url "http://www.eclipse.org/legal/epl-v10.html"}
  :dependencies [
                  [org.clojure/clojure "1.5.1"]
                  [com.yammer.dropwizard/dropwizard-core "0.6.2"]]
  :java-source-paths ["src/main/java"]
  :source-paths ["src/main/clojure"]
  :aot :all
  :main dropclj.core)
