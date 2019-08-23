package patrones.sin_patron.model;

public class Envio {
    private String direccion;

    public Envio(String direccion) {
        this.direccion = direccion;
    }

    public String getDireccion() {
        return direccion;
    }

    @Override
    public String toString() {
        return  direccion;
    }
    
    
}
