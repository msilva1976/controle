package App;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Carreta extends Application {
    private static Stage stage;

    public static void main(String[] args) {
        launch(args);
    }
    @Override
    public void start(Stage thirdstage) throws Exception {
        Parent root = FXMLLoader.load(getClass().getResource("/View/carretas.fxml"));
        Scene scene = new Scene(root);
        thirdstage.setScene(scene);
        thirdstage.setTitle("CARRETA");
        thirdstage.show();
        setStage(thirdstage);
    }

    public static Stage getStage() {
        return stage;
    }

    public static void setStage(Stage stage) {
        Carreta.stage = stage;
    }
}
