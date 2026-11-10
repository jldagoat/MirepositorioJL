/**
 * Ejercicio 18 - Con la matriz del ejercicio 17:
 * suma, resta, multiplicacion, raiz cuadrada de la suma y division (multiplicacion / suma).
 * La multiplicacion de 20 numeros se sale del rango de un int, por eso se usa double.
 */
public class Ejercicio18 {
    public static void main(String[] args) {
        int numeros[][] = new int[5][4];
        int suma = 0;
        int resta = 0;
        double multiplicacion = 1; // inicia en 1; si empezara en 0 todo daria 0
        double division;
        double raiz;

        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 4; j++) {
                numeros[i][j] = (int) (Math.random() * 101);
            }
        }

        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 4; j++) {
                suma = suma + numeros[i][j];
                resta = resta - numeros[i][j];
                multiplicacion = multiplicacion * numeros[i][j];
                System.out.printf("%5d", numeros[i][j]);
            }
            System.out.println();
        }

        raiz = Math.sqrt(suma);
        if (suma != 0) {
            division = multiplicacion / suma;
        } else {
            division = 0;
        }

        System.out.println("\nLa suma es: " + suma);
        System.out.println("La resta es: " + resta);
        System.out.printf("La multiplicación es: %.4e%n", multiplicacion);
        System.out.println("La raíz cuadrada de la suma es: " + raiz);
        if (suma != 0) {
            System.out.printf("La división (multiplicación / suma) es: %.4e%n", division);
        } else {
            System.out.println("La división no se puede calcular porque la suma es 0.");
        }
    }
}
