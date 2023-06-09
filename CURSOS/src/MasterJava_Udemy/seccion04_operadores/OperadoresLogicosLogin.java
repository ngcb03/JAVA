/*
* vd #44
* */

package MasterJava_Udemy.seccion04_operadores;

import javax.swing.*;
import java.util.Scanner;

public class OperadoresLogicosLogin {

    public static void main(String[] args) {

        String username1 = "ncamargo";
        String password1 = "1024asdf";

        String username2 = "nicogcb";
        String password2 = "5138fdsa";

        boolean esValido = false;

        Scanner lector = new Scanner(System.in);

        JOptionPane.showMessageDialog(null,"Login de usuario!");
        String u = JOptionPane.showInputDialog("Ingrese usuario: ");
        String p = JOptionPane.showInputDialog("Ingrese contraseña: ");

        if (username1.equals(u) && password1.equals(p) || username2.equals(u) && password2.equals(p)){
            JOptionPane.showMessageDialog(null,"¡Bienvenido ".concat(u).concat("!"));
            esValido = true;
        } else {
            JOptionPane.showMessageDialog(null,"¡Usuario o contraseña incorrectos!");
        }

    }

}
