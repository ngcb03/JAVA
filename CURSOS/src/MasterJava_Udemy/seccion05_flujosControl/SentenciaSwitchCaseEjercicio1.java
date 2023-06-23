package MasterJava_Udemy.seccion05_flujosControl;

import java.util.Scanner;

public class SentenciaSwitchCaseEjercicio1 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese el número del mes de 1 a 12: ");
        int mes = scanner.nextInt();

        System.out.print("Ingrese el año (YYYY): ");
        int anio = scanner.nextInt();

        int numeroDias = 0;

        switch (mes){
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                numeroDias = 31;
                break;
            case 4:
            case 6:
            case 9:
            case 11:
                numeroDias  =30;
                break;
            case 2:
                if (anio % 400 == 0 || ((anio % 400 == 0) && !(anio % 100 == 0))){
                    numeroDias = 29;
                }else{
                    numeroDias = 28;
                }
                break;
            default:
                System.out.println("Mes no valido!");
        }

        System.out.println("numeroDias = " + numeroDias);

    }

}
