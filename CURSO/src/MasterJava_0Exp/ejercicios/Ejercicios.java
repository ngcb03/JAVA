package MasterJava_0Exp.ejercicios;
import java.util.Scanner;

public class Ejercicios {

    public static void main(String[] args) {

        //DetalleDeFactura.ejercicio1(args);
        ProgramaManejoDeNombres.ejercicio2();

    }

}

// ejercicio #1
class DetalleDeFactura{
    public static void ejercicio1(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.print("Ingrese nombre factura: ");
        String nombreFactura = scan.nextLine();

        System.out.print("Ingrese precio producto #1: ");
        double precio1 = scan.nextDouble();

        System.out.print("Ingrese precio producto #2: ");
        double precio2 = scan.nextDouble();

        double total = precio1+precio2;
        double impuesto = total * 0.19;

        System.out.println("\nLa factura " + nombreFactura + " tiene un total bruto de " +
                total + ", con un impuesto de " + impuesto + " y el monto después de los impuestos es de " +
                (total+impuesto));

    }
}

// ejercicio #2
class ProgramaManejoDeNombres {

    public static void ejercicio2(){

        Scanner scan = new Scanner(System.in);

        // tiempo = 70ms aprox
        /*
        System.out.print("Ingrese nombre de primer familiar o amigo: ");
        String familiar1 = scan.nextLine().trim();

        System.out.print("Ingrese nombre de segundo familiar o amigo: ");
        String familiar2 = scan.nextLine().trim();

        System.out.print("Ingrese nombre de tercer familiar o amigo: ");
        String familiar3 = scan.nextLine().trim();

        long inicio = System.currentTimeMillis();
        String resultado = "";

        char [] new_fam = familiar1.toCharArray();
        String conv = String.valueOf(new_fam[1]+".").toUpperCase();
        conv += familiar1.substring(familiar1.length()-2);

        resultado += conv+"_";


        new_fam = familiar2.toCharArray();
        conv = String.valueOf(new_fam[1]+".").toUpperCase();
        conv += familiar2.substring(familiar2.length()-2);

        resultado += conv+"_";

        new_fam = familiar3.toCharArray();
        conv = String.valueOf(new_fam[1]+".").toUpperCase();
        conv += familiar3.substring(familiar3.length()-2);

        resultado += conv;
        System.out.println(resultado);

        long fin = System.currentTimeMillis();
        System.out.println("Tiempo: " + (fin-inicio));
        */

        // tiempo: 90ms apox

        System.out.println("Ingrese un nombre de un familiar:");
        String nombreA = scan.nextLine();

        System.out.println("Ingrese otro nombre de un familiar:");
        String nombreB = scan.nextLine();

        System.out.println("Ingrese otro nombre de un familiar:");
        String nombreC = scan.nextLine();

        long inicio = System.currentTimeMillis();

        String nombreA2 = nombreA.toUpperCase().charAt(1) + "." + nombreA.substring(nombreA.length()-2);
        String nombreB2 = nombreB.toUpperCase().charAt(1) + "." + nombreB.substring(nombreB.length()-2);
        String nombreC2 = nombreC.toUpperCase().charAt(1) + "." + nombreC.substring(nombreC.length()-2);
        String resultado = nombreA2 + "_" + nombreB2 + "_" + nombreC2;

        long fin = System.currentTimeMillis();
        System.out.println("Tiempo: " + (fin-inicio));


        
    }

}
