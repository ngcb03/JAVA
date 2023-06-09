package GestionContactos.vista;

import GestionContactos.modelo.Contactos;
import GestionContactos.controlador.GestorContactos;

import java.util.Scanner;
import java.util.List;

/*
 * Creador: Nicolas Camargo
 *
 * Gestión de contactos: Crea una aplicación para gestionar una lista de
 * contactos. Debe permitir crear nuevos contactos, mostrar una lista de
 *  contactos existentes, actualizar la información de un contacto y
 * eliminar contactos.
 * */


public class Main {

    private static Scanner scanner = new Scanner(System.in);
    private static GestorContactos gestorContactos = new GestorContactos();

    public static void main(String[] args) {
        menu();
    }

    private static void menu(){
        boolean salir = false;

        while (!salir) {
            System.out.println("------ GESTIÓN DE CONTACTOS ------");
            System.out.println("1. Agregar contacto");
            System.out.println("2. Mostrar contactos");
            System.out.println("3. Actualizar contacto");
            System.out.println("4. Eliminar contacto");
            System.out.println("5. Salir");
            System.out.print("Ingrese una opción: ");
            int opcion = scanner.nextInt();
            scanner.nextLine(); // Consumir el salto de línea

            switch (opcion) {
                case 1:
                    agregarContacto();
                    break;
                case 2:
                    mostrarContactos();
                    break;
                case 3:
                    actualizarContacto();
                    break;
                case 4:
                    eliminarContacto();
                    break;
                case 5:
                    salir = true;
                    break;
                default:
                    System.out.println("Opción inválida. Intente nuevamente.");
            }
        }
    }

    private static void agregarContacto(){
        System.out.println("------ AGREGAR CONTACTO ------");
        System.out.print("Ingrese el nombre: ");
        String nombre = scanner.nextLine();
        System.out.print("Ingrese el apellido: ");
        String apellido = scanner.nextLine();
        System.out.print("Ingrese el teléfono: ");
        String telefono = scanner.nextLine();
        System.out.print("Ingrese el correo electrónico: ");
        String correo = scanner.nextLine();

        Contactos contacto = new Contactos(nombre, apellido, telefono, correo);
        gestorContactos.agregarContacto(contacto);

        System.out.println("Contacto agregado correctamente.");
    }

    private static void obtenerContactos(){

    }

    private static void mostrarContactos(){
        System.out.println("------ LISTA DE CONTACTOS ------");
        List<Contactos> contactos = gestorContactos.obtenerContactos();

        if (contactos.isEmpty()) {
            System.out.println("No hay contactos registrados.");
        } else {
            for (int i = 0; i < contactos.size(); i++) {
                Contactos contacto = contactos.get(i);
                System.out.println((i + 1) + ". " + contacto.getNombre() + " " +
                        contacto.getApellido() + " | Teléfono: " + contacto.getTelefono() +
                        " | Correo: " + contacto.getCorreo());
            }
        }
    }

    private static void actualizarContacto(){
        System.out.println("------ ACTUALIZAR CONTACTO ------");
        mostrarContactos();
        System.out.print("Ingrese el número de contacto a actualizar: ");
        int indice = scanner.nextInt();
        scanner.nextLine(); // Consumir el salto de línea

        if (indice >= 1 && indice <= gestorContactos.obtenerContactos().size()) {
            Contactos contacto = gestorContactos.obtenerContactos().get(indice - 1);

            System.out.print("Ingrese el nuevo nombre: ");
            String nombre = scanner.nextLine();
            System.out.print("Ingrese el nuevo apellido: ");
            String apellido = scanner.nextLine();
            System.out.print("Ingrese el nuevo teléfono: ");
            String telefono = scanner.nextLine();
            System.out.print("Ingrese el nuevo correo electrónico: ");
            String correo = scanner.nextLine();

            contacto.setNombre(nombre);
            contacto.setApellido(apellido);
            contacto.setTelefono(telefono);
            contacto.setCorreo(correo);

            gestorContactos.actualizarContacto(indice - 1, contacto);
            System.out.println("Contacto actualizado correctamente.");
        } else {
            System.out.println("Número de contacto inválido.");
        }
    }

    private static void eliminarContacto(){
        System.out.println("------ ELIMINAR CONTACTO ------");
        mostrarContactos();
        System.out.print("Ingrese el número de contacto a eliminar: ");
        int indice = scanner.nextInt();
        scanner.nextLine(); // Consumir el salto de línea

        if (indice >= 1 && indice <= gestorContactos.obtenerContactos().size()) {
            gestorContactos.eliminarContacto(indice - 1);
            System.out.println("Contacto eliminado correctamente.");
        } else {
            System.out.println("Número de contacto inválido.");
        }
    }

}

