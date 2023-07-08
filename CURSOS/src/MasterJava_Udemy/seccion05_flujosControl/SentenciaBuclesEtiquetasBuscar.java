package MasterJava_Udemy.seccion05_flujosControl;

public class SentenciaBuclesEtiquetasBuscar {

    public static void main(String[] args) {

        String frase = "tres tristes tigres tragan trigo en un trigal";
        String palabra = "trigo";
        int max_frase = frase.length(), max_palabra = palabra.length(), cantidad = 0;

        buscar: for(int i = 0; i < max_frase; i++){
            int k = i;
            for(int j = 0; j < max_palabra; j++){
                if(frase.charAt(k++) != palabra.charAt(j)){
                    continue;
                } cantidad++;
            }
            // cantidad == max_palabra ? ;
        }

    }

}
