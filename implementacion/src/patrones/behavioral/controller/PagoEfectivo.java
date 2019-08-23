package patrones.behavioral.controller;

public class PagoEfectivo implements TipoPago {
    private float descuento;
    @Override
    public float pagar(float monto) {
        if(descuento != 0){
            float montoDescuento = monto*descuento/100;
            monto -= montoDescuento;
            System.out.println("Se pago: " + monto + " en efectivo con: " + descuento + " % de descuento");
        }
        else    
            System.out.println("Se pago: " + monto + " en efectivo");
        return monto;
    }

    public float getDescuento() {
        return descuento;
    }

    public void setDescuento(float descuento) {
        this.descuento = descuento;
    }


}
