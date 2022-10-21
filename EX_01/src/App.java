/*1. Lee una cadena de texto que contenga un nombre y los apellidos de alguien,
     devolviéndolos en formato “Apellidos, Iniciales”. Por ejemplo, si la entrada es
     “Francisco Mesas Cervilla”, la salida será: “Mesas Cervilla, F.”. Si la entrada es
     “Francisco José López Pérez”, la salida será: “López Pérez, F. J.”.*/

public class App {
    String nom = "Hugo Pérez Sánchez";

    public static void main(String[] args) {
        App app = new App();
        app.PartsNom();
    }

    public void PartsNom(){
        String[] partsNom = nom.split(" ");
        String partsNom1 = partsNom[partsNom.length-1];
        String partsNom2 = partsNom[partsNom.length-2];
        String partsNom3 = partsNom[partsNom.length-3];
        String partsNom0 = partsNom[0];

        char inicial = partsNom0.charAt(0);
        char inicial2 = partsNom3.charAt(0);

        if(partsNom.length>3){
            System.out.println(partsNom1 + " " + partsNom2 + " , " + inicial + ". " + inicial2 + ". ");
        }else{
            System.out.println(partsNom1 + " " + partsNom2 + " , " + inicial + ". ");
        }

    }
}





