# 📅 Clase Date y Calendar en Java

## 📋 Índice
- [Introducción](#introducción)
- [Clase java.util.Date](#clase-javautildate)
- [Formateo de Fechas (SimpleDateFormat)](#formateo-de-fechas-simpledateformat)
- [Parseo de Fechas (String a Date)](#parseo-de-fechas-string-a-date)
- [Clase java.util.Calendar](#clase-javautilcalendar)
- [Comparación de Fechas](#comparación-de-fechas)
- [Ejemplos Prácticos](#ejemplos-prácticos)

---

## Introducción

En Java, el manejo de fechas y horas ha evolucionado a lo largo del tiempo. Las clases `Date` y `Calendar` pertenecen al paquete `java.util` y son las herramientas clásicas para trabajar con tiempo antes de la introducción de la API `java.time` en Java 8.

---

## Clase java.util.Date

La clase `Date` representa un instante específico en el tiempo, con precisión de milisegundos.

### 📄 Archivo: [EjemploJavaUtilDate.java](./EjemploJavaUtilDate.java)

```java
Date fecha = new Date();
System.out.println("fecha = " + fecha);
```

> [!NOTE]
> Muchos de los métodos de `Date` están obsoletos (deprecated). Se recomienda usar `Calendar` para manipulación o `SimpleDateFormat` para formateo.

---

## Formateo de Fechas (SimpleDateFormat)

`SimpleDateFormat` permite convertir un objeto `Date` a un `String` con un formato personalizado.

```java
SimpleDateFormat df = new SimpleDateFormat("EEEE dd 'de' MMMM, yyyy");
String fechaStr = df.format(fecha);
System.out.println("fechaStr = " + fechaStr);
```

**Patrones comunes:**
- `yyyy`: Año (ej. 2024)
- `MMMM`: Mes completo (ej. enero)
- `dd`: Día del mes
- `EEEE`: Día de la semana completo
- `HH:mm:ss`: Hora, minutos y segundos

---

## Parseo de Fechas (String a Date)

El parseo es la operación inversa: convertir un texto en un objeto `Date`. Requiere manejar la excepción `ParseException`.

### 📄 Archivo: [EjemploJavaUtilDateParse.java](./EjemploJavaUtilDateParse.java)

```java
SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd");
try {
    Date fecha = format.parse("2024-03-25");
} catch (ParseException e) {
    System.err.println("Formato inválido");
}
```

---

## Clase java.util.Calendar

`Calendar` es una clase abstracta que proporciona métodos para convertir entre un instante específico en el tiempo y un conjunto de campos de calendario como `YEAR`, `MONTH`, `DAY_OF_MONTH`, etc.

### 📄 Archivo: [EjemploJavaUtilCalendar.java](./EjemploJavaUtilCalendar.java)

```java
Calendar calendario = Calendar.getInstance();

// Configurar una fecha específica
calendario.set(2020, Calendar.MARCH, 25, 19, 20, 10);

// O campo por campo
calendario.set(Calendar.YEAR, 2020);
calendario.set(Calendar.MONTH, Calendar.MARCH);

// Obtener el objeto Date
Date fecha = calendario.getTime();
```

---

## Comparación de Fechas

Java ofrece varias formas de comparar dos fechas:

1.  **`after(Date when)`**: Retorna true si la fecha es después.
2.  **`before(Date when)`**: Retorna true si la fecha es antes.
3.  **`equals(Object obj)`**: Compara si son iguales.
4.  **`compareTo(Date anotherDate)`**: Retorna:
    -   `> 0` si es después.
    -   `< 0` si es antes.
    -   `0` si son iguales.

---

## Ejemplos Prácticos

### 🧪 Tarea: Calcular Edad
Un ejemplo común es calcular la edad de una persona restando su año de nacimiento del año actual y ajustando según el día del año.

### 📄 Archivo: [tarea.java](./tarea.java)

```java
Calendar fechaNacimiento = Calendar.getInstance();
fechaNacimiento.setTime(fechaNacimientoDate);

Calendar fechaActual = Calendar.getInstance();

int edad = fechaActual.get(Calendar.YEAR) - fechaNacimiento.get(Calendar.YEAR);

if (fechaActual.get(Calendar.DAY_OF_YEAR) < fechaNacimiento.get(Calendar.DAY_OF_YEAR)) {
    edad--;
}
```

---

## 📚 Archivos del Módulo

| Archivo | Descripción |
|---------|-------------|
| [EjemploJavaUtilDate.java](./EjemploJavaUtilDate.java) | Uso básico de la clase `Date` y medición de tiempo |
| [EjemploJavaUtilDateParse.java](./EjemploJavaUtilDateParse.java) | Conversión de `String` a `Date` y comparaciones |
| [EjemploJavaUtilCalendar.java](./EjemploJavaUtilCalendar.java) | Uso de `Calendar` para manejar campos específicos |
| [tarea.java](./tarea.java) | Ejercicio práctico: Calcular edad |

---
> 💡 **Tip**: Siempre que sea posible, prefiere usar la nueva API de Java 8 (`java.time`) para proyectos nuevos, pero es vital conocer `Date` y `Calendar` para mantenimiento de código legado.
