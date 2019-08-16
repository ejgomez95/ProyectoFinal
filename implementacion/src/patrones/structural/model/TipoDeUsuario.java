package patrones.structural.model;

import patrones.sinPatron.model.Articulo;

public interface TipoDeUsuario {
    void almacenarDatos();
    Articulo buscarArticulo();
    void seleccionarArticulo(Articulo a);
}
