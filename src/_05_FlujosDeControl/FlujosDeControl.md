# 🔀 Flujos de Control en Java

## 📋 Índice
- [Introducción](#introducción)
- [Sentencia if-else](#sentencia-if-else)
- [Sentencia switch-case](#sentencia-switch-case)
- [Bucle for](#bucle-for)
- [Bucle for-each](#bucle-for-each)
- [Bucle while y do-while](#bucle-while-y-do-while)
- [break, continue y etiquetas](#break-continue-y-etiquetas)
- [Resumen](#resumen)

---

## Introducción

Los **flujos de control** determinan el orden en que se ejecutan las instrucciones de un programa. Java ofrece:

| Tipo | Estructuras |
|------|-------------|
| **Condicionales** | `if-else`, `switch-case` |
| **Bucles** | `for`, `for-each`, `while`, `do-while` |
| **Saltos** | `break`, `continue`, `return` |

---

## Sentencia if-else

La sentencia `if-else` ejecuta código basándose en una condición booleana.

### 📄 Archivo: `SentenciaIfElse.java`

```java
package _05_FlujosDeControl;

public class SentenciaIfElse {
    public static void main(String[] args) {
        float promedio = 5.8f;

        // IF ELSE básico
        if (promedio >= 6.5) {
            System.out.println("Felicitaciones, buen promedio");
        } else {
            System.out.println("Hay que estudiar un poco más");
        }

        // IF - ELSE IF - ELSE (múltiples condiciones)
        if (promedio >= 6.5) {
            System.out.println("Felicitaciones, excelente promedio");
        } else if (promedio >= 6.0) {
            System.out.println("Felicitaciones, muy buen promedio");
        } else if (promedio >= 5.5) {
            System.out.println("Buen promedio");
        } else if (promedio >= 4.0) {
            System.out.println("Insuficiente. Hay que estudiar un poco más");
        } else {
            System.out.println("Reprobado");
        }
    }
}
```

### 📊 Diagrama de Flujo:
```
           ┌──────────────┐
           │   condición  │
           └──────┬───────┘
                  │
        ┌─────────┴─────────┐
        ▼                   ▼
   [true]               [false]
   Bloque IF            Bloque ELSE
        │                   │
        └─────────┬─────────┘
                  ▼
           Continúa...
```

---

## Sentencia switch-case

`switch` evalúa una expresión y ejecuta el bloque correspondiente al valor encontrado.

### 📄 Archivo: `SentenciaSwitchCase.java`

```java
package _05_FlujosDeControl;

public class SentenciaSwitchCase {
    public static void main(String[] args) {
        int num = 3;

        // Tipos válidos: int, char, String, enum
        switch (num) {
            case 0:
                System.out.println("num es 0");
                break;
            case 1:
                System.out.println("num es 1");
                break;
            case 2:
                System.out.println("num es 2");
                break;
            case 3:
                System.out.println("num es 3");
                break;
            default:
                System.out.println("num es otro valor");
        }

        // Ejemplo práctico: Nombre del mes
        int mes = 3;
        String nombreMes;

        switch (mes) {
            case 1:  nombreMes = "Enero";      break;
            case 2:  nombreMes = "Febrero";    break;
            case 3:  nombreMes = "Marzo";      break;
            // ... más casos ...
            case 12: nombreMes = "Diciembre";  break;
            default: nombreMes = "Número incorrecto";
        }
        System.out.println("El mes es: " + nombreMes);
    }
}
```

> ⚠️ **Importante**: Si olvidas el `break`, la ejecución "cae" al siguiente case (fall-through).

---

## Bucle for

El bucle `for` repite un bloque de código un número determinado de veces.

### Sintaxis:
```java
for (inicialización; condición; incremento) {
    // código a repetir
}
```

### 📄 Archivo: `SentenciaFor.java`

```java
package _05_FlujosDeControl;

public class SentenciaFor {
    public static void main(String[] args) {
        // Ciclo FOR básico
        for (int i = 0; i < 5; i++) {
            System.out.println(i);
        }
        // OUTPUT: 0 1 2 3 4
    }
}
```

### 📄 Archivo: `SentenciaForArreglo.java`

```java
package _05_FlujosDeControl;

public class SentenciaForArreglo {
    public static void main(String[] args) {
        String[] nombres = { "Andres", "Pepe", "Maria", "Paco", "Lola" };

        for (int i = 0; i < nombres.length; i++) {
            // Saltar "Andres" y "Pepe"
            if (nombres[i].equalsIgnoreCase("andres") ||
                nombres[i].equalsIgnoreCase("pepe")) {
                continue;  // Salta a la siguiente iteración
            }
            System.out.print(nombres[i] + " ");
        }
        // OUTPUT: Maria Paco Lola
    }
}
```

---

## Bucle for-each

El `for-each` simplifica la iteración sobre colecciones y arrays.

### Sintaxis:
```java
for (tipo elemento : colección) {
    // usar elemento
}
```

### 📄 Archivo: `SentenciaForEach.java`

```java
package _05_FlujosDeControl;

public class SentenciaForEach {
    public static void main(String[] args) {
        int[] numeros = { 1, 3, 5, 7, 9, 11 };
        String[] nombres = { "Ana", "Pedro", "Luis" };

        // Recorrer array de números
        for (int num : numeros) {
            System.out.println("num = " + num);
        }

        // Recorrer array de strings
        for (String nombre : nombres) {
            System.out.println(nombre);
        }
    }
}
```

### Comparación for vs for-each:

| Aspecto | `for` tradicional | `for-each` |
|---------|-------------------|------------|
| Acceso al índice | ✅ Sí | ❌ No |
| Sintaxis | Más verbosa | Más limpia |
| Modificar array | ✅ Sí | ❌ No (solo lectura) |
| Uso recomendado | Cuando necesitas índice | Solo recorrer |

---

## Bucle while y do-while

### while
Ejecuta mientras la condición sea `true`. Puede no ejecutarse nunca.

### do-while
Siempre ejecuta **al menos una vez**, luego verifica la condición.

### 📄 Archivo: `SentenciaWhile.java`

```java
package _05_FlujosDeControl;

public class SentenciaWhile {
    public static void main(String[] args) {
        int i = 0;

        // WHILE: puede no ejecutarse
        while (i < 5) {
            System.out.println("i : " + i);
            i++;
        }

        // DO-WHILE: siempre se ejecuta al menos una vez
        boolean condicion = false;
        do {
            System.out.println("Se ejecuta al menos una sola vez");
        } while (condicion);  // false, pero ya se ejecutó
    }
}
```

### Diagrama comparativo:
```
      WHILE                         DO-WHILE
         │                              │
    ┌────▼────┐                         ▼
    │condición│◄──┐              ┌────────────┐
    └────┬────┘   │              │   código   │
         │        │              └──────┬─────┘
    true │        │                     │
         ▼        │                ┌────▼────┐
   ┌──────────┐   │                │condición│
   │  código  │───┘                └────┬────┘
   └──────────┘                    true │
                                        │
                                   ┌────┘
                                   ▼
```

---

## break, continue y etiquetas

### break
Sale completamente del bucle actual.

### continue
Salta a la siguiente iteración del bucle.

### Etiquetas (Labels)
Permiten controlar bucles anidados desde el bucle interno.

### 📄 Archivo: `SentenciasBucleEtiquetas.java`

```java
package _05_FlujosDeControl;

public class SentenciasBucleEtiquetas {
    public static void main(String[] args) {

        bucle1: for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                if (i == 2) {
                    continue bucle1;  // Salta al bucle externo
                }
                System.out.println("i = " + i + ", j = " + j);
            }
        }
        // Cuando i=2, se salta toda la iteración del bucle interno
    }
}
```

### 📄 Archivo: `SentenciasBucleEtiquetasBuscar.java`

Ejemplo práctico: buscar una palabra en una frase.

```java
package _05_FlujosDeControl;

public class SentenciasBucleEtiquetasBuscar {
    public static void main(String[] args) {
        String frase = "tres tristes tigres tragan trigo en un trigal";
        String palabra = "trigo";
        int cantidad = 0;

        buscar: for (int i = 0; i <= frase.length() - palabra.length(); i++) {
            int k = i;
            for (int j = 0; j < palabra.length(); j++) {
                if (frase.charAt(k++) != palabra.charAt(j)) {
                    continue buscar;  // No coincide, siguiente posición
                }
            }
            cantidad++;  // ¡Encontrado!
        }
        System.out.println("Palabra '" + palabra + "' encontrada " + cantidad + " veces");
    }
}
```

---

## Resumen

### 🎯 Cuándo usar cada estructura:

| Estructura | Usar cuando... |
|------------|----------------|
| `if-else` | Decisión binaria simple |
| `if-else if` | Múltiples condiciones excluyentes |
| `switch` | Valor discreto con muchos casos |
| `for` | Número conocido de iteraciones |
| `for-each` | Recorrer colección sin modificar |
| `while` | Condición puede ser falsa inicialmente |
| `do-while` | Necesitas ejecutar al menos una vez |

### ⚡ Tips Importantes:

1. **Evita bucles infinitos**: Asegúrate de que la condición eventualmente sea `false`
2. **Usa `break` con cuidado**: Puede hacer el código difícil de seguir
3. **Prefiere `for-each`**: Cuando solo necesitas leer elementos
4. **`switch` moderno**: Desde Java 14, hay nueva sintaxis con flechas (`->`)

---

## 📚 Archivos del Módulo

| Archivo | Descripción |
|---------|-------------|
| [SentenciaIfElse.java](./SentenciaIfElse.java) | Condicionales if-else |
| [SentenciaIfElseNumDiaMes.java](./SentenciaIfElseNumDiaMes.java) | Ejemplo días del mes con if |
| [SentenciaSwitchCase.java](./SentenciaSwitchCase.java) | Switch con múltiples casos |
| [SentenciaSwitchNumDiaMes.java](./SentenciaSwitchNumDiaMes.java) | Días del mes con switch |
| [SentenciaFor.java](./SentenciaFor.java) | Bucle for básico |
| [SentenciaForArreglo.java](./SentenciaForArreglo.java) | For con arrays y continue |
| [SentenciaForEach.java](./SentenciaForEach.java) | For-each con arrays |
| [SentenciaWhile.java](./SentenciaWhile.java) | While y do-while |
| [SentenciasBucleEtiquetas.java](./SentenciasBucleEtiquetas.java) | Etiquetas en bucles |
| [SentenciasBucleEtiquetasBuscar.java](./SentenciasBucleEtiquetasBuscar.java) | Búsqueda con etiquetas |

---

> 💡 **Tip**: Practica escribiendo bucles anidados y usando `break`/`continue` para entender bien su comportamiento.
