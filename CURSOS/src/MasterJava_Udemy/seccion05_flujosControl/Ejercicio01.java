package MasterJava_Udemy.seccion05_flujosControl;

import javax.swing.*;

/*
 * Programador: Nicolas G. Camargo B.
 *
 * Problema: Crear una clase con el método main donde el desafío
 * es buscar el número menor de mínimo 10 valores enteros, usando
 * la clase Scanner ingresar la cantidad de números a comparar,
 * luego utilizando una sentencia for iterar el numero de veces
 * (ingresado) para pedir el numero entero, entonces se requiere:
 *      Calcular el menor número e imprimir el valor.
 *      Si el menor número es menor que 10, imprimir "El número menor es menor que 10!". si no, imprimir " el numero menor es igual o mayor que 10!".
 *
 * Última actualización: 09/07/2023
 * */

public class Ejercicio01 {

    public static void main(String[] args) {
        int numero = 0, menor = 0;
        char seguir;

        JOptionPane.showMessageDialog(null,"Hallar valor menor!");

        menor = Integer.parseInt(JOptionPane.showInputDialog("Ingrese primer numero: "));
        do{
            numero = Integer.parseInt(JOptionPane.showInputDialog("Ingrese otro numero: "));
            if(menor > numero){
                menor = numero;
            }
            seguir = JOptionPane.showInputDialog("¿Desea seguir (s/n)?: ").charAt(0);
        }while(seguir == 's' || seguir == 'S' && seguir != 'n' && seguir != 'N');

        JOptionPane.showMessageDialog(null,"El valor menor de los números ingresados es " + menor +
                ". Además, el número menor es " + (menor < 10 ? "menor que 10!" : "igual o mayor que 10!"));

    }

}
