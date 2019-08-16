package patrones.creational;

public class BaseDatos {
    //TODO: Aquí conexión con base de datos SQL
    private BaseDatos instancia;
    private BaseDatos(){}

    public BaseDatos getInstancia() {
        return instancia;
    }
}
