package S03N03_Command.comandos.comandosBicicleta;

import S03N03_Command.comandos.Comando;
import S03N03_Command.vehiculos.Bicicleta;

public class ComandoArrancarBicicleta implements Comando {
    private Bicicleta bicicleta;

    public ComandoArrancarBicicleta(Bicicleta bicicleta) {
        this.bicicleta = bicicleta;
    }

    @Override
    public void ejecutar() {
        bicicleta.arrancar();
    }
}
