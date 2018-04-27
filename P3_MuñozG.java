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
    private static final int MAL_MAX = 3; //valor estatic, contador máxim per fer control de preguntes
    private static final int RESP_SI = 1; //valor correcte de la resposta si vol tornar a inscriure altre participant
    private static final int RESP_NO = 2; //valor correcte de la resposta si vol finalitzar l'inscripció dels participants
    public static void main(String[] args) {
        //////////////
        //VARIABLES//
        ////////////
        
        Scanner teclado = new Scanner(System.in); //variable per invocar l'eina de lectura de dades del teclat
        boolean repeat, tipOK, respOK, totOK;
        repeat = false;//valor per defecte, repetició del programa?
        respOK = false;//la resposta es l'esperada?
        totOK = true;//tot el programa es OK.
        int[] id = new int[10]; //contindrá els identificadors creats per l'usuari, màxim 10 usuaris.
        int respRepeat; //la resposta de l'usuari, 1 o 0, repeteix o no
        int id;
        int contMal = 0; //contador de respostes malament
        
        ////////////////////////////////
        //PREGUNTES I GESTIÓ D'ERRORS//
        //////////////////////////////
        do {   
            repeat = false; //torna a deixa el valor per defecte
            if (totOK) { //si totes les respostes han sigut correctes
                while (contMal < MAL_MAX) {//mentre no hi hagin 3 respostes malament ...
                    while (contMal < MAL_MAX) {//mentre no hi hagin 3 respostes malament ...
                        //Pregunta pel número identificatiu de l'inscriptor
                        System.out.println("Quin és el número identificatiu del participant? (1 - 2000)");
                        //Agafa les dades del teclat i filtra les respostes
                        respOK = teclado.hasNextInt(); //la resposta es del tipus int?
                        if (respOK) { //si la resposta ha sigut tipus int...
                            id = teclado.nextInt(); //ha de ser array, corregeix######################
                            teclado.nextLine();//neteja memòria buffer
                            
                        }
                        else {
                            contMal++;//la resposta ha sigut incorrecte i augmenta el contador...
                            teclado.nextLine();//neteja memòria buffer
                        }
                    }
                    
                    
                    
                    
                    //tot el codi dins les respostes correctes
                    
                    
                    
                    
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
                    } while (!respOK);//mentre respostaOK sigui false ...
                    
                    
                    //tot el codi dins les 3 respostes correctes
                    
                }
            }                        
        } while (repeat); //mentre repeat sigui true...
    }
}
