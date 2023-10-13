package Controller;

import App.Bob;
import App.Principal;
import DAO.BobDao;
import Model.BobModel;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

import java.net.URL;
import java.util.ResourceBundle;

public class BobController implements Initializable {

    @FXML
    private Button btnCadastra;

    @FXML
    private Button btnCancela;

    @FXML
    private TextField txtFrota;

    @FXML
    private TextField txtMotorista;

    @FXML
    private TextField txtPlaca;

    @FXML
    private TextField txtTara;

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        btnCancela.setOnMouseClicked((MouseEvent )->{
            fecha();
            iniiciaPrincipal();
        });
        btnCadastra.setOnMouseClicked((KeyEvent)->{
            cadastrarBob();
        });

    }


    public void fecha(){

        Bob.getStage().close();
    }

    public void iniiciaPrincipal() {
        Principal principal = new Principal();
        try {
            fecha();
            principal.start(new Stage());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    private void cadastrarBob(){
        String frota = txtFrota.getText();
        String placaBobs = txtPlaca.getText().toUpperCase();
        String tara = txtTara.getText();

        BobModel bob = new BobModel(0,frota,placaBobs,tara);
        BobDao bobDao = new BobDao();
        if (bobDao.bobadd(bob)){
            Alert alert = new Alert(Alert.AlertType.CONFIRMATION);
            alert.setHeaderText("Bobtail Cadastrado");
            alert.showAndWait();
            fecha();
        }else {
            Alert alert = new Alert(javafx.scene.control.Alert.AlertType.ERROR);
            alert.setHeaderText("Bobtail não Cadastrado.");
        }
    }
}