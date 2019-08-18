package patrones.creational.controller;

import patrones.sinPatron.model.Articulo;

import java.util.List;
import java.util.Scanner;

public class Bodega implements Locales {
    private List<Articulo> inventarioBodega;
    @Override
    public List<Articulo> crearInventario() {
        System.out.println("Creando inventario para la bodega: ");
        inventarioBodega.add(new Articulo("iPod", "Dispositivo mobil", "Tecnologia", 100.0f));
        inventarioBodega.add(new Articulo("iPhone", "Dispositivo mobil", "Tecnologia", 500.0f));
        inventarioBodega.add(new Articulo("Celular Samsung", "Dispositivo mobil", "Tecnologia", 300.0f));
        inventarioBodega.add(new Articulo("Televisor Sony", "Para ver junto con toda la familia", "Entretenimiento", 1000.0f));
        inventarioBodega.add(new Articulo("Consola PS4", "Consola de videojugo", "Entretenimiento", 400.0f));
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
}
