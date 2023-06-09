package MasterJava_0Exp.seccion04_operadores;

public class OperadoresRelacionales {

    public static void main(String[] args) {

        int i = 3;
        byte j = 7;
        float k = 127e-7f;
        double l = 3.1416e3;
        boolean m = false;

        boolean b1 = i == j;
        System.out.println("b1 = " + b1);
        
        boolean b2 = !b1;
        System.out.println("!b1 = " + b2);

        boolean b3 = i != j;
        System.out.println("i != j = " + b3);
        
        boolean b4 = m == true;
        System.out.println("m = " + m);
        System.out.println("m == true = " + b4);

        boolean b5 = m != true;
        System.out.println("m != true = " + b5);

        boolean b6 = i > j;
        System.out.println("i > j = " + b6);

        boolean b7 = j < i;
        System.out.println("j < i = = " + b7);

        boolean b8 = l >= k;
        System.out.println("l >= k = " + b8);

        boolean b9 = l <= k;
        System.out.println("l <= k = " + b9);
        
    }

}
