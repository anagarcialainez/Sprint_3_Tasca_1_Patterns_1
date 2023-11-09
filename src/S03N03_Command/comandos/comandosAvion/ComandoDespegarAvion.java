package S03N03_Command.comandos.comandosAvion;

import S03N03_Command.comandos.Comando;
import S03N03_Command.vehiculos.Avion;

public class ComandoDespegarAvion implements Comando {
    private Avion avion;
    public ComandoDespegarAvion(Avion avion) {
        this.avion = avion;
    }
    @Override
    public void ejecutar() {
        avion.despegar();
    }
}
