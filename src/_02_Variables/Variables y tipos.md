
# Variables en Java

Las variables son uno de los conceptos más fundamentales en Java. Representan entidades que almacenan datos o valores durante la ejecución de un programa.

## ¿Qué es una Variable?

Una variable es un contenedor que tiene un nombre y almacena un valor. Una declaración de variable en Java siempre incluye dos partes principales:

1.  **Tipo de Dato:** Define qué tipo de valor puede almacenar la variable (números, texto, etc.) y qué operaciones se pueden realizar con ella.
2.  **Nombre:** Un identificador único para referirse a esa variable dentro del programa.

**Sintaxis básica:**

```java
TipoDato nombreVariable; // Declaración
// o
TipoDato nombreVariable = valorInicial; // Declaración e inicialización
```

**Ejemplos:**

```java
int edad; // Declara una variable llamada 'edad' de tipo entero
double precio = 19.99; // Declara e inicializa una variable 'precio' de tipo double
String nombre = "Juan"; // Declara e inicializa una variable 'nombre' de tipo String
boolean esMayor = true; // Declara e inicializa una variable 'esMayor' de tipo boolean
```

## Categorías de Tipos de Datos

En Java, los tipos de datos se dividen en dos categorías principales:

### 1. Tipos Primitivos

Estos son los tipos de datos más básicos predefinidos en el lenguaje. Almacenan un único valor.

*   **Enteros:** `byte`, `short`, `int`, `long`
*   **Flotantes (decimales):** `float`, `double`
*   **Caracteres:** `char`
*   **Booleanos:** `boolean`

**Ejemplos:**

```java
int numeroEntero = 42;
double numeroDecimal = 3.14159;
char caracter = 'A';
boolean esVerdadero = false;
```

### 2. Tipos Referenciados (Referencia)

En lugar de almacenar directamente el valor, estas variables almacenan una referencia (dirección de memoria) a un objeto. Incluyen:

*   **Clases:** Como `String`, `Integer`, o clases personalizadas como `Usuario`.
*   **Interfaces**
*   **Arreglos (Arrays)**

**Ejemplos:**

```java
String mensaje = "Hola Mundo"; // String es una clase
Integer numeroEnvolvente = 100; // Clase envolvente (Wrapper) para int
int[] numeros = {1, 2, 3, 4}; // Arreglo de enteros
// Suponiendo que existe una clase Usuario definida
Usuario usuario1 = new Usuario("Ana");
```

## Reglas para Definir Nombres de Variables

Al elegir un nombre para una variable en Java, debes seguir estas reglas y convenciones:

1.  **Carácter Inicial:** Debe comenzar con una **letra** (a-z, A-Z), un **guión bajo** (`_`) o un **signo de dólar** (`$`).
2.  **Caracteres Posteriores:** Pueden ser letras, dígitos (0-9), guiones bajos (`_`) o signos de dólar (`$`).
3.  **No usar palabras clave:** No puedes usar palabras reservadas del lenguaje como `int`, `class`, `public`, `for`, etc.
4.  **Distingue mayúsculas y minúsculas:** `edad`, `Edad` y `EDAD` son tres variables diferentes.
5.  **Únicos en su ámbito:** No puede haber dos variables con el mismo nombre declaradas en el mismo bloque de código (ámbito).
6.  **Convención de Nomenclatura (Camel Case):**
    *   Los nombres de variables comienzan con **letra minúscula**.
    *   Si el nombre está compuesto por varias palabras, se unen y cada palabra *después de la primera* comienza con **mayúscula**.
    *   Ejemplo: `nombreDeUsuario`, `saldoCuentaBancaria`.

**Ejemplos Válidos:**

```java
int edad;
String nombreCompleto;
double _precio_unitario;
int $saldo;
boolean esActivo;
```

**Ejemplos NO Válidos:**

```java
// int 1edad;        // Comienza con un número
// int class;        // Es una palabra clave
// int nombre completo; // Contiene un espacio
// int true;         // Es un valor booleano reservado
```

Seguir estas reglas y convenciones ayuda a escribir código Java claro, legible y que cumple con los estándares del lenguaje.