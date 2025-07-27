package _04_Operadores;

import java.util.Scanner;

public class OperadoresLogicosLoginArraysTernario {
    public static void main(String[] args) {
        String[] userNames = { "eugenia", "admin" };
        String[] passwords = { "12345", "12345" };

        Scanner scanner = new Scanner(System.in);
        boolean isAuthenticated = false;

        System.out.print("Ingrese el usuario: ");
        String userNameInput = scanner.next();

        System.out.print("Ingrese el password: ");
        String passwordInput = scanner.next();

        // Iteramos con un for para buscar una coincidencia
        for (int i = 0; i < userNames.length; i++) {
            if (userNames[i].equals(userNameInput) && passwords[i].equals(passwordInput)) {
                isAuthenticated = true;
                break; // Si encontramos la coincidencia, salimos del bucle para ser más eficientes
            }
        }

        // Usamos el operador ternario para definir el mensaje final
        String mensaje = isAuthenticated
                ? "Bienvenido, usuario: ".concat(userNameInput).concat("!")
                : "Usuario o contraseña incorrectos. \nLo siento, requiere autenticación.";

        System.out.println(mensaje);

        scanner.close(); // Buena práctica: cerrar el scanner para liberar recursos
    }
}
