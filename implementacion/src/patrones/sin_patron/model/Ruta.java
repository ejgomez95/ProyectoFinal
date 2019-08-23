package patrones.sin_patron.model;

import java.util.List;

public class Ruta {
    private List<Envio> envios;

    public Ruta(List<Envio> envios) {
        this.envios = envios;
    }

    public List<Envio> getEnvios() {
        return envios;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Ruta: {");
        for(Envio e: envios){
            sb.append(e + " ");
        }
        sb.append("}");
        return sb.toString();
    }
    
    
}
