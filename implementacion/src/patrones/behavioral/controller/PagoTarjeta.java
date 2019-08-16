package patrones.behavioral.controller;

public class PagoTarjeta implements TipoPago{
    private String aplicaCredito;
    private int plazoMeses;
    private float interes;

    public String getAplicaCredito() {
        return aplicaCredito;
    }

    public void setAplicaCredito(String aplicaCredito) {
        this.aplicaCredito = aplicaCredito;
    }

    public int getPlazoMeses() {
        return plazoMeses;
    }

    public void setPlazoMeses(int plazoMeses) {
        this.plazoMeses = plazoMeses;
    }

    public float getInteres() {
        return interes;
    }

    public void setInteres(float interes) {
        this.interes = interes;
    }

    @Override
    public void pagar(float monto) {
        //TODO: Implementar
    }
}
