package MasterJava_0Exp.seccion03_strings;

public class MetodosStringxArreglos {

    public static void main(String[] args) {

        String trabalenguas = "trabalenguas";

        // métodos: toCharArray: convierte el String en un arreglo de caracteres
        // 1. se listan las posiciones en el arreglo en formato UNICODE
        // 2. se puede listar de forma correcta con un bucle
        System.out.println("trabalenguas.toCharArray() = " + trabalenguas.toCharArray());

        char[] arreglo = trabalenguas.toCharArray();
        int largo = arreglo.length;
        for (int i = 0; i < largo; i++) {
            System.out.println("posc [" + i + "]: " + arreglo[i]);
        }

        System.out.println();

        // método: split(): convierte String a arreglo del mismo tipo en base a una expresión regular
        // 1. divide el String por secciones en la cuales encuentre el argumento indicado
        String[] arregloSplit = trabalenguas.split("a");
        largo = arregloSplit.length;
        for(int i = 0; i < largo; i++){
            System.out.println("arregloSplit[i] = " + arregloSplit[i]);
        }

        System.out.println();

        String archivo = "ruta.algun.documento.pdf";
        // 1. con doble barra indicamos que es el caracter punto y no una expresión regular
        String[] archivoPdf = archivo.split("\\.");
        // 2. también se puede indicar entre corchetes
        // String[] archivoPdf = archivo.split("[.]");
        largo = archivoPdf.length;

        for(int i = 0; i < largo; i++){
            System.out.println("archivoPdf[i] = " + archivoPdf[i]);
        }

        System.out.println("archivoPdf[largo-1] = " + archivoPdf[largo-1]);

    }

}
