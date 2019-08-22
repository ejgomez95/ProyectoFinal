package patrones.structural.model;

import patrones.sinPatron.model.Articulo;

import java.util.List;

public class Administrador extends UsuarioDecorator {
    protected String id;
    protected String Nombre;
    protected String Apellido;
    protected String cargo;
    protected float sueldo;
    protected String usuario;
    protected String clave;

    public Administrador(TipoDeUsuario usuarioDecorado) {
        super(usuarioDecorado);
    }

    public List<Usuario> almacenarDatos() {
        super.almacenarDatos();
        return null;
    }

    public Articulo buscarArticulo(List<Articulo> la) {
        return super.buscarArticulo(la);
    }

    public void seleccionarArticulo(Articulo a) {
        super.seleccionarArticulo(a);
    }

    public void actualizarStock(Articulo a, int adicional){
        //TODO: Implementar

    }

    public void actualizarPrecio(Articulo a){
        //TODO: Implementar
    }
}
