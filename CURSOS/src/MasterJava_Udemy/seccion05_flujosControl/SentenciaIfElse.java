package MasterJava_Udemy.seccion05_flujosControl;

public class SentenciaIfElse {

    public static void main(String[] args) {

        /* ESTRUCTURA
        *
        * if(expresión){
        *   instrucciones -> expresión verdadera
        * }else{
        *   instrucciones -> expresión falsa
        * }
        *
        * */

        float promedio = 5.8f;

        if(promedio >= 8.5){
            System.out.println("Felicitaciones, excelente promedio");
        } else if(promedio >= 7.0){
            System.out.println("Muy buen promedio!");
        } else if(promedio >= 6.0){
            System.out.println("Buen promedio");
        }else if(promedio >= 5.0){
            System.out.println("Regular, necesitar esforzarte más!");
        }else{
            System.out.println("Necesitas esforzarte más!");
        }

    }

}
