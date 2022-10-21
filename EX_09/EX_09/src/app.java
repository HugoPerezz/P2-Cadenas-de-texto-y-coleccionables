/*9. Escribe un programa que añada elementos a un hashSet y muestra el contenido.*/

import java.util.HashSet;
public class app {
    public static void main(String[] args) {
        HashSet<String> colores =
                new HashSet<String>();

        colores.add("Blanco");
        colores.add("Azul");
        colores.add("Verde");
        colores.add("Rojo");
        colores.add("Amarillo");
        colores.add(null);
        colores.add("Amarillo");
        System.out.println(colores);

    }
}
