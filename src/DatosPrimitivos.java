public class DatosPrimitivos  {

    public static void getDefinicion() {

        System.out.println("**************** DEFINICION *************************");
        System.out.println("Los TIPOS DE DATOS PRIMITIVOS son ");
        System.out.println("tipos de datos escalares que contienen un unico valor.");
        System.out.println("booleanos/caracteres/enteros/flotante/");
        System.out.println("Cada tipo de dato primitivo tiene su clase Wrapper (envolvente) equivalente. Y les da funcionalidad extra.");
        System.out.println("******************************************************");

        // Desde JDK 10, existe la asignacion dinamica (como en javascript). Es decir, el tipo de dato sera
        // segun sea el valor que se le asigne.
        // var numeroVar = 9223372036854775807f;

    }

    public static void getEnterosInfo() {
        System.out.println("**************** Tipo: enteros ***********************");
        System.out.println("Son 4 tipos: byte (8 bits), short (16 bits), int (32 bits), long (64 bits)");
        System.out.println("Clases Wrapper: Byte / Short / Integer / Long");
        System.out.println("Los enteros no tienen precision, o sea, no tienen decimales.");
        System.out.println("Un entero es un número del conjunto Z = {..., -2, -1, 0, 1, 2, ...}");
        System.out.println("Tipos de enteros:");

        System.out.println("--> byte");
        imprimirByteBitsMaxMin(String.valueOf(Byte.BYTES), String.valueOf(Byte.SIZE), String.valueOf(Byte.MIN_VALUE), String.valueOf(Byte.MAX_VALUE), "0");

        System.out.println("--> short");
        imprimirByteBitsMaxMin(String.valueOf(Short.BYTES), String.valueOf(Short.SIZE), String.valueOf(Short.MIN_VALUE), String.valueOf(Short.MAX_VALUE), "0");

        System.out.println("--> int");
        imprimirByteBitsMaxMin(String.valueOf(Integer.BYTES), String.valueOf(Integer.SIZE), String.valueOf(Integer.MIN_VALUE), String.valueOf(Integer.MAX_VALUE), "0");

        System.out.println("--> long");
        imprimirByteBitsMaxMin(String.valueOf(Long.BYTES), String.valueOf(Long.SIZE), String.valueOf(Long.MIN_VALUE), String.valueOf(Long.MAX_VALUE), "0L");

        System.out.println();
        System.out.println("Ejemplos:");

        System.out.println("byte enteroByte = 127; // Mas de 127 da error.");
        System.out.println("short enteroShort = 32767;");
        System.out.println("int enteroInt = 2147483647;");
        System.out.println("long enteroLong = 9223372036854775807L; // Se indica long con L mayuscula");

        // entre -128 a 127
        byte enteroByte = 127; // Mas de 127 da error.
        // entre -32768 a 32767
        short enteroShort = 32767;
        // entre -2147483648 a 2147483647
        int enteroInt = 2147483647;
        // entre -9223372036854775808 a 9223372036854775807
        long enteroLong = 9223372036854775807L; // Se indica long con L mayuscula

        System.out.println("Output:");
        System.out.println("El valor de enteroByte es: " + enteroByte);
        System.out.println("El valor de enteroShort es: " + enteroShort);
        System.out.println("El valor de enteroInt es: " + enteroInt);
        System.out.println("El valor de enteroLong es: " + enteroLong);
        System.out.println();
        System.out.println("** Algunos metodos utiles de las clases Wrapper para pasar a otros sistemas de numeracion: Binario/Hexa/Octal");
        System.out.println("Numero binario de un entero: Integer.toBinaryString(500) es " + Integer.toBinaryString(500));
        System.out.println("Numero hexadecimal de un entero: Integer.toHexString(500) es " + Integer.toHexString(500));
        System.out.println("Numero octal de un entero: Integer.toOctalString(500) es " + Integer.toOctalString(500));
        System.out.println("Ahora pasamos de binario/hexa/octal a entero.");
        System.out.println("[Binario] Se agrega [0b] antes del numero para indicar que es binario");
        System.out.println("[Octal] Se agrega [0] antes del numero para indicar que es octal");
        System.out.println("[Hexadecimal] Se agrega [0x] antes del numero para indicar que es hexa");
        System.out.println("El numero entero del binario 0b111110100 es " + 0b111110100);
        System.out.println("El numero entero del octal 0764 es " + 0764);
        System.out.println("El numero entero del hexa 0x1f4 es " + 0x1f4);

        System.out.println("*************************************************");
    }

    public static void getFlotantesInfo() {

        System.out.println("**************** Tipo: flotantes ***********************");
        System.out.println("Es un tipo dato para guardar números reales con coma flotante con precisión simple y doble");
        System.out.println("Espacio que ocupa: float 32 bits (precision simple) / double 64 bits (presicion doble)");
        System.out.println("Clases Wrapper: Float / Double");
        System.out.println("Tambien se conocen como numeros reales o dobles");
        System.out.println();
        System.out.println("--> float");
        imprimirByteBitsMaxMin(String.valueOf(Float.BYTES), String.valueOf(Float.SIZE), String.valueOf(Float.MIN_VALUE), String.valueOf(Float.MAX_VALUE), "0f");
        System.out.println("Ejemplo:");
        System.out.println("float realFloat1 = 2120f; // Se debe colocar la f/F para indicar que es un float");
        System.out.println("float realFloat2 = 2.12e3f; // Cuando ponemos e3 significa: * (10*10*10), o sea, 10 elevado a 3. Por lo que realFloat1=realFloat2 ");
        float realFloat1 =  2120f;
        float realFloat2 =  2.12e3f;
        System.out.println("El valor de realFloat1 (2120f) es " + realFloat1);
        System.out.println("El valor de realFloat2 (2.12e3f) es " + realFloat2);
        System.out.println("float realFloat3 = 2.12e-3f; // Cuando se pone el signo menos despues de la e, los ceros se agregan hacia la izquierda");
        float realFloat3 =  2.12e-3f;
        System.out.println("El valor de realFloat2 (2.12e-3f) es " + realFloat3);

        System.out.println();
        System.out.println("--> double");
        imprimirByteBitsMaxMin(String.valueOf(Double.BYTES), String.valueOf(Double.SIZE), String.valueOf(Double.MIN_VALUE), String.valueOf(Double.MAX_VALUE), "0.0");
        System.out.println("Ejemplo:");
        System.out.println("double realDouble = 4.7029235E3; // Por defecto es double (cuando tiene punto). Pero tambien se puede poner la d/D");
        double realDouble = 4.7029235E3;
        System.out.println("El valor de realDouble es " + realDouble);
        System.out.println();
        System.out.println("******************************************************");

    }

    public static void getCaracterInfo() {

        System.out.println("**************** Tipo: char ***********************");

        System.out.println("Valores: Código UNICODE. Se definen con comillas simples.");
        System.out.println("Clase Wrapper: Character");
        imprimirByteBitsMaxMin(String.valueOf(Character.BYTES), String.valueOf(Character.SIZE), "\\u0000", "\\uFFFF", "u0000");

        System.out.println("Ejemplos:");
        System.out.println("char caracter = '@';");
        System.out.println("char decimal = 64; // El 64 decimal corresponde a [@]");
        System.out.println("char unicode = '\\u0040'; //Unicode \u0040 corresponde a [@]");

        char caracter = '@';
        char decimal = 64;
        char unicode = '\u0040'; // Corresponde al carácter '!'

        System.out.println("El valor de caracter es: " + caracter);
        System.out.println("El valor de decimal es: " + decimal);
        System.out.println("El valor de unicode es: " + unicode);
        System.out.println("Es (caracter==unicode)? " + (caracter==unicode));
        System.out.println("Es (decimal==unicode)? " + (decimal==unicode));

        System.out.println();
        System.out.println("Algunos Ejemplos de codigos de escape muy usados:");
        System.out.println("\\u0020 Espacio");
        System.out.println("\\b Retroceso (borra el caracter anterior)");
        System.out.println("\\n Nueva línea");
        System.out.println("\\r Retorno del carro. Tambien se puede usar System.lineSeparator() que dependera del SO si es /r/n o /n. ");   //System.lineSeparator());
        System.out.println("\\t Tabulador");
        System.out.println("\\\\ Diagonal invertida (Se escapa con otra diagonal)");
        System.out.println("\\\" Comillas dobles");
        System.out.println("******************************************************");

    }

    public static void getBooleanInfo() {

        System.out.println("**************** Tipo: boolean ***********************");
        System.out.println("Espacio que ocupa: un solo bit");
        System.out.println("Clase Wrapper: Boolean");
        System.out.println("Valores: " +Boolean.FALSE+ "/"+Boolean.TRUE+". Es un valor logico. Valor por defecto "+Boolean.FALSE);
        System.out.println("Para acceder a los valores se utiliza: Boolean.TRUE.booleanValue() / Boolean.FALSE.booleanValue() / o simplemente con false y true");
        System.out.println("Se utiliza para evaluar expresiones. Ejemplo (3-2) == 1 ? " + ((3-2) == 1));
        System.out.println("Ejemplos:");
        System.out.println("boolean b1=true;");
        System.out.println("boolean b2=false;");

        boolean b1 = true;
        boolean b2 = false;
        System.out.println("El valor de b1 es " + b1);
        System.out.println("El valor de b2 es " + b2);
        System.out.println("******************************************************");


    }


    /**
     * Imprime información sobre un tipo de dato en Java, incluyendo su tamaño en bytes,
     * cantidad de bits, valores mínimo y máximo, y el valor por defecto.
     *
     * @param tamByte Cadena que representa la cantidad de bytes del tipo de dato.
     * @param tamBits Cadena que representa la cantidad de bits del tipo de dato.
     * @param min Cadena que representa el valor mínimo que puede tomar el tipo de dato.
     * @param max Cadena que representa el valor máximo que puede tomar el tipo de dato.
     * @param defaultValue Cadena que representa el valor por defecto del tipo de dato.
     */
    private static void imprimirByteBitsMaxMin(String tamByte, String tamBits, String min, String max, String defaultValue) {
        System.out.println("Espacio que ocupa: " + tamByte + " bytes / " + tamBits + " bits " );
        //"Cantidad en byte [" + tamByte + "] bits ["+ tamBits +"]");
        System.out.println("Valores Minimo [" + min + "] Maximo [" + max + "]");
        System.out.println("Valor por defecto: " + defaultValue);
    }

}
