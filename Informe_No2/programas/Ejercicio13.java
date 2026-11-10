import java.util.Scanner;

/**
 * Ejercicio 13 - Ciclo while: impares entre 0 y n, 12 numeros por renglon.
 * El while externo arma los renglones y el while interno cuenta hasta 12.
 */
public class Ejercicio13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Ingresa el valor de n: ");
        int n = sc.nextInt();

        System.out.println("Números impares entre 0 y " + n + " (12 por renglón):");
        int i = 1;
        while (i <= n) {
            int porRenglon = 0;
            while (porRenglon < 12 && i <= n) {
                System.out.print(i + " ");
                i += 2;
                porRenglon++;
            }
            System.out.println();
        }

        sc.close();
    }
}
