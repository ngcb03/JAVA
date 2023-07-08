package MasterJava_Udemy.seccion05_flujosControl;

import javax.swing.*;

public class SentenciaForArreglo {

    public static void main(String[] args) {

        //String[] nombres = new String[6];
        String[] nombres = {"Nicolas","Gabriel","Juan","Camilo"};

        // Solicitar nombre al usuario
        String buscar = JOptionPane.showInputDialog("Ingrese un nombre: ");

        int count = nombres.length;
        for(int i = 0; i < count; i++){

            if(!nombres[i].equals(buscar)) {
                continue;
            } else{
                count = 0;
                break;
            }
        }

        if(count!=0){
            JOptionPane.showMessageDialog(null,"¡El nombre NO existe!");
        } else{
            JOptionPane.showMessageDialog(null,"¡El nombre SI existe!");
        } System.exit(1);

    }

}
