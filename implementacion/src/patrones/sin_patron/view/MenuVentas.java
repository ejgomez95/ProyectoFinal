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

public class MenuVentas {
    @FXML private Button botonPagos;
    @FXML private Button botonVentas;
    @FXML private Button botonRegresar;
    @FXML private Label labelVentas;

    public void ingresarPago(){
        //Aún no implementado
    }

    public void consultarVentas(){
        //Aún no implementado
    }

    public void lanzarVentanaPagos(ActionEvent actionEvent) {
        //Aún no implementado
    }

    public void regresar(ActionEvent actionEvent) throws IOException {
        Parent dashboardParent = FXMLLoader.load(getClass().getResource("MenuUsuario.fxml"));
        Scene dashboardScene = new Scene(dashboardParent);
        Stage window = (Stage)((Node)actionEvent.getSource()).getScene().getWindow();
        window.setScene(dashboardScene);
        window.show();
    }

    public Button getBotonPagos() {
        return botonPagos;
    }

    public Button getBotonVentas() {
        return botonVentas;
    }

    public Button getBotonRegresar() {
        return botonRegresar;
    }

    public Label getLabelVentas() {
        return labelVentas;
    }
}
