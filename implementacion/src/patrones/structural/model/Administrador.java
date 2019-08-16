package patrones.structural.model;

import patrones.sinPatron.model.Articulo;

public class Administrador extends UsuarioDecorator {
    protected String nombre;
    protected String clave;

    public void almacenarDatos() {
        super.almacenarDatos();
    }

    public Articulo buscarArticulo() {
        return super.buscarArticulo();
    }

    public void seleccionarArticulo(Articulo a) {
        super.seleccionarArticulo(a);
    }

    public void actualizarStock(Articulo a){
        //TODO: Implementar
    }

    public void actualizarPrecio(Articulo a){
        //TODO: Implementar
    }
}
