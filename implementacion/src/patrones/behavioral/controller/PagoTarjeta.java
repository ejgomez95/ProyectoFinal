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
        if(aplicaCredito.equals("no"))
        System.out.println("No se puede realizar el pago con tarjeta de credito");
        else{
            if(interes != 0){
                float montoInteres = monto*interes/100;
                monto -= montoInteres;
                System.out.println("Se pago: " + monto + " con tarjeta de credito con: " + plazoMeses + " de meses de plazo y: "  + 
                        interes + " de interes");
            }
            else
                System.out.println("Se pago: " + monto + " con tarjeta de credito y: " + plazoMeses + " de meses de plazo");
        }
    }
}
