package patrones.structural.model;

import java.util.Collections;
import java.util.List;

public class Repartidor {
    protected String id;
    protected String nombre;
    protected String apellido;
    protected String cargo;
    protected float sueldo;
    protected String usuario;
    protected String clave;
    protected String sexo;


    public Repartidor(String id, String nombre, String apellido, String sexo){
        this.id = id;
        this.nombre = nombre;
        this.apellido =apellido;
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

    public List<Repartidor> almacenarDatos() {return Collections.emptyList();}}
