package S03N03_Command.comandos.comandosCoche;

import S03N03_Command.comandos.Comando;
import S03N03_Command.vehiculos.Coche;
// Comando concreto para Coche
public class ComandoArrancarCoche implements Comando {
    private Coche coche;

    public ComandoArrancarCoche(Coche coche) {
        this.coche = coche;
    }

    @Override
    public void ejecutar() {
        coche.arrancar();

    }
}
