package repeticioRepte1;
import java.util.Scanner;
public class repeticioRepte1 {
  public static void main (String [] args) {
    /////////////////////////////////////////////////////////////
    //Bloc de variables i subvariables pel tractament de dades//
    ///////////////////////////////////////////////////////////
    
    boolean respostaOK = false;
    lector = new Scanner(System.in);
    //variable que conte la resposta de l'usuari
    int car = 0;
    //variable que conté el contador
    int contador = 0;
    
    ////////////////////////////////////////
    //Bloc de preguntes i gestió d'errors//
    //////////////////////////////////////
    
    //Pregunta a l'usuari quants caracters '-' vol que és repeteixi
    System.out.println("Cuants càracters "-" vols que és mostri per pantalla");
    respostaOK = lector.hasNextInt();
    if (repostaOK) {
      car = lector.nextInt();
      lector.nextLine();
      //fer un while, compara contador amb car, si és true
    }
    else {
      System.out.println("Les dades introduides no són correctes");
    }
    
  }
}
