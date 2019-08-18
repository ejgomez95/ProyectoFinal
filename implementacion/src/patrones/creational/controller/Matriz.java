package patrones.creational.controller;

import patrones.sinPatron.model.Articulo;

import java.util.List;
import java.util.Scanner;

public class Matriz implements Locales {
    private List<Articulo> inventarioMatriz;
    @Override
    public List<Articulo> crearInventario() {
        System.out.println("Creando inventario para la matriz: ");
        String sql = "select * from inventariomatriz";
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
                inventarioSucursal.add(nombre, descripcion, categoria, Float.parseof(precio));
            }
        }
        return inventarioSucursal;
    }

    @Override
    public Articulo venderLocal() {
        System.out.println("Ingresar nombre del articulo que desea vender en la matriz: ");
        Scanner sc = new Scanner(System.in);
        if(sc.hasNext()){
            for(int i = 0; i<inventarioMatriz.size(); i++){
                Articulo a = inventarioMatriz.get(i);
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
        System.out.println("Ingresar nombre del articulo que desea vender a domicilio desde la matriz: ");
        Scanner sc = new Scanner(System.in);
        if(sc.hasNext()){
            for(int i = 0; i<inventarioMatriz.size(); i++){
                Articulo a = inventarioMatriz.get(i);
                if(sc.equals(a.getNombre())){
                    return a;
                }
            }
        }
        System.out.println("No se encontro articulo con ese nombre");
        return null;
    }
}
