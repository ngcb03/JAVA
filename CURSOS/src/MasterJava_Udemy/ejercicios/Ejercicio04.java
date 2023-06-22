package MasterJava_Udemy.ejercicios;

/*
 * Programador: Nicolas G. Camargo B.
 *
 * Problema: Suponiendo un estanque de gasolina (gas) con capacidad 70
 * litros, se requiere un programa que pida la medida actual en litros
 * y mostrar el resultado de la forma: Insuficiente, Suficiente, Medio...
    * La medida o capacidad actual del estanque puede ser en tipo double,
    * para una mejor precisión, pero tambien puede ser del tipo int.
    - Si la capacidad actual es 70 litros: imprimir Estanque lleno
    - Si está entre 60 y menor a 70: imprimir Estanque casi lleno
    - Si está entre 40 y menor a 60: imprimir Estanque  3/4
    - Si está entre 35 y menor a 40: imprimir Medio Estanque
    - Si está entre 20 y menor a 35: imprimir Suficiente
    - Si está entre 1 y menor a 20: imprimir Insuficiente
 *
 * Última actualización: 19/06/2023
 * */

import java.util.Scanner;

public class Ejercicio04 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("------ CAPACIDAD ESTANQUE GASOLINA ------");
        System.out.print("Ingrese capacidad actual estanque en litros (1 a 70): ");
        double capacidad_estanque = scanner.nextDouble();

        if(capacidad_estanque >= 1 && capacidad_estanque <= 70){
            String capacidad = capacidad_estanque == 70 ? "Estanque lleno" :
                    (capacidad_estanque >= 60 ? "Estanque casi lleno" :
                    (capacidad_estanque >= 40 ? "Estanque 3/4" :
                    (capacidad_estanque >= 35 ? "Medio Estanque" :
                    (capacidad_estanque >= 20) ? "Estanque Suficiente" :
                        "Estanque Insuficiente")));
            System.out.println("capacidad_estanque = " + capacidad);
        }else{
            System.out.println("Valor de capacidad de estanque incorrecta," +
                    " vuelva a intentarlo!");
        }

    }

}
