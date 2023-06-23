package MasterJava_Udemy.seccion05_flujosControl;

import java.util.Scanner;

public class SentenciaSwitchCase {

    public static void main(String[] args) {

        int num = 9;

        switch (num){
            case 3:
                System.out.println("Cerca de cero");
                break;
            case 6:
                System.out.println("Cerca de cero y diez");
                break;
            case 9:
                System.out.println("Cerca de diez");
                break;
            default:
                System.out.println("Valor no registrado!");
        }

        String nombre = "user";

        switch (nombre){
            case "admin":
                System.out.println("Rol: administrador del sistema");
                break;
            case "user":
                System.out.println("Rol: usuario del sistema");
                break;
            default:
                System.out.println("Rol no existente o registrado!");
        }

        Scanner scanner = new Scanner(System.in);
        String nombreMes = "";

        System.out.print("Ingrese mes actual: ");
        int mes = scanner.nextInt();

        switch (mes){
            case 1:
                nombreMes = "enero";
                break;
            case 2:
                nombreMes = "febrero";
                break;
            case 3:
                nombreMes = "marzo";
                break;
            case 4:
                nombreMes = "abril";
                break;
            case 5:
                nombreMes = "mayo";
                break;
            case 6:
                nombreMes = "junio";
                break;
            case 7:
                nombreMes = "julio";
                break;
            case 8:
                nombreMes = "agosto";
                break;
            case 9:
                nombreMes = "septiembre";
                break;
            case 10:
                nombreMes = "octubre";
                break;
            case 11:
                nombreMes = "noviembre";
                break;
            case 12:
                nombreMes = "diciembre";
                break;
            default:
                System.out.printf("Mes no valido!");
        }

        System.out.println("nombreMes = " + nombreMes);

    }

}
