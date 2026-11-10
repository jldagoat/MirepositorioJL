import java.util.Scanner;

/**
 * Ejercicio 15 - Dos vectores: notas y porcentajes. Calcula el promedio final.
 * Las notas se piden con Scanner; los porcentajes son opcionales
 * (por defecto los de la guia: 20, 10, 30, 20, 20).
 */
public class Ejercicio15 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double[] notas = new double[5];
        int[] porcentajes = {20, 10, 30, 20, 20};

        // Notas (con coma o punto decimal)
        for (int i = 0; i < notas.length; i++) {
            System.out.print("Nota " + (i + 1) + " (0 a 5): ");
            notas[i] = Double.parseDouble(sc.nextLine().trim().replace(',', '.'));
        }

        // Porcentajes opcionales
        System.out.print("¿Quieres ingresar tus propios porcentajes? (s/n): ");
        String quiere = sc.nextLine().trim();
        if (quiere.equalsIgnoreCase("s")) {
            int[] propios = new int[5];
            int suma = 0;
            for (int i = 0; i < propios.length; i++) {
                System.out.print("Porcentaje de la nota " + (i + 1) + " (sin el %): ");
                propios[i] = Integer.parseInt(sc.nextLine().trim());
                suma += propios[i];
            }
            if (suma == 100) {
                porcentajes = propios;
            } else {
                System.out.println("Los porcentajes suman " + suma + " y deben sumar 100. Se usarán los de la guía.");
            }
        }

        double promedio = 0;
        for (int i = 0; i < notas.length; i++) {
            promedio = (notas[i] * porcentajes[i] / 100) + promedio;
        }

        System.out.println("Promedio final: " + String.format("%.2f", promedio));
        System.out.println("Promedio final redondeado: " + Math.round(promedio));

        sc.close();
    }
}
