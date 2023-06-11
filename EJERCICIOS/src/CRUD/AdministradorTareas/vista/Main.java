package CRUD.AdministradorTareas.vista;

/*
* Autor: Nicolas Camargo
*
* Administrador de tareas: Desarrolla una aplicación que permita a los
* usuarios crear, editar y eliminar tareas. Debe permitir asignar una
* descripción, fecha de vencimiento y estado (completado o pendiente)
* a cada tarea.
*
* Última modificación: 08/06/2023
* */

import CRUD.AdministradorTareas.controlador.AdministrarTareas;
import CRUD.AdministradorTareas.modelo.Tareas;

import javax.swing.*;
import java.util.Scanner;
import java.util.List;

public class Main {
    private static Scanner scanner = new Scanner(System.in);
    private static AdministrarTareas adminTareas = new AdministrarTareas();

    public static void main(String[] args) {
        menu();
    }

    private static void menu(){
        boolean salir = false;

        while(salir != true) {
            System.out.println("------ ADMINISTRADOR DE TAREAS ------");
            System.out.println("1. agregar tareas");
            System.out.println("2. buscar tarea");
            System.out.println("3. mostrar tareas");
            System.out.println("4. actualizar tarea");
            System.out.println("5. eliminar tarea");
            System.out.println("6. salir del programa");
            System.out.print("Elección: ");
            byte eleccion = scanner.nextByte();
            scanner.nextLine();  // Consumir el salto de línea

            switch (eleccion){
                case 1:
                    agregarTarea();
                    break;
                case 2:
                    buscarTarea();
                    break;
                case 3:
                    mostrarTareas();
                    break;
                case 4:
                    break;
                case 5:
                    break;
                case 6:
                    System.out.println("Hasta pronto!");
                    salir = true;
                    break;
                default:
                    System.out.println("¡Opcion incorrecta, vuelva a intentarlo!");
            }
        }
    }

    private static void agregarTarea(){
        System.out.println("----- AGREGAR TAREAS ------");
        System.out.print("Ingrese descripción: ");
        String descripcion = scanner.nextLine();
        System.out.print("Ingrese fecha de vencimiento (10/06/2023): ");
        String fecha_vencimiento = scanner.nextLine();
        System.out.print("Ingrese estado tarea: ");
        String estado = scanner.nextLine();
        Tareas tarea = new Tareas(descripcion,fecha_vencimiento,estado);
        adminTareas.agregarTareas(tarea);
        System.out.println("¡Tarea creada!\n");
    }

    private static void buscarTarea(){
        System.out.println("----- BUSCAR TAREA ------");


    }

    private static void mostrarTareas(){
        System.out.println("------ LISTA DE TAREAS ------");
        List<Tareas> listaTareas = adminTareas.obtenerTareas();

        if(listaTareas.isEmpty()){
            System.out.println("¡No existen tareas registradas!");
        }else{
            for(int i = 0; i < listaTareas.size(); i++){
                System.out.println("\nId: " + (listaTareas.get(i).getId_tarea() + 1));
                System.out.println("Descripción: " + listaTareas.get(i).getDescripción());
                System.out.println("Fecha de vencimiento: " + listaTareas.get(i).getFecha_vencimiento());
                System.out.println("Estado: " + listaTareas.get(i).getEstado() + "\n");
            }
        }
    }

}
