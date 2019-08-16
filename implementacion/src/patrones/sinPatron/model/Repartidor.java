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
        return false;
    //TODO: Implementar
    }

    public void realizarEntrega(){
        //TODO: Implementar
    }
}
