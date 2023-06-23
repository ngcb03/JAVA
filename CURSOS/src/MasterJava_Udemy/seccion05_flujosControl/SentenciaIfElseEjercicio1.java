package MasterJava_Udemy.seccion05_flujosControl;

import javax.swing.*;

public class SentenciaIfElseEjercicio1 {

    public static void main(String[] args) {

        int numeroDias = 0;

        JOptionPane.showMessageDialog(null,"--- NUEMERO DIAS MES ---");
        int mes = Integer.parseInt(JOptionPane.showInputDialog("Ingrese mes actual: "));
        int anio = Integer.parseInt(JOptionPane.showInputDialog("Ingrese año actual: "));

        if(mes == 1 || mes == 3 || mes == 5 || mes == 7 || mes == 8 || mes == 10 || mes == 12){
            numeroDias = 31;
        } else if (mes == 4 || mes == 6 || mes == 9 || mes == 11){
            numeroDias = 30;
        } else if (mes == 2){
            if (anio % 400 == 0 || ((anio % 400 == 0) && !(anio % 100 == 0))){
                numeroDias = 29;
            }else{
                numeroDias = 28;
            }
        } else {
            JOptionPane.showMessageDialog(null,
                    "Mes incorrecto, debe estar entre 1 y 12!");
        }

        JOptionPane.showMessageDialog(null,
                "Numero días del mes: " +  numeroDias);
    }

}
