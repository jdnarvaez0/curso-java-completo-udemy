package _04_Operadores;

public class OperadorInstanceOf {
    public static void main(String[] args) {
        String texto = "Creando un objeto de la clase String...que tal!";
        Integer num = 7;
        Double decimal = 45.56;

        // Todas las clases derivan de Object
        // Es la clase padre de todos los objetos

        // Las clases wrapper como Double, Integer, Short, Long, etc., heredan de Number

        boolean bool = texto instanceof String;
        System.out.println("texto es del tipo String ? " + bool);
        bool = texto instanceof Object;
        System.out.println("texto es del tipo Object ? " + bool);

        bool = num instanceof Integer;
        System.out.println("num es del tipo Integer ? " + bool);
        bool = num instanceof Number;
        System.out.println("num es del tipo Number ? " + bool);
        bool = num instanceof Object;
        System.out.println("num es del tipo Object ? " + bool);
        // La siguiente línea daría un error de compilación porque Integer y Short
        // son clases "hermanas" y no hay una relación de herencia que permita el
        // casteo.
        // bool = num instanceof Short;

        bool = decimal instanceof Double;
        System.out.println("decimal es del tipo Double ? " + bool);

        bool = decimal instanceof Object;
        System.out.println("decimal es del tipo Object ? " + bool);

        bool = decimal instanceof Number;
        System.out.println("decimal es del tipo Number ? " + bool);
    }
}
