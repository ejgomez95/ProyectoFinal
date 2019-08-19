package patrones.structural.model;

import patrones.behavioral.controller.ColaRep;
import patrones.creational.controller.Bodega;
import patrones.sinPatron.model.Articulo;
import patrones.sinPatron.model.Ruta;

public class JefeBodega extends UsuarioDecorator implements MetodosJefeGerente
{
    protected String id;
    protected String Nombre;
    protected String Apellido;
    protected String cargo;
    protected float sueldo;
    protected String usuario;
    protected String clave;

    public void almacenarDatos() {

    }

    public Articulo buscarArticulo() {
        return super.buscarArticulo();
    }

    public void seleccionarArticulo(Articulo a) {
        super.seleccionarArticulo(a);
    }

    public void asignarRuta(ColaRep cola){
        //TODO: Implementar
    }

    public void crearRuta(Ruta r){
        //TODO: Implementar
    }

    public void ingresarNovedades(){
        //TODO: Implementar
    }

    public boolean repDisponible(ColaRep cola){
        //TODO: Implementar
        return false;
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

    public String getNombre() {
        return nombre;
    }
}
