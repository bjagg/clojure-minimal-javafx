(ns clojure-minimal-javafx.core
  (:gen-class
    :main true
    :extends javafx.application.Application))

(defn -start [app stage]
  (let [circ (javafx.scene.shape.Circle. 40 40 40)
        root (javafx.scene.Group.)                  ; Cannot use variadic arg constructor.
        scene (javafx.scene.Scene. root 400 300)]
    (.. root (getChildren) (add circ))              ; Add circle to group.
    (doto stage
      (.setTitle "My JavaFX Application")
      (.setScene scene)
      (.show))))

(defn -main [& args]
  (javafx.application.Application/launch clojure_minimal_javafx.core (into-array String args)))
