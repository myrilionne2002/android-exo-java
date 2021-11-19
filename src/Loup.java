
public class Loup extends Canin implements Milou {

    public   Loup () {
    
    }
    
    public Loup(String couleur, int poids){
      this.couleur = couleur;
      this.poids = poids;
    }                
  //Methode crier
    void crier() {
      System.out.println("Je hurle a la plaine lune !");
    }        
 
          
  //Methode faireLeBeau
  public void faireLeBeau() {
      System.out.println("Je fais le beau !");
    }
  
    public void faireCalin() {
      System.out.println("Je fais à ma maitresse !");
    }
  }
 