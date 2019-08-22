package patrones.structural.model;

import patrones.creational.controller.Bodega;
import patrones.sinPatron.model.Articulo;

import java.util.List;

public class Gerente extends UsuarioDecorator implements MetodosJefeGerente{
    protected String usuario;
    protected String clave;

    public Gerente(TipoDeUsuario usuarioDecorado) {
        super(usuarioDecorado);
    }

    @Override
    public List<Usuario> almacenarDatos() {
        return null;
    }

    @Override
    public Articulo buscarArticulo(List<Articulo> la) {
        Articulo articulo = super.buscarArticulo(la);
        return (Articulo) la;
    }

    public void seleccionarArticulo(Articulo a) {
        super.seleccionarArticulo(a);
    }

    public void asignarFuncionesDeAdministrador(){
        //TODO: Implementar
        //Funciones CRUD
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
