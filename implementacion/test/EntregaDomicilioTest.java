
import java.util.ArrayList;
import java.util.List;
import org.junit.Test;
import static org.junit.Assert.*;
import patrones.behavioral.controller.EntregaDomicilio;
import patrones.sin_patron.model.Articulo;
import patrones.sin_patron.model.Envio;
import patrones.sin_patron.model.Ruta;
import patrones.structural.model.Repartidor;


public class EntregaDomicilioTest {
    EntregaDomicilio ed = new EntregaDomicilio();
    Articulo a = new Articulo("XBOX 360","videojuegos","consola",400);
    Repartidor r = new Repartidor("001", "juan", "perez", "masculino");
    List<Envio> envios = new ArrayList<>();
    Ruta ruta = new Ruta(envios);
    Envio e1 = new Envio("Urdesa");
    Envio e2 = new Envio("Ceibos");
    
    @Test
    public void entregar() {
       ed.setRepartidor(r);
       envios.add(e1);
       envios.add(e2);
       ed.setRuta(ruta);
       assertEquals(a,ed.entregar(a));
    }
}

