---
sidebar_position: 5
---

# ➕ Operadores

Los operadores permiten realizar operaciones sobre variables y valores.

## Operadores Aritméticos

| Operador | Descripción | Ejemplo |
|:--------:|-------------|---------|
| `+` | Suma | `5 + 3` → `8` |
| `-` | Resta | `5 - 3` → `2` |
| `*` | Multiplicación | `5 * 3` → `15` |
| `/` | División | `5 / 2` → `2` |
| `%` | Módulo (resto) | `5 % 2` → `1` |

```java
int a = 10, b = 3;
int suma = a + b;     // 13
int resta = a - b;    // 7
int producto = a * b; // 30
int division = a / b; // 3 (división entera)
int resto = a % b;    // 1
```

## Operadores de Asignación

| Operador | Equivale a |
|:--------:|------------|
| `+=` | `a = a + b` |
| `-=` | `a = a - b` |
| `*=` | `a = a * b` |
| `/=` | `a = a / b` |
| `%=` | `a = a % b` |

```java
int x = 10;
x += 5;  // x = 15
x -= 3;  // x = 12
x *= 2;  // x = 24
```

## Operadores Relacionales

| Operador | Descripción |
|:--------:|-------------|
| `==` | Igual a |
| `!=` | Distinto de |
| `>` | Mayor que |
| `<` | Menor que |
| `>=` | Mayor o igual |
| `<=` | Menor o igual |

```java
int edad = 18;
boolean esMayor = edad >= 18;    // true
boolean esIgual = edad == 18;    // true
boolean esDiferente = edad != 21; // true
```

## Operadores Lógicos

| Operador | Descripción |
|:--------:|-------------|
| `&&` | AND (y) |
| `\|\|` | OR (o) |
| `!` | NOT (negación) |

```java
boolean a = true, b = false;

boolean and = a && b;  // false
boolean or = a || b;   // true
boolean not = !a;      // false
```

## Incremento y Decremento

```java
int i = 5;
i++;  // i = 6 (post-incremento)
++i;  // i = 7 (pre-incremento)
i--;  // i = 6 (post-decremento)
--i;  // i = 5 (pre-decremento)
```

## Operador Ternario

```java
int edad = 20;
String mensaje = (edad >= 18) ? "Mayor" : "Menor";
// mensaje = "Mayor"
```

:::tip Prioridad
Los operadores tienen prioridad: `()` > `++/--` > `*/%` > `+-` > relacionales > lógicos
:::
