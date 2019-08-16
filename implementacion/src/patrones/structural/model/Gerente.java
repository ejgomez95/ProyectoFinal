package patrones.structural.model;

import patrones.sinPatron.model.Articulo;

public class Gerente extends UsuarioDecorator {
    private String nombre;
    private String clave;

    public Gerente(String nombre, String clave) {
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

    public void asignarFuncionesDeAdministrador(){
        //TODO: Implementar
    }
}
