package patrones.creational.controller;

import patrones.sinPatron.model.Articulo;

import java.util.List;

public interface Locales {
    List<Articulo> crearInventario();
    Articulo venderLocal();
    Articulo venderDomicilio();

    //TODO: Esta interfaz se relaciona con MenuLocal y MenuEmpresa
    //TODO: Esta interfaz es implementada por Matriz, Sucursal y Bodega
}
