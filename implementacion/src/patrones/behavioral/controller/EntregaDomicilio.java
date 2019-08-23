package patrones.behavioral.controller;

import patrones.sin_patron.model.Articulo;
import patrones.sin_patron.model.Repartidor;
import patrones.sin_patron.model.Ruta;

public class EntregaDomicilio implements TipoEntrega{
    private Ruta ruta;
    private Repartidor repartidor;

    @Override
    public void entregar(Articulo articulo) {
        articulo.getVenta().setVendido(true);
        System.out.println("Repartidor: " + repartidor.getNombre() + " entrego el articulo usando la ruta: " 
                + ruta.getEnvios() + "Articulo: " + articulo.getVenta() + " con el nombre" + articulo.getNombre() + 
                " con el costo de: " + articulo.getPrecio());
    }
}
