# La Clase Math en Java

La clase `java.lang.Math` contiene métodos para realizar operaciones numéricas básicas como exponencial, logaritmo, raíz cuadrada y funciones trigonométricas.

## Contenido

1. [Métodos Matemáticos Comunes](#1-métodos-matemáticos-comunes)
2. [Generación de Números Aleatorios](#2-generación-de-números-aleatorios)

---

## 1. Métodos Matemáticos Comunes

La clase `Math` proporciona métodos estáticos para cálculos matemáticos.

**Archivo:** [`EjemploClaseMath.java`](./EjemploClaseMath.java)

### Operaciones Básicas
- `Math.abs(x)`: Valor absoluto.
- `Math.max(x, y)`: Máximo de dos valores.
- `Math.min(x, y)`: Mínimo de dos valores.
- `Math.pow(base, exp)`: Potencia.
- `Math.sqrt(x)`: Raíz cuadrada.

### Redondeo
- `Math.ceil(x)`: Redondeo hacia arriba (techo).
- `Math.floor(x)`: Redondeo hacia abajo (piso).
- `Math.round(x)`: Redondeo al entero más cercano.

### Trigonometría
- `Math.toDegrees(rad)`: Convierte radianes a grados.
- `Math.toRadians(deg)`: Convierte grados a radianes.
- `Math.sin(rad)`, `Math.cos(rad)`: Seno y Coseno (reciben radianes).

```java
int absoluto = Math.abs(-3);
System.out.println("absoluto = " + absoluto);

double max = Math.max(3.5, 1.2);
System.out.println("max = " + max);

double techo = Math.ceil(3.5);
System.out.println("techo = " + techo);

double raiz = Math.sqrt(5);
System.out.println("raiz = " + raiz);
```

---

## 2. Generación de Números Aleatorios

Java ofrece varias formas de generar números aleatorios, principalmente usando `Math.random()` o la clase `java.util.Random`.

**Archivo:** [`EjemploClaseMathRandom.java`](./EjemploClaseMathRandom.java)

### Usando `Math.random()`
Devuelve un `double` aleatorio entre `0.0` (inclusivo) y `1.0` (exclusivo).

```java
double random = Math.random();
System.out.println("random = " + random);

// Generar un número aleatorio para seleccionar de un arreglo
String[] colores = { "azul", "amarillo", "rojo", "verde", "blanco", "negro" };
random *= colores.length;
System.out.println("color seleccionado = " + colores[(int) random]);
```

### Usando `java.util.Random`
La clase `Random` ofrece más flexibilidad, permitiendo generar enteros, booleans, etc., dentro de rangos específicos.

```java
import java.util.Random;

Random randomObj = new Random();

// Entero aleatorio entre 15 y 25 (inclusive el rango inicial, variable el final según fórmula)
int randomInt = 15 + randomObj.nextInt(25 - 15 + 1);
System.out.println("randomInt = " + randomInt);

// Entero aleatorio dentro del índice del arreglo
randomInt = randomObj.nextInt(colores.length);
System.out.println("colores = " + colores[randomInt]);
```
