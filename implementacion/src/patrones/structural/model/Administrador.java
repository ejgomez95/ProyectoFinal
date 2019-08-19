package patrones.structural.model;

import patrones.sinPatron.model.Articulo;

public class Administrador extends UsuarioDecorator {
    protected String id;
    protected String Nombre;
    protected String Apellido;
    protected String cargo;
    protected float sueldo;
    protected String usuario;
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

    public void actualizarStock(Articulo a, int adicional){
        //TODO: Implementar

    }

    public void actualizarPrecio(Articulo a){
        //TODO: Implementar
    }
}
