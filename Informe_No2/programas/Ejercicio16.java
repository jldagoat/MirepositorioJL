import java.util.Scanner;

/**
 * Ejercicio 16 - Cambia las letras de 5 nombres por numeros (A=1 ... Z=27, con la Ñ=15).
 * Los nombres se piden con Scanner dentro de un ciclo while.
 */
public class Ejercicio16 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String nombres[] = new String[5];
        char caracteres[] = {'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L',
                             'M', 'N', '\u00D1', 'O', 'P', 'Q', 'R', 'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z'};
        int numeros[] = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15,
                         16, 17, 18, 19, 20, 21, 22, 23, 24, 25, 26, 27};

        // Pedir los 5 nombres con while
        int x = 0;
        while (x < 5) {
            System.out.print("Nombre " + (x + 1) + ": ");
            nombres[x] = sc.nextLine().trim().toUpperCase();
            x++;
        }

        // Convertir cada nombre
        x = 0;
        String nombreAuxiliar = "";
        System.out.println("\nResultados:");
        while (x < 5) {
            for (int j = 0; j < nombres[x].length(); j++) {
                for (int k = 0; k < caracteres.length; k++) {
                    if (nombres[x].charAt(j) == caracteres[k]) {
                        nombreAuxiliar = nombreAuxiliar + numeros[k]; // concatena (no suma)
                    }
                }
            }
            System.out.println(nombres[x] + " - " + nombreAuxiliar);
            nombres[x] = nombreAuxiliar;
            nombreAuxiliar = "";
            x++;
        }

        sc.close();
    }
}
