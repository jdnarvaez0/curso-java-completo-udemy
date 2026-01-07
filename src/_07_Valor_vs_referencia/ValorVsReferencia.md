# 📦 Valor vs Referencia en Java

## 📋 Índice
- [Introducción](#introducción)
- [Conceptos Clave](#conceptos-clave)
- [Paso por Valor (Tipos Primitivos)](#paso-por-valor-tipos-primitivos)
- [Paso por Referencia (Objetos y Arrays)](#paso-por-referencia-objetos-y-arrays)
- [Ejemplo con Objetos](#ejemplo-con-objetos)
- [Diagrama Visual](#diagrama-visual)
- [Resumen Comparativo](#resumen-comparativo)
- [Errores Comunes](#errores-comunes)

---

## Introducción

En Java, es fundamental entender cómo se pasan los datos a los métodos. Esta diferencia determina si los cambios realizados dentro de un método afectan o no a la variable original.

> **⚠️ Concepto Importante**: Java **siempre** pasa por valor, pero el "valor" puede ser:
> - El valor literal (para tipos primitivos)
> - La referencia/dirección de memoria (para objetos)

---

## Conceptos Clave

### 🔢 Tipos Primitivos
Son los tipos de datos básicos de Java:
| Tipo | Tamaño | Rango de Valores |
|------|--------|------------------|
| `byte` | 8 bits | -128 a 127 |
| `short` | 16 bits | -32,768 a 32,767 |
| `int` | 32 bits | -2³¹ a 2³¹-1 |
| `long` | 64 bits | -2⁶³ a 2⁶³-1 |
| `float` | 32 bits | Decimales de precisión simple |
| `double` | 64 bits | Decimales de precisión doble |
| `char` | 16 bits | Caracteres Unicode |
| `boolean` | 1 bit | true o false |

### 📦 Tipos por Referencia
Son todos los objetos, incluyendo:
- Arrays (`int[]`, `String[]`, etc.)
- Clases (`String`, `Persona`, `ArrayList`, etc.)
- Interfaces

---

## Paso por Valor (Tipos Primitivos)

Cuando pasamos un **tipo primitivo** a un método, se crea una **copia** del valor. Los cambios dentro del método **NO afectan** a la variable original.

### 📄 Archivo: `PasarPorValor.java`

```java
package _07_Valor_vs_referencia;

public class PasarPorValor {
    public static void main(String[] args) {
        // toda variable PRIMITIVA siempre se PASA POR VALOR
        // y no por referencia (no es un objeto)
        int i = 10;
        System.out.println("Iniciamos el main con i = " + i);
        test(i); // se pasa el valor, no la referencia al objeto
        System.out.println("Finalizamos el main con i = " + i); // 10
    }

    public static void test(int i) {
        System.out.println("Iniciamos el método test con i = " + i);
        i = 35;
        System.out.println("Finalizamos el método test con i = " + i);
    }
}
```

### 🖥️ Salida Esperada:
```
Iniciamos el main con i = 10
Iniciamos el método test con i = 10
Finalizamos el método test con i = 35
Finalizamos el main con i = 10    ← El valor original NO cambió
```

### 🧠 Explicación Paso a Paso:
1. Se declara `i = 10` en el main
2. Se llama a `test(i)` → se pasa una **copia** del valor `10`
3. Dentro de `test()`, la copia se modifica a `35`
4. Al salir de `test()`, la copia se descarta
5. En el main, `i` sigue siendo `10`

---

## Paso por Referencia (Objetos y Arrays)

Cuando pasamos un **objeto o array** a un método, se pasa la **referencia** (dirección de memoria). Los cambios dentro del método **SÍ afectan** al objeto original.

### 📄 Archivo: `PasarPorReferencia.java`

```java
package _07_Valor_vs_referencia;

public class PasarPorReferencia {
    public static void main(String[] args) {
        // como no se vio objetos se ve con arreglos
        int[] edad = { 10, 11, 12 };
        System.out.println("Iniciamos el main");

        // itero con los valores originales
        for (int i = 0; i < edad.length; i++) {
            System.out.println("edad[" + i + "] = " + edad[i]);
        }
        System.out.println("Antes de invocar al método test");

        test(edad); // se pasa la REFERENCIA al array
        System.out.println("Después de invocar al método test");

        // Lo recorro de nuevo para mostrar los valores modificados
        for (int i = 0; i < edad.length; i++) {
            System.out.println("edad[" + i + "] = " + edad[i]);
        }
        System.out.println("Finaliza el método main, con los datos del arreglo modificados");
    }

    public static void test(int[] edadArr) {
        System.out.println("Iniciamos el método test");
        for (int i = 0; i < edadArr.length; i++) {
            edadArr[i] += 20;
        }
        System.out.println("Finalizamos el método test");
    }
}
```

### 🖥️ Salida Esperada:
```
Iniciamos el main
edad[0] = 10
edad[1] = 11
edad[2] = 12
Antes de invocar al método test
Iniciamos el método test
Finalizamos el método test
Después de invocar al método test
edad[0] = 30    ← El array original SÍ cambió
edad[1] = 31
edad[2] = 32
Finaliza el método main, con los datos del arreglo modificados
```

### 🧠 Explicación Paso a Paso:
1. Se crea un array `edad` con valores `{10, 11, 12}`
2. Se llama a `test(edad)` → se pasa la **referencia** al array
3. Dentro de `test()`, se modifica el array sumando `20` a cada elemento
4. Al salir de `test()`, el array original está modificado
5. En el main, el array ahora tiene `{30, 31, 32}`

---

## Ejemplo con Objetos

### 📄 Archivo: `PasarPorReferencia2.java`

Este ejemplo demuestra el paso por referencia usando una clase personalizada.

```java
package _07_Valor_vs_referencia;

class Persona {
    // atributo
    private String nombre;

    // modifico el nombre
    public void modificarNombre(String nuevoNombre) {
        this.nombre = nuevoNombre;
    }

    // getter
    public String leerNombre() {
        return this.nombre;
    }
}

public class PasarPorReferencia2 {
    public static void main(String[] args) {
        // Instancio un objeto de la clase persona
        Persona persona = new Persona();
        persona.modificarNombre("Maria");
        System.out.println("El nombre de persona es : " + persona.leerNombre()); // Maria
        test(persona); // aca si me modifica el nombre en mi persona
        System.out.println("El nombre de persona es : " + persona.leerNombre()); // Pepe
    }

    public static void test(Persona persona) {
        System.out.println("Inicializamos el método test");
        // modifica el nombre
        persona.modificarNombre("Pepe");
        System.out.println("Finalizamos el método test");
    }
}
```

### 🖥️ Salida Esperada:
```
El nombre de persona es : Maria
Inicializamos el método test
Finalizamos el método test
El nombre de persona es : Pepe    ← El objeto original SÍ cambió
```

---

## Diagrama Visual

```
┌─────────────────────────────────────────────────────────────────┐
│                    PASO POR VALOR (Primitivos)                  │
├─────────────────────────────────────────────────────────────────┤
│                                                                 │
│    main()                         test()                        │
│   ┌───────┐                      ┌───────┐                      │
│   │ i = 10│ ──── COPIA ────────▶ │ i = 10│                      │
│   └───────┘                      └───────┘                      │
│       ▲                              │                          │
│       │                              ▼                          │
│   Sin cambio                     i = 35 (solo la copia)         │
│                                                                 │
└─────────────────────────────────────────────────────────────────┘

┌─────────────────────────────────────────────────────────────────┐
│                PASO POR REFERENCIA (Objetos/Arrays)             │
├─────────────────────────────────────────────────────────────────┤
│                                                                 │
│    main()                         test()                        │
│   ┌────────┐                     ┌────────┐                     │
│   │ edad[] │──── REFERENCIA ───▶ │edadArr │                     │
│   │ (0x123)│                     │ (0x123)│                     │
│   └────┬───┘                     └────┬───┘                     │
│        │                              │                          │
│        ▼                              ▼                          │
│   ┌─────────────────────────────────────┐                       │
│   │    MISMO OBJETO EN MEMORIA          │                       │
│   │    [10, 11, 12] → [30, 31, 32]      │                       │
│   └─────────────────────────────────────┘                       │
│                                                                 │
└─────────────────────────────────────────────────────────────────┘
```

---

## Resumen Comparativo

| Característica | Paso por Valor | Paso por Referencia |
|----------------|----------------|---------------------|
| **Aplica a** | Tipos primitivos (`int`, `double`, `char`, etc.) | Objetos y Arrays |
| **¿Qué se pasa?** | Una copia del valor | La dirección de memoria |
| **¿Afecta al original?** | ❌ NO | ✅ SÍ |
| **Memoria** | Se crea una nueva variable | Apunta al mismo objeto |
| **Ejemplo** | `test(10)` → copia 10 | `test(array)` → misma referencia |

---

## Errores Comunes

### ❌ Error 1: Creer que se puede modificar un primitivo
```java
public static void duplicar(int numero) {
    numero = numero * 2; // ❌ Solo modifica la copia local
}

int x = 5;
duplicar(x);
System.out.println(x); // Imprime 5, no 10
```

### ✅ Solución: Retornar el nuevo valor
```java
public static int duplicar(int numero) {
    return numero * 2; // ✅ Retorna el valor modificado
}

int x = 5;
x = duplicar(x);
System.out.println(x); // Imprime 10
```

### ❌ Error 2: Reasignar la referencia dentro del método
```java
public static void reasignar(int[] arr) {
    arr = new int[]{100, 200, 300}; // ❌ Crea un nuevo array local
}

int[] numeros = {1, 2, 3};
reasignar(numeros);
System.out.println(numeros[0]); // Imprime 1, no 100
```

### ✅ Solución: Modificar el contenido, no la referencia
```java
public static void modificar(int[] arr) {
    arr[0] = 100; // ✅ Modifica el array original
    arr[1] = 200;
    arr[2] = 300;
}
```

---

## 🎯 Puntos Clave para Recordar

1. **Java siempre pasa por valor**, pero el valor puede ser una referencia
2. **Primitivos**: Se copia el valor → cambios NO afectan al original
3. **Objetos/Arrays**: Se copia la referencia → cambios SÍ afectan al original
4. **Reasignar** una referencia dentro de un método no afecta la original
5. **Modificar** el contenido de un objeto sí afecta al original

---

## 📚 Archivos del Módulo

| Archivo | Descripción |
|---------|-------------|
| [PasarPorValor.java](./PasarPorValor.java) | Demuestra paso por valor con tipos primitivos |
| [PasarPorReferencia.java](./PasarPorReferencia.java) | Demuestra paso por referencia con arrays |
| [PasarPorReferencia2.java](./PasarPorReferencia2.java) | Demuestra paso por referencia con objetos |

---

> 💡 **Tip**: Para practicar, intenta predecir la salida de cada programa antes de ejecutarlo. ¡Es la mejor manera de internalizar estos conceptos!
