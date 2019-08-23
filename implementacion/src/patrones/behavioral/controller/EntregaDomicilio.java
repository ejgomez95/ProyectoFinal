package patrones.behavioral.controller;

import patrones.sin_patron.model.Articulo;
import patrones.structural.model.Repartidor;
import patrones.sin_patron.model.Ruta;

public class EntregaDomicilio implements TipoEntrega{
    private Ruta ruta;
    private Repartidor repartidor;

    @Override
    public Articulo entregar(Articulo articulo) {
        articulo.getVenta().setVendido(true);
        System.out.println("Repartidor: " + repartidor.getNombre() + " " + repartidor.getApellido() + 
                " entrego el articulo con el nombre: " + articulo.getNombre() + 
                " con el costo de: " + articulo.getPrecio() + " usando la ruta: " 
                + ruta.getEnvios().toString());
        return articulo;
    }

    public Ruta getRuta() {
        return ruta;
    }

    public void setRuta(Ruta ruta) {
        this.ruta = ruta;
    }

    public Repartidor getRepartidor() {
        return repartidor;
    }

    public void setRepartidor(Repartidor repartidor) {
        this.repartidor = repartidor;
    }
    
    
}
