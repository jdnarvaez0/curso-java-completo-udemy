package _08_Clase_Date_y_Calendar;

/*
Tarea: Calcular edad
Calcular edad ingresando la fecha de nacimiento de una persona.
 */

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

public class tarea {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd");

        System.out.println("Ingrese su fecha de nacimiento (yyyy-MM-dd): ");
        String fechaNacimiento = s.nextLine();

        try {
            Date fechaNacimientoDate = format.parse(fechaNacimiento);
            Calendar fechaNacimientoCalendar = Calendar.getInstance();
            fechaNacimientoCalendar.setTime(fechaNacimientoDate);

            Calendar fechaActual = Calendar.getInstance();

            int edad = fechaActual.get(Calendar.YEAR) - fechaNacimientoCalendar.get(Calendar.YEAR);

            if (fechaActual.get(Calendar.DAY_OF_YEAR) < fechaNacimientoCalendar.get(Calendar.DAY_OF_YEAR)) {
                edad--;
            }

            System.out.println("Su edad es: " + edad);
        } catch (ParseException e) {
            System.out.println("Formato de fecha invalido. Por favor, ingrese la fecha en el formato yyyy-MM-dd.");
        }
    }
}
