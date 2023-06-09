package MasterJava_Udemy.seccion04_operadores;

public class OperadoresAsignacion {

    public static void main(String[] args) {

        // Operador de asignación "="
        // 1. Para dar un valor a una variable o estructura que almacene datos

        int var1 = 5;
        int var2 = var1 + 4;
        System.out.println("var1 = " + var1);
        System.out.println("var2 = " + var2);
        
        var1 += 2; // var2 = var2 + 2;
        System.out.println("var1 += 2 = " + var1);
        
        var1 -= 4; // var1 = var1 - 4;
        System.out.println("var1 -= 4 = " + var1);

        String sqlString = "select * from clientes as c";
        sqlString += " where c.nombre='Andres'";
        sqlString += " and c.activo=1";
        System.out.println("sqlString = " + sqlString);

    }

}
