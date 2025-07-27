package _04_Operadores;

import java.util.Scanner;

public class OperadorTernarioNumeroMayor {
    Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int max;
        int num1, num2, num3;
        System.out.print("Ingrese un numero: ");
        num1 = sc.nextInt();
        System.out.print("Ingrese un segundo numero: ");
        num2 = sc.nextInt();
        System.out.print("Ingrese un tercer numero: ");
        num3 = sc.nextInt();

        // Calculamos el mayor
        max = (num1 > num2) ? num1 : num2;
        max = (max > num3) ? max : num3;
        System.out.println("El máximo entre " + num1 + ", " + num2 + ", " + num3 + " es = " + max);
        sc.close();
    }
}
