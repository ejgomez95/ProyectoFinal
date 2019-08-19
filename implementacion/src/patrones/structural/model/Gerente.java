package patrones.structural.model;

import patrones.sinPatron.model.Articulo;
import java.util.ArrayList ;
import patrones.structural.model.TipoDeUsuario;
import patrones.structural.model.Usuario;

public class Gerente implements UsuarioDecorador {
    protected String usuario;
    protected String clave;

    public Gerente(TipoDeUsuario usuarioDecorado) {
        super(usuarioDecorado);
    }

    @Override
    public void almacenarDatos(Usuario u) {
        this.usuario= u.getUsuario();
        this.clave= u.getClave();
        asignarFuncionesDeAdministrador();
    }

    public Articulo buscarArticulo() {
        return super.buscarArticulo();
    }

    public void seleccionarArticulo(Articulo a) {
        super.seleccionarArticulo(a);
    }

    public void asignarFuncionesDeAdministrador(){
        //TODO: Implementar
        //Funciones CRUD
    }
}
