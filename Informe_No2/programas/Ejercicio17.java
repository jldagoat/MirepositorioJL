/**
 * Ejercicio 17 - Matriz de 5x4 con numeros aleatorios entre 0 y 100,
 * mostrada en forma de tabla.
 */
public class Ejercicio17 {
    public static void main(String[] args) {
        int numeros[][] = new int[5][4];

        // Llenar: numero entero aleatorio entre 0 y 100 (ambos incluidos)
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 4; j++) {
                numeros[i][j] = (int) (Math.random() * 101);
            }
        }

        // Mostrar en forma de tabla
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 4; j++) {
                System.out.printf("%5d", numeros[i][j]);
            }
            System.out.println();
        }
    }
}
