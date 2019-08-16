package patrones.structural.model;

import patrones.creational.controller.Bodega;

public interface MetodosJefeGerente {
    void realizarVentasLocales();
    void realizarVentasDomicilio();
    void manejarInventario();
    void peticionRe(Bodega b);
}
