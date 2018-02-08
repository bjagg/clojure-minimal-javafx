# clojure-minimal-javafx

A Clojure application that implements the very short program
defined in the JavaDocs for [`javafx.application.Application`][1]:

```
import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.shape.Circle;
import javafx.stage.Stage;

public class MyApp extends Application {
    public void start(Stage stage) {
        Circle circ = new Circle(40, 40, 30);
        Group root = new Group(circ);
        Scene scene = new Scene(root, 400, 300);

        stage.setTitle("My JavaFX Application");
        stage.setScene(scene);
        stage.show();
    }
}
```

### Code Notes

- The addition of `:main` and `:aot` to `project.clj` is required due
to the self-reference in the `-main` function.
- The Java code uses a variadic argument constructor for `javafx.scene.Group`.
In Clojure, it is challenging to invoke this constructor. Instead, the 
no-argument constructor is used, and the circle is added post-creation.
- The generated Application class needs to be passed to `launch()` as functions
are inner classes in Java. Also, hyphens in namespaces are converted
to underscores for packages and files.

## Usage

```
   lein run
```

## License

Copyright © 2018 Benito Gonzalez

Distributed under the Eclipse Public License.

[1]: https://docs.oracle.com/javase/8/javafx/api/javafx/application/Application.html
