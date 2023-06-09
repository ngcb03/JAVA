package MasterJava_Udemy.seccion04_operadores;

public class OperadoresLogicos {

    public static void main(String[] args) {

        int i = 3;
        byte j = 7;
        float k = 127e-7f;
        double l = 3.1416e3;
        boolean m = false;

        boolean b1 = i == j && k > l && m == true;
        System.out.println("i == j && k > l && m == true = " + b1);

        boolean b2 = i  == j ||  k < l;
        System.out.println("i  == j ||  k > l = " + b2);


        // PRECEDENCIA DE OPERADORES

        // 1. EL AND (&&) tiene mayor prioridad que el OR (||)
        boolean b3 = i == j && k < l || m == false;
        System.out.println("i == j && k < l || m = false = " + b3);

        // 2. A menos que indiquemos lo contrario por prioridad
        boolean b4 = i == j && (k > l || m == false);
        System.out.println("i == j && (k > l || m = false) = " + b4);

        boolean b5 = (true || true) && false;
        System.out.println("(true || true) && false = " + b5);

        boolean b6 = true || false && false || false;
        System.out.println("true || false && false || false = " + b6);
        // se evaluaría de la forma -> true || (false && false) || false
    }

}
