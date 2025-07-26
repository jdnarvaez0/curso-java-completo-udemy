package _02_Variables;

public class Primitivos_Enteros {
    byte numeroByte = 127;
    public static void main(String[] args) {
        // System.out.println("numeroByte = " + numeroByte);
        System.out.println("tipo byte corresponde en byte a " + Byte.BYTES);
        System.out.println("tipo byte corresponde en bites a " + Byte.SIZE);
        System.out.println("valor máximo de un byte: " + Byte.MAX_VALUE);
        System.out.println("valor mínimo de un byte: " + Byte.MIN_VALUE);

        short numeroShort = 32767; // Max value for short
        System.out.println("numeroShort = " + numeroShort);
        System.out.println("tipo short corresponde en byte a " + Short.BYTES);
        System.out.println("tipo short corresponde en bites a " + Short.SIZE);
        System.out.println("valor máximo de un short: " + Short.MAX_VALUE);
        System.out.println("valor mínimo de un short: " + Short.MIN_VALUE);

        int numeroInt = 2147483647; // Max value for int
        System.out.println("numeroInt = " + numeroInt);

        System.out.println("tipo int corresponde en byte a " + Integer.BYTES);
        System.out.println("tipo int corresponde en bites a " + Integer.SIZE);
        System.out.println("valor máximo de un int: " + Integer.MAX_VALUE);
        System.out.println("valor mínimo de un int: " + Integer.MIN_VALUE);
        
        long numeroLong = 9223372036854775807L; // Max value for long
        System.out.println("numeroLong = " + numeroLong);

        System.out.println("tipo long corresponde en byte a " + Long.BYTES);
        System.out.println("tipo long corresponde en bites a " + Long.SIZE);
        System.out.println("valor máximo de un long: " + Long.MAX_VALUE);
        System.out.println("valor mínimo de un long: " + Long.MIN_VALUE);
        
        // The literal 9223372036854775808 is out of range for a long.
        // If you intend this to be a float, it's too large and will lose precision.
        // If you intend it to be a long, it exceeds Long.MAX_VALUE.
        var numeroVar = 9223372036854775807L; // Changed to a long literal within range
        System.out.println("numeroVar = " + numeroVar);
    }
}
