package patrones.structural.model;

import patrones.creational.controller.Bodega;
import patrones.sinPatron.model.Articulo;

public class GerenteLocal extends UsuarioDecorator implements MetodosJefeGerente{
    protected String id;
    protected String Nombre;
    protected String Apellido;
    protected String cargo;
    protected float sueldo;
    protected String usuario;
    protected String clave;

    public GerenteLocal(String nombre, String clave) {
        this.nombre = nombre;
        this.clave = clave;
    }

    public void almacenarDatos() {
        super.almacenarDatos();
    }

    public Articulo buscarArticulo() {
        return super.buscarArticulo();
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
