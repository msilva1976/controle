package Controller;

import App.Carreta;
import App.Principal;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

import java.awt.event.MouseEvent;
import java.net.URL;
import java.util.ResourceBundle;

public class CarretaController implements Initializable {

    @FXML    private Button btnCadastrar;
    @FXML    private Button btnCancela;
    @FXML    private TextField txtCapacidade;
    @FXML    private TextField txtDestino;
    @FXML    private TextField txtEixo;
    @FXML    private TextField txtMotorista;
    @FXML    private TextField txtPlacaCarreta;
    @FXML    private TextField txtfrota;
    @FXML    private TextField txttxtPlaCavalo;

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        btnCancela.setOnMouseClicked((MouseEvent)->{
            fechar();
            iniiciaPrincipal();

        });


    }

    public void fechar(){
        Carreta.getStage().close();
    }
    public void iniiciaPrincipal(){
        Principal principal = new Principal();
        try {
            fechar();
            principal.start(new Stage());
        }catch (Exception e ){
            e.printStackTrace();
        }

    }
}
