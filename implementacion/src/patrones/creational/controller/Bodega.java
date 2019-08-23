package patrones.creational.controller;

import patrones.sin_patron.model.Articulo;
import patrones.creational.BaseDatos;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.List;
import java.util.Scanner;

public class Bodega implements Locales {
    private List<Articulo> inventarioBodega;


    @Override
    public List<Articulo> crearInventario() {
        System.out.println("Creando inventario para la bodega: ");
        String sql = "select * from inventariobodega";
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
                inventarioBodega.add(new Articulo(nombre, descripcion, categoria, Float.valueOf(precio)));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return inventarioBodega;
    }

    @Override
    public Articulo venderLocal() {
        System.out.println("Ingresar nombre del articulo que desea vender en la bodega: ");
        Scanner sc = new Scanner(System.in);
        if(sc.hasNext()){
            for(int i = 0; i<inventarioBodega.size(); i++){
                Articulo a = inventarioBodega.get(i);
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
        System.out.println("Ingresar nombre del articulo que desea vender a domicilio desde la bodega: ");
        Scanner sc = new Scanner(System.in);
        if(sc.hasNext()){
            for(int i = 0; i<inventarioBodega.size(); i++){
                Articulo a = inventarioBodega.get(i);
                if(sc.equals(a.getNombre())){
                    return a;
                }
            }
        }
        System.out.println("No se encontro articulo con ese nombre");
        return null;
    }

    public List<Articulo> getInventarioBodega() {
        return inventarioBodega;
    }

    public void setInventarioBodega(List<Articulo> inventarioBodega) {
        this.inventarioBodega = inventarioBodega;
    }

}

