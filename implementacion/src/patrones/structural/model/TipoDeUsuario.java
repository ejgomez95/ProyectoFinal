package patrones.structural.model;

import patrones.sinPatron.model.Articulo;

import java.util.List;

public interface TipoDeUsuario {
    List<Usuario> almacenarDatos();
    Articulo buscarArticulo(List<Articulo> la);
    void seleccionarArticulo(Articulo a);
}
