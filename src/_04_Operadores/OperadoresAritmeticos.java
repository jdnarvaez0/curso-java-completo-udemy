package _04_Operadores;

import java.util.Scanner;

public class OperadoresAritmeticos {
    public static void main(String[] args) {
        int i = 5;
        int j = 4;

        // operador suma : +
        int suma = i + j;
        System.out.println("suma = " + suma);
        // Cuando se encuentra un String, el resto de operadores '+' se comportan como concatenación
        System.out.println("i + j : " + i + j); // Imprime "i + j : 54"
        // Los paréntesis cambian la precedencia, forzando la suma aritmética primero
        System.out.println("i + j : " + (i + j)); // Imprime "i + j : 9"
        // La suma se realiza antes de encontrar el String
        System.out.println(i + j + ": i + j"); // Imprime "9: i + j"

        // operador resta: -
        int resta = i - j;
        System.out.println("resta = " + resta);
        // Para la resta, los paréntesis son necesarios para que no dé un error de compilación al intentar restar un int de un String
        System.out.println("i - j : " + (i - j));

        // operador multiplicación: *
        int multi = i * j;
        System.out.println("multiplicación = i * j : " + multi);

        // operador división: /
        // La división entre enteros trunca el resultado (elimina la parte decimal)
        int div = i / j;
        System.out.println("div = " + div); // Imprime 1
        // Para obtener un resultado con decimales, al menos uno de los operandos debe ser float o double
        float div2 = (float) i / j; // Basta con castear uno de los dos
        System.out.println("div2 = " + div2); // Imprime 1.25

        // operador resto (módulo)
        int resto = i % j;
        System.out.println("resto = " + resto); // Imprime 1

        // Usamos Scanner para mantener la consistencia con una aplicación de consola
        Scanner scanner = new Scanner(System.in);
        System.out.print("\nIngrese un número para verificar si es par o impar: ");
        int numero = scanner.nextInt();

        if (numero % 2 == 0) {
            System.out.println("El número " + numero + " es par.");
        } else {
            System.out.println("El número " + numero + " es impar.");
        }
        scanner.close(); // Es una buena práctica cerrar el scanner para liberar recursos
    }
}
