---
sidebar_position: 10
---

# 🖥️ La Clase System

La clase `System` en Java contiene varios atributos y métodos útiles. No se puede instanciar, por lo que todos sus miembros son estáticos. Proporciona acceso a recursos del sistema, como la entrada/salida estándar, propiedades del sistema y variables de entorno.

## Propiedades del Sistema

Java nos permite acceder a configuraciones y propiedades del sistema operativo y del entorno de ejecución a través de `System.getProperties()` o `System.getProperty("key")`.

### Ejemplos comunes

- `user.name`: Nombre del usuario del sistema.
- `user.home`: Directorio home del usuario.
- `user.dir`: Directorio actual de trabajo.
- `java.version`: Versión de Java en uso.

```java
String username = System.getProperty("user.name");
System.out.println("username = " + username);

String javaVersion = System.getProperty("java.version");
System.out.println("java = " + javaVersion);

// Listar todas las propiedades disponibles
System.getProperties().list(System.out);
```

## Asignar Propiedades Personalizadas

Es posible agregar nuestras propias propiedades al objeto `Properties` del sistema o cargar configuraciones desde un archivo externo.

:::info Nota Importante
Para ejecutar este ejemplo, asegúrate de crear el archivo `src/config.properties` en la raíz del proyecto.
:::

**Contenido sugerido para `src/config.properties`:**
```properties
config.puerto.servidor=8080
config.autor.nombre=Andrés
config.autor.email=andres@correo.com
```

### Cargar desde archivo

```java
import java.io.FileInputStream;
import java.util.Properties;

FileInputStream archivo = new FileInputStream("src/config.properties");
Properties p = new Properties(System.getProperties());
p.load(archivo); // Cargar propiedades del archivo
p.setProperty("mi.propiedad.personalizada", "Valor personalizado");

System.setProperties(p); // Actualizar las propiedades del sistema
```

## Variables de Entorno

A diferencia de las propiedades (que son de Java), las variables de entorno son del Sistema Operativo (como `PATH`, `JAVA_HOME`, `USERNAME`). Se obtienen con `System.getenv()` que devuelve un `Map<String, String>`.

```java
import java.util.Map;

Map<String, String> varEnv = System.getenv();
String path = System.getenv("Path");
System.out.println("path = " + path);

// Recorrer todas las variables
for (String key : varEnv.keySet()) {
    System.out.println(key + " => " + varEnv.get(key));
}
```

## Ejecutar Programas del SO

La clase `Runtime` permite interactuar con el entorno de ejecución, permitiendo ejecutar comandos del sistema operativo.

:::warning Precaución
El comando a ejecutar depende del Sistema Operativo. Es importante detectar el SO antes de intentar abrir un programa específico.
:::

```java
Runtime rt = Runtime.getRuntime();
Process proceso;

if (System.getProperty("os.name").toLowerCase().startsWith("windows")) {
    proceso = rt.exec("notepad");
} else if (System.getProperty("os.name").toLowerCase().startsWith("mac")) {
    proceso = rt.exec("textedit");
} else {
    proceso = rt.exec("gedit");
}
proceso.waitFor(); // Espera a que el proceso termine
```
