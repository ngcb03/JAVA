package MasterJava_Udemy.ejercicios;

/*
 * Programador: Nicolas G. Camargo B.
 *
 * Problema: Obtener el nombre mas largo de tres personas, según los siguientes requerimientos
 * Mediante el teclado pedir el nombre completo (nombre + apellido) de tres miembros de la familia o amigos usando la clase JOptionPane y método showInputDialog().
 * Calcular e Imprimir el nombre de la persona que tenga el nombre más largo (en cantidad de caracteres)   (Imprimir sólo uno de los tres, el de más caracteres en el nombre.)
 * Podría usar .split(" "); del objeto String para separar nombre y apellido en un arreglo, y con el indice cero accedemos al nombre de la persona.
 * Restricción no usar loops en el desarrollo de la tarea.
 * Ejemplo del resultado: "Guillermo Doe tiene el nombre más largo."
 *
 * Última actualización: 22/06/2023
 * */

import javax.swing.*;

public class Ejercicio05 {

    public static void main(String[] args) {

        JOptionPane.showMessageDialog(null,"------ NOMBRE MAS LARGO ------");
        System.out.println("Persona #1");
        String nombre1 = JOptionPane.showInputDialog("Ingrese primer nombre y primer apellido: ");
        System.out.println("Persona #2");
        String nombre2 = JOptionPane.showInputDialog("Ingrese primer nombre y primer apellido: ");
        System.out.println("Persona #3");
        String nombre3 = JOptionPane.showInputDialog("Ingrese primer nombre y primer apellido: ");

        String [] array_nombre = nombre1.split(" ");
        int tamanio_nombre1 = array_nombre[0].length();
        array_nombre = nombre2.split(" ");
        int tamanio_nombre2 = array_nombre[0].length();
        array_nombre = nombre3.split(" ");
        int tamanio_nombre3 = array_nombre[0].length();

        String nombre_largo = tamanio_nombre1 > tamanio_nombre2 &&
                tamanio_nombre1 > tamanio_nombre3 ? nombre1 : (tamanio_nombre2 > tamanio_nombre3 ?
                nombre2 : nombre3);
        JOptionPane.showMessageDialog(null,nombre_largo + " tiene el nombre más largo.");

    }

}
