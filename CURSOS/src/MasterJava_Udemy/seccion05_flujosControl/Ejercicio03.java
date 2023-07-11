package MasterJava_Udemy.seccion05_flujosControl;

/*
 * Programador: Nicolas G. Camargo B.
 *
 * Mediante el teclado pedir dos números enteros positivos o negativos y multiplicarlos, pero sin usar el símbolo de multiplicación (*).
 * Puede utilizar una sentencia for para realizar la multiplicación y tener en cuenta los unarios, donde menos por menos es positivo.
 *
 * Última actualización: 10/07/2023
 * */

import java.util.Scanner;

public class Ejercicio03 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int res_multiplicacion = 0;

        System.out.print("Ingrese primer valor entero: ");
        int num_entero1 = scanner.nextInt();
        System.out.print("Ingrese segundo valor entero: ");
        int num_entero2 = scanner.nextInt();

        // se determina el signo del resultado final
        char signo = '-';
        signo = (num_entero1 > 0 && num_entero2 > 0) || (num_entero1 < 0 && num_entero2 < 0) ? '+' : signo;

        // Se convierten a positivos
        num_entero1 = num_entero1 < 0 ? -(num_entero1) : num_entero1;
        num_entero2 = num_entero2 < 0 ? -(num_entero2) : num_entero2;

        for(int i = 0; i < num_entero2; i++){
            res_multiplicacion += num_entero1;
        }

        // no se requiere comparar el caracter (+) por la conversión a positivo
        if(signo == '-'){
            res_multiplicacion *= (-1);
        } System.out.println("res_multiplicacion = " + res_multiplicacion);

    }

}
