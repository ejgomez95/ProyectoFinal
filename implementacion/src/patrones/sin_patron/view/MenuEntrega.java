package patrones.sin_patron.view;

import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.stage.Stage;

import java.io.IOException;

public class MenuEntrega {
    public Button botonRegresar;
    public Label labelEntrega;

    public void consultarEntregas(){
        //Aún no implementado
    }

    public void regresar(ActionEvent actionEvent) throws IOException {
        Parent dashboardParent = FXMLLoader.load(getClass().getResource("MenuUsuario.fxml"));
        Scene dashboardScene = new Scene(dashboardParent);
        Stage window = (Stage)((Node)actionEvent.getSource()).getScene().getWindow();
        window.setScene(dashboardScene);
        window.show();
    }

    public Button getBotonRegresar() {
        return botonRegresar;
    }

    public Label getLabelEntrega() {
        return labelEntrega;
    }
}
