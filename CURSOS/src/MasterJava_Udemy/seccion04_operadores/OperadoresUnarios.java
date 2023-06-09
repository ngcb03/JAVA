package MasterJava_Udemy.seccion04_operadores;

public class OperadoresUnarios {

    public static void main(String[] args) {

        int i = -5, j = +i; // j = (1)*i => -5
        System.out.println("i = -5 -> " + i);
        System.out.println("j = +i -> " + j);

        int k = -i; // k = (-1)*i => 5
        System.out.println("k = -i -> " + k);

        i = 6;
        j = +i;
        System.out.println("j = +i => " + k);

        k = -i;
        System.out.println("k = -i => " + k);


    }

}
