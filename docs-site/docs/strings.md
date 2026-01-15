---
sidebar_position: 4
---

# 🔤 Strings

La clase `String` representa secuencias de caracteres en Java.

## Creación de Strings

```java
// Literal (recomendado)
String saludo = "Hola";

// Con constructor
String nombre = new String("Juan");
```

## Métodos Importantes

| Método | Descripción | Ejemplo |
|--------|-------------|---------|
| `length()` | Longitud del string | `"Hola".length()` → `4` |
| `charAt(i)` | Carácter en posición i | `"Hola".charAt(0)` → `'H'` |
| `substring(a,b)` | Subcadena | `"Hola".substring(0,2)` → `"Ho"` |
| `toUpperCase()` | Mayúsculas | `"Hola".toUpperCase()` → `"HOLA"` |
| `toLowerCase()` | Minúsculas | `"Hola".toLowerCase()` → `"hola"` |
| `trim()` | Quitar espacios | `" Hola ".trim()` → `"Hola"` |
| `equals(s)` | Comparar contenido | `"Hola".equals("hola")` → `false` |
| `equalsIgnoreCase(s)` | Comparar sin case | `"Hola".equalsIgnoreCase("hola")` → `true` |
| `contains(s)` | Contiene subcadena | `"Hola".contains("ol")` → `true` |
| `replace(a,b)` | Reemplazar | `"Hola".replace("o","0")` → `"H0la"` |

## Concatenación

```java
String nombre = "Juan";
String saludo = "Hola, " + nombre + "!"; // "Hola, Juan!"

// Con concat()
String mensaje = "Hola".concat(" Mundo"); // "Hola Mundo"
```

## Comparación de Strings

```java
String a = "Hola";
String b = "Hola";

// ✅ Correcto: comparar contenido
if (a.equals(b)) {
    System.out.println("Son iguales");
}

// ❌ Incorrecto: compara referencias, no contenido
if (a == b) { } // Puede fallar
```

## StringBuilder (Eficiente para concatenaciones)

```java
StringBuilder sb = new StringBuilder();
sb.append("Hola");
sb.append(" ");
sb.append("Mundo");
String resultado = sb.toString(); // "Hola Mundo"
```

:::warning Inmutabilidad
Los Strings son **inmutables**. Cada operación crea un nuevo String en memoria.
:::
