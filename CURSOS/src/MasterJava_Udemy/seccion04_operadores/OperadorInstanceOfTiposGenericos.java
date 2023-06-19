package MasterJava_Udemy.seccion04_operadores;

/*
 * Instanceof: Nos permite saber si una instancia es referencia o pertenceciente a un tipo
 * de por ejemplo: una clase, una interfaz, clase abtracta o de un subtipo
*/
public class OperadorInstanceOfTiposGenericos {

    public static void main(String[] args) {

        String texto1 = new String("Creando un objeto de la clase String!");
        Integer num1 = 7;
        // Integer num1 = Integer.valueOf(7):
        // por debajo uso esta forma para Integer num1 = 9;

        Boolean validar = texto1 instanceof String;
        System.out.println("texto1 instanceof String = " + validar);

        validar = texto1 instanceof String;
        System.out.println("texto1 instanceof String = " + validar);

        validar = num1 instanceof Integer;
        System.out.println("num1 instanceof Integer = " + validar);

        Number decimal = 45.54F;
        validar = decimal instanceof Double;
        System.out.println("decimal instanceof Double = " + validar);

        validar = validar instanceof Boolean;
        System.out.println("validar instanceof Boole|an = " + validar);

        Number num2 = 9;
        validar = num2 instanceof Long;
        System.out.println("num2 instanceof Long = " + validar);

        // Todos los tipos heredan de la clase Object
        validar = texto1 instanceof Object;
        System.out.println("texto1 instanceof Object = " + validar);

        validar = num1 instanceof Object;
        System.out.println("num1 instanceof Object = " + validar);

        validar = decimal instanceof Object;
        System.out.println("decimal instanceof Object = " + validar);

        validar = validar instanceof Object;
        System.out.println("validar instanceof Object = " + validar);

    }

}
