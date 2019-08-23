package patrones.behavioral.controller;

import patrones.sin_patron.model.Repartidor;

import java.util.Queue;

public class Cola {
    private Queue<Repartidor> colaRep;

    public Queue<Repartidor> getColaRep() {
        return colaRep;
    }

    //Relación de composición con Repartidor
    //Asociado con ColaRep
}
