package patrones.sinPatron.model;

import java.util.List;

public class Ruta {
    private List<Envio> envios;

    public Ruta(List<Envio> envios) {
        this.envios = envios;
    }

    public List<Envio> getEnvios() {
        return envios;
    }
}
