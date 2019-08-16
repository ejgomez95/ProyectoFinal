package patrones.sinPatron.model;

import java.util.Date;

public class Venta {
    private String id;
    private Date fecha;
    private boolean vendido;

    public Venta(String id, Date fecha, boolean vendido) {
        this.id = id;
        this.fecha = fecha;
        this.vendido = vendido;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public boolean isVendido() {
        return vendido;
    }

    public void setVendido(boolean vendido) {
        this.vendido = vendido;
    }
}
