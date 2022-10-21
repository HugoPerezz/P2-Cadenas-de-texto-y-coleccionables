/*3. Dada una frase y un carácter introducido por el usuario, indica en qué posiciones se
encuentra ese carácter sin utilizar indexOf.*/

public class app {
    public static void main(String[] args) {

        String frase = "Visca el barça i visca Catalunya";
for(int i= 0; i<frase.length();i++){
    if(frase.charAt(i)!='a'){
        System.out.println("El caràcter "+ i + " no és una A");
    } else {
        System.out.println("El caràcter "+ i + " és una A");
    }
}
    }
}
