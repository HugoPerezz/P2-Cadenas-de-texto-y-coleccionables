/*7. Escribe un programa que atraviese (itere) un ArrayList usando Iterator*/

import java.util.ArrayList;
import java.util.Iterator;
public class app {
    public static void main(String[] args) {
        ArrayList<String> equipos = new ArrayList<String>();
        equipos.add("Barça");
        equipos.add("Madrid");
        equipos.add("Sevilla");
        equipos.add("Betis");

        Iterator<String> it = equipos.iterator();

        System.out.println(it.next());
        String item;
        while(it.hasNext()) {
            System.out.println(item = it.next());
            if(item.equals("Barça")){
                it.remove();
            }
        }
        System.out.println(equipos);
    }
}
