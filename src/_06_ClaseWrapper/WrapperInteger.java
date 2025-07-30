package _06_ClaseWrapper;

public class WrapperInteger {
    public static void main(String[] args) {
        // El valor 32768 excede el límite máximo de un short (32767).
        // Usaremos un valor que quepa para evitar el desbordamiento (overflow).
        int intPrimitivo = 32767;

        // 1. Boxing: Convertir un primitivo a un objeto Wrapper.
        // Forma explícita (recomendada antes de Java 5)
        Integer intObjeto = Integer.valueOf(intPrimitivo);
        // Forma implícita (autoboxing, la forma moderna y preferida)
        Integer intObjeto2 = intPrimitivo;

        System.out.println("Objeto Integer (creado con valueOf): " + intObjeto);
        System.out.println("Objeto Integer (creado con autoboxing): " + intObjeto2);

        // 2. Unboxing: Convertir un objeto Wrapper a un primitivo.
        // Forma implícita (auto-unboxing)
        int num = intObjeto;
        System.out.println("\nPrimitivo (obtenido con auto-unboxing): " + num);
        // Forma explícita
        int num2 = intObjeto.intValue();
        System.out.println("Primitivo (obtenido con intValue()): " + num2);

        // 3. Conversión desde String
        String valorTvLcd = "67000";
        Integer valor = Integer.valueOf(valorTvLcd);
        System.out.println("\nInteger creado desde un String: " + valor);

        // 4. Conversiones a otros tipos primitivos (Narrowing Conversion)
        // Estas conversiones pueden causar pérdida de datos si el valor no cabe.

        // Conversión a short. El valor 32767 es el máximo para un short.
        Short shortObjeto = intObjeto.shortValue();
        System.out.println("\nConversión a short: " + shortObjeto);

        // Conversión a byte. El rango de byte es de -128 a 127.
        // El valor 32767 se truncará, causando pérdida de información.
        Byte byteObjeto = intObjeto.byteValue();
        System.out.println("Conversión a byte (con pérdida de datos): " + byteObjeto);

        // Conversión a long. No hay pérdida de datos ya que long es más grande.
        Long longObjeto = intObjeto.longValue();
        System.out.println("Conversión a long: " + longObjeto);
    }
}
