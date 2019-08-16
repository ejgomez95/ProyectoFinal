package patrones.creational.controller;

import patrones.sinPatron.model.Articulo;

import java.util.List;

public class Matriz implements Locales {
    private List<Articulo> inventarioMatriz;
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
