# 📦 Clases Wrapper en Java

## 📋 Índice
- [Introducción](#introducción)
- [¿Qué son las Clases Wrapper?](#qué-son-las-clases-wrapper)
- [Tabla de Tipos Primitivos y sus Wrappers](#tabla-de-tipos-primitivos-y-sus-wrappers)
- [Boxing y Unboxing](#boxing-y-unboxing)
- [Autoboxing y Auto-unboxing](#autoboxing-y-auto-unboxing)
- [Wrapper Integer](#wrapper-integer)
- [Wrapper Boolean](#wrapper-boolean)
- [Operadores Relacionales con Wrappers](#operadores-relacionales-con-wrappers)
- [Método getClass()](#método-getclass)
- [Errores Comunes](#errores-comunes)
- [Resumen](#resumen)

---

## Introducción

En Java, los **tipos primitivos** (`int`, `boolean`, `double`, etc.) no son objetos. Sin embargo, hay situaciones donde necesitamos usar estos valores como objetos:

- Colecciones (`ArrayList`, `HashMap`, etc.) solo aceptan objetos
- APIs que requieren objetos (como la API de Streams)
- Uso de métodos útiles como `parseInt()`, `valueOf()`, etc.

> **💡 Las Clases Wrapper** resuelven este problema envolviendo ("wrapping") los tipos primitivos en objetos.

---

## ¿Qué son las Clases Wrapper?

Las **Clases Wrapper** son clases que encapsulan un tipo primitivo dentro de un objeto. Cada tipo primitivo tiene su correspondiente clase Wrapper.

```
┌─────────────────────────────────────────────────────────┐
│                    WRAPPER CLASS                        │
│  ┌─────────────────────────────────────────────────┐    │
│  │           Valor Primitivo (ej: 42)              │    │
│  └─────────────────────────────────────────────────┘    │
│                                                         │
│  + Métodos útiles (parseInt, valueOf, compareTo...)     │
│  + Compatible con colecciones                           │
│  + Puede ser null                                       │
└─────────────────────────────────────────────────────────┘
```

---

## Tabla de Tipos Primitivos y sus Wrappers

| Tipo Primitivo | Clase Wrapper | Ejemplo |
|----------------|---------------|---------|
| `byte` | `Byte` | `Byte b = 10;` |
| `short` | `Short` | `Short s = 100;` |
| `int` | `Integer` | `Integer i = 42;` |
| `long` | `Long` | `Long l = 1000L;` |
| `float` | `Float` | `Float f = 3.14f;` |
| `double` | `Double` | `Double d = 3.14159;` |
| `char` | `Character` | `Character c = 'A';` |
| `boolean` | `Boolean` | `Boolean flag = true;` |

---

## Boxing y Unboxing

### 📥 Boxing
**Boxing** es el proceso de convertir un tipo primitivo en su objeto Wrapper correspondiente.

```java
// Boxing explícito (forma tradicional)
int primitivo = 10;
Integer objeto = Integer.valueOf(primitivo);
```

### 📤 Unboxing
**Unboxing** es el proceso inverso: convertir un objeto Wrapper a su tipo primitivo.

```java
// Unboxing explícito
Integer objeto = Integer.valueOf(10);
int primitivo = objeto.intValue();
```

---

## Autoboxing y Auto-unboxing

A partir de **Java 5**, el compilador realiza estas conversiones automáticamente.

### ✨ Autoboxing
```java
// El compilador convierte automáticamente int → Integer
Integer numero = 42;  // Equivale a: Integer.valueOf(42)
```

### ✨ Auto-unboxing
```java
// El compilador convierte automáticamente Integer → int
Integer objeto = 42;
int primitivo = objeto;  // Equivale a: objeto.intValue()
```

---

## Wrapper Integer

### 📄 Archivo: `WrapperInteger.java`

Este archivo demuestra las operaciones principales con la clase `Integer`.

```java
package _06_ClaseWrapper;

public class WrapperInteger {
    public static void main(String[] args) {
        int intPrimitivo = 32767;

        // 1. Boxing: Convertir primitivo a objeto Wrapper
        Integer intObjeto = Integer.valueOf(intPrimitivo);  // Forma explícita
        Integer intObjeto2 = intPrimitivo;                  // Autoboxing

        System.out.println("Objeto Integer (valueOf): " + intObjeto);
        System.out.println("Objeto Integer (autoboxing): " + intObjeto2);

        // 2. Unboxing: Convertir objeto Wrapper a primitivo
        int num = intObjeto;                    // Auto-unboxing
        int num2 = intObjeto.intValue();        // Forma explícita

        // 3. Conversión desde String
        String valorTvLcd = "67000";
        Integer valor = Integer.valueOf(valorTvLcd);

        // 4. Conversiones a otros tipos (pueden causar pérdida de datos)
        Short shortObjeto = intObjeto.shortValue();   // OK si cabe
        Byte byteObjeto = intObjeto.byteValue();      // Pérdida de datos
        Long longObjeto = intObjeto.longValue();      // Sin pérdida
    }
}
```

### 🖥️ Salida Esperada:
```
Objeto Integer (creado con valueOf): 32767
Objeto Integer (creado con autoboxing): 32767
Primitivo (obtenido con auto-unboxing): 32767
Primitivo (obtenido con intValue()): 32767
Integer creado desde un String: 67000
Conversión a short: 32767
Conversión a byte (con pérdida de datos): -1
Conversión a long: 32767
```

> ⚠️ **Nota**: La conversión a `byte` muestra `-1` porque 32767 excede el rango de byte (-128 a 127), causando overflow.

---

## Wrapper Boolean

### 📄 Archivo: `WrapperBoolean.java`

```java
package _06_ClaseWrapper;

public class WrapperBoolean {
    public static void main(String[] args) {
        Integer num1 = 1, num2 = 2;

        boolean primBoolean = num1 > num2;                    // false
        Boolean objetoBoolean = false;                        // Autoboxing
        Boolean objetoBoolean1 = Boolean.valueOf(primBoolean); // Explícito
        Boolean objetoBoolean2 = Boolean.valueOf("false");    // Desde String

        // Comparación de objetos Boolean
        System.out.println(objetoBoolean1 == objetoBoolean2);        // true
        System.out.println(objetoBoolean1.equals(objetoBoolean2));   // true

        // Unboxing
        boolean primBoolean2 = objetoBoolean1.booleanValue();
    }
}
```

### 🔑 Punto Importante:
Para `Boolean`, los valores `true` y `false` son **cacheados**, por lo que `==` funciona correctamente. Sin embargo, siempre es mejor usar `.equals()` para comparar objetos.

---

## Operadores Relacionales con Wrappers

### 📄 Archivo: `WrapperOperadoresRelacionales.java`

Este archivo muestra la diferencia entre `==` y `.equals()` con objetos Wrapper.

```java
package _06_ClaseWrapper;

public class WrapperOperadoresRelacionales {
    public static void main(String[] args) {
        Integer num1 = Integer.valueOf(1000);
        Integer num2 = num1;
        System.out.println("Son el mismo objeto? " + (num1 == num2)); // true

        num2 = 1000;  // Nuevo objeto
        System.out.println("Son el mismo objeto? " + (num1 == num2)); // false
        System.out.println("Tienen el mismo valor? " + num1.equals(num2)); // true
    }
}
```

### ⚠️ Cuidado con el Integer Cache

Java cachea objetos `Integer` entre **-128 y 127**:

```java
Integer a = 100;
Integer b = 100;
System.out.println(a == b);  // true (mismo objeto cacheado)

Integer c = 1000;
Integer d = 1000;
System.out.println(c == d);  // false (objetos diferentes)
```

### ✅ Regla de Oro:
| Operador | Uso Correcto |
|----------|--------------|
| `==` | Comparar **identidad** (mismo objeto en memoria) |
| `.equals()` | Comparar **valor** (mismo contenido) |

---

## Método getClass()

### 📄 Archivo: `EjemploMetodoGetClase.java`

El método `getClass()` permite obtener información sobre la clase de un objeto en tiempo de ejecución (Reflection).

```java
package _06_ClaseWrapper;

import java.lang.reflect.Method;

public class EjemploMetodoGetClase {
    public static void main(String[] args) {
        String texto = "Hola que tal!";
        Class<?> stringClass = texto.getClass();

        System.out.println("Clase: " + stringClass);                    // class java.lang.String
        System.out.println("Nombre: " + stringClass.getName());         // java.lang.String
        System.out.println("SimpleName: " + stringClass.getSimpleName()); // String
        System.out.println("Package: " + stringClass.getPackage());     // package java.lang

        // Explorar jerarquía de herencia
        Integer num = 34;
        Class<?> intClass = num.getClass();
        System.out.println("Superclase de Integer: " + intClass.getSuperclass()); // Number
    }
}
```

### 📊 Jerarquía de Integer:
```
Object
   └── Number (clase abstracta)
          └── Integer
          └── Double
          └── Long
          └── ...
```

---

## Autoboxing en Arrays

### 📄 Archivo: `AutoboxingInteger.java`

```java
package _06_ClaseWrapper;

public class AutoboxingInteger {
    public static void main(String[] args) {
        // Mezcla de boxing explícito y autoboxing
        Integer[] enteros = { Integer.valueOf(1), 2, 3, 4, 5, 6, 7,
                8, 9, 10, 11, 12, 13, 14, 15 };
        int suma = 0;

        // Sumar todos los números pares
        for (Integer i : enteros) {
            if (i.intValue() % 2 == 0) {
                suma += i.intValue();
            }
        }
        System.out.println("Suma = " + suma);  // 56
    }
}
```

### 🖥️ Salida:
```
Suma = 56
```
> Los pares son: 2 + 4 + 6 + 8 + 10 + 12 + 14 = **56**

---

## Errores Comunes

### ❌ Error 1: Usar `==` para comparar valores
```java
Integer a = 1000;
Integer b = 1000;
if (a == b) { ... }  // ❌ Compara referencias, no valores
```

### ✅ Solución:
```java
if (a.equals(b)) { ... }  // ✅ Compara valores
// o
if (a.intValue() == b.intValue()) { ... }  // ✅ También funciona
```

---

### ❌ Error 2: NullPointerException con auto-unboxing
```java
Integer numero = null;
int primitivo = numero;  // ❌ NullPointerException!
```

### ✅ Solución:
```java
if (numero != null) {
    int primitivo = numero;  // ✅ Seguro
}
```

---

### ❌ Error 3: Pérdida de datos en conversiones
```java
Integer grande = 1000000;
Byte pequeno = grande.byteValue();  // ❌ Pérdida de datos
```

### ✅ Solución: Validar el rango antes de convertir
```java
if (grande >= Byte.MIN_VALUE && grande <= Byte.MAX_VALUE) {
    Byte pequeno = grande.byteValue();  // ✅ Seguro
}
```

---

## Resumen

### 🎯 Puntos Clave

| Concepto | Descripción |
|----------|-------------|
| **Wrapper** | Clase que envuelve un primitivo en un objeto |
| **Boxing** | Primitivo → Objeto (`Integer.valueOf(10)`) |
| **Unboxing** | Objeto → Primitivo (`obj.intValue()`) |
| **Autoboxing** | Boxing automático por el compilador |
| **Auto-unboxing** | Unboxing automático por el compilador |
| **Integer Cache** | Java cachea Integers de -128 a 127 |

### 📚 Métodos Útiles de Integer

| Método | Descripción |
|--------|-------------|
| `valueOf(int)` | Crea un Integer desde un int |
| `valueOf(String)` | Crea un Integer desde un String |
| `parseInt(String)` | Convierte String a int primitivo |
| `intValue()` | Obtiene el int primitivo |
| `compareTo(Integer)` | Compara dos Integer |
| `equals(Object)` | Compara por valor |

---

## 📚 Archivos del Módulo

| Archivo | Descripción |
|---------|-------------|
| [WrapperInteger.java](./WrapperInteger.java) | Boxing, unboxing y conversiones con Integer |
| [WrapperBoolean.java](./WrapperBoolean.java) | Uso del Wrapper Boolean |
| [AutoboxingInteger.java](./AutoboxingInteger.java) | Autoboxing en arrays |
| [WrapperOperadoresRelacionales.java](./WrapperOperadoresRelacionales.java) | Comparación de objetos Wrapper |
| [EjemploMetodoGetClase.java](./EjemploMetodoGetClase.java) | Uso de getClass() y Reflection |

---

> 💡 **Tip**: Siempre usa `.equals()` para comparar valores de objetos Wrapper, y ten cuidado con los `null` para evitar `NullPointerException`.
