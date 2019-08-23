package patrones.sin_patron.view;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

import java.io.IOException;

public class VentanaLogin {

    @FXML private Button botonSalir;
    @FXML private Button botonIngresar;
    @FXML private PasswordField campoContrasena;
    @FXML private TextField campoUsuario;
    @FXML private Label labelNombreEmpresa;
    @FXML private Label labelAdvertencia;

    public void ingresar(ActionEvent actionEvent) throws IOException {
        //Codigo de lanzamiento para la ventana del menuUsuario
        Parent dashboardParent = FXMLLoader.load(getClass().getResource("MenuUsuario.fxml"));
        Scene dashboardScene = new Scene(dashboardParent);
        Stage window = (Stage)((Node)actionEvent.getSource()).getScene().getWindow();
        window.setScene(dashboardScene);
        window.show();
    }

    public void cerrarSistema(ActionEvent actionEvent) {
        //Aún no implementado
    }

    public Button getBotonSalir() {
        return botonSalir;
    }

    public Button getBotonIngresar() {
        return botonIngresar;
    }

    public PasswordField getCampoContrasena() {
        return campoContrasena;
    }

    public TextField getCampoUsuario() {
        return campoUsuario;
    }

    public Label getLabelNombreEmpresa() {
        return labelNombreEmpresa;
    }

    public Label getLabelAdvertencia() {
        return labelAdvertencia;
    }
}
