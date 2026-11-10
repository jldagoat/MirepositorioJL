import java.util.Scanner;

/**
 * Ejercicio 10 - Metodos de conversion de tipo de datos numericos (parse).
 * Integer.parseInt, Double.parseDouble, Float.parseFloat, Long.parseLong
 * y Boolean.parseBoolean.
 */
public class Ejercicio10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        try {
            System.out.print("Entero (Integer.parseInt): ");
            int entero = Integer.parseInt(sc.nextLine().trim());
            System.out.println("-> int: " + entero + " | entero + 1 = " + (entero + 1));

            System.out.print("Decimal (Double.parseDouble): ");
            double decimal = Double.parseDouble(sc.nextLine().trim().replace(',', '.'));
            System.out.println("-> double: " + decimal + " | decimal * 2 = " + (decimal * 2));

            System.out.print("Nota (Float.parseFloat): ");
            float nota = Float.parseFloat(sc.nextLine().trim().replace(',', '.'));
            System.out.println("-> float: " + nota);

            System.out.print("Número grande (Long.parseLong): ");
            long grande = Long.parseLong(sc.nextLine().trim());
            System.out.println("-> long: " + grande);

            System.out.print("Verdadero o falso (Boolean.parseBoolean): ");
            boolean activo = Boolean.parseBoolean(sc.nextLine().trim());
            System.out.println("-> boolean: " + activo);

        } catch (NumberFormatException e) {
            System.out.println("Error: uno de los valores no se pudo convertir a número.");
        }

        sc.close();
    }
}
