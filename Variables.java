public class Variables {
    public static void main(String[] args) {
        // Numeros enteros
        System.out.println("\n Tipos de Numeros enteros:");


        // Variables primitivas declaradas e inicializadas
        byte numByte = 127;
        short numShort = 32767;
        int numInt = 2147483647;
        long numLong = 9223372036854775807L;

        System.out.println("Byte (8 bits): " + numByte);
        System.out.println("Short (16 bits): " + numShort);
        System.out.println("Int (32 bits): " + numInt);
        System.out.println("Long (64 bits): " + numLong);

            System.err.println("todos representan numeros enteros, pero con diferentes rangos y tamaños de almacenamiento.  El byte es el más pequeño y el long es el más grande, lo que permite almacenar números enteros más grandes o más pequeños según sea necesario.  Es importante elegir el tipo de dato adecuado según el rango de valores que se espera manejar en el programa para optimizar el uso de memoria y evitar errores de desbordamiento.");

        // numeros decimales
        System.out.println("\n Tipos de Numeros decimales:");

        // Variables primitivas declaradas e inicializadas
        float numFloat = 3.14f;
        double numDouble = 3.141592653589793;

        System.out.println("Float (32 bits): " + numFloat);
        System.out.println("Double (64 bits): " + numDouble);

            System.err.println("El float es un tipo de dato de punto flotante de precisión simple que ocupa 32 bits y tiene una precisión de aproximadamente 7 dígitos decimales, mientras que el double es un tipo de dato de punto flotante de precisión doble que ocupa 64 bits y tiene una precisión de aproximadamente 15 dígitos decimales.  El double es más preciso que el float, pero también ocupa más memoria.  Es importante elegir el tipo de dato adecuado según la precisión requerida en los cálculos y el uso de memoria en el programa.");

        // Caracteres

        char letra = 'A';

        System.out.println("\n Tipo de dato char:");
        // Imprimir el valor del char
        System.out.println("Char (16 bits): " + letra);

            System.err.println("El char es un tipo de dato primitivo en Java que se utiliza para representar caracteres individuales.  Ocupa 16 bits (2 bytes) de memoria y puede almacenar cualquier carácter Unicode, lo que significa que puede representar una amplia gama de caracteres de diferentes idiomas y símbolos.  El char se define utilizando comillas simples (' '), y su valor se asigna a través de un literal de carácter o mediante su código Unicode.  Es importante tener en cuenta que el char es un tipo de dato de punto único, lo que significa que solo puede almacenar un carácter a la vez.");

        // Booleanos
        boolean esVerdadero = true;

        System.out.println("\n Tipo de dato boolean:");
        // Imprimir el valor del boolean
        System.out.println("Boolean (1 bit): " + esVerdadero);

            System.err.println("El boolean es un tipo de dato primitivo en Java que se utiliza para representar valores de verdad, es decir, verdadero (true) o falso (false).  Aunque se dice que ocupa 1 bit, en realidad el tamaño de un boolean puede variar dependiendo de la implementación de la máquina virtual de Java, pero generalmente se almacena como un byte (8 bits) para facilitar su manejo.  El boolean se utiliza comúnmente en estructuras de control como condicionales y bucles para tomar decisiones basadas en condiciones lógicas.  Es importante utilizar el tipo booleano para mejorar la legibilidad del código y evitar confusiones al representar estados verdaderos o falsos en el programa.");
        
        // wrappers
        System.out.println("\n Tipos de datos Wrapper:");

        // Variables Wrapper declaradas e inicializadas
        Byte wrapperByte = 127;
        Short wrapperShort = 32767;
        Integer wrapperInt = 2147483647;
        Long wrapperLong = 9223372036854775807L;
        Float wrapperFloat = 3.14f;
        Double wrapperDouble = 3.141592653589793;
        Character wrapperChar = 'A';
        Boolean wrapperBoolean = true;

        System.out.println("Wrapper Byte: " + wrapperByte);
        System.out.println("Wrapper Short: " + wrapperShort);
        System.out.println("Wrapper Int: " + wrapperInt);
        System.out.println("Wrapper Long: " + wrapperLong);
        System.out.println("Wrapper Float: " + wrapperFloat);
        System.out.println("Wrapper Double: " + wrapperDouble);
        System.out.println("Wrapper Char: " + wrapperChar);
        System.out.println("Wrapper Boolean: " + wrapperBoolean);

            System.err.println("Los tipos de datos Wrapper en Java son clases que envuelven los tipos de datos primitivos, proporcionando métodos y funcionalidades adicionales.  Cada tipo de dato primitivo tiene su correspondiente clase Wrapper: Byte, Short, Integer, Long, Float, Double, Character y Boolean.  Estas clases permiten convertir entre tipos de datos primitivos y objetos, lo que es útil en situaciones donde se requiere un objeto en lugar de un valor primitivo, como en colecciones o al utilizar métodos que requieren objetos.  Además, las clases Wrapper proporcionan métodos para realizar operaciones comunes, como convertir cadenas a números o viceversa, lo que facilita el manejo de datos en el programa.");


        // Comparacion 
        System.out.println("diferencias clave:");

        int x =10 ;
        Integer y = 10;

        System.out.println("Comparación de tipos primitivos:");
        System.out.println("int x = " + x);
        System.out.println("Integer y = " + y);
        System.out.println("int = valor simple");
        System.out.println("Integer = objeto con metodos");

        // FIN

    }

}
