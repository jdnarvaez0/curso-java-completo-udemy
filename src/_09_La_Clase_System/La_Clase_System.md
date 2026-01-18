# La Clase System en Java

La clase `System` en Java contiene varios atributos y métodos útiles. No se puede instanciar, por lo que todos sus miembros son estáticos. Proporciona acceso a recursos del sistema, como la entrada/salida estándar, propiedades del sistema y variables de entorno.

## Contenido

1. [Propiedades del Sistema](#1-propiedades-del-sistema)
2. [Asignar Propiedades Personalizadas](#2-asignar-propiedades-personalizadas)
3. [Variables de Entorno](#3-variables-de-entorno)
4. [Ejecutar Programas del Sistema Operativo](#4-ejecutar-programas-del-sistema-operativo)

---

## 1. Propiedades del Sistema

Java nos permite acceder a configuraciones y propiedades del sistema operativo y del entorno de ejecución a través de `System.getProperties()` o `System.getProperty("key")`.

**Archivo:** [`EjemploPropiedadesDeSistema.java`](./EjemploPropiedadesDeSistema.java)

### Ejemplos comunes:
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

---

## 2. Asignar Propiedades Personalizadas

Es posible agregar nuestras propias propiedades al objeto `Properties` del sistema o cargar configuraciones desde un archivo externo (por ejemplo, `config.properties`).

**Archivo:** [`EjemploAsignarPropiedadesDeSistema.java`](./EjemploAsignarPropiedadesDeSistema.java)

### Cargar desde archivo:
El ejemplo intenta leer un archivo `src/config.properties`.

**Nota:** Asegúrate de crear el archivo `src/config.properties` en la raíz del proyecto (o ajusta la ruta) con contenido como:
```properties
config.puerto.servidor=8080
config.autor.nombre=Andrés
config.autor.email=andres@correo.com
```

### Código destacado:
```java
FileInputStream archivo = new FileInputStream("src/config.properties");
Properties p = new Properties(System.getProperties());
p.load(archivo); // Cargar propiedades del archivo
p.setProperty("mi.propiedad.personalizada", "Valor personalizado");

System.setProperties(p); // Actualizar las propiedades del sistema
```

---

## 3. Variables de Entorno

A diferencia de las propiedades (que son de Java), las variables de entorno son del Sistema Operativo (como `PATH`, `JAVA_HOME`, `USERNAME`).

**Archivo:** [`EjemploVariablesDeEntorno.java`](./EjemploVariablesDeEntorno.java)

Se obtienen con `System.getenv()` que devuelve un `Map<String, String>`.

```java
Map<String, String> varEnv = System.getenv();
String path = System.getenv("Path");
System.out.println("path = " + path);

// Recorrer todas las variables
for (String key : varEnv.keySet()) {
    System.out.println(key + " => " + varEnv.get(key));
}
```

---

## 4. Ejecutar Programas del Sistema Operativo

La clase `Runtime` permite interactuar con el entorno de ejecución, permitiendo ejecutar comandos del sistema operativo.

**Archivo:** [`EjemploEjecutarProgramaSO.java`](./EjemploEjecutarProgramaSO.java)

El siguiente ejemplo abre un editor de texto dependiendo del Sistema Operativo detectado:

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
