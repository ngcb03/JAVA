package MasterJava_Udemy.seccion05_flujosControl;

/*
 * Programador: Nicolas G. Camargo B.
 *
 * Pedir 20 notas finales de alumnos en una escala de 1 a 7, manejar decimales en las notas (double).
 * Mostrar el promedio de las notas mayores a 5, promedio de notas inferiores a 4 y la cantidad de notas 1, ademas mostrar el promedio total.
 * Ayuda: usar un bucle for que itere hasta 20 (notas) y dentro del ciclo pedir las notas una a una para realizar los cálculos (contadores, sumas).
 * Opcional: si una de las notas ingresadas es 0 debe salirse del ciclo for y mostrar un mensaje de error finalizando el programa.
 *
 * Última actualización: 10/07/2023
 * */


import java.util.Scanner;

public class Ejercicio02 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        double nota, promedio_mayor = 0, promedio_menor = 0;
        byte total_numeros = 5, cont_mayor = 0, cont_menor = 0;
        boolean validar = true;

        bucle_promedio: for(byte i = 0; i < total_numeros; i++){

            do{
                System.out.println("\nEstudiante #" + (i+1));
                System.out.print("Ingrese nota: ");
                nota = scanner.nextDouble();
                if(nota < 1 || nota > 7){
                    System.out.println("\n¡Error, la nota debe estar entre 1 y 7!");
                    if(nota == 0){
                        System.out.println("¡Error, programa terminado!");
                        validar = false;
                        break bucle_promedio;
                    }
                } else {

                    if(nota > 5){
                        promedio_mayor = promedio_mayor + nota;
                        cont_mayor++;
                    }else if(nota != 5){
                        promedio_menor = promedio_menor + nota;
                        cont_menor++;
                    } validar = true;

                }

            }while(!validar);

        }

        if(validar) {
            System.out.println("\n\nEl promedio de notas menores a 5 es " + (promedio_menor / cont_menor));
            System.out.println("El promedio de notas mayores a 5 es " + (promedio_mayor / cont_mayor));
            System.out.println("El promedio general es " + (promedio_menor + promedio_mayor) / total_numeros);
        }

    }

}
