package CRUD.GestionContactos.controlador;

import CRUD.GestionContactos.modelo.Contactos;

import java.util.ArrayList;
import java.util.List;

// Creador: Nicolas Camargo

/*
 * 1. Definimos operaciones CRUD para gestionar contactos que se registren
 * */
public class GestorContactos {
    private ArrayList<Contactos> listaContactos;

    public GestorContactos(){
        listaContactos = new ArrayList<>();
    }

    public void agregarContacto(Contactos contacto){
        listaContactos.add(contacto);
    }

    public List<Contactos> obtenerContactos(){
        return listaContactos;
    }

    public void actualizarContacto(int indice, Contactos contacto){
        listaContactos.set(indice,contacto);
    }

    public void eliminarContacto(int indice){
        listaContactos.remove(indice);
    }

}
