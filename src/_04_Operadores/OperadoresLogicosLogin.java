package _04_Operadores;

import java.util.Scanner;

public class OperadoresLogicosLogin {
    String userName = "eugenia";
    String userName2 = "admin";
    String password = "123";
    String password2 = "123";

    public static void main(String[] args) {
        String userName = "eugenia";
        String userName2 = "admin";
        String password = "123";
        String password2 = "123";
        boolean isAutheticated = false;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese el usuario : ");
        String userNameInput = scanner.next();
        System.out.println("Ingrese el password: ");
        String passwordInput = scanner.next();

        // con || evalúo más de n usuario
        if (userName.equals(userNameInput) && password.equals(passwordInput) || userName2.equals(userNameInput) && password2.equals(passwordInput)) {
            isAutheticated = true;
        } else {
            System.out.println("Usuario o contraseña incorrectas :(");
        }

        if (isAutheticated) {
            System.out.println("Bienvenido, usuario: ".concat(userNameInput).concat("!"));
        } else {
            System.out.println("Requiere autenticación");
        }
    }
}
