import java.util.Scanner;

/**
 * Ejercicio 14 - Menu del ejercicio 7 dentro de un ciclo while.
 * Despues de cada producto pregunta si se vuelve al menu o se sale.
 */
public class Ejercicio14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean seguir = true;

        while (seguir) {
            System.out.println("\n===== MENÚ - CAFETERÍA =====");
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
                opcion = -1;
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

            System.out.print("¿Volver al menú (1) o salir (2)? ");
            String respuesta = sc.nextLine().trim();
            while (!respuesta.equals("1") && !respuesta.equals("2")) {
                System.out.print("Escribe 1 para volver al menú o 2 para salir: ");
                respuesta = sc.nextLine().trim();
            }
            if (respuesta.equals("2")) {
                seguir = false;
            }
        }

        System.out.println("¡Gracias por tu visita!");
        sc.close();
    }
}
