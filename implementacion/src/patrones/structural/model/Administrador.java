package patrones.structural.model;

import patrones.sin_patron.model.Articulo;

import java.util.Collections;
import java.util.List;

public class Administrador extends UsuarioDecorator {
    protected String id;
    protected String nombre;
    protected String apellido;
    protected String cargo;
    protected float sueldo;
    protected String usuario;
    protected String clave;

    public Administrador(TipoDeUsuario usuarioDecorado) {
        super(usuarioDecorado);
    }

    public List<Usuario> almacenarDatos() {
        super.almacenarDatos();
        return Collections.emptyList();
    }
    @Override
    public Articulo buscarArticulo(List<Articulo> la) {
        return super.buscarArticulo(la);
    }

    @Override
    public void seleccionarArticulo(Articulo a) {
        super.seleccionarArticulo(a);
    }

    public void actualizarStock(Articulo a, int adicional){
        //Aún no implementado

    }

    public void actualizarPrecio(Articulo a){
        //Aún no implementado
    }
}
