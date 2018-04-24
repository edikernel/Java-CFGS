/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package e12_muñozg;
import java.util.Scanner; //importar l'eina per la lectura de dades per teclat
/**
 *
 * @author emunoz
 */
public class E12_MuñozG {

    /**
     * @param args the command line arguments
     */
    private static final int USER_MIN = 1;//Identificador estatic, número minim d'usuaris per registrar
    public static void main(String[] args) {
        //////////////
        //VARIABLES//
        ////////////
        
        Scanner teclado = new Scanner(System.in); //Assignar a la variable l'eina per introduïr dades pel teclat.
        boolean tipusOK = false; //Per controlar si el tipus de dada es correcte
        boolean dadesOK = false;//Per controlar si compleix amb totes les condicions de la dada esperada.
        int numUsers = 0;//Numero per defecte d'usuaris
        String[] users; //array que contindrá el nom dels usuaris, encara no té la mesura de l'array.
        String contrasenya; //contindrá la password generada
        String userAux;
        
        //////////////////////////////////
        //REGISTRE I GENERACIÓ PASSWORD//
        ////////////////////////////////
        
        do {
            System.out.println("Quants usuaris vols registrar?");
            tipusOK = teclado.hasNextInt();//Comproba si les dades son del tipus correcte
            if (tipusOK) {//Si es true ...
                numUsers = teclado.nextInt(); //guarda en aquesta variable el valor introduït per l'usuari
                teclado.nextLine();//Neteja la memória buffer
                if (numUsers >= USER_MIN) { //si el número anterior es igual o més gran que 1 ...
                    dadesOK = true;//Les dades introduides son correctes.
                }
                else {
                    System.out.println("______________________________________________________________");
                    System.out.println("Les dades introduïdes no son correctes, torna-ho a intentar-ho");
                }
            }
            else {
                teclado.nextLine();//neteja la memória buffer.
                System.out.println("______________________________________________________________");
                System.out.println("Les dades introduïdes no son correctes, torna-ho a intentar-ho");
            }
        } while (!dadesOK);//si dadesOK es true surt del bucle
        users = new String [numUsers];//Indicar la mesura de l'array, la mesura segons les dades anteriors.
        for (int contador = 0; contador < numUsers; contador++) {//si contador es més petit que la dada anterior... augmenta contador cada vegada
            System.out.println("·····························");
            System.out.println("Introdueix el nom de l'usuari");
            users[contador] = teclado.nextLine();//array que el nom de tots els usuaris introduïts
            //generació de contrasenya
            contrasenya = users[contador].replace('a' , '4'); 
            contrasenya = contrasenya.replace('e' , '4');
            contrasenya = contrasenya.replace('i' , '4');
            contrasenya = contrasenya.replace('o' , '4');
            contrasenya = contrasenya.replace('u' , '4');
            contrasenya = contrasenya.replace('A' , '4');
            contrasenya = contrasenya.replace('E' , '4');
            contrasenya = contrasenya.replace('I' , '4');
            contrasenya = contrasenya.replace('O' , '4');
            contrasenya = contrasenya.replace('U' , '4');
            System.out.println("La contrasenya és:" +contrasenya );
        }
        
        ////////////////////////
        //LLISTAT I ORDENACIÓ//
        //////////////////////
        
        System.out.println("______________________________________");
        System.out.println("Llistat dels usuaris");
        for (int contador = 0; contador < numUsers; contador++) { //genera bucle amb contador, contador ha de ser mes petit que numUsers
            System.out.println(users[contador]);
        }
        for (int contador = 0; contador < users.length -1; contador++) {
            for (int x = contador + 1; x < users.length; x++) {
                if (users[contador].compareTo(users[x]) > 0) {
                    userAux = users[contador];
                    users[contador] = users[x];
                    users[x] = userAux;
                }
            }
        }
        System.out.println("______________________________________");
        System.out.println("Llistat ordenat dels usuaris");
        for (int contador = 0; contador < numUsers; contador++) {
            System.out.println(users[contador]);
        }
        /**
        do {
            //System.out.println("-----------------------------");
            System.out.println("Introdueix el nom de l'usuari");
            userOK = teclado.hasNext(); //comproba si es tipus string
            if (userOK) {//si es true fes les següents accions
                users[0] = teclado.next(); //enmagatzema el valor en la array.
                teclado.nextLine();//neteja la memoria buffer
            }
            else {
                System.out.println("Les dades introduides no són correctes, torna a executar el programa");
                System.out.println("____________________________________________________________________");
                teclado.nextLine();//neteja la memoria buffer
            }
        } while (!userOK); //si es false torna a repetir tot el codi */
    }   
}
