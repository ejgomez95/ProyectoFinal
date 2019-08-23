
import org.junit.Test;
import static org.junit.Assert.*;
import patrones.sin_patron.model.Articulo;
import patrones.behavioral.controller.EntregaLocal;


public class EntregaLocalTest {
    EntregaLocal el = new EntregaLocal();
    Articulo a = new Articulo("XBOX 360","videojuegos","consola",400);
    
    @Test
    public void entregar() {
        assertEquals(a,el.entregar(a));
    }
}
