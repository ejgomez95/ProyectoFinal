package patrones.structural.model;

import patrones.sin_patron.model.Articulo;

import java.util.Collections;
import java.util.List;

public abstract class UsuarioDecorator implements TipoDeUsuario{
    private TipoDeUsuario usuarioDecorado;

    public UsuarioDecorator(TipoDeUsuario usuarioDecorado) {
        this.usuarioDecorado = usuarioDecorado;
    }

    @Override
    public List<Usuario> almacenarDatos() {
        this.usuarioDecorado.almacenarDatos();
        return Collections.emptyList();
    }

    public Articulo buscarArticulo(List<Articulo> la) {
        return null;
    }

    @Override
    public void seleccionarArticulo(Articulo a) {
        //Aún no implementado
    }

}
