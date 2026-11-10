import java.util.Scanner;

/**
 * Ejercicio 7 - Menu de 5 productos con switch case (cafeteria).
 * Imprime el valor del producto escogido.
 */
public class Ejercicio07 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("===== MENÚ - CAFETERÍA =====");
        System.out.println("1. Café ............ $3000");
        System.out.println("2. Empanada ........ $2500");
        System.out.println("3. Jugo natural .... $4500");
        System.out.println("4. Sándwich ........ $7000");
        System.out.println("5. Postre del día .. $5000");
        System.out.print("Escoge una opción (1-5): ");

        int opcion;
        try {
            opcion = Integer.parseInt(sc.nextLine().trim());
        } catch (NumberFormatException e) {
            opcion = -1; // cae en default
        }

        switch (opcion) {
            case 1:
                System.out.println("Café: $3000");
                break;
            case 2:
                System.out.println("Empanada: $2500");
                break;
            case 3:
                System.out.println("Jugo natural: $4500");
                break;
            case 4:
                System.out.println("Sándwich: $7000");
                break;
            case 5:
                System.out.println("Postre del día: $5000");
                break;
            default:
                System.out.println("Opción no válida.");
        }

        sc.close();
    }
}
