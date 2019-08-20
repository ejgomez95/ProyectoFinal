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

public class MenuEmpresa {
    public Button botonRegresar;
    public Label labelEmpresa;

    public void seleccionarLocal(){
        //TODO: Implementar
        //TODO: Utilizar la interfaz Locales en implementación
    }

    public void regresar(ActionEvent actionEvent) throws IOException {
        Parent dashboardParent = FXMLLoader.load(getClass().getResource("MenuUsuario.fxml"));
        Scene dashboardScene = new Scene(dashboardParent);
        Stage window = (Stage)((Node)actionEvent.getSource()).getScene().getWindow();
        window.setScene(dashboardScene);
        window.show();
    }
}
