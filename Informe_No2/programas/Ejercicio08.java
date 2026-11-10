import java.util.Scanner;

/**
 * Ejercicio 8 - Metodos de String (Guia String y Excepciones).
 * Usa length, toUpperCase, toLowerCase, charAt, substring, equals,
 * equalsIgnoreCase, contains, replace y trim.
 */
public class Ejercicio08 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Escribe una frase (puedes dejar espacios al inicio y al final): ");
        String frase = sc.nextLine();

        System.out.println("\n--- Información de la frase ---");
        System.out.println("length():          " + frase.length());
        System.out.println("trim():            [" + frase.trim() + "]");
        System.out.println("length() sin trim: " + frase.trim().length());

        String limpia = frase.trim();
        System.out.println("toUpperCase():     " + limpia.toUpperCase());
        System.out.println("toLowerCase():     " + limpia.toLowerCase());

        if (!limpia.isEmpty()) {
            System.out.println("charAt(0):         " + limpia.charAt(0));
            int fin = Math.min(5, limpia.length());
            System.out.println("substring(0, " + fin + "):   " + limpia.substring(0, fin));
        }

        System.out.println("replace('a','e'):  " + limpia.replace("a", "e"));

        System.out.print("\nEscribe una palabra para buscar dentro de la frase: ");
        String buscada = sc.nextLine().trim();
        System.out.println("contains(\"" + buscada + "\"): " + limpia.contains(buscada));

        System.out.println("\n--- Comparar dos palabras ---");
        System.out.print("Primera palabra: ");
        String p1 = sc.nextLine().trim();
        System.out.print("Segunda palabra: ");
        String p2 = sc.nextLine().trim();

        System.out.println("equals():            " + p1.equals(p2));
        System.out.println("equalsIgnoreCase():  " + p1.equalsIgnoreCase(p2));

        sc.close();
    }
}
