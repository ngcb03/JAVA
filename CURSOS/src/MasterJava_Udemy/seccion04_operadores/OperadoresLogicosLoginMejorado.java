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

        for(int i = 0; i < usernames.length; i++){
            if(usernames[i].equals(u) && password[i].equals(p)){
                esAutentico=true;
                break;
            }
        }

        if(esAutentico){
            System.out.println("Bienvenido ".concat(u).concat("!"));
        }else{
            System.out.println("¡Usuario erroneo, vuelva a intentarlo!");
        }

    }

}
