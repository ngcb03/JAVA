package MasterJava_Udemy.seccion04_operadores;

public class PrecedenciaOperadores {

    public static void main(String[] args) {

        int i = 3, j = 6, k = 9;
        double promedio = (i + j) / (k * 3d);

        System.out.println("i = " + i);
        System.out.println("j = " + j);
        System.out.println("k = " + k + "\n");
        System.out.println("(i + j) / (k * 3d) = " + promedio);
        promedio = ++i + j-- + k / 3d * 10;
        System.out.println("++i + j-- + k / 3d * 10 = " + promedio);

    }

}
