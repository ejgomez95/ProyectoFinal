package patrones.structural.model;

import patrones.sin_patron.model.Articulo;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

import static patrones.creational.BaseDatos.getConnection;


public class Usuario implements TipoDeUsuario{
    protected String id;
    protected String nombre;
    protected String apellido;
    protected String cargo;
    protected float sueldo;
    protected String usuario;
    protected String clave;
    protected String sexo;


    public Usuario(String id, String nombre, String apellido, String cargo, float sueldo, String usuario, String clave,String sexo){
        this.id = id;
        this.nombre = nombre;
        this.apellido =apellido;
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
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
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
                Connection c = getConnection();
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
                Usuario person;
                person = new Usuario(u, n, a, car, suel, us,pass,se);
                empleadoList.add(person);
            }
        } catch (SQLException ex) {
            Logger.getLogger(Usuario.class.getName()).log(Level.SEVERE, null, ex);
        }
        return empleadoList;
    }

    @Override
    public void seleccionarArticulo(Articulo a) {

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
