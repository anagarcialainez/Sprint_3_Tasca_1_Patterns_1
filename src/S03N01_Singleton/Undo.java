package S03N01_Singleton;

import java.util.ArrayList;
import java.util.List;

public class Undo {
    private static Undo instance;
    private List<String> comandoHistory;

    // Constructor privado para evitar la creación directa de instancias
    private Undo(){
        //inicialización de la instancea
        comandoHistory = new ArrayList<>();
    }

    //Método estático para obtener una única instancia
    public static Undo getInstance(){
        if(instance == null){
            instance = new Undo();
        }
        return instance;
    }

    //Métodos para agregar, listar y remover comandos
    public void addComando(String comando){

        comandoHistory.add(comando);
    }

    public void listarComando(){
        System.out.println("Lista de comandos introducidos");
        for(String cmd:comandoHistory){
            System.out.println(cmd);
        }
    }

    public void eliminarComando(){
        if(!comandoHistory.isEmpty()){
            comandoHistory.remove(comandoHistory.size()-1); //elimina el último comando de la lista
        }
    }

}

