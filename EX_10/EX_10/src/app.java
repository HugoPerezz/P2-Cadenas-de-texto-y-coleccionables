/*10. Escribe un programa para ordenar un HashMap por su valor (Investigar sobre
TreeMap, ArrayList, Collections.sort()… Existen varias soluciones posibles).
*/

import java.util.*;
public class app {
    public static void main(String[] args) {
        HashMap<String, String> capitales = new HashMap<String, String>();

        capitales.put("España", "Madrid");
        capitales.put("Alemania", "Berlin");
        capitales.put("Estonia", "Tallin");
        capitales.put("Finlandia", "Helsinki");

        TreeMap<String, String > t = new TreeMap<>();
        t.putAll(capitales);

        for (String key : t.keySet()) {
            System.out.println("Pais: " + key + ", Capital: " + t.get(key));
        }
    }
}
