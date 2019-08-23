
import org.junit.Test;
import static org.junit.Assert.*;
import patrones.behavioral.controller.PagoTarjeta;

public class PagoTarjetaTest {
    
    //Prueba para verificar si pagar con tarjeta se realiza como deberia ser
    //Una prueba para cuando se tiene interes y otra para cuando no se tiene interes
    @Test
    public void pagar() {
        float interes = 12f;
        float monto = 500f;
        PagoTarjeta p = new PagoTarjeta();
        p.setPlazoMeses(2);
        p.setAplicaCredito(true);
        float pagoSinInteres = p.pagar(monto);
        assertEquals(500,pagoSinInteres,0.01);
        p.setInteres(interes);
        float pagoInteres = p.pagar(monto);
        assertEquals(560,pagoInteres,0.01);   
    }
}