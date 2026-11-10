import java.util.Scanner;

/**
 * Ejercicio 3 - Pide nombre, edad y capital.
 * Imprime un mensaje SOLO si es mayor de edad y tiene mas de un millon de pesos.
 */
public class Ejercicio03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Nombre: ");
        String nombre = sc.nextLine();

        System.out.print("Edad: ");
        int edad = Integer.parseInt(sc.nextLine().trim());

        System.out.print("Capital (en pesos): ");
        double capital = Double.parseDouble(sc.nextLine().trim().replace(',', '.'));

        if (edad >= 18 && capital > 1000000) {
            System.out.println("¡Felicitaciones " + nombre + "! Eres mayor de edad y tienes un buen capital, ¡a invertirlo con inteligencia!");
        }

        sc.close();
    }
}
