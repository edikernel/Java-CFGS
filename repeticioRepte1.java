package repeticioRepte1;
import java.util.Scanner;
public class repeticioRepte1 {
  public static void main (String [] args) {
    /////////////////////////////////////////////////////////////
    //Bloc de variables i subvariables pel tractament de dades//
    ///////////////////////////////////////////////////////////
    boolean respostaOK = false;
    lector = new Scanner(System.in);
    car = 0;
    
    //Pregunta a l'usuari quants caracters '-' vol que és repeteixi
    System.out.println("Cuants càracters "-" vols que és mostri per pantalla");
    respostaOK = lector.hasNextInt();
    if (repostaOK) {
      car = lector.nextInt();
      lector.nextLine();
    }
    else {
      System.out.println("Les dades introduides no són correctes");
    }
    
  }
}
