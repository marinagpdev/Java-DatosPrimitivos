# Información sobre Tipos de Datos Primitivos en Java

Este programa muestra información detallada sobre los diferentes tipos de datos primitivos en Java, junto con sus clases envolventes (Wrapper), ejemplos de uso y conversiones útiles entre diferentes representaciones numéricas (binario, hexadecimal, octal).

## Características

El programa proporciona información sobre los siguientes tipos de datos primitivos:

1. **Enteros**:
    - Tipos: `byte`, `short`, `int`, `long`
    - Características: Tamaño en bits y bytes, rango de valores, ejemplos de uso, métodos de conversión (binario, hexadecimal, octal).
   
2. **Flotantes**:
    - Tipos: `float`, `double`
    - Características: Tamaño en bits, precisión, ejemplos de uso de notación científica, conversiones.
   
3. **Caracteres**:
    - Tipo: `char`
    - Características: Código Unicode, ejemplos de representación en decimal y hexadecimal, códigos de escape comunes.

4. **Booleanos**:
    - Tipo: `boolean`
    - Características: Valores posibles (`true`, `false`), tamaño en bits, ejemplos de uso.

Cada tipo de dato se explica con ejemplos prácticos y los métodos de sus clases `Wrapper`.

## Ejecución

El programa principal permite explorar diferentes tipos de datos primitivos a través de varios métodos:

### Métodos Disponibles

- `getDefinicion()`: Muestra una definición básica sobre los tipos de datos primitivos y su relación con las clases `Wrapper`.
  
- `getEnterosInfo()`: Proporciona detalles sobre los tipos de enteros (`byte`, `short`, `int`, `long`), su tamaño, ejemplos, y métodos de conversión entre bases numéricas (binario, hexadecimal, octal).

- `getFlotantesInfo()`: Muestra información sobre los números reales con precisión simple (`float`) y doble (`double`), junto con ejemplos de notación científica.

- `getCaracterInfo()`: Explica el tipo `char`, cómo se representan los caracteres mediante Unicode, y cómo convertir entre diferentes representaciones.

- `getBooleanInfo()`: Describe el tipo `boolean`, sus valores (`true`, `false`), y ejemplos de uso en evaluaciones lógicas.

### Ejemplo de Ejecución

Al ejecutar el programa se muestra una pequeña definicion de Tipo de 
Datos Primitivos y un menú interactivo para que los usuarios seleccionen una opcion sobre el tipo de dato a explorar y luego se  imprimirá en la consola la información sobre el dato seleccionado.

```bash
**************** DEFINICION *************************
Los TIPOS DE DATOS PRIMITIVOS son 
tipos de datos escalares que contienen un unico valor.
booleanos/caracteres/enteros/flotante/
Cada tipo de dato primitivo tiene su clase Wrapper (envolvente) equivalente. Y les da funcionalidad extra.
******************************************************

++++++ Ingrese la opción que desee para ver más info: ++++++
(1) boolean / (2) char / (3) enteros / (4) flotantes / (0) Exit
```

\
Se utiliza el ingreso de datos por teclado mediante la clase `Scanner` y la salida standard `System.out` para mostrar la información.


Aquí hay un ejemplo de cómo se vería la salida para los tipos enteros:

```bash
**************** Tipo: enteros ***********************
Son 4 tipos: byte (8 bits), short (16 bits), int (32 bits), long (64 bits)
Clases Wrapper: Byte / Short / Integer / Long
Los enteros no tienen precision, o sea, no tienen decimales.
Un entero es un número del conjunto Z = {..., -2, -1, 0, 1, 2, ...}
Tipos de enteros:
--> byte
Espacio que ocupa: 1 bytes / 8 bits 
Valores Minimo [-128] Maximo [127]
Valor por defecto: 0
--> short
Espacio que ocupa: 2 bytes / 16 bits 
Valores Minimo [-32768] Maximo [32767]
Valor por defecto: 0
--> int
Espacio que ocupa: 4 bytes / 32 bits 
Valores Minimo [-2147483648] Maximo [2147483647]
Valor por defecto: 0
--> long
Espacio que ocupa: 8 bytes / 64 bits 
Valores Minimo [-9223372036854775808] Maximo [9223372036854775807]
Valor por defecto: 0L

Ejemplos:
byte enteroByte = 127; // Mas de 127 da error.
short enteroShort = 32767;
int enteroInt = 2147483647;
long enteroLong = 9223372036854775807L; // Se indica long con L mayuscula
Output:
El valor de enteroByte es: 127
El valor de enteroShort es: 32767
El valor de enteroInt es: 2147483647
El valor de enteroLong es: 9223372036854775807

** Algunos metodos utiles de las clases Wrapper para pasar a otros sistemas de numeracion: Binario/Hexa/Octal
Numero binario de un entero: Integer.toBinaryString(500) es 111110100
Numero hexadecimal de un entero: Integer.toHexString(500) es 1f4
Numero octal de un entero: Integer.toOctalString(500) es 764
Ahora pasamos de binario/hexa/octal a entero.
[Binario] Se agrega [0b] antes del numero para indicar que es binario
[Octal] Se agrega [0] antes del numero para indicar que es octal
[Hexadecimal] Se agrega [0x] antes del numero para indicar que es hexa
El numero entero del binario 0b111110100 es 500
El numero entero del octal 0764 es 500
El numero entero del hexa 0x1f4 es 500
*************************************************
```

## Manejo de Excepciones

Si el usuario ingresa un valor incorrecto en el menú, se atrapa  `InputMismatchException`, devolviendo el control al menú principal sin que el programa falle.

## Instalación

Clona el repositorio o descarga el código fuente.
   ```bash
   git@github.com:marinagpdev/Java-DatosPrimitivos.git
```
Si deseas contribuir, por favor abre un issue o envía un pull request en el repositorio.
