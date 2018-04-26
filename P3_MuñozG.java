/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package p3_muñozg;
import java.util.Scanner;
/**
 *
 * @author emunoz
 */
public class P3_MuñozG {

    /**
     * @param args the command line arguments
     */
    private static final int NOIA = 1;
    private static final int NOI = 2;
    private static final int INF = 1;
    private static final int JUN = 2;
    private static final int SEN = 3;
    private static final int ID_MIN = 1;
    private static final int ID_MAX = 2000;
    private static final int ANY_MIN = 1900;
    private static final int ANY_MAX = 2100;
    private static final int MES_MIN = 1;
    private static final int MES_MAX = 12;
    private static final int DIA_MIN = 1;
    private static final int DIA_MAX = 31;
    private static final int PUNT_MIN = 2;
    private static final int PUNT_MAX = 30;
    private static final int CONT_MAX = 3; //valor estatic, contador máxim per fer control de preguntes
    private static final int RESP_SI = 1; //valor correcte de la resposta si vol tornar a inscriure altre participant
    private static final int RESP_NO = 2; //valor correcte de la resposta si vol finalitzar l'inscripció dels participants
    public static void main(String[] args) {
        //////////////
        //VARIABLES//
        ////////////
        
        Scanner teclado = new Scanner(System.in); //variable per invocar l'eina de lectura de dades del teclat
        boolean repeat, tipOK, respOK, totOK;
        repeat = false;
        respOK = false;
        totOK = false;
        int[] id = new int[10]; //contindrá els identificadors creats per l'usuari, màxim 10 usuaris.
        int respRepeat;
        ////////////////////////////////
        //PREGUNTES I GESTIÓ D'ERRORS//
        //////////////////////////////
        do {
            System.out.println("Vols inscriure altre participant? 1:Si / 2:no");
            do {
                tipOK = teclado.hasNextInt();//es tipus int?
                if (tipOK) { //si es tipus int ...
                    respRepeat = teclado.nextInt(); //assigna el valor introduït a aquesta variable.
                    teclado.nextLine(); //Neteja memòria buffer
                    if (respRepeat == RESP_SI || respRepeat == RESP_NO) {//si respRepeat es igual a 1 o 2...
                        respOK = true;//La resposta es l'esperada i sortira del bucle de la pregunta
                        if (respRepeat == RESP_SI) { // si respRepeat es igual a 1 ...
                            repeat = true; //torna a inscriure altre usuari
                        }
                        else if (respRepeat == RESP_NO) { // ales hores si respRepeat es igual a 2 ...
                            repeat = false; //S'acabat el registre, no es vol registrar més usuaris.
                        }
                    }
                    else {
                        System.out.println("La resposta no es correcte, torna a respondre la pregunta");
                        respOK = false;//la resposta no es l'esperada i torna a executar el bucle de la pregunta
                    }
                }
                else {//si no es tipus int ...
                    teclado.nextLine();//Neteja memòria buffer.
                    System.out.println("El tipus de dada no es correcte, contesta amb les dades demanades");
                    System.out.println("_________________________________________________________________");
                }
            } while (!respOK);
        } while (repeat);
    }
}
