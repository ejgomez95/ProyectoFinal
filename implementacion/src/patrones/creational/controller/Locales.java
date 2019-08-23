package patrones.creational.controller;

import patrones.sin_patron.model.Articulo;

import java.util.List;

public interface Locales {
    List<Articulo> crearInventario();
    Articulo venderLocal();
    Articulo venderDomicilio();
}
