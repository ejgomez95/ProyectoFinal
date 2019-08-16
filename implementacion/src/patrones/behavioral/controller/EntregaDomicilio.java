package patrones.behavioral.controller;

import patrones.sinPatron.model.Articulo;
import patrones.sinPatron.model.Repartidor;
import patrones.sinPatron.model.Ruta;

public class EntregaDomicilio implements TipoEntrega{
    private Ruta ruta;
    private Repartidor repartidor;

    @Override
    public void entregar(Articulo articulo) {
        //TODO: Implementar
    }
}
