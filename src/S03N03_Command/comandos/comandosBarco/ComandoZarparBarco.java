package S03N03_Command.comandos.comandosBarco;

import S03N03_Command.comandos.Comando;
import S03N03_Command.vehiculos.Barco;

public class ComandoZarparBarco implements Comando {
    private Barco barco;

    public ComandoZarparBarco(Barco barco) {
        this.barco = barco;
    }

    @Override
    public void ejecutar() {
        barco.zarpar();
    }
}
