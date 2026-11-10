import java.util.Scanner;

/**
 * Ejercicio 11 - Ciclo for: numeros pares entre 0 y n (ascendente).
 */
public class Ejercicio11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Ingresa el valor de n: ");
        int n = sc.nextInt();

        System.out.println("Números pares entre 0 y " + n + ":");
        for (int i = 0; i <= n; i += 2) {
            System.out.print(i + " ");
        }
        System.out.println();

        sc.close();
    }
}
