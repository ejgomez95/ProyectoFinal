package patrones.structural.model;

import patrones.sinPatron.model.Articulo;

public class Usuario implements TipoDeUsuario{
    protected String nombre;
    protected String clave;

    @Override
    public void almacenarDatos() {

    }

    @Override
    public Articulo buscarArticulo() {
        return null;
    }

    @Override
    public void seleccionarArticulo(Articulo a) {

    }
}
