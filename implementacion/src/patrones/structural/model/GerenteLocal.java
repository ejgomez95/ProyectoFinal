package patrones.structural.model;

import patrones.creational.controller.Bodega;
import patrones.sin_patron.model.Articulo;

import java.util.Collections;
import java.util.List;

public class GerenteLocal extends UsuarioDecorator implements MetodosJefeGerente{
    protected String id;
    protected String nombre;
    protected String apellido;
    protected String cargo;
    protected float sueldo;
    protected String usuario;
    protected String clave;

    public GerenteLocal(TipoDeUsuario usuarioDecorado) {
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


    @Override
    public void realizarVentasLocales() {
        //Aún no implementado
    }

    @Override
    public void realizarVentasDomicilio() {
        //Aún no implementado
    }

    @Override
    public void manejarInventario() {
        //Aún no implementado
    }

    @Override
    public void peticionRe(Bodega b) {
        //Aún no implementado
    }
}
