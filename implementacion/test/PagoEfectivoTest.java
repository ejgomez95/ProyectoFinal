
import org.junit.Test;
import static org.junit.Assert.*;
import patrones.behavioral.controller.PagoEfectivo;

public class PagoEfectivoTest {
    
    //Prueba para verificar si pagar en efectivo se realiza como deberia ser
    //Una prueba para cuando se tiene descuento y otra para cuando no se tiene descuento
    @Test
    public void pagar() {
        float descuento = 10f;
        float monto = 500f;
        PagoEfectivo p = new PagoEfectivo();
        float pagoSinDescuento = p.pagar(monto);
        assertEquals(500,pagoSinDescuento,0.01);
        p.setDescuento(descuento);
        float pagoDescuento = p.pagar(monto);
        assertEquals(450,pagoDescuento,0.01);
    }
}
