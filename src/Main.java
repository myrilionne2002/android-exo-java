

//Classe test
public class Main {
//Methode principal
    public static void main(String[] args) {
        // Demande de choix de l'animal
        System.out.println("CATEGORIE DE FELIN CHOISIR CHAT ");
        // Les méthodes d'un chat
        Chat n = new Chat("noire", 15);
        n.boire();
        n.manger();
        n.deplacement();
        n.crier();
        System.out.println(n.toString());

        System.out.println("-------------------**-----------------------");
        // Les méthodes de l'interface
        n.faireCalin();
        n.faireLeBeau();
       



        System.out.println(" CATEGORIEDE FELIN CHOISIR PANTHERE");
        // Les méthodes d'un tigre
        Panthère p = new Panthère ("noire", 150);
        p.boire();
        p.manger();
        p.deplacement();
        p.crier();
        System.out.println(p.toString());

        System.out.println("-------------------**-----------------------");
        // Les méthodes de l'interface
        p.faireLeBeau();
        p.faireCalin();

       
    }
}
