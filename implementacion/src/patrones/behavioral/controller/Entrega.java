package patrones.behavioral.controller;

import patrones.sin_patron.model.Articulo;

public class Entrega {
    private String tipoEntrega;
    private Articulo articulo;

    public void setTipoEntrega(String tipoEntrega) {
        this.tipoEntrega = tipoEntrega;
    }

    public void hacerEntrega(){
        System.out.println("Entrega de articulo: " + articulo.getNombre() + "se realizara: " + tipoEntrega);
    }


}
