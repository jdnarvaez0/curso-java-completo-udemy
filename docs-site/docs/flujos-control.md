---
sidebar_position: 6
---

# 🔄 Flujos de Control

Estructuras que controlan el flujo de ejecución del programa.

## Condicional if-else

```java
int edad = 18;

if (edad >= 18) {
    System.out.println("Mayor de edad");
} else if (edad >= 13) {
    System.out.println("Adolescente");
} else {
    System.out.println("Niño");
}
```

## Switch

```java
int dia = 3;

switch (dia) {
    case 1:
        System.out.println("Lunes");
        break;
    case 2:
        System.out.println("Martes");
        break;
    case 3:
        System.out.println("Miércoles");
        break;
    default:
        System.out.println("Otro día");
}
```

### Switch Expression (Java 14+)

```java
String resultado = switch (dia) {
    case 1 -> "Lunes";
    case 2 -> "Martes";
    case 3 -> "Miércoles";
    default -> "Otro día";
};
```

## Bucle for

```java
// For clásico
for (int i = 0; i < 5; i++) {
    System.out.println(i); // 0, 1, 2, 3, 4
}

// For-each (para colecciones)
int[] numeros = {1, 2, 3, 4, 5};
for (int num : numeros) {
    System.out.println(num);
}
```

## Bucle while

```java
int contador = 0;

while (contador < 5) {
    System.out.println(contador);
    contador++;
}
```

## Bucle do-while

```java
int i = 0;

do {
    System.out.println(i);
    i++;
} while (i < 5);
```

:::info Diferencia
`do-while` siempre ejecuta al menos una vez, incluso si la condición es falsa.
:::

## Control de Bucles

```java
// break: termina el bucle
for (int i = 0; i < 10; i++) {
    if (i == 5) break; // Sale del bucle
    System.out.println(i);
}

// continue: salta a la siguiente iteración
for (int i = 0; i < 5; i++) {
    if (i == 2) continue; // Salta el 2
    System.out.println(i); // 0, 1, 3, 4
}
```
