package _04_Operadores;

public class OperadoresUnarios {
    public static void main(String[] args) {
        int i = -5;

        // El operador unario de signo positivo (+) no cambia el valor del operando.
        int j = +i; // j = 1 * i => -5
        System.out.println("j = +i : " + j);

        // El operador unario de signo negativo (-) invierte el signo del operando.
        int k = -i; // k = (-1) * i => 5
        System.out.println("k = -i : " + k);

        // Ejemplo con un valor positivo
        i = 6;
        j = +i; // j toma el valor de i (6)
        System.out.println("\nCon i = 6, el valor de j = +i es: " + j);

        k = -i; // k toma el valor de i con el signo invertido (-6)
        System.out.println("Con i = 6, el valor de k = -i es: " + k);
    }
}
