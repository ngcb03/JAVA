package MasterJava_Udemy.seccion04_operadores;

/*
 * Tipos abstractos o genéricos
 */
public class OperadorInstanceOfTiposGenericos {

    public static void main(String[] args) {

        Object texto1 = new String("Creando un objeto de la clase String!");
        Number num1 = Integer.valueOf(7);

        Boolean validar = texto1 instanceof String;
        System.out.println("texto1 instanceof String = " + validar);

        validar = texto1 instanceof Integer;
        System.out.println("texto1 instanceof Integer = " + validar);

        // Todos los tipos heredan de la clase Object
        validar = texto1 instanceof Object;
        System.out.println("texto1 instanceof Object = " + validar);

        validar = num1 instanceof Integer;
        System.out.println("num1 instanceof Integer = " + validar);

        validar = num1 instanceof Number;
        System.out.println("num1 instanceof Number = " + validar);

        validar = num1 instanceof Long;
        System.out.println("num1 instanceof Long = " + validar);

        validar = num1 instanceof Object;
        System.out.println("num1 instanceof Object = " + validar);

        Number decimal = 45.54;

        validar = decimal instanceof Float;
        System.out.println("decimal instanceof Float = " + validar);

        validar = decimal instanceof Double;
        System.out.println("decimal instanceof Double = " + validar);

        validar = decimal instanceof Number;
        System.out.println("decimal instanceof Number = " + validar);

        validar = decimal instanceof Object;
        System.out.println("decimal instanceof Object = " + validar);

        validar = validar instanceof Boolean;
        System.out.println("validar instanceof Boolean = " + validar);

        validar = validar instanceof Object;
        System.out.println("validar instanceof Object = " + validar);

    }

}