package MasterJava_Udemy.seccion05_flujosControl;

import javax.swing.*;

public class SentenciaForeach {

    public static void main(String[] args) {

        int[] impares = {1, 3, 5, 7, 9, 11, 13, 15};

        System.out.println("Numeros impares del 1 a 15:");
        for(int numero: impares){
            System.out.print(numero + ", ");
        } System.out.println();

        String[] nombres = {"Nicolas","Gabriel","Juan","Camilo"};

        // Solicitar nombre al usuario
        String buscar = JOptionPane.showInputDialog("Ingrese un nombre: ");
        boolean encontrado = false;

        for(String nombre: nombres){
            if(!nombre.equals(buscar)) {
                continue;
            } else{
                encontrado = true;
                break;
            }
        }

        if(encontrado){
            JOptionPane.showMessageDialog(null,"¡El nombre SI existe!");
        } else {
            JOptionPane.showMessageDialog(null,"¡El nombre NO existe!");
        }

    }

}
