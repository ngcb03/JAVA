package MasterJava_Udemy.seccion04_operadores;
import java.util.Scanner;

//Operadores ternarios: Mayor de dos números

public class OperadorTernarioNumeroMayor {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.lineSeparator();

        System.out.print("Ingrese primer número: ");
        int num1 = scanner.nextInt();
        System.out.print("Ingrese segundo número: ");
        int num2 = scanner.nextInt();
        System.out.print("Ingrese tercer número: ");
        int num3 = scanner.nextInt();
        System.out.print("Ingrese cuarto número: ");
        int num4 = scanner.nextInt();

        int mayor = (num1>num2 && num1>num3 && num1>num4) ? num1 : ((num2>num3 && num2>num4) ?
                num2 : ((num3>num4) ? num3 : num4));
        System.out.println("Número mayor = " + mayor);


    }

}
