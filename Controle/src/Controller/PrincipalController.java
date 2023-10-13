package Controller;

import App.Bob;
import App.Carreta;
import App.Cavalo;
import App.Principal;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.MenuItem;
import javafx.scene.control.Tab;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

import java.awt.event.KeyEvent;
import java.net.URL;
import java.util.ResourceBundle;

public class PrincipalController implements Initializable {

    @FXML
    private Tab abaBob;
    @FXML
    private Tab abaCarretas;
    @FXML
    private Tab abaUser;
    @FXML
    private Tab abaUser1;
    @FXML
    private Button btbBobBusca;
    @FXML
    private Button btccarredeleta;
    @FXML
    private Button btnAtualiza;
    @FXML
    private Button btnBobAtualiza;
    @FXML
    private Button btnBobDeleta;
    @FXML
    private Button btnCarreBusca;
    @FXML
    private Button btnCavaloAtualiza;
    @FXML
    private Button btnCavaloDeleta;
    @FXML
    private Button btnCavaloOk;
    @FXML
    private Button btnDeleta;
    @FXML
    private Button btnbusca;
    @FXML
    private Button btncarreatualiza;
    @FXML
    private Label lb2Capacidade;
    @FXML
    private Label lb2Carreta;
    @FXML
    private Label lb2Cavalo;
    @FXML
    private Label lb2Destino;
    @FXML
    private Label lb2Eixos;
    @FXML
    private Label lb2Motorista;
    @FXML
    private Label lb2frota;
    @FXML
    private Label lbCapacidade;
    @FXML
    private Label lbCarrta;
    @FXML
    private Label lbCavalo;
    @FXML
    private Label lbDestino;
    @FXML
    private Label lbEixo;
    @FXML
    private Label lbMotorista;
    @FXML
    private Label lbfrota;
    @FXML
    private MenuItem menuBobs;
    @FXML
    private MenuItem menuCarretas;
    @FXML
    private MenuItem menuCavalos;
    @FXML
    private MenuItem menuSair;
    @FXML
    private MenuItem menuUsuarios;
    @FXML
    private TableColumn<?, ?> tbUseUser;
    @FXML
    private TableColumn<?, ?> tbUserNome;
    @FXML
    private TableColumn<?, ?> tbUserSenha;
    @FXML
    private TableColumn<?, ?> tblBobNomeMo;
    @FXML
    private TableColumn<?, ?> tblBobPlca;
    @FXML
    private TableColumn<?, ?> tblBobTara;
    @FXML
    private TableColumn<?, ?> tblBobfrota;
    @FXML
    private TableColumn<?, ?> tblCarrCapacidade;
    @FXML
    private TableColumn<?, ?> tblCarrCarreta;
    @FXML
    private TableColumn<?, ?> tblCarrCavalo;
    @FXML
    private TableColumn<?, ?> tblCarrDestino;
    @FXML
    private TableColumn<?, ?> tblCarrEixos;
    @FXML
    private TableColumn<?, ?> tblCarrFrota;
    @FXML
    private TableColumn<?, ?> tblCarrMotorista;
    @FXML
    private TableColumn<?, ?> tblCavaloCavalo;
    @FXML
    private TableColumn<?, ?> tblCavaloEmpresa;
    @FXML
    private TableColumn<?, ?> tblCavaloFrota;
    @FXML
    private TableColumn<?, ?> tblCavaloMotorista;
    @FXML
    private TableView<?> tbtBob;
    @FXML
    private TableView<?> tbtCavaloCavalo;
    @FXML
    private TableView<?> tbtUser;
    @FXML
    private TableView<?> tbtcarretas;
    @FXML
    private TextField txtBusca;
    @FXML
    private TextField txtCavaloBusca;
    @FXML
    private TextField txtcarreBusca;

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        menuBobs.setOnAction((KeyEvent)->{
            iniciaBob();
        });
        menuCarretas.setOnAction((KeyEvent)->{
            iniciarCarreta();
        });
        menuCavalos.setOnAction((KeyEvent)->{
            iniciaCavalo();
        });
        menuSair.setOnAction((KeyEvent)->{
            fecha();
        });
    }
    public void iniciaBob(){
        Bob bob = new Bob();
        try {
            Principal.getStage().close();
            bob.start(new Stage());
        }catch (Exception e){
            e.printStackTrace();
        }

    }
    public void iniciarCarreta(){
        Carreta carreta = new Carreta();
        try {
            Principal.getStage().close();
            carreta.start(new Stage());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    public void  iniciaCavalo(){
        Cavalo cavalo = new Cavalo();
        try {
            Principal.getStage().close();
            cavalo.start(new Stage());
        }catch (Exception e){
            e.printStackTrace();
        }

    }
    public void fecha(){
        Principal.getStage().close();
    }


}