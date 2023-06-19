package MasterJava_Udemy.ejercicios;
import java.util.Scanner;

/*
* Programador: Nicolas G. Camargo B.
*
* Problema: Pedir dos números y mostrarlos ordenados de mayor a menor
*
* Última actualización: 19/06/2023
* */

public class Ejercicio03 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("----- ORDENAR MAYOR A MENOR ------");
        System.out.print("Ingrese primer número: ");
        float num1 = scanner.nextFloat();
        System.out.print("Ingrese segundo número: ");
        float num2 = scanner.nextFloat();

        float mayor = (num1 > num2) ? num1 : num2;
        System.out.println("mayor = " + mayor);
    }

}
