package MasterJava_Udemy.seccion05_flujosControl;

public class SentenciaFor {

    public static void main(String[] args) {

        for(int i = 0; i < 10; i++){
            if(i % 2 == 0){
                continue; // sigue a la siguiente iteración
            }
            System.out.println("i -> " + i);
        } System.out.println();
        
        int i = 0;
        for( ; ; ){
            if(i > 5){
                break;
            } System.out.println("i = " + i);
            i++;
        } System.out.println();

        for(int j = 1, k = 10; j < k; j++, k--){
            System.out.println(j + " - " + k);
        }

    }
}
