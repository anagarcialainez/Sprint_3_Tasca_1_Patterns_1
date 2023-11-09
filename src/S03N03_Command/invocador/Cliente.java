package S03N03_Command.invocador;

import S03N03_Command.comandos.*;
import S03N03_Command.comandos.comandosAvion.ComandoAumentarAltitudAvion;
import S03N03_Command.comandos.comandosAvion.ComandoDescenderAvion;
import S03N03_Command.comandos.comandosAvion.ComandoDespegarAvion;
import S03N03_Command.comandos.comandosCoche.ComandoAcelerarCoche;
import S03N03_Command.comandos.comandosCoche.ComandoArrancarCoche;
import S03N03_Command.comandos.comandosCoche.ComandoFrenarCoche;
import S03N03_Command.vehiculos.Avion;
import S03N03_Command.vehiculos.Barco;
import S03N03_Command.vehiculos.Bicicleta;
import S03N03_Command.vehiculos.Coche;

public class Cliente {
    public static void main(String[] args) {
        // Creación de instancias de diferentes tipos de vehículos
        Coche coche = new Coche();
        Bicicleta bicicleta = new Bicicleta();
        Avion avion = new Avion();
        Barco barco = new Barco();

        System.out.println("-------- Comandos para coche---------");
        // Ejemplo de comandos para el coche
        Comando comandoArrancarCoche = new ComandoArrancarCoche(coche);
        Comando comandoAcelerarCoche = new ComandoAcelerarCoche(coche);
        Comando comandoFrenarCoche = new ComandoFrenarCoche(coche);

        // Creación de un objeto Invocador
        Invocador invocador = new Invocador();

        // Configuración y ejecución de comandos a través del Invocador
        invocador.setComando(comandoArrancarCoche); // Configura el comando de arrancar el coche
        invocador.ejecutarComando(); // Ejecuta el comando de arrancar

        invocador.setComando(comandoAcelerarCoche);
        invocador.ejecutarComando();

        invocador.setComando(comandoFrenarCoche);
        invocador.ejecutarComando();

        System.out.println("-------- Comandos para el Avión---------");

        //Ejemplo de comandos para el Avión
        Comando comandoDespegarAvion = new ComandoDespegarAvion(avion);
        Comando comandoAumentarAltitudAvion = new ComandoAumentarAltitudAvion(avion);
        Comando comandoDescenderAvion = new ComandoDescenderAvion(avion);

        // Configuración y ejecución de comandos a través del Invocador
        invocador.setComando(comandoDespegarAvion);
        invocador.ejecutarComando();

        invocador.setComando(comandoAumentarAltitudAvion);
        invocador.ejecutarComando();

        invocador.setComando(comandoDescenderAvion);
        invocador.ejecutarComando();

    }
}

/*Nivel 3
Command
Diseña un parking de 4 vehículos: un coche, una bicicleta, un avión y un barco.
Muestra cómo funciona el patrón Command que implementa los métodos arrancar, acelerar y frenar para cada tipo de vehículo.
*/
