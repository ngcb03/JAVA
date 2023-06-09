package MasterJava_0Exp.seccion03_strings;

public class ValidarStrings {

    public static void main(String[] args) {

        String curso = null;
        boolean esNulo = curso == null;

        System.out.println("esNulo = " + esNulo);

        if(esNulo) { // !esNulo -> mismo que -> esNulo == false
            curso = "programación Java";
            System.out.println(curso.toLowerCase());
        }

        // No se puede concatenar String con null
        /* System.out.println("Bienvenido al curso".concat
                (curso.concat(" desde cero!"))); */

        // Saber si String es vacío
        boolean esVacio = curso.length() == 0;

        if(!esVacio){
            // Al concatenar el String con el null no da error
            System.out.println("Bienvenido al curso " + curso);
        }

        curso = " "; // deja de ser vacío

        boolean esVacio2 = curso.isEmpty(); // java/jdk 6 o 1.6 en adelante
        if(!esVacio2){
            System.out.println("Bienvenido al curso " + curso + "!");
        }

        // saber si contiene únicamente un espacio
        boolean esBlanco = curso.isBlank(); // jdk 11 en adelante
        if(esBlanco){
            System.out.println("Curso es vacío!");
        }

    }

}
