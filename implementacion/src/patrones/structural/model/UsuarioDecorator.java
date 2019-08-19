package patrones.structural.model;

import patrones.sinPatron.model.Articulo;
import java.util.ArrayList ;

public abstract class UsuarioDecorator implements TipoDeUsuario{
    private TipoDeUsuario usuarioDecorado;

    public UsuarioDecorator(TipoDeUsuario usuarioDecorado) {
        this.usuarioDecorado = usuarioDecorado;
    }

    @Override
    public void almacenarDatos() {
        this.usuarioDecorado.almacenarDatos();
    }

    @Override
    public Articulo buscarArticulo() {
        return null;
    }

    @Override
    public void seleccionarArticulo(Articulo a) {

    }

}
