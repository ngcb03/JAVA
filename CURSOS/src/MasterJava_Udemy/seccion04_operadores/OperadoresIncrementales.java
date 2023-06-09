package MasterJava_Udemy.seccion04_operadores;

public class OperadoresIncrementales {

    public static void main(String[] args) {

        int i = 1;

        // Pre incremento
        int j = ++i; // primero incrementa y luego se asigna
        System.out.println("j = ++i => " + j);

        // Post incremento;
        i = 2;
        j = i++; // primero se asigna y luego se incrementa
        System.out.println("j = i++ => " + j);

        // Pre decremento
        i = 3;
        j = --i; // primero decrementa y luego se asigna
        System.out.println("j = --i => " + j);

        // Post decremento;
        i = 4;
        j = i--; // primero se asigna y luego se decrementa
        System.out.println("j = i-- => " + j);

        System.out.println("++i = " +  ++i);
        System.out.println("j++ = " + j++);

    }

}
