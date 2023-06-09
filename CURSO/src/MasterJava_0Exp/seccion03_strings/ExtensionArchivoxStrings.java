package MasterJava_0Exp.seccion03_strings;

public class ExtensionArchivoxStrings {

    public static void main(String[] args) {

        String archivo = "ruta_alguna_imagen.jpg";
        System.out.println("archivo = " + archivo);
        System.out.println("archivo.length() = " + archivo.length());

        // últimos 3 caracteres: forma estática
        System.out.println("archivo.substring(19) = " + archivo.substring(19));

        // últimos 3 caracteres: forma dinámica
        System.out.println("archivo.substring(archivo.indexOf('.')) = " + archivo.substring(archivo.lastIndexOf('.')+1));

    }

}
