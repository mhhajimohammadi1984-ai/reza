package projectphase1v1;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.stage.Stage;

public class App extends Application {
    @Override
    public void start(Stage stage) {
        Label label = new Label("سلام به JavaFX در VS Code 👋");
        Scene scene = new Scene(label, 400, 200);
        stage.setScene(scene);
        stage.setTitle("HelloFX");
        // haji
        stage.show();
        //i have started using git
    }

    public static void main(String[] args) {
        launch();
    }
}
