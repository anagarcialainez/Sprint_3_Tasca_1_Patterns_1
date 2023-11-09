package S03N03_Command.comandos.comandosBicicleta;

import S03N03_Command.comandos.Comando;
import S03N03_Command.vehiculos.Bicicleta;

public class ComandoAcelerarBicicleta implements Comando {
    private Bicicleta bicicleta;

    public ComandoAcelerarBicicleta(Bicicleta bicicleta) {
        this.bicicleta = bicicleta;
    }

    @Override
    public void ejecutar() {
        bicicleta.acelerar();
    }
}
