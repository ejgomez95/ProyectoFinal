package patrones.behavioral.controller;

public class Pago {
    private String tipoPago;
    protected float monto;

    public void setTipoPago(String tipoPago) {
        this.tipoPago = tipoPago;
    }

    public void hacerPago(){
        System.out.println("Pago de: " + monto + " dolares se realizara en: " + tipoPago);
    }
}
