---
sidebar_position: 3
---

# 📊 Variables y Tipos de Datos

Las variables son contenedores que almacenan datos durante la ejecución de un programa.

## Declaración de Variables

```java
TipoDato nombreVariable; // Declaración
TipoDato nombreVariable = valorInicial; // Declaración e inicialización
```

## Categorías de Tipos de Datos

### 1. Tipos Primitivos

| Tipo | Descripción | Ejemplo |
|------|-------------|---------|
| `byte` | Entero 8 bits | `-128` a `127` |
| `short` | Entero 16 bits | `-32,768` a `32,767` |
| `int` | Entero 32 bits | `-2³¹` a `2³¹-1` |
| `long` | Entero 64 bits | Sufijar con `L` |
| `float` | Decimal 32 bits | Sufijar con `f` |
| `double` | Decimal 64 bits | `3.14159` |
| `char` | Carácter Unicode | `'A'` |
| `boolean` | Verdadero/Falso | `true`, `false` |

```java
int edad = 25;
double precio = 19.99;
char inicial = 'J';
boolean activo = true;
```

### 2. Tipos Referenciados

Almacenan referencias a objetos en memoria:

```java
String mensaje = "Hola Mundo";
Integer numero = 100;
int[] arreglo = {1, 2, 3};
```

## Reglas para Nombres de Variables

1. ✅ Comenzar con letra, `_` o `$`
2. ✅ Usar camelCase: `nombreDeUsuario`
3. ❌ No usar palabras reservadas (`int`, `class`, `public`)
4. ❌ No comenzar con números

```java
// ✅ Válidos
int edad;
String nombreCompleto;
double _precio;

// ❌ Inválidos
// int 1edad;
// int class;
```

## Conversión de Tipos (Casting)

```java
// Implícito (automático): de menor a mayor
int entero = 100;
double decimal = entero; // 100.0

// Explícito (manual): de mayor a menor
double precio = 19.99;
int precioEntero = (int) precio; // 19
```

:::tip Convención
Usa nombres descriptivos y sigue camelCase para tus variables.
:::
