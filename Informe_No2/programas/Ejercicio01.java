import java.util.Scanner;

/**
 * Ejercicio 1 - Ejemplo del documento de clase "Scanner_JAVA.pdf".
 * Lee nombre y edad, suma dos numeros y valida una entrada.
 */
public class Ejercicio01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // 1. Ejemplo completo del documento: nombre (String) y edad (int)
        System.out.print("Nombre: ");
        String nombre = scanner.nextLine();

        System.out.print("Edad: ");
        int edad = scanner.nextInt();
        scanner.nextLine(); // limpiar el salto de linea que deja nextInt()

        System.out.println(nombre + " tiene " + edad + " años.");

        // 2. Leer numeros para calculos
        System.out.print("Ingresa el primer número: ");
        int a = scanner.nextInt();
        System.out.print("Ingresa el segundo número: ");
        int b = scanner.nextInt();
        System.out.println("Suma: " + (a + b));

        // 3. Validar entradas con hasNextInt()
        System.out.print("Ingresa un número entero: ");
        if (scanner.hasNextInt()) {
            int numero = scanner.nextInt();
            System.out.println("Ingresaste el número " + numero);
        } else {
            System.out.println("¡Debes ingresar un número!");
        }

        scanner.close();
    }
}
