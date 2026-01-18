---
sidebar_position: 11
---

# 🧮 La Clase Math

La clase `java.lang.Math` contiene métodos para realizar operaciones numéricas básicas como exponencial, logaritmo, raíz cuadrada y funciones trigonométricas.

## Métodos Matemáticos

La clase `Math` es utilitaria, por lo que todos sus métodos son **estáticos**.

### Operaciones Comunes

| Método | Descripción | Ejemplo |
|--------|-------------|---------|
| `abs(x)` | Valor absoluto | `Math.abs(-3)` -> `3` |
| `max(a, b)` | Máximo valor | `Math.max(3.5, 1.2)` -> `3.5` |
| `min(a, b)` | Mínimo valor | `Math.min(3.5, 1.2)` -> `1.2` |
| `pow(a, b)` | Potencia ($a^b$) | `Math.pow(10, 3)` -> `1000.0` |
| `sqrt(x)` | Raíz cuadrada | `Math.sqrt(25)` -> `5.0` |

### Redondeo

```java
double techo = Math.ceil(3.5);  // 4.0 (Hacia arriba)
double piso = Math.floor(3.5);  // 3.0 (Hacia abajo)
long entero = Math.round(3.5);  // 4   (Redondeo aritmético)
```

### Trigonometría

:::note Unidades
Las funciones trigonométricas en Java (`sin`, `cos`, `tan`) esperan recibir el ángulo en **radianes**, no en grados.
:::

```java
double grados = 90.0;
double radianes = Math.toRadians(grados);

System.out.println("sin(90): " + Math.sin(radianes)); // 1.0
System.out.println("cos(90): " + Math.cos(radianes)); // 6.12e-17 (aprox 0)
```

## Números Aleatorios

### Math.random()
Genera un número `double` pseudoaleatorio mayor o igual a `0.0` y menor que `1.0`.

```java
// Número aleatorio simple
double random = Math.random(); 

// Seleccionar elemento de un arreglo
String[] colores = { "azul", "rojo", "verde" };
int indice = (int) (Math.random() * colores.length);
System.out.println("Color: " + colores[indice]);
```

### Clase Random
La clase `java.util.Random` proporciona métodos más versátiles para generar diferentes tipos de datos aleatorios.

```java
import java.util.Random;

Random rnd = new Random();

// Entero aleatorio en rango [0, 100) (exclusivo)
int n = rnd.nextInt(100);

// Entero en rango [15, 25]
int min = 15;
int max = 25;
int rango = rnd.nextInt(max - min + 1) + min;
```
