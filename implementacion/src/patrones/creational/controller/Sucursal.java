package patrones.creational.controller;

import patrones.sinPatron.model.Articulo;

import java.util.List;
import java.util.Scanner

public class Sucursal implements Locales{
    private List<Articulo> inventarioSucursal;
    @Override
    public List<Articulo> crearInventario() {
        System.out.println("Creando inventario para la matriz: ");
        inventarioSucursal.add(new Articulo("iPod", "Dispositivo mobil", "Tecnologia", 100.0f));
        inventarioSucursal.add(new Articulo("iPhone", "Dispositivo mobil", "Tecnologia", 500.0f));
        inventarioSucursal.add(new Articulo("Celular Samsung", "Dispositivo mobil", "Tecnologia", 300.0f));
        inventarioSucursal.add(new Articulo("Televisor Sony", "Para ver junto con toda la familia", "Entretenimiento", 1000.0f));
        inventarioSucursal.add(new Articulo("Consola PS4", "Consola de videojugo", "Entretenimiento", 400.0f));
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
