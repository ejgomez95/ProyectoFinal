package patrones.behavioral.controller;

import patrones.sin_patron.model.Articulo;

public class EntregaLocal implements TipoEntrega{
    @Override
    public void entregar(Articulo articulo) {
        articulo.getVenta().setVendido(true);
        System.out.println("Articulo: " + articulo.getVenta() + " con el nombre" + articulo.getNombre() + 
                " entregado desde el local con el costo de: " + articulo.getPrecio());
    }
}
