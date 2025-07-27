package _04_Operadores;

import java.util.Scanner;

public class OperadorTernario {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Operador Ternario: (condicion)? siEsTrue : siEsFalse;
        // Es un if-else abreviado en una línea.
        System.out.print("Ingrese un número entero: ");
        int numero = sc.nextInt();
        String resultado = (numero == 5) ? "Si es verdadero" : "Si es falso";
        System.out.println("resultado = " + resultado);

        String estado;
        double promedio;
        double matematicas;
        double ciencia;
        double historia;

        System.out.print("Ingrese la nota de matemáticas (0-10): ");
        matematicas = sc.nextDouble();
        System.out.print("Ingrese la nota de ciencia (0-10): ");
        ciencia = sc.nextDouble();
        System.out.print("Ingrese la nota de historia (0-10): ");
        historia = sc.nextDouble();

        // Calcular el promedio
        promedio = (matematicas + ciencia + historia) / 3;

        // Obtener el estado (Aprobado/Desaprobado) dependiendo del promedio
        estado = (promedio >= 6.00) ? "Aprobado" : "Desaprobado";
        System.out.println("Estado = " + estado);
    }
}
