# 🔤 Manejo de Strings en Java

## 📋 Índice
- [¿Qué son los Strings?](#qué-son-los-strings)
- [Concatenar Strings](#concatenar-strings)
- [Comparar Strings](#comparar-strings)
- [Métodos de la Clase String](#métodos-de-la-clase-string)

---

## ¿Qué son los Strings?

*   Los `String` son **objetos** en Java, pertenecen al tipo de **referencia**.
*   A pesar de ser objetos, tienen una **sintaxis especial** muy conveniente para su creación.
*   Se pueden crear usando la palabra clave `new`, pero lo más común es usar **literales entre comillas dobles**.

**Ejemplos:**

```java
// Creación usando 'new' (menos común)
String nombre = new String("Andrés");
String tema = new String("Manejo de \"String\"");

// Creación usando literales (más común)
String nombre2 = "Andrés";
String tema2 = "Manejo de \"String\"";
```

*   Para incluir un carácter de comillas dobles (`"`) dentro de un String, se debe **escapar** usando la barra invertida (`\"`).
*   Los caracteres de un String se codifican usando **Unicode**.
*   **Característica clave:** Los Strings son **inmutables**. Una vez creado un objeto `String`, su valor no puede cambiar. Cualquier operación que "modifica" un String en realidad crea un nuevo objeto `String`.

## Concatenar Strings

Para unir o concatenar cadenas de texto, se utiliza el operador de **suma (`+`)**.

**Ejemplo:**

```java
String nombre = "Andrés";
String apellido = "Guzmán";
String nombreCompleto = nombre + " " + apellido;
System.out.println(nombreCompleto); // Imprime: Andrés Guzmán
```

## Comparar Strings

Existen dos formas principales de comparar Strings, y es crucial entender la diferencia:

1.  **Operador `==`:** Compara las **referencias** (direcciones de memoria). Verifica si ambas variables apuntan al *mismo objeto* en memoria.
2.  **Método `.equals()`:** Compara los **valores** (el contenido real del String).

**Ejemplo:**

```java
String str1 = "Hola Andres";
String str2 = new String("Hola Andres");

// Compara por referencia
System.out.println("Son el mismo objeto? " + (str1 == str2)); // Imprime: false

// Compara por valor
System.out.println("Tienen el mismo valor? " + str1.equals(str2)); // Imprime: true
```

## Métodos de la Clase String

La clase `String` proporciona muchos métodos útiles para manipular texto:

*   **`int length()`**: Devuelve el número de caracteres del String.
*   **`boolean equals(String otroString)`**: Compara si dos Strings tienen el mismo valor (contenido).
*   **`boolean equalsIgnoreCase(String otroString)`**: Compara si dos Strings tienen el mismo valor, ignorando mayúsculas y minúsculas.
*   **`int compareTo(String otroString)`**: Compara dos Strings lexicográficamente (como en un diccionario).
    *   Devuelve un valor **negativo** si el String es anterior a `otroString`.
    *   Devuelve **cero (0)** si son iguales.
    *   Devuelve un valor **positivo** si el String es posterior a `otroString`.
*   **`String trim()`**: Crea un nuevo String eliminando los espacios en blanco del principio y del final.
*   **`char charAt(int indice)`**: Devuelve el carácter que se encuentra en la posición especificada (`indice`).
*   **`char[] toCharArray()`**: Convierte el String en un arreglo de caracteres (`char[]`).
*   **`String substring(int inicio, int fin)`**: Extrae una subcadena desde la posición `inicio` hasta la posición `fin - 1`.
*   **`String substring(int inicio)`**: Extrae una subcadena desde la posición `inicio` hasta el final del String.
*   **`int indexOf(String cadena)`**: Devuelve la posición (índice) de la **primera** aparición de la `cadena` especificada, buscando desde el principio. Devuelve -1 si no se encuentra.
*   **`int lastIndexOf(String cadena)`**: Devuelve la posición (índice) de la **primera** aparición de la `cadena` especificada, pero buscando desde el **final** hacia el principio. Devuelve -1 si no se encuentra.
*   **`boolean startsWith(String prefijo)`**: Verifica si el String **comienza** con el `prefijo` especificado. Devuelve `true` o `false`.
*   **`boolean endsWith(String sufijo)`**: Verifica si el String **termina** con el `sufijo` especificado. Devuelve `true` o `false`.
*   **`String[] split(String patron)`**: Divide el String en varias subcadenas, utilizando el `patron` como delimitador, y devuelve un arreglo de Strings (`String[]`).

**Ejemplo de uso de algunos métodos:**

```java
String texto = "  Hola Mundo Java  ";

System.out.println("Longitud: " + texto.length()); // Imprime: 20
System.out.println("Sin espacios: '" + texto.trim() + "'"); // Imprime: 'Hola Mundo Java'
System.out.println("Caracter en posicion 0: " + texto.trim().charAt(0)); // Imprime: H

String frase = "Java es un lenguaje poderoso";
System.out.println("Substring (5,8): " + frase.substring(5, 8)); // Imprime: es
System.out.println("IndexOf 'lenguaje': " + frase.indexOf("lenguaje")); // Imprime: 11
System.out.println("Termina con 'poderoso'? " + frase.endsWith("poderoso")); // Imprime: true
```

---

## 📚 Archivos del Módulo

| Archivo | Descripción |
|---------|-------------|
| [EjemploString.java](./EjemploString.java) | Creación básica de Strings |
| [EjemploStringConcatenacion.java](./EjemploStringConcatenacion.java) | Concatenación con + |
| [EjemploStringInmutable.java](./EjemploStringInmutable.java) | Inmutabilidad de Strings |
| [EjemploStringMetodos.java](./EjemploStringMetodos.java) | Métodos principales de String |
| [EjemploStringMetodosArreglos.java](./EjemploStringMetodosArreglos.java) | Split y arrays de Strings |
| [EjemploStringExtensionArchivo.java](./EjemploStringExtensionArchivo.java) | Extraer extensión de archivo |
| [EjemploStringValidar.java](./EjemploStringValidar.java) | Validación de Strings |
| [EjemploStringRendimiento.java](./EjemploStringRendimiento.java) | String vs StringBuilder |

---

> 💡 **Tip**: Usa `.equals()` para comparar Strings, no `==`. Recuerda que los Strings son inmutables.