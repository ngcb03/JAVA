package AdministradorTareas.controlador;

import AdministradorTareas.modelo.Tareas;

import java.util.ArrayList;
import java.util.List;

public class AdministrarTareas {

    private ArrayList<Tareas> listaTareas;

    public AdministrarTareas(){
        listaTareas = new ArrayList<>();
    }

    public void agregarTareas(Tareas tarea){
        listaTareas.add(tarea);
    }

    public List<Tareas> obtenerTareas(){
        return listaTareas;
    }

    public void actualiarTareas(int indice, Tareas tarea){
        listaTareas.add(indice,tarea);
    }

    public void eliminarTareas(int indice){
        listaTareas.remove(indice);
    }
}
