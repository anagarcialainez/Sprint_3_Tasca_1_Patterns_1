package S03N01_Singleton;

import java.util.Scanner;

public class MainUndo {
    public static void main(String[] args) {
        //Instancia de la clase S03N01.Undo del patron Singleton
        Undo undo = Undo.getInstance();
        Scanner entrada = new Scanner(System.in);
        int opcion;
        String comando;

        while (true) {
            System.out.println("-----Menú de opciones----");
            System.out.println("1.Agregar comando.\n" +
                    "2. Eliminar último comando\n" +
                    "3. Listar comandos\n" +
                    "4.Salir\n" +
                    "Seleccione una opción:");

            opcion = entrada.nextInt();
            entrada.nextLine();

            switch (opcion) {
                case 1:
                    System.out.print("Ingrese el comando: ");
                    comando = entrada.nextLine();
                    undo.addComando(comando);
                    break;

                case 2:
                    undo.eliminarComando();
                    System.out.println("Último comando eliminado.");
                    break;

                case 3:
                    Undo existeUndo = Undo.getInstance(); //obtenemos la instancia existente
                    //comprobamos que este operando en una instancia única
                    if(undo == existeUndo){ //comparamos la instancia actual con la existente
                        existeUndo.listarComando();
                    }else{
                        System.out.println("!Error! Las instancias de Undo no son iguales."); //si las instancias no son iguales debería ,mostrar un error.
                    }
                    break;

                case 4:
                    System.out.println("Saliendo del programa.");
                    entrada.close();
                    System.exit(0);
                    break;

                default:
                    System.out.println("Opción no válida. Inténtelo de nuevo.");

            }

        }
    }
}

/*Nivel 1 - Singleton
En todos los ejercicios, crea un proyecto con una clase Main que demuestre el uso del patrón (con las necesarias invocaciones).
Crea una clase que replique el funcionamiento del comando 'S03N01.Undo'. Esta clase será utilizada por la clase Main, que permitirá introducir opciones por consola.
La clase 'S03N01.Undo' debe guardar los últimos comandos introducidos. Debe permitir añadir o eliminar comandos, así como listar los últimos comandos introducidos (similar al comando 'history' en Linux).
La clase 'S03N01.Undo' debe implementar imprescindiblemente un patrón Singleton.*/