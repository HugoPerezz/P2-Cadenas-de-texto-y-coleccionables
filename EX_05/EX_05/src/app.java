/*5. Dada una cadena de texto con una contraseña, indicar si la contraseña es fuerte o
débil. Consideramos una contraseña fuerte si contiene 8 o más caracteres, y entre
ellos, por lo menos una mayúscula, una minúscula, un símbolo y un dígito*/

import java.util.regex.Matcher;
import java.util.regex.Pattern;
public class app {
    public static void main(String[] args) {
        Pattern pattern = Pattern.compile("^(?=.*[a-z])(?=.*[A-Z])(?=.*\\d)(?=.*\\W).{8,}$", Pattern.CASE_INSENSITIVE);
         Matcher matcher = pattern.matcher("Hugo:");
        boolean parametros = matcher.find();
    if(parametros) {
         System.out.println("La contraseña es suficientemente segura");
        } else {
      System.out.println("La contraseña no es suficientemente segura");
   }
 }
    }