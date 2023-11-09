package S03N03_Command.comandos.comandosAvion;

import S03N03_Command.comandos.Comando;
import S03N03_Command.vehiculos.Avion;

public class ComandoAumentarAltitudAvion implements Comando {
    private Avion avion;

    public ComandoAumentarAltitudAvion(Avion avion) {
        this.avion = avion;
    }
    @Override
    public void ejecutar() {
        avion.aumentarAltitud();
    }
}
