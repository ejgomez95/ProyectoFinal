package patrones.behavioral.controller;

public class PagoTarjeta implements TipoPago{
    private boolean aplicaCredito = false;
    private int plazoMeses;
    private float interes;
    
    @Override
    public float pagar(float monto) {
        if(aplicaCredito == false || plazoMeses <= 0)
            throw new RuntimeException("No se puede realizar el pago con tarjeta de credito");
        else{
            if(interes != 0){
                float montoInteres = monto*interes/100;
                monto += montoInteres;
                System.out.println("Se pago: " + monto + " con tarjeta de credito con: " + plazoMeses + " de meses de plazo y "  + 
                        interes + " % de interes");
            }
            else
                System.out.println("Se pago: " + monto + " con tarjeta de credito y " + plazoMeses + " de meses de plazo");
        }
        return monto;
    }
    
    public boolean isAplicaCredito() {
        return aplicaCredito;
    }

    public void setAplicaCredito(boolean aplicaCredito) {
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
}
