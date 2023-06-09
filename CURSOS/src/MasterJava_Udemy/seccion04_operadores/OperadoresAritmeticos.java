package MasterJava_Udemy.seccion04_operadores;

import javax.swing.*;

public class OperadoresAritmeticos {

    public static void main(String[] args) {

        int i = 9, j = 5, suma = i + j;
        System.out.println("suma = " + suma);
        System.out.println("i + j = " + (i + j));
        
        int resta = i - j;
        System.out.println("resta = " + resta);
        // System.out.println("i - j = " + i - j); // error
        System.out.println("i - j = " + (i - j));

        int multi = i * j;
        System.out.println("multiplicación = " + multi);
        
        int div = i / j;
        float div2 = (float) i / (float) j;
        System.out.println("división entera = " + div);
        System.out.println("división flotante: " + div2);
        
        int resto = i % j;
        System.out.println("resto = " + resto);

        int numero = Integer.parseInt(JOptionPane.showInputDialog("Ingrese un número: "));
        if(numero % 2 == 0){
            System.out.println("Par!");
        }else {
            System.out.println("Impar!");
        }

    }

}
