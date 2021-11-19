public class Panthère extends Felin implements Milou {
  // constructeur par defaut d'une Panthère
  public Panthère() {

  }
  // constructeur par defaut d'une Panthère

  public Panthère(String couleur, int poids) {
    this.couleur = couleur;
    this.poids = poids;
  }
 //Methode Crier
  void crier() {
    System.out.println("Je grogne très fort !");
  }
 //Methode faireLeBeau
  public void faireLeBeau() {
    System.out.println("Je fais le beau!");
  }
//Methode faireCalin
public void faireCalin() {
  System.out.println("Je fais un calin à ma maitresse!");
}
  
  }
