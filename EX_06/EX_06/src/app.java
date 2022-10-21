/*6. Transforma los caracteres del String “Cadenas de texto y coleccionables” en ASCII.
Muéstralos de la siguiente manera:
ASCII: 67 es equivalente a: C
ASCII: …
*/

import java.nio.charset.StandardCharsets;
public class app {
    public static void main(String[] args) {

        String frase = "Cadenas de texto y coleccionables";

        String cadena= frase.trim().replaceAll(" ","").toLowerCase();

        char[] arrayfrase = cadena.toCharArray();
        String[] frase_letra = cadena.split("");

        for (int i = 0; i < cadena.length(); i++) {
            byte[] bytes = cadena.getBytes(StandardCharsets.US_ASCII);
            System.out.println("ASCII: " + bytes[i] + " es equivalente a la letra: " + arrayfrase[i]);
        }
    }
    }

