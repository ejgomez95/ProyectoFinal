package patrones.sinPatron.model;

import patrones.structural.model.JefeBodega;

public class Repartidor {
    private String nombre;
    private String id;
    private Ruta ruta;


    public Repartidor(String nombre, String id) {
        this.nombre = nombre;
        this.id = id;
    }

 public boolean devolverDocs(JefeBodega b){
        System.out.println("Entregado los documentos al jefe de bodega: " + b.getNombre());
        return true;
    }

    public void realizarEntrega(){
        System.out.println("Repartidor: " + nombre + " realizara una entrega");
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Ruta getRuta() {
        return ruta;
    }

    public void setRuta(Ruta ruta) {
        this.ruta = ruta;
    }
}
