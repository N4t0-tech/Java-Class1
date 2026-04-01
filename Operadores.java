public class Operadores {
    public static void main(String[] args) {
        System.out.println("\n Operadores Aritmeticos en JAVA:");
        int a = 10;
        int b = 5;

        System.out.println("a = " + a);
        System.out.println("b = " + b);

        System.out.println("\n Suma: a + b = " + (a + b));
        System.out.println("Resta: a - b = " + (a - b));
        System.out.println("Multiplicación: a * b = " + (a * b));
        System.out.println("División: a / b = " + (a / b));
        System.out.println("Módulo: a % b = " + (a % b));

        System.out.println("OJO: int /int = int, si quieres un resultado decimal, al menos uno de los operandos debe ser un tipo de dato de punto flotante (float o double).");

        // operadores de incremento 
        System.out.println("\n Operadores de Incremento:");
        int c = 5;
        System.out.println("Valor inicial de c: " + c);
        c++; // Incremento postfijo
        System.out.println("Después de c++: " + c);
        ++c; // Incremento prefijo
        System.out.println("Después de ++c: " + c);
        System.out.println("OJO: El operador de incremento postfijo (c++) devuelve el valor original de c antes de incrementarlo, mientras que el operador de incremento prefijo (++c) incrementa c primero y luego devuelve el nuevo valor.  Esto puede afectar el resultado de las expresiones en las que se utilizan estos operadores, por lo que es importante entender la diferencia entre ellos para evitar confusiones en el código.");

        // operadores de decremento

        System.out.println("\n Operadores de Decremento:");
        int d = 5;
        System.out.println("Valor inicial de d: " + d);
        d--; // Decremento postfijo
        System.out.println("Después de d--: " + d);
        --d; // Decremento prefijo
        System.out.println("Después de --d: " + d);
        System.out.println("OJO: El operador de decremento postfijo (d--) devuelve el valor original de d antes de decrementarlo, mientras que el operador de decremento prefijo (--d) decrementa d primero y luego devuelve el nuevo valor.  Al igual que con los operadores de incremento, es importante entender la diferencia entre ellos para evitar confusiones en el código, especialmente cuando se utilizan en expresiones más complejas donde el orden de evaluación puede afectar el resultado final.");

        
        // operadores racionales
        System.out.println("\n Operadores Racionales:");
        int x = 10;
        int y = 5;

        // Imprimir los valores de x e y
        System.out.println("x = " + x);

        System.out.println("y = " + y);

        // Comparaciones utilizando operadores racionales
        System.out.println("x > y: " + (x > y)); // El operador de comparación mayor que (>)
        System.out.println("x < y: " + (x < y)); // El operador de comparación menor que (<)
        System.out.println("x >= y: " + (x >= y)); // El operador de comparación mayor o igual que (>=)
        System.out.println("x <= y: " + (x <= y)); // El operador de comparación menor o igual que (<=)
        System.out.println("x == y: " + (x == y)); // El operador de comparación de igualdad (==)
        System.out.println("x != y: " + (x != y)); // El operador de comparación de desigualdad (!=)
        System.out.println("OJO: Los operadores racionales se utilizan para comparar dos valores y devuelven un valor booleano (true o false) dependiendo del resultado de la comparación.  Es importante entender cómo funcionan estos operadores para tomar decisiones basadas en condiciones en el código, como en estructuras de control como if, while, y for.  Además, es crucial recordar que el operador de igualdad (==) compara el valor de los operandos, mientras que el operador de desigualdad (!=) verifica si los valores son diferentes, lo que puede ser especialmente importante al comparar objetos en Java, donde el operador de igualdad puede no funcionar como se espera si no se utiliza correctamente."); 
        
    }
}
