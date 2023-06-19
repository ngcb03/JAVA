package MasterJava_Udemy.seccion03_strings;

public class MetodosStrings {

    public static void main(String[] args) {

        String nombre = "Nicolas Camargo";
        System.out.println("\nnombre = " + nombre);

        // método: length(): saber largo o caracteres
        System.out.println("nombre.length() = " + nombre.length());

        // método: toUpperCase(): convetir mayusculas
        System.out.println("nombre.toUpperCase() = " + nombre.toUpperCase());

        // método: toLowerCase(): convertir minúsculas
        System.out.println("nombre.toLowerCase() = " + nombre.toLowerCase());

        // método: equals(): comparar Strings
        System.out.println("nombre.equals(\"nicolas camargo\") = " + nombre.equals("nicolas camargo"));
        System.out.println("nombre.equals(\"Nicolas Camargo\") = " + nombre.equals("Nicolas Camargo"));

        // método: equalsIgnoreCase: ignora mayusculas y minusculas
        System.out.println("nombre.equalsIgnoreCase(\"nicolas camargo\") = " + nombre.equalsIgnoreCase("nicolas camargo"));

        // método: compareTo(): compara a nivel alfabético con otro String
        System.out.println("nombre.compareTo(\"Gabriel Buelvas\") = " + nombre.compareTo("Gabriel Buelvas"));

        // método: chatAt(): obtener caracterer de un String
        System.out.println("nombre.charAt(0) = " + nombre.charAt(0));
        System.out.println("nombre.charAt(nombre.length()-1) = " + nombre.charAt(nombre.length()-1));

        // método: subString: obtener fragmento String
        System.out.println("nombre.substring(2) = " + nombre.substring(2));
        System.out.println("nombre.substring(2,10) = " + nombre.substring(2, 12));

        System.lineSeparator();

        String trabalenguas = "trabalenguas";
        System.out.println("trabalenguas = " + trabalenguas);

        // método: replace(): remplazar letras/caracteres
        System.out.println("trabalenguas.replace(\"a\",\".\") = " + trabalenguas.replace("a", "."));

        // método: indexOf(): saber si se encuentra caracter/frase en específico
        // 0. recibe tanto caracteres 'a' como frases "a" como argumento
        // 1. devuelve primera posición forma ascende que coincida con lo solicitado
        System.out.println("trabalenguas.indexOf('a') = " + trabalenguas.indexOf('a'));
        System.out.println("trabalenguas.indexOf(\"leng\") = " + trabalenguas.indexOf("leng"));
        // 2. no existe caracter/frase devuelve -1
        System.out.println("trabalenguas.indexOf('z') = " + trabalenguas.indexOf('z'));
        
        // método: lastIndexOf(): busca último caracter/frase que coincida
        System.out.println("trabalenguas.lastIndexOf('a') = " + trabalenguas.lastIndexOf('a'));

        // método: contains(): saber si se encuentra una secuencia de caracteres
        // 0. solo recibe frases "a" como argumentos
        // 1. retorna booleano
        System.out.println("trabalenguas.contains(\"a\") = " + trabalenguas.contains("a"));
        System.out.println("trabalenguas.contains(\"guas\") = " + trabalenguas.contains("guas"));

        // método: startsWith(): si comienza con cierta frase
        System.out.println("trabalenguas.startsWith(\"traba\") = " + trabalenguas.startsWith("traba"));
        System.out.println("trabalenguas.startsWith(\"lenguas\") = " + trabalenguas.startsWith("lenguas"));

        // método endsWith(): si termina con cirta frase
        System.out.println("trabalenguas.endsWith(\"lenguas\") = " + trabalenguas.endsWith("lenguas"));
        System.out.println("trabalenguas.endsWith(\"traba\") = " + trabalenguas.endsWith("traba"));

        // método: trim(): quita espacios blanco izquierda y deracha
        System.out.println("  trabalenguas     ".trim());
        
    }

}
