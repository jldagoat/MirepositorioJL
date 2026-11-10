import java.util.Scanner;

/**
 * Ejercicio 6 - Limites de velocidad en Colombia (Guia 2, pag. 15).
 * 30 km/h zonas escolares, 60 vias urbanas, 80 vias rurales, 100 rutas nacionales.
 * Segun una velocidad X, indica a que grupo pertenece y si infringe el limite.
 */
public class Ejercicio06 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Ingresa tu velocidad (km/h): ");
        int velocidad = sc.nextInt();

        if (velocidad < 0) {
            System.out.println("Velocidad no válida.");
        } else if (velocidad <= 30) {
            System.out.println("Zonas Escolares (límite 30 km/h): no estás infringiendo el límite.");
        } else if (velocidad <= 60) {
            System.out.println("Vías Urbanas (límite 60 km/h): no estás infringiendo el límite.");
        } else if (velocidad <= 80) {
            System.out.println("Vías Rurales (límite 80 km/h): no estás infringiendo el límite.");
        } else if (velocidad <= 100) {
            System.out.println("Rutas Nacionales (límite 100 km/h): no estás infringiendo el límite.");
        } else {
            System.out.println("Estás infringiendo los límites de velocidad (más de 100 km/h).");
        }

        sc.close();
    }
}
