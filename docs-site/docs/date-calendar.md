---
sidebar_position: 9
---

# 📅 Clase Date y Calendar

Manejo de fechas y tiempos en Java.

## Clase Date (Legacy)

```java
import java.util.Date;

// Fecha actual
Date ahora = new Date();
System.out.println(ahora);

// Timestamp en milisegundos
long tiempo = ahora.getTime();
```

:::warning Obsoleto
Muchos métodos de `Date` están deprecados. Preferir `Calendar` o `java.time`.
:::

## Clase Calendar

```java
import java.util.Calendar;

// Obtener instancia
Calendar cal = Calendar.getInstance();

// Obtener componentes
int año = cal.get(Calendar.YEAR);
int mes = cal.get(Calendar.MONTH); // 0-11
int dia = cal.get(Calendar.DAY_OF_MONTH);
int hora = cal.get(Calendar.HOUR_OF_DAY);
int minuto = cal.get(Calendar.MINUTE);

// Establecer fecha
cal.set(Calendar.YEAR, 2025);
cal.set(Calendar.MONTH, Calendar.JANUARY);
cal.set(Calendar.DAY_OF_MONTH, 15);

// Convertir a Date
Date fecha = cal.getTime();
```

## Operaciones con Calendar

```java
Calendar cal = Calendar.getInstance();

// Sumar días
cal.add(Calendar.DAY_OF_MONTH, 7); // +7 días

// Restar meses
cal.add(Calendar.MONTH, -2); // -2 meses

// Comparar fechas
Calendar otra = Calendar.getInstance();
if (cal.after(otra)) {
    System.out.println("cal es posterior");
}
```

## SimpleDateFormat

```java
import java.text.SimpleDateFormat;

Date fecha = new Date();
SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm");
String formateado = sdf.format(fecha);
// "15/01/2025 10:30"

// Parsear String a Date
String texto = "25/12/2025";
SimpleDateFormat parser = new SimpleDateFormat("dd/MM/yyyy");
Date navidad = parser.parse(texto);
```

## Patrones de Formato

| Patrón | Descripción | Ejemplo |
|--------|-------------|---------|
| `dd` | Día (2 dígitos) | `15` |
| `MM` | Mes (2 dígitos) | `01` |
| `yyyy` | Año (4 dígitos) | `2025` |
| `HH` | Hora 24h | `14` |
| `mm` | Minutos | `30` |
| `ss` | Segundos | `45` |
| `EEEE` | Día de semana | `Miércoles` |

:::tip Java 8+
Para nuevos proyectos, considera usar `java.time.LocalDate`, `LocalDateTime`, etc.
:::
