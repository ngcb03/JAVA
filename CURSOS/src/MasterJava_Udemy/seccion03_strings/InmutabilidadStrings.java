package MasterJava_Udemy.seccion03_strings;

public class InmutabilidadStrings {

    public static void main(String[] args) {
        // Inmutabilidad de los Strings: Una vez se crea objeto su valor no cambia
        // toda operación realizada sobre estos genera un nuevo instancia

        String curso = "Programación Java";
        String profesor = "Andrés Guzmán";

        String resultado = curso.concat(" ".concat(profesor));
        System.out.println("curso: " + curso);
        System.out.println("resultado = " + resultado);
        System.out.println("curso == resultado: " + (curso == resultado));

        /*Otra forma de concatenar un String pero de forma más funcional. Haciendo uso de la
        * expresión Lamda*/
        String resultado2 = curso.transform((crs) -> {
            return crs + " con " + profesor;
        });
        System.out.println("resultado2 = " + resultado2);

        /* Remplazamos todas las letras "a" por "A" */
        String resultado3 = resultado.replace("a","A");
        System.out.println("resultado: " + resultado3);

    }

}
