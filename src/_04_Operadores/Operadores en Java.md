# Operadores en Java

Los operadores en Java son símbolos especiales que realizan operaciones específicas sobre una, dos o tres operandos (valores, variables) y luego devuelven un resultado. Sirven para realizar cálculos matemáticos, comparar valores, formar expresiones lógicas, tomar decisiones, etc.

## Clasificación de Operadores

Java proporciona muchos tipos de operadores que se pueden usar según la necesidad. Se clasifican según la funcionalidad que brindan:

*   Aritméticos
*   Relacionales
*   Lógicos
*   De Asignación
*   Unarios, Incrementales, Ternarios, Combinados, de Bits, de Instancia

---

## Operadores Aritméticos

Se utilizan para realizar operaciones matemáticas simples con valores numéricos (primitivos).

| Operador | Nombre           | Expresión Ejemplo | Resultado |
| :------- | :--------------- | :---------------- | :-------- |
| `+`      | Suma             | `5 + 3`           | `8`       |
| `-`      | Resta            | `5 - 3`           | `2`       |
| `*`      | Multiplicación   | `2 * 7`           | `14`      |
| `/`      | División         | `6 / 3`           | `2`       |
| `%`      | Módulo (Resto)   | `5 % 2`           | `1`       |
| `++`     | Incremento       | `++2` o `2++`     | `3`       |
| `--`     | Decremento       | `--2` o `2--`     | `1`       |
| `-`      | Menos Unario     | `-(4 + 2)`        | `-6`      |

**Ejemplo:**

```java
int a = 10;
int b = 5;
System.out.println(a + b); // 15
System.out.println(a - b); // 5
System.out.println(a * b); // 50
System.out.println(a / b); // 2
System.out.println(a % b); // 0
```

---

## Operadores de Asignación

Asignan valores a las variables. El más básico es `=`. También existen operadores combinados que realizan una operación y asignan el resultado a la misma variable.

| Operador | Ejemplo   | Equivalente a   |
| :------- | :-------- | :-------------- |
| `=`      | `a = 5`   | `a = 5`         |
| `+=`     | `a += 5`  | `a = a + 5`     |
| `-=`     | `a -= 5`  | `a = a - 5`     |
| `*=`     | `a *= 5`  | `a = a * 5`     |
| `/=`     | `a /= 5`  | `a = a / 5`     |
| `%=`     | `a %= 5`  | `a = a % 5`     |

**Ejemplo:**

```java
int a = 3;
a += 5; // a = a + 5; -> a ahora vale 8
System.out.println(a); // 8
```

---

## Operadores de Incremento y Decremento

Se utilizan para **aumentar o disminuir** el valor de una variable numérica en **1**. Existen dos formas: **pre** y **post**.

| Operador | Nombre            | Efecto                                      |
| :------- | :---------------- | :------------------------------------------ |
| `++a`    | Pre-incremento    | Incrementa `a` en uno, y luego devuelve `a`.|
| `a++`    | Post-incremento   | Devuelve `a`, y luego incrementa `a` en uno.|
| `--a`    | Pre-decremento    | Decrementa `a` en uno, luego devuelve `a`.  |
| `a--`    | Post-decremento   | Devuelve `a`, luego decrementa `a` en uno.  |

**Ejemplo:**

```java
int a = 1;
int b = ++a; // Primero a = a + 1 (a=2), luego b = a. a=2, b=2

a = 1;
int c = a++; // Primero c = a (c=1), luego a = a + 1. a=2, c=1
```

---

## Operador Ternario (Condicional)

Es una forma abreviada de la sentencia `if-else`. Evalúa una condición y devuelve uno de dos valores posibles dependiendo del resultado (`true` o `false`).

**Sintaxis:** `condición ? valor_si_true : valor_si_false`

**Ejemplo:**

```java
int edad = 18;
String mensaje = (edad >= 18) ? "Eres mayor de edad" : "Eres menor de edad";
System.out.println(mensaje); // Imprime: Eres mayor de edad

// Equivalente a:
// if (edad >= 18) {
//     mensaje = "Eres mayor de edad";
// } else {
//     mensaje = "Eres menor de edad";
// }
```

---

## Operadores Relacionales

Se utilizan para **comparar** dos valores. Devuelven un valor **booleano** (`true` o `false`).

| Operador | Descripción              | Ejemplo   | Resultado si a=5, b=3 |
| :------- | :----------------------- | :-------- | :-------------------- |
| `>`      | Mayor que                | `a > b`   | `true`                |
| `>=`     | Mayor o igual que        | `a >= b`  | `true`                |
| `<`      | Menor que                | `a < b`   | `false`               |
| `<=`     | Menor o igual que        | `a <= b`  | `false`               |
| `==`     | Igual a                  | `a == b`  | `false`               |
| `!=`     | No igual a (diferente)   | `a != b`  | `true`                |

**Importante:** Para comparar objetos como `String`, se debe usar el método `.equals()`, no `==`.

**Ejemplo:**

```java
int x = 10;
int y = 20;
System.out.println(x > y);  // false
System.out.println(x <= y); // true
System.out.println(x == 10); // true
System.out.println(x != y);  // true
```

---

## Operadores Lógicos

Se utilizan para **combinar** expresiones booleanas. Trabajan con operandos de tipo `boolean`.

| Operador | Nombre | Descripción                                               | Ejemplo     | Resultado |
| :------- | :----- | :-------------------------------------------------------- | :---------- | :-------- |
| `&&`     | AND    | Verdadero si **ambos** operandos son verdaderos (evaluación condicional). | `true && false` | `false`   |
| `\|\|`   | OR     | Verdadero si **al menos uno** de los operandos es verdadero (evaluación condicional). | `true \|\| false` | `true`    |
| `!`      | NOT    | Niega el valor booleano (invierte `true` por `false` y viceversa). | `!(true)`   | `false`   |
| `&`      | AND    | Verdadero si **ambos** operandos son verdaderos (evalúa siempre ambos). | `true & false`  | `false`   |
| `\|`     | OR     | Verdadero si **al menos uno** de los operandos es verdadero (evalúa siempre ambos). | `true \| false` | `true`    |
| `^`      | XOR    | Verdadero si los operandos son **diferentes**.            | `true ^ false`  | `true`    |

**Diferencia entre `&&`/`||` y `&`/`|`:**
*   `&&` y `||` son de **cortocircuito**: si el resultado se puede determinar evaluando solo el primer operando, no se evalúa el segundo.
*   `&` y `|` **siempre** evalúan ambos operandos.

**Tabla de Verdad:**

| A     | B     | A && B | A \|\| B | !A    | A ^ B |
| :---- | :---- | :----- | :------- | :---- | :---- |
| true  | true  | true   | true     | false | false |
| true  | false | false  | true     | false | true  |
| false | true  | false  | true     | true  | true  |
| false | false | false  | false    | true  | false |

**Ejemplo:**

```java
int edad = 25;
boolean tieneLicencia = true;
boolean puedeConducir = (edad >= 18) && tieneLicencia; // true
System.out.println(puedeConducir);

boolean esFinDeSemana = false;
boolean esFeriado = true;
boolean noTrabaja = esFinDeSemana || esFeriado; // true
System.out.println(noTrabaja);

boolean esMayor = !(edad < 18); // true
System.out.println(esMayor);
```

---

## Precedencia de Operadores

Determina el orden en que se evalúan los operadores en una expresión cuando hay varios. Los operadores con mayor precedencia se evalúan primero.

**Orden de precedencia (de mayor a menor):**

1.  `()` (Paréntesis)
2.  `++`, `--` (Incremento/Decremento - prefijo)
3.  `!` (NOT lógico), `-` (Menos unario)
4.  `*`, `/`, `%` (Multiplicación, División, Módulo)
5.  `+`, `-` (Suma, Resta)
6.  `<`, `<=`, `>`, `>=` (Relacionales)
7.  `==`, `!=` (Igualdad)
8.  `&` (AND lógico/bit a bit)
9.  `^` (XOR lógico/bit a bit)
10. `|` (OR lógico/bit a bit)
11. `&&` (AND lógico - cortocircuito)
12. `||` (OR lógico - cortocircuito)
13. `?:` (Operador ternario)
14. `=`, `+=`, `-=`, `*=`, `/=`, `%=` (Asignación)
15. `++`, `--` (Incremento/Decremento - postfijo)

**Ejemplo:**

```java
int resultado = 2 + 3 * 4; // Multiplicación tiene mayor precedencia
System.out.println(resultado); // Imprime 14, no 20

// Usar paréntesis para claridad o cambiar el orden
int resultado2 = (2 + 3) * 4;
System.out.println(resultado2); // Imprime 20
```

**Conclusión:**

Entender los operadores es fundamental para escribir expresiones y sentencias efectivas en Java. Practica con diferentes combinaciones para familiarizarte con su comportamiento y precedencia.