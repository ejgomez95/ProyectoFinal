package patrones.structural.model;

import patrones.sinPatron.model.Articulo;

public interface TipoDeUsuario {
    public List<Usuario> almacenarDatos();
    Articulo buscarArticulo();
    void seleccionarArticulo(Articulo a);
}
