package patrones.structural.model;

import patrones.sin_patron.model.Articulo;

import java.util.List;

public interface TipoDeUsuario {
    List<Usuario> almacenarDatos();
    Articulo buscarArticulo(List<Articulo> la);
    void seleccionarArticulo(Articulo a);
}
