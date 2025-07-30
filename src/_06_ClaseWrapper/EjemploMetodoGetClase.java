package _06_ClaseWrapper;

import java.lang.reflect.Method;

public class EjemploMetodoGetClase {
    public static void main(String[] args) {
        String texto = "Hola que tal!";

        // Usamos Class<?> para evitar warnings de "raw types" y mejorar la seguridad
        // del tipo.
        Class<?> stringClass = texto.getClass();

        System.out.println("stringClass = " + stringClass);
        System.out.println("stringClass.getName() = " + stringClass.getName());
        System.out.println("stringClass.getSimpleName() = " + stringClass.getSimpleName());
        System.out.println("stringClass.getPackage() = " + stringClass.getPackage());

        // Para ver todos los métodos de la clase String
        System.out.println("\n=== Métodos de la clase String ===");
        for (Method metodo : stringClass.getMethods()) {
            System.out.println("metodo : " + metodo.getName());
        }

        Integer num = 34;
        Class<?> intClass = num.getClass();
        Class<?> objectClass = intClass.getSuperclass().getSuperclass();
        System.out.println("\nintClass = " + intClass);
        System.out.println("intClass.getName() = " + intClass.getName());
        System.out.println("Superclase de Integer es: " + intClass.getSuperclass());
        System.out.println("Superclase de Number es: " + objectClass);

        // Para ver todos los métodos de la clase Object
        System.out.println("\n=== Métodos de la clase Object ===");
        for (Method metodo : objectClass.getMethods()) {
            System.out.println("metodo : " + metodo.getName());
        }
    }
}
