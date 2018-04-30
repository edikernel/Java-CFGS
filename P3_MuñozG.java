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
        int[] any = new int[10]; //contindrá els anys creats per l'usuari, màxim 10 anys.
        int[] mes = new int[10]; //contindrá els mesos creats per l'usuari, màxim 10 messos.
        int[] dia = new int[10]; //contindrá els dies creats per l'usuari, màxim 10 dies.
        int[] genere = new int[10]; //contindrá el genere de l'usuari, màxim 10 generes.
        int[] categoria = new int[10]; //contindrá el genere de l'usuari, màxim 10 generes.
        int respRepeat; //la resposta de l'usuari, 1 o 0, repeteix o no
        int contMal = 0; //contador de respostes malament
        int contId = 0; //contador per posicions array id
        int contAny = 0; //contador per posicions array any
        int contMes = 0; //contador per posicions array mes
        int contDia = 0; //contador per posicions array dia
        int contGen = 0; //contador per posicions array genere
        int contCat = 0;
        String genereString;
        
        ////////////////////////////////
        //PREGUNTES I GESTIÓ D'ERRORS//
        //////////////////////////////
        do {
            repeat = false; //torna a deixa el valor per defecte
            if (totOK) { //si totes les respostes han sigut correctes
                totOK = false; //torna a deixar el valor per defecte
                if (contId < id.length) {/* si contador registre es més petit que la mesura màxima de array... 
                    (només controlant aquesta posició controlem la resta de posicions)
                    */
                    while (contMal < MAL_MAX) {//mentre no hi hagin 3 respostes malament ...
                        do {
                            
                            /////////////////////
                            //PRIMERA PREGUNTA//
                            ///////////////////
                            
                            System.out.println("Quin és el número identificatiu del participant? (1 - 2000)");
                            tipOK = teclado.hasNextInt(); //la resposta es del tipus int?
                            if (tipOK) { //si la resposta ha sigut tipus int...
                                id[contId] = teclado.nextInt();//guarda el valor en la posició corresponent de la array
                                teclado.nextLine();//neteja memòria buffer
                                if (id[contId] >= ID_MIN && id[contId] <= ID_MAX) {//si compleix amb les condicions bàsiques...
                                    respOK = true;//la resposta es correcte
                                    contId++;//El identificador es correcte i augmenta una posició més per la pròxima volta.
                                }
                                else {
                                    contMal++;//la resposta ha sigut incorrecte i augmenta el contador...
                                    respOK = false;//la resposta no es correcte
                                    System.out.println("La resposta no es correcte, torna a respondre la pregunta");
                                }
                            }
                            else {
                                teclado.nextLine();//neteja memòria buffer
                                contMal++;//la resposta ha sigut incorrecte i augmenta el contador...
                                respOK = false;
                                System.out.println("El tipus de dada no es correcte, contesta amb les dades demanades");
                                System.out.println("_________________________________________________________________");
                            }
                        } while (!respOK && contMal < MAL_MAX); //torna a executar si la variable es false...
                        
                        ////////////////////
                        //SEGONA PREGUNTA//
                        //////////////////
                        
                        if (contMal < MAL_MAX) {
                            do {
                                //Pregunta pel número identificatiu de l'inscriptor
                                System.out.println("Data de naixement");
                                //Pregunta per l'any, la resposta s'afegirá al costat de la pregunta
                                System.out.println("    any?: ");
                                tipOK = teclado.hasNextInt(); //la resposta es del tipus int?
                                if (tipOK) { //si la resposta ha sigut tipus int...
                                    any[contAny] = teclado.nextInt();//guarda el valor en la posició corresponent de la array
                                    teclado.nextLine();//neteja memòria buffer
                                    if (any[contAny] >= ANY_MIN && any[contAny] <= ANY_MAX) {//si compleix amb les condicions bàsiques...
                                        respOK = true;//la resposta es correcte
                                        contAny++;//El identificador es correcte i augmenta una posició més per la pròxima volta.
                                    }
                                    else {
                                        contMal++;//la resposta ha sigut incorrecte i augmenta el contador...
                                        respOK = false;//la resposta no es correcte
                                        System.out.println("La resposta no es correcte, torna a respondre la pregunta");
                                    }
                                }
                                else {
                                    teclado.nextLine();//neteja memòria buffer
                                    contMal++;//la resposta ha sigut incorrecte i augmenta el contador...
                                    respOK = false;
                                    System.out.println("El tipus de dada no es correcte, contesta amb les dades demanades");
                                    System.out.println("_________________________________________________________________");
                                }
                            } while (!respOK && contMal < MAL_MAX); //torna a executar si la variable es false...
                        }   
                            
                            
                        /////////////////////
                        //TERCERA PREGUNTA//    
                        ///////////////////
                        
                        if (contMal < MAL_MAX) {
                            //Tercera pregunta...
                            do {
                                //Pregunta pel número identificatiu de l'inscriptor
                                System.out.println("    mes? (1-12): ");
                                //Pregunta per l'any, la resposta s'afegirá al costat de la pregunta
                                tipOK = teclado.hasNextInt(); //la resposta es del tipus int?
                                if (tipOK) { //si la resposta ha sigut tipus int...
                                    mes[contMes] = teclado.nextInt();//guarda el valor en la posició corresponent de la array
                                    teclado.nextLine();//neteja memòria buffer
                                    if (mes[contMes] >= MES_MIN && mes[contMes] <= MES_MAX) {//si compleix amb les condicions bàsiques...
                                        respOK = true;//la resposta es correcte
                                        contMes++;//El identificador es correcte i augmenta una posició més per la pròxima volta.
                                    }
                                    else {
                                        contMal++;//la resposta ha sigut incorrecte i augmenta el contador...
                                        respOK = false;//la resposta no es correcte
                                        System.out.println("La resposta no es correcte, torna a respondre la pregunta");
                                    }
                                }
                                else {
                                    teclado.nextLine();//neteja memòria buffer
                                    contMal++;//la resposta ha sigut incorrecte i augmenta el contador...
                                    respOK = false;
                                    System.out.println("El tipus de dada no es correcte, contesta amb les dades demanades");
                                    System.out.println("_________________________________________________________________");
                                }
                            } while (!respOK && contMal < MAL_MAX); //torna a executar si la variable es false...  
                        }
                        
                        
                        ////////////////////
                        //CUARTA PREGUNTA//
                        //////////////////
                        
                        
                        if (contMal < MAL_MAX) {
                            do {
                                //Pregunta pel número identificatiu de l'inscriptor
                                System.out.println("    dia? (1-30): ");
                                //Pregunta per l'any, la resposta s'afegirá al costat de la pregunta
                                tipOK = teclado.hasNextInt(); //la resposta es del tipus int?
                                if (tipOK) { //si la resposta ha sigut tipus int...
                                    dia[contDia] = teclado.nextInt();//guarda el valor en la posició corresponent de la array
                                    teclado.nextLine();//neteja memòria buffer
                                    if (dia[contDia] >= DIA_MIN && dia[contDia]<= DIA_MAX) {//si compleix amb les condicions bàsiques...
                                        respOK = true;//la resposta es correcte
                                        contDia++;//El identificador es correcte i augmenta una posició més per la pròxima volta.
                                    }
                                    else {
                                        contMal++;//la resposta ha sigut incorrecte i augmenta el contador...
                                        respOK = false;//la resposta no es correcte
                                        System.out.println("La resposta no es correcte, torna a respondre la pregunta");
                                    }
                                }
                                else {
                                    teclado.nextLine();//neteja memòria buffer
                                    contMal++;//la resposta ha sigut incorrecte i augmenta el contador...
                                    respOK = false;
                                    System.out.println("El tipus de dada no es correcte, contesta amb les dades demanades");
                                    System.out.println("_________________________________________________________________");
                                }
                            } while (!respOK && contMal < MAL_MAX); //torna a executar si la variable es false...  
                        }
                        
                        ////////////////////
                        //QUINTA PREGUNTA//
                        //////////////////
                        
                        if (contMal < MAL_MAX) {
                            do {
                                //Pregunta si es noia o noi
                                System.out.println("És noia(1) o noi(2)?");
                                //Pregunta per l'any, la resposta s'afegirá al costat de la pregunta
                                tipOK = teclado.hasNextInt(); //la resposta es del tipus int?
                                if (tipOK) { //si la resposta ha sigut tipus int...
                                    genere[contGen] = teclado.nextInt();//guarda el valor en la posició corresponent de la array
                                    teclado.nextLine();//neteja memòria buffer
                                    if (genere[contGen] == NOIA || genere[contGen] == NOI) {//si compleix amb les condicions bàsiques...
                                        respOK = true;//la resposta es correcte
                                        contGen++;//El identificador es correcte i augmenta una posició més per la pròxima volta.
                                        if (genere[contGen] == NOIA) {//Si el valor de array genere es igual a 1 ...
                                            genereString = "noia";
                                        }
                                        else if (genere[contGen] == NOI) {//Si el valor de array genere es igual a 2 ...
                                            genereString = "noi";
                                        }
                                    }
                                    else {
                                        contMal++;//la resposta ha sigut incorrecte i augmenta el contador...
                                        respOK = false;//la resposta no es correcte
                                        System.out.println("La resposta no es correcte, torna a respondre la pregunta");
                                    }
                                }
                                else {
                                    teclado.nextLine();//neteja memòria buffer
                                    contMal++;//la resposta ha sigut incorrecte i augmenta el contador...
                                    respOK = false;
                                    System.out.println("El tipus de dada no es correcte, contesta amb les dades demanades");
                                    System.out.println("_________________________________________________________________");
                                }
                            } while (!respOK && contMal < MAL_MAX); //torna a executar si la variable es false...  
                        }
                        
                        ///////////////////
                        //SEXTA PREGUNTA//
                        /////////////////
                        
                        if (contMal < MAL_MAX) {
                            do {
                                System.out.println("En quina categoria competirà el participant?");
                                System.out.println("Infantil (1)");
                                System.out.println("Junior (2)");
                                System.out.println("Senior (3)");
                                //Pregunta per categoria
                                tipOK = teclado.hasNextInt(); //la resposta es del tipus int?
                                if (tipOK) { //si la resposta ha sigut tipus int...
                                    categoria[contCat] = teclado.nextInt();//guarda el valor en la posició corresponent de la array
                                    teclado.nextLine();//neteja memòria buffer
                                    if (categoria[contCat] == NOIA || categoria[contCat] == NOI) {//si compleix amb les condicions bàsiques...
                                        respOK = true;//la resposta es correcte
                                        contGen++;//El identificador es correcte i augmenta una posició més per la pròxima volta.
                                    }
                                    else {
                                        contMal++;//la resposta ha sigut incorrecte i augmenta el contador...
                                        respOK = false;//la resposta no es correcte
                                        System.out.println("La resposta no es correcte, torna a respondre la pregunta");
                                    }
                                }
                                else {
                                    teclado.nextLine();//neteja memòria buffer
                                    contMal++;//la resposta ha sigut incorrecte i augmenta el contador...
                                    respOK = false;
                                    System.out.println("El tipus de dada no es correcte, contesta amb les dades demanades");
                                    System.out.println("_________________________________________________________________");
                                }
                            } while (!respOK && contMal < MAL_MAX); //torna a executar si la variable es false...  
                        }
                        
                        
                        
                        
                        ////////////////
                        //TOT ESTÁ OK//
                        //////////////
                    
                    
                    
                        if (totOK) {
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
                            } while (!respOK && contMal < MAL_MAX);//mentre respostaOK sigui false ...
                            
                            
                            
                            
                            
                            
                        }
                        


                        //tot el codi dins les 3 respostes correctes

                    }
                }                        
            }
        } while (repeat);//mentre repeat sigui true...
        if (contMal >= MAL_MAX) {
            System.out.println("........................................................");
            System.out.println("________________________________________________________");
            System.out.println("Has executat malament el programa, torna-ho ha intentar.");
        }
    }
}
