/*2. Dadas dos cadenas introducidas por el usuario, hay que juntarlas carácter a carácter.
En caso de un espacio, ignorar ese carácter. Por ejemplo, si la entrada es “Fran” y
“Manu”, la salida será: “FMraanu”.*/

import java.util.Scanner;
public class app {


    public static void main(String[] args) {
        app ex02 = new app();
        app.Juntar();
    }
        public static void Juntar() {
            Scanner primerapalabra = new Scanner(System.in);
            Scanner segundapalabra = new Scanner(System.in);

            System.out.println("Ingresa la primera palabra:");
            String primera_palabra = primerapalabra.nextLine();
            System.out.println("Ingresa la segunda palabra: ");
            String segunda_palabra = segundapalabra.nextLine();

            char primeraletra1 = primera_palabra.charAt(0);
            char primeraletra2 = segunda_palabra.charAt(0);

            String palabra1_simple = primera_palabra.substring(1);
            String palabra2_simple = segunda_palabra.substring(1);
            System.out.print(primeraletra1);
            System.out.print(primeraletra2);

            char[] arr_primera_palabra = primera_palabra.toCharArray();
            char[] arr_segunda_palabra = segunda_palabra.toCharArray();
            int num_pal1 = arr_primera_palabra.length;
            int num_pal2 = arr_segunda_palabra.length;
            boolean mezcla = num_pal1 < num_pal2;

            char[] palabra_corta;
            if (mezcla == true) {
                palabra_corta = arr_primera_palabra;
            } else {
                palabra_corta = arr_segunda_palabra;
            }
            for (int i = 1; i < palabra_corta.length; i++) {
                System.out.print(arr_primera_palabra[i]);
                System.out.print(arr_segunda_palabra[i]);
            }
            if (primera_palabra.length() < segunda_palabra.length()) {
                System.out.println(segunda_palabra.substring(primera_palabra.length()));
            } else {
                System.out.println(primera_palabra.substring(segunda_palabra.length()));
            }
            System.out.println("El resultado de las dos palabras es el siguiente:" + primeraletra1 + "" + primeraletra2 + "" + palabra1_simple + "" + palabra2_simple);
        }
    }

