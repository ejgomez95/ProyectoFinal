package patrones.sinPatron.view;

import javafx.event.ActionEvent;
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
    public Button BotonSalir;
    public Button BotonIngresar;
    public PasswordField CampoContraseña;
    public TextField CampoUsuario;
    public Label labelNombreEmpresa;
    public Label labelAdvertencia;

    public void ingresar(ActionEvent actionEvent) throws IOException {
        //Codigo de lanzamiento para la ventana del menuUsuario
        Parent dashboardParent = FXMLLoader.load(getClass().getResource("MenuUsuario.fxml"));
        Scene dashboardScene = new Scene(dashboardParent);
        Stage window = (Stage)((Node)actionEvent.getSource()).getScene().getWindow();
        window.setScene(dashboardScene);
        window.show();
    }

    public void cerrarSistema(ActionEvent actionEvent) {
    }
}
