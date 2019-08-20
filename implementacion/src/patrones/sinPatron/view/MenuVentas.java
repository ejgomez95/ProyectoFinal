package patrones.sinPatron.view;

import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.stage.Stage;

import java.io.IOException;

public class MenuVentas {
    public Button botonPagos;
    public Button botonVentas;
    public Button botonRegresar;
    public Label labelVentas;

    public void ingresarPago(){
        //TODO: Implementar
        //TODO: Referir a clase Pago
    }

    public void consultarVentas(){
        //TODO: Implementar
        //TODO: Referir a clase Venta y clase Entrega
    }

    public void lanzarVentanaPagos(ActionEvent actionEvent) {
    }

    public void regresar(ActionEvent actionEvent) throws IOException {
        Parent dashboardParent = FXMLLoader.load(getClass().getResource("MenuUsuario.fxml"));
        Scene dashboardScene = new Scene(dashboardParent);
        Stage window = (Stage)((Node)actionEvent.getSource()).getScene().getWindow();
        window.setScene(dashboardScene);
        window.show();
    }
}
