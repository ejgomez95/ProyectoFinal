package patrones.behavioral.controller;

import patrones.sin_patron.model.Repartidor;

public class ColaRep {
    private int posicion;
    private Cola cola_rep;

    public Repartidor getNext() {
        Repartidor r = cola_rep.getColaRep().poll();
        posicion++;
        return r;
    }

    public boolean hasMore(){
        return cola_rep.getColaRep().size() < posicion;
    }
}
