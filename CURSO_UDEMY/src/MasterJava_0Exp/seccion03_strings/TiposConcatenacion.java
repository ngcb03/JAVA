package MasterJava_0Exp.seccion03_strings;

public class TiposConcatenacion {

    public static void main(String[] args) {

        // se mide rendimiento de las diferentes formas de concatenar
        String a = "a";
        String b = "b";
        String c = a;

        /*
        * 1. Usamos clase StringBuilder la cual recibe un String como parámetro
        * 2. Nos permite crear un String
        * 3. Anexamos elementos con el método append()
        * 4. Luego con el método ToString() generamos el String completo de forma más optimizada
        * 5. Tiene la caracteristica de ser mutable
        * */
        StringBuilder sb = new StringBuilder(a);
        long inicio = System.currentTimeMillis();

        for(int i = 0; i < 10000; i++){
            // c = c.concat(a).concat(b).concat("\n"); // 500 => 5ms
            // c += a + b + "\n"; // 500 => 37ms - 50ms
            /* c = c.transform((c2) -> {
                return c2 + a + b + "\n";
            }); // 500 => 27ms - 138ms */
            sb.append(a).append(b).append("\n"); // 500 => 1ms / 1000 => 3ms - 9ms
        }

        long fin = System.currentTimeMillis();
        System.out.println("c = " + c);
        System.out.println("sb = " + sb.toString());
        System.out.println(fin - inicio);
    }

}
