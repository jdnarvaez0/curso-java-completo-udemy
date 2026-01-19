---
sidebar_position: 11
---

# Línea de Comando

Este módulo explica cómo trabajar con la línea de comandos en Java, desde la compilación hasta la ejecución y el manejo de argumentos.

## 1. Compilación y Ejecución

Para ejecutar un programa Java desde la terminal, primero debemos compilar el código fuente (`.java`) a código de bytes o *bytecode* (`.class`).

### Compilar (`javac`)

El comando `javac` (Java Compiler) se utiliza para compilar el código fuente.

Desde la raíz del proyecto (`src`), para compilar el archivo `ArgumentosLineaComando.java` que está en el paquete `_11_LInea_de_comando`:

```bash
javac _11_LInea_de_comando/ArgumentosLineaComando.java
```

O si el sistema operativo requiere backslash (Windows):

```powershell
javac _11_LInea_de_comando\ArgumentosLineaComando.java
```

Esto generará un archivo `ArgumentosLineaComando.class` en el mismo directorio. Este archivo contiene el **bytecode**, que es el código intermedio que entiende la JVM (Java Virtual Machine).

### Ejecutar (`java`)

Una vez compilado, usamos el comando `java` para ejecutar el programa. Debemos invocarlo usando el nombre completo de la clase (incluyendo el paquete).

```bash
java _11_LInea_de_comando.ArgumentosLineaComando
```

> **Nota:** No se debe incluir la extensión `.class` ni `.java` al ejecutar, solo el nombre de la clase.

## 2. Paso de Argumentos

Los argumentos que pasamos desde la línea de comandos se reciben en el método `main` a través del parámetro `String[] args`.

### Desde la Consola

Podemos pasar argumentos separándolos por espacios después del nombre de la clase.

```bash
java _11_LInea_de_comando.ArgumentosLineaComando Juan Pedro Maria
```

En este ejemplo:
- `args[0]` será "Juan"
- `args[1]` será "Pedro"
- `args[2]` será "Maria"

Si el programa espera argumentos y no se envían, es buena práctica validar `args.length` para evitar errores, como se muestra en los ejemplos de este módulo.

### Desde IntelliJ IDEA

Para probar argumentos sin salir del IDE:

1. Ve al menú **Run** -> **Edit Configurations...**
2. Selecciona tu clase (`ArgumentosLineaComando` o `Calculadora`).
3. En el campo **Program arguments**, escribe los valores separados por espacio (ej: `Juan Pedro`).
4. Haz clic en **Apply** y **OK**.
5. Ejecuta el programa normalmente.

## 3. Ejemplo: Calculadora por Línea de Comandos

El archivo `ArgumentosLineaComandoCalculadora.java` muestra un uso práctico. Espera 3 argumentos:
1. Operación (`suma`, `resta`, `multi`, `div`)
2. Primer número (entero)
3. Segundo número (entero)

Ejemplo de ejecución:

```bash
java _11_LInea_de_comando.ArgumentosLineaComandoCalculadora suma 10 20
```

Salida esperada:
```
Resultado de la operación 'suma' es: 30.0
```
