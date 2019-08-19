package patrones.behavioral.controller;

import patrones.sinPatron.model.Repartidor;

public class ColaRep {
    private int posicion;
    private Cola colaRep;

    public Repartidor getNext() {
        Repartidor r = colaRep.getColaRep().poll();
        posicion++;
        return r;
    }

    public boolean hasMore(){
        return colaRep.getColaRep().size() < posicion;
    }
}
