package _02_Variables;

public class PrimitivosCaracter {
    /**
     * CHARACTER
     */
    public static void main(String[] args) {
        char caracter = 'A';
        System.out.println("caracter = " + caracter);
        char caracterNumero = '5';
        System.out.println("caracterNumero = " + caracterNumero);
        // unicode
        char arroba = '\u0040';
        System.out.println("arroba = " + arroba);
        char simbolo = '@';
        System.out.println("simbolo = " + simbolo);
        System.out.println("arroba es igual a simbolo ? " + (arroba == simbolo));
        System.out.println("Char corresponde en byte: " + Character.BYTES); // 2
        System.out.println("Char corresponde en bites: " + Character.SIZE); // 16
        System.out.println("Valor mínimo de char : " + Character.MIN_VALUE);
        System.out.println("Valor máximo de char : " + Character.MAX_VALUE);
        // caracteres especiales
        char espacio1 = ' ';
        System.out.println("espacio = " + espacio1);
        char espacio2 = '\u0020';
        System.out.println("espacio2 = " + espacio2);
        char retroceso1 = '\b';
        char retroceso = '\t';
        char nuevaLinea = '\n'; // salta una línea hacia abajo
        char retornoCarro = '\r'; // varia si es windows, linux o Mac
        // En vez de retorno de carro:
        // System.getProperty("line.separator");
        // System.lineSeparator()
        System.out.println("retroceso = " + retroceso);
        System.out.println("retroceso1 = " + retroceso1);
        System.out.println("nuevaLinea = " + nuevaLinea);
        System.out.println("retornoCarro = " + retornoCarro);
    }
}
