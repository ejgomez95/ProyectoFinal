package patrones.structural.model;

import patrones.creational.controller.Bodega;
import patrones.sinPatron.model.Articulo;

import java.util.List;

public class GerenteLocal extends UsuarioDecorator implements MetodosJefeGerente{
    protected String id;
    protected String Nombre;
    protected String Apellido;
    protected String cargo;
    protected float sueldo;
    protected String usuario;
    protected String clave;

    public GerenteLocal(TipoDeUsuario usuarioDecorado) {
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


    @Override
    public void realizarVentasLocales() {

    }

    @Override
    public void realizarVentasDomicilio() {

    }

    @Override
    public void manejarInventario() {

    }

    @Override
    public void peticionRe(Bodega b) {

    }
}
