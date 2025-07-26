package _02_Variables;

public class Variables {
    public static void main(String[] args) {
        // como declarar una variable
        // tipo nombreVariable = valor;

        int edad = 25; // Variable que almacena un número entero
        String nombre = "Juan"; // Variable que almacena texto
        System.out.println("Edad: " + edad + ", Nombre: " + nombre);

        // Variables flexibles
        var numero = 42; // int
        var decimal = 3.14; // double
        var texto = "Hola Mundo"; // String
        var caracter = 'A'; // char
        var booleano = true; // boolean

        System.out.println("Número: " + numero);
        System.out.println("Decimal: " + decimal);
        System.out.println("Texto: " + texto);
        System.out.println("Carácter: " + caracter);
        System.out.println("Booleano: " + booleano);
    }
}
