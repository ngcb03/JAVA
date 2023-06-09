package MasterJava_0Exp.seccion03_strings;

public class UsoStrings {

    public static void main(String[] args) {

        // String curso = new String("Programación Java");
        String curso = "Programación Java"; // abreviado / implícito -> automatizar
        String curso2 = new String("Programación Java"); // explícito

        boolean esIgual = curso == curso2;
        System.out.println("curso == curso2: " + esIgual);

        esIgual = curso.equals(curso2);
        System.out.println("curso.equals(curso2): " + esIgual);

        esIgual = curso.equalsIgnoreCase(curso2);
        System.out.println("curso.equalsIgnoreCase(curso2): " + esIgual);

        String curso3 = "Programación Java";
        esIgual = curso == curso3;
        System.out.println("curso == curso3 = " + esIgual); /* Detecta que ya se creó un objeto con contenido
        identifico por lo cual no crea un nuevo objeto para optimizar. Asigna la referencia del objeto
        con el contenido idéntico que ya existe. No crear más objetos idénticos en memoria*/

    }

}
