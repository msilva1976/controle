package App;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Bob extends Application {
    private static Stage stage;
    public static void main(String[] args) {
        launch(args);
    }
    @Override
    public void start(Stage secondstage) throws Exception {
        Parent root = FXMLLoader.load(getClass().getResource("/View/bobs.fxml"));
        Scene scene = new Scene(root);
        secondstage.setScene(scene);
        secondstage.setTitle("BOBS");
        secondstage.show();
        setStage(secondstage);
    }

    public static Stage getStage() {
        return stage;
    }

    public static void setStage(Stage stage) {
        Bob.stage = stage;
    }
}
