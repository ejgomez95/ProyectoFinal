package patrones.behavioral.controller;

import patrones.sin_patron.model.Articulo;

public interface TipoEntrega {
    Articulo entregar(Articulo articulo);
}
