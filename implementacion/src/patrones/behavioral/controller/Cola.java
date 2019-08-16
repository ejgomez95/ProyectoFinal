package patrones.behavioral.controller;

import patrones.sinPatron.model.Repartidor;

import java.util.Queue;

public class Cola {
    private Queue<Repartidor> colaRep;

    public Queue<Repartidor> getColaRep() {
        return colaRep;
    }
}
