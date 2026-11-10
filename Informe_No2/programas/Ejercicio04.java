import java.util.Scanner;

/**
 * Ejercicio 4 - Ejercicio de la pagina 11 de "Fundamentos de Java_Guia_2.pdf"
 * (el cafe), pero pidiendo las respuestas con Scanner.
 * Se usa equals() para comparar texto (no ==).
 */
public class Ejercicio04 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("- ¿Quieres un café? (Si/No)");
        String respuesta1 = sc.nextLine().trim();

        if (respuesta1.equalsIgnoreCase("Si") || respuesta1.equalsIgnoreCase("Sí")) {
            System.out.println("- ¿Vas a comprarlo? (Si/No)");
            String respuesta2 = sc.nextLine().trim();

            if (respuesta2.equalsIgnoreCase("Si") || respuesta2.equalsIgnoreCase("Sí")) {
                System.out.println("- Comprar café");
            } else {
                System.out.println("- Hacer el café");
            }
            System.out.println("- Beber");
        } else {
            System.out.println("- Sigue estudiando");
        }

        sc.close();
    }
}
