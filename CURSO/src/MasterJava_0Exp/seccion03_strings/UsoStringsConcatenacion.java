package MasterJava_0Exp.seccion03_strings;

public class UsoStringsConcatenacion {
    public static void main(String[] args) {

        String curso = "Programación Java";
        String profesor = "Andrés Guzmán";

        String detalle = curso + " con el instructor " + profesor;
        System.out.println(detalle);

        int numeroA = 10;
        int numeroB = 5;

        System.out.println(detalle + " : " + numeroA + numeroB); // concatenando
        System.out.println(detalle + " : " + (numeroA + numeroB)); // concatena + suma
        System.out.println(numeroA + numeroB + " : " + detalle); // suma
        String detalle2 = curso.concat(" ".concat(profesor));
        System.out.println("detalle2 = " + detalle2);

    }
}
