/*
* vd #46
* */

package MasterJava_Udemy.seccion04_operadores;

import java.util.Scanner;

public class OperadoresTeranarios {

    public static void main(String[] args) {

        // ternario: formado de 3 partes y devuelve un valor
        // estructura: variable = condicion ? si es verdadero: si es falso;
        String estado = 7 == 7 ? "SI" : "NO";
        System.out.println(estado.concat(" es verdadero!"));

        double matematicas = 0.0;
        double ciencias = 0.0;
        double historia = 0.0;
        double promedio = 0.0;
        Scanner scan = new Scanner(System.in);

        System.out.println("\n¡NOTA debe estar entre 2 y 7!");
        System.out.print("Ingrese nota matemáticas: ");
        matematicas = scan.nextDouble();
        System.out.print("Ingrese nota ciencias: ");
        ciencias = scan.nextDouble();
        System.out.print("Ingrese nota historia: ");
        historia = scan.nextDouble();

        System.out.println();
        promedio = (matematicas + ciencias + historia) / 3;
        estado = promedio >= 5.49 ? "aprobado" : "Rechazado";
        System.out.println("Estudiante ".concat(estado));
        System.out.println("Promedio = " + promedio);

    }

}
