---
sidebar_position: 7
---

# 📦 Clases Wrapper

Las clases Wrapper envuelven tipos primitivos en objetos.

## Correspondencia Primitivo - Wrapper

| Primitivo | Wrapper |
|-----------|---------|
| `byte` | `Byte` |
| `short` | `Short` |
| `int` | `Integer` |
| `long` | `Long` |
| `float` | `Float` |
| `double` | `Double` |
| `char` | `Character` |
| `boolean` | `Boolean` |

## ¿Por qué usar Wrappers?

1. **Colecciones**: Las colecciones solo aceptan objetos, no primitivos
2. **Valores nulos**: Los primitivos no pueden ser `null`, los Wrappers sí
3. **Métodos útiles**: Conversiones, parsing, comparaciones

```java
// Primitivo no puede ser null
int numero = null; // ❌ Error

// Wrapper puede ser null
Integer numero = null; // ✅ Válido
```

## Autoboxing y Unboxing

```java
// Autoboxing: primitivo → Wrapper (automático)
Integer num = 100; // int → Integer

// Unboxing: Wrapper → primitivo (automático)
int valor = num;   // Integer → int
```

## Métodos Útiles

```java
// Parsing: String a número
int entero = Integer.parseInt("123");
double decimal = Double.parseDouble("3.14");

// Conversión a String
String texto = Integer.toString(123);
String texto2 = String.valueOf(123);

// Valores máximos y mínimos
int max = Integer.MAX_VALUE; // 2147483647
int min = Integer.MIN_VALUE; // -2147483648
```

## Comparación de Wrappers

```java
Integer a = 100;
Integer b = 100;
Integer c = 200;
Integer d = 200;

// ⚠️ Cuidado con ==
a == b; // true (cache -128 a 127)
c == d; // false (fuera del cache)

// ✅ Usar equals()
a.equals(b); // true
c.equals(d); // true
```

:::warning Cache de Integer
Java cachea Integers de -128 a 127. Fuera de ese rango, `==` puede fallar. Siempre usa `equals()`.
:::
