package MasterJava_Udemy.seccion05_flujosControl;

public class SentenciaWhile {

    public static void main(String[] args) {

        int i = 0;
        while(i < 5){
            System.out.println("i = " + i);
            i++;
        }
        System.out.println();

        i = 0;
        boolean prueba = true;

        while (prueba){
            System.out.println("i = " + i);
            if(i == 7){
                prueba = false;
            } i++;
        } System.out.println();

        do{
            System.out.println("prueba = " + prueba);
        }while(prueba);

    }

}
