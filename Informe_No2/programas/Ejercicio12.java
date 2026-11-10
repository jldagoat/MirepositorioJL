import java.util.Scanner;

/**
 * Ejercicio 12 - Ciclo for: pares entre 0 y n, 10 numeros por renglon.
 * El ciclo externo arma cada renglon (cada renglon abarca 10 pares = 20 unidades)
 * y el ciclo interno imprime los numeros de ese renglon.
 */
public class Ejercicio12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Ingresa el valor de n: ");
        int n = sc.nextInt();

        System.out.println("Números pares entre 0 y " + n + " (10 por renglón):");
        for (int inicio = 0; inicio <= n; inicio += 20) {
            for (int i = inicio; i <= n && i < inicio + 20; i += 2) {
                System.out.print(i + " ");
            }
            System.out.println();
        }

        sc.close();
    }
}
