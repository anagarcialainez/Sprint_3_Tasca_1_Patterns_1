package S03N03_Command.invocador;

import S03N03_Command.comandos.Comando;

public class Invocador {
    private Comando comando;

    public void setComando(Comando comando) {
        this.comando = comando;
    }
    public void ejecutarComando(){
        comando.ejecutar();
    }
}

/*Con los comandos concretos, creamos un invocador que permite ejecutar los comandos de manera independiente para cada vehículo*/


