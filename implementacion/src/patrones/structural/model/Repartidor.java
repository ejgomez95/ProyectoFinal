


public class Repartidor {
    protected String id;
    protected String Nombre;
    protected String Apellido;
    protected String cargo;
    protected float sueldo;
    protected String usuario;
    protected String clave;
    protected String sexo;


    public Repartidor(String id, String nombre, String apellido, String cargo, float sueldo, String usuario, String clave,String sexo){
        this.id = id;
        this.Nombre = nombre;
        this.Apellido=apellido;
        this.cargo=cargo;
        this.sueldo=sueldo;
        this.usuario=usuario;
        this.clave=clave;
        this.sexo=sexo;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String nombre) {
        Nombre = nombre;
    }

    public String getApellido() {
        return Apellido;
    }

    public void setApellido(String apellido) {
        Apellido = apellido;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public float getSueldo() {
        return sueldo;
    }

    public void setSueldo(float sueldo) {
        this.sueldo = sueldo;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getClave() {
        return clave;
    }

    public void setClave(String clave) {
        this.clave = clave;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public List<Repartidor> almacenarDatos() {}}
