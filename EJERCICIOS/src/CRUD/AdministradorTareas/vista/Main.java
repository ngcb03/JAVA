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

import java.util.Scanner;

public class Main {
    private static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        menu();
    }

    private static void menu(){
        boolean salir = false;

        while(salir != true) {
            System.out.println("------ ADMINISTRADOR DE TAREAS ------");
            System.out.println("1. agregar tarea");
            System.out.println("2. buscar tarea");
            System.out.println("3. mostrar tareas");
            System.out.println("4. actualizar tarea");
            System.out.println("5. eliminar tarea");
            byte eleccion = scanner.nextByte();

            switch (eleccion){
                case 1:
                    break;
                case 2:
                    break;
                case 3:
                    break;
                case 4:
                    break;
                case 5:
                    break;
                default:
                    System.out.println("¡Opcion incorrecta, vuelva a intentarlo!");
            }
        }
    }

}
