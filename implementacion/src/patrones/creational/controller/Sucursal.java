package patrones.creational.controller;

import patrones.sinPatron.model.Articulo;

import java.util.List;

public class Sucursal implements Locales{
    private List<Articulo> inventarioSucursal;
    @Override
    public List<Articulo> crearInventario() {
        return null;
    }

    @Override
    public Articulo venderLocal() {
        return null;
    }

    @Override
    public Articulo venderDomicilio() {
        return null;
    }
}
