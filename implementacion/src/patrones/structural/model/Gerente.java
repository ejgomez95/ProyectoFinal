package patrones.structural.model;

import patrones.creational.controller.Bodega;
import patrones.sin_patron.model.Articulo;

import java.util.Collections;
import java.util.List;

public class Gerente extends UsuarioDecorator implements MetodosJefeGerente{
    protected String usuario;
    protected String clave;

    public Gerente(TipoDeUsuario usuarioDecorado) {
        super(usuarioDecorado);
    }

    @Override
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

    public void asignarFuncionesDeAdministrador(){
        //Aún no implementado
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
