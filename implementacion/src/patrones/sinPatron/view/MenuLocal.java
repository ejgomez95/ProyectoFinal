package patrones.sinPatron.view;

import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.stage.Stage;
import patrones.sinPatron.model.Articulo;

import java.io.IOException;

public class MenuLocal {

    public Button botonRegresar;
    public Label labelLocal;

    public Articulo buscarArticuloPorNombre(){
        //TODO: Implementar
        return null;
    }

    public Articulo buscarArticuloPorDescripcion(){
        //TODO: Implementar
        return null;
    }

    public Articulo buscarArticuloPorCategoria(){
        //TODO: Implementar
        return null;
    }

    public void consultarArticulos(){
        //TODO: Implementar
    }

    public void regresar(ActionEvent actionEvent) throws IOException {
        Parent dashboardParent = FXMLLoader.load(getClass().getResource("MenuUsuario.fxml"));
        Scene dashboardScene = new Scene(dashboardParent);
        Stage window = (Stage)((Node)actionEvent.getSource()).getScene().getWindow();
        window.setScene(dashboardScene);
        window.show();
    }
}
