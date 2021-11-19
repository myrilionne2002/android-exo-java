public class Chat extends Felin implements Milou {

    public Chat(){
  
    }
    public Chat(String couleur, int poids){
      this.couleur = couleur;
      this.poids = poids;
    }                
  //Methode crier
    void crier() {
      System.out.println("Je miole  sur le toit !");
    }        
  //Methode faireCalin
  public void faireCalin() {
      System.out.println("Je te fais un GROS CÂLIN");               
    }
  //Methode faireLeBeau
  public void faireLeBeau() {
      System.out.println("Je fais le beau !");
    }
  
    
  }