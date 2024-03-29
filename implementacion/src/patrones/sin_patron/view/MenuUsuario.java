package patrones.sin_patron.view;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.stage.Stage;

import java.io.IOException;

public class MenuUsuario {
    @FXML private Label labelMenu;
    @FXML private Button botonVentas;
    @FXML private Button botonLocal;
    @FXML private Button botonEntregas;
    @FXML private Button botonEmpresa;
    @FXML private Button botonSalir;

    public void consultarUsuarios(){
        //Aún no implementado
    }

    public void lanzarMenuVentas(ActionEvent actionEvent) throws IOException {
        Parent dashboardParent = FXMLLoader.load(getClass().getResource("MenuVentas.fxml"));
        Scene dashboardScene = new Scene(dashboardParent);
        Stage window = (Stage)((Node)actionEvent.getSource()).getScene().getWindow();
        window.setScene(dashboardScene);
        window.show();
    }

    public void lanzarMenuEntregas(ActionEvent actionEvent) throws IOException {
        Parent dashboardParent = FXMLLoader.load(getClass().getResource("MenuEntrega.fxml"));
        Scene dashboardScene = new Scene(dashboardParent);
        Stage window = (Stage)((Node)actionEvent.getSource()).getScene().getWindow();
        window.setScene(dashboardScene);
        window.show();
    }

    public void lanzarMenuLocal(ActionEvent actionEvent) throws IOException {
        Parent dashboardParent = FXMLLoader.load(getClass().getResource("MenuLocal.fxml"));
        Scene dashboardScene = new Scene(dashboardParent);
        Stage window = (Stage)((Node)actionEvent.getSource()).getScene().getWindow();
        window.setScene(dashboardScene);
        window.show();
    }

    public void lanzarMenuEmpresa(ActionEvent actionEvent) throws IOException {
        Parent dashboardParent = FXMLLoader.load(getClass().getResource("MenuEmpresa.fxml"));
        Scene dashboardScene = new Scene(dashboardParent);
        Stage window = (Stage)((Node)actionEvent.getSource()).getScene().getWindow();
        window.setScene(dashboardScene);
        window.show();
    }

    public void salirSistema(ActionEvent actionEvent) {
        //Aún no implementado.
    }

    public Label getLabelMenu() {
        return labelMenu;
    }

    public Button getBotonVentas() {
        return botonVentas;
    }

    public Button getBotonLocal() {
        return botonLocal;
    }

    public Button getBotonEntregas() {
        return botonEntregas;
    }

    public Button getBotonEmpresa() {
        return botonEmpresa;
    }

    public Button getBotonSalir() {
        return botonSalir;
    }
}
