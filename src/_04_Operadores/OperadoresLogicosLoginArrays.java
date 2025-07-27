package _04_Operadores;

import java.util.Scanner;

public class OperadoresLogicosLoginArrays {
    public static void main(String[] args) {
        // Se pueden declarar de forma literal
        String[] userNames = {"eugenia", "admin"};
        String[] passwords = {"12345", "12345"};

        /*
         * // O se pueden declarar y luego inicializar
         * String[] userNames = new String[2];
         * String[] passwords = new String[2];
         * userNames[0] = "eugenia";
         * userNames[1] = "admin";
         * passwords[0] = "12345";
         * passwords[1] = "12345";
         */

        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese el usuario: ");
        String userNameInput = scanner.next();

        System.out.print("Ingrese el password: ");
        String passwordInput = scanner.next();

        boolean isAuthenticated = false;

        // Iteramos con un for para buscar una coincidencia
        for (int i = 0; i < userNames.length; i++) {
            if (userNames[i].equals(userNameInput) && passwords[i].equals(passwordInput)) {
                isAuthenticated = true;
                break; // Si encontramos la coincidencia, salimos del bucle para ser más eficientes
            }
        }

        if (isAuthenticated) {
            System.out.println("Bienvenido, usuario: ".concat(userNameInput).concat("!"));
        } else {
            System.out.println("Usuario o contraseña incorrectos. Requiere autenticación.");
        }

        scanner.close(); // Buena práctica: cerrar el scanner para liberar recursos
    }
}
