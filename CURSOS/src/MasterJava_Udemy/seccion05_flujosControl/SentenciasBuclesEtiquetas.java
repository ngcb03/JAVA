package MasterJava_Udemy.seccion05_flujosControl;

public class SentenciasBuclesEtiquetas {

    public static void main(String[] args) {

        // Bucle contenido en una etiqueta (._.)
        etiqueta_bucle1: for(int i = 0; i < 5; i++){
            System.out.println();
            for(int j = 0; j < 5; j++){
                if(i == 2){ continue etiqueta_bucle1; } // ir al for padre
                System.out.print("[i " + i + " , j " + j + "], ");
            }
        }
        System.out.println("\n");

        etiqueta_bucle2: for (int i = 0; i < 8; i++){
            if(i == 4){
                break etiqueta_bucle2; // salimos bucle padre
            }
            System.out.print("i = " + i + ", ");
        }

    }

}