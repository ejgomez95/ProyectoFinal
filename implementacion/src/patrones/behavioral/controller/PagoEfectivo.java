package patrones.behavioral.controller;

public class PagoEfectivo implements TipoPago {
    private float descuento;
    @Override
    public void pagar(float monto) {
        //TODO: Implementar
    }

    public float getDescuento() {
        return descuento;
    }

    public void setDescuento(float descuento) {
        this.descuento = descuento;
    }
}
