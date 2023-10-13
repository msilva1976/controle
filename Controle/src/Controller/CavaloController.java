package Controller;
import App.Cavalo;
import App.Principal;

import App.Carreta;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.stage.Stage;
import org.w3c.dom.events.MouseEvent;

import java.net.URL;
import java.util.ResourceBundle;

public class CavaloController implements Initializable {

    @FXML
    private Button btnCadastrar;

    @FXML
    private Button btnCancela;

    @FXML
    private TextField txtEmpresa;

    @FXML
    private TextField txtFrota;

    @FXML
    private TextField txtMotorista;

    @FXML
    private TextField txtPlaCavalo;

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        btnCancela.setOnMouseClicked((MouseEvent)->{
            fecha();


        });
    }
    public void fecha(){
        Cavalo.getStage().close();
        try {
            Principal principal = new Principal();
            principal.start(new Stage());

        }catch (Exception e){
            e.printStackTrace();

        }

    }

}