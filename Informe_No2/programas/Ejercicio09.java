import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * Ejercicio 9 - Ejemplos de excepciones con try-catch.
 */
public class Ejercicio09 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // 1. ArithmeticException: division entre cero (enteros)
        System.out.println("=== 1. ArithmeticException ===");
        try {
            System.out.print("Numerador: ");
            int a = Integer.parseInt(sc.nextLine().trim());
            System.out.print("Denominador: ");
            int b = Integer.parseInt(sc.nextLine().trim());
            System.out.println("Resultado: " + (a / b));
        } catch (ArithmeticException e) {
            System.out.println("Error: No se puede dividir entre cero.");
        } catch (NumberFormatException e) {
            System.out.println("Error: Debe ingresar números enteros válidos.");
        }

        // 2. NumberFormatException: convertir texto a numero
        System.out.println("\n=== 2. NumberFormatException ===");
        try {
            System.out.print("Ingrese un número entero: ");
            int numero = Integer.parseInt(sc.nextLine().trim());
            System.out.println("Número ingresado: " + numero);
        } catch (NumberFormatException e) {
            System.out.println("Error: Debe ingresar un número válido.");
        }

        // 3. ArrayIndexOutOfBoundsException: indice fuera del vector
        System.out.println("\n=== 3. ArrayIndexOutOfBoundsException ===");
        int[] vector = {10, 20, 30};
        try {
            System.out.println("Posición 3: " + vector[3]); // solo existen 0, 1 y 2
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Error: La posición no existe en el vector (tamaño " + vector.length + ").");
        }

        // 4. NullPointerException: objeto null
        System.out.println("\n=== 4. NullPointerException ===");
        String texto = null;
        try {
            System.out.println("Longitud: " + texto.length());
        } catch (NullPointerException e) {
            System.out.println("Error: La variable texto vale null.");
        }

        // 5. StringIndexOutOfBoundsException: charAt fuera de rango
        System.out.println("\n=== 5. StringIndexOutOfBoundsException ===");
        String palabra = "Diego";
        try {
            System.out.println(palabra.charAt(5)); // solo existen 0..4
        } catch (StringIndexOutOfBoundsException e) {
            System.out.println("Error: La posición 5 no existe en \"" + palabra + "\".");
        }

        // 6. InputMismatchException: tipo incorrecto con Scanner
        System.out.println("\n=== 6. InputMismatchException ===");
        try {
            System.out.print("Ingrese su edad (número entero): ");
            int edad = sc.nextInt();
            System.out.println("Edad: " + edad);
        } catch (InputMismatchException e) {
            System.out.println("Error: Escribió un dato que no es un entero.");
        }

        sc.close();
    }
}
