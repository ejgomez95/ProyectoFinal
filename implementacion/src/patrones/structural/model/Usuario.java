package patrones.structural.model;

import patrones.sinPatron.model.Articulo;
import java.sql.*;


public class Usuario implements TipoUsuario{
    protected String id;
    protected String Nombre;
    protected String Apellido;
    protected String cargo;
    protected float sueldo;
    protected String usuario;
    protected String clave;
    protected String sexo;


    public Usuario(String id, String nombre, String apellido, String cargo, float sueldo, String usuario, String clave,String sexo){
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

    @Override
    public List<Usuario> almacenarDatos() {
        System.out.println("Creando lista empleados: ");
        String sql = "select * from Empleado";
        List<Usuario> empleadoList = new ArrayList<>();
        try (
                Connection c = BaseDatos.getConnection();
                Statement stmnt = c.createStatement();
                ResultSet rs = stmnt.executeQuery(sql);
        ){
            while (rs.next()) {
                String u = rs.getString("idEmpleado");
                String n = rs.getString("Nombre");
                String a = rs.getString("Apellido");
                String car = rs.getString("Cargo");
                float suel = Float.parseFloat(rs.getString("Sueldo"));
                String us = rs.getString("username");
                String pass = rs.getString("password");
                String se = rs.getString("sexo");
                Usuario person = new Empleado(u, n, a, car, suel, us,pass,se);
                empleadoList.add(person);
            }
        } catch (SQLException ex) {
            Logger.getLogger(Usuario.class.getName()).log(Level.SEVERE, null, ex);
        }
        return empleadoList;
    }

    @Override
    public Articulo buscarArticulo(List<Articulo> la) {
        System.out.println("Ingresar nombre del articulo que desea buscar: ");
        Scanner sc = new Scanner(System.in);
        if(sc.hasNext()){
            for(int i = 0; i<la.size(); i++){
                Articulo a = la.get(i);
                if(sc.equals(a.getNombre())){
                    return a;
                }
            }
        }
        return null;
    }

}
