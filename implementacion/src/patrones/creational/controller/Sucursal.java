package patrones.creational.controller;

import patrones.creational.BaseDatos;
import patrones.sin_patron.model.Articulo;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.List;
import java.util.Scanner;


public class Sucursal implements Locales{
    private List<Articulo> inventarioSucursal;
    @Override
    public List<Articulo> crearInventario() {
        System.out.println("Creando inventario para la matriz: ");
        String sql = "select * from inventariosucursal";
        try (
                Connection c = BaseDatos.getConnection();
                Statement stmnt = c.createStatement();
                ResultSet rs = stmnt.executeQuery(sql);
        ){
            while (rs.next()) {
                String nombre = rs.getString("Nombre");
                String descripcion = rs.getString("descripcion");
                String categoria = rs.getString("categoria");
                String precio = rs.getString("precio");
                inventarioSucursal.add(new Articulo(nombre, descripcion, categoria, Float.valueOf(precio)));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return inventarioSucursal;
    }

    @Override
    public Articulo venderLocal() {
        System.out.println("Ingresar nombre del articulo que desea vender en la sucursal: ");
        Scanner sc = new Scanner(System.in);
        if(sc.hasNext()){
            for(int i = 0; i<inventarioSucursal.size(); i++){
                Articulo a = inventarioSucursal.get(i);
                if(sc.equals(a.getNombre())){
                    return a;
                }
            }
        }
        System.out.println("No se encontro articulo con ese nombre");
        return null;
    }

    @Override
    public Articulo venderDomicilio() {
        System.out.println("Ingresar nombre del articulo que desea vender a domicilio desde la sucursal: ");
        Scanner sc = new Scanner(System.in);
        if(sc.hasNext()){
            for(int i = 0; i<inventarioSucursal.size(); i++){
                Articulo a = inventarioSucursal.get(i);
                if(sc.equals(a.getNombre())){
                    return a;
                }
            }
        }
        System.out.println("No se encontro articulo con ese nombre");
        return null;
    }
}
