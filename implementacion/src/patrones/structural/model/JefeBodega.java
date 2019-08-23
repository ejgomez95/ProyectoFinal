package patrones.structural.model;

import patrones.behavioral.controller.ColaRep;
import patrones.creational.controller.Bodega;
import patrones.sin_patron.model.Articulo;
import patrones.sin_patron.model.Ruta;

import java.util.Collections;
import java.util.List;

public class JefeBodega extends UsuarioDecorator implements MetodosJefeGerente
{
    protected String id;
    protected String nombre;
    protected String apellido;
    protected String cargo;
    protected float sueldo;
    protected String usuario;
    protected String clave;

    public JefeBodega(TipoDeUsuario usuarioDecorado) {
        super(usuarioDecorado);
    }

    public List<Usuario> almacenarDatos() {

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

    public void asignarRuta(ColaRep cola){
        //Aún no implementado
    }

    public void crearRuta(Ruta r){
        //Aún no implementado
    }

    public void ingresarNovedades(){
        //Aún no implementado
    }

    public boolean repDisponible(ColaRep cola){
        //Aún no implementado
        return false;
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

    public String getNombre() {
        return nombre;
    }
}
