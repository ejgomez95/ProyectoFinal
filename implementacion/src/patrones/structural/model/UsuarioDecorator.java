package patrones.structural.model;

import patrones.sinPatron.model.Articulo;

public class UsuarioDecorator implements TipoDeUsuario{
    protected String nombre;
    protected String clave;

    public void decorator(Usuario u){
        //TODO: Implementar
    }

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
