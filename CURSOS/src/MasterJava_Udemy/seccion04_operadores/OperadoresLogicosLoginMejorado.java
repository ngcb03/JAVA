/*
 * vd #45
 * */

package MasterJava_Udemy.seccion04_operadores;

import java.util.Scanner;

public class OperadoresLogicosLoginMejorado {

    public static void main(String[] args) {

        String[] usernames = {"root","admin","ncamargo"};
        String[] password = {"root","admin","1024asdf"};

        Scanner scan = new Scanner(System.in);
        boolean esAutentico = false;

        System.out.print("Ingrese nombre usuario: ");
        String u = scan.next();
        System.out.print("Ingrese contreña usuario: ");
        String p = scan.next();

        for(int i = 0; i < usernames.length && esAutentico != true; i++){
            esAutentico = (usernames[i].equals(u) && password[i].equals(p)) ? true: false;
            /*if(usernames[i].equals(u) && password[i].equals(p)){
                esAutentico=true;
                break;
            }*/
        }
        String mensaje = esAutentico ?
                ("Bienvenido ".concat(u).concat("!")): ("¡Usuario erroneo, vuelva a intentarlo!");
        System.out.println(mensaje);

    }

}
