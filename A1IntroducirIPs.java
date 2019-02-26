package eac4p1OmplirArray;

import java.util.Scanner;
import java.util.regex.Pattern;

public class A1IntroduirIPs {
    /** Declareu en aquesta zona les constant i variables globals 
     * accessibles des de totes les funcions i des del programa principal.
     */
    ///////////////
    //CONSTANSTS//
    /////////////

    //determina el valor máxim de la array, cuantes direccions es guardaran?
    static final int IP_MAX = 1;
    //determina el valor mÃ¡xim de la array que guardara els numeros corresponents del rang de IP
    static final int IP_RANG = 3;

    //////////////
    //VARIABLES//
    ////////////
    //Declaració array on es guardara les dades introduides
    String[] ipIntroduida = new String[IP_MAX];
    //Declaració array on es guardará els diferents números dels 4 octets, cada octet correspon a un valor del array
    //String numerosIp[] = new String[IP_RANG];
    //String numerosIp[][] = new String[IP_MAX][IP_RANG];
    //variable que fa la crida al metode escaner
    Scanner resp = new Scanner(System.in);
    //s'utilitzará per determinar si la Ip cumpleix tots els requisits
    boolean ipCorrecta;
    //S'utilitzará per controlar el bucle comprovarFormatIp()
    int contComprovacio;
    /**crea el array on guardará les dades introduides separades pel ".", el tamany de l'array es veura modificat
     * segons les dades enmagatzemades en ipIntroduida
     */
    String[] numerosIp = new String[0];
    //String[] numerosIp = ipIntroduida[contComprovacio].split(Pattern.quote("."));
    //contindran els 4 octets que composa una dirección IP, s'utilitzará per evaluar si compleix amb els requisits
    int num1, num2, num3, num4;
    
    
    public static void main(String[] args) {
        // Es crea una variable prg de tipus A1IntroduirIPs i es crida al seu
        // mètode inici per a començar el programa.
        A1IntroduirIPs prg = new A1IntroduirIPs();
        prg.inici();
    }
    
    /**
     * Programa principal. 
     * Anirem demanant IP's fins que el nombre d'IPs introduïdes siguin les que
     * marca la constant del nostre programa, o bé la IP introduïda sigui 0.0.0.0
     * Una variable anirà comptant el nombre d'IPs que s'han introduït i indexant 
     * a la vegada l'array on aquestes es guarden.
     */
    public void inici(){
    	demanarIP();
    	comprovarFormatIp();
    }
    
    /** Funció o mètode que demana per teclat una IP i no en fa la comprovació de si és o
     * no correcte, només demana que s'introdueixi un text i el guarda a la variable
     * global corresponent per a ser usada des del codi principal.
     */
    public void demanarIP(){
    	//Sempre que x sigui igual o més petit que IP_MAX fes... 
    	for (int x = 0; x < IP_MAX; x++) {
            System.out.println("Introdueix una adreça IP valida");
            //escoltar les dades introduides pel teclat i guardar les dades en array
            ipIntroduida[x] = resp.nextLine();
    	}
    }
    
    /** Funció o mètode que recorre totes les posicions de l'arrayIps comprovant
     * si alguna d'aquestes posicions conté el mateix valor que el que es troba
     * a la variable global que conté la ip introduida, en cas de ser així 
     * guardarà en una variable global el valor de cert.
     */
    public void buscarIpsRepetides(){
    	//Doble bucle for per recorre totes les posicions i comparar amb el métode equals les dades
    	for (int x = 0; x < ipIntroduida.length; x++) {
    		for (int y = x + 1; y < ipIntroduida.length; y++) {
    			ipIntroduida[x].equals(ipIntroduida[y]);
    		}
    	}
    }
    
    /** Funció o mètode que mitjançant un split aplicat a l'String ipIntroduida
     * separa aquesta en quatre parts diferents fent servir de separador el '.'
     * En cas que tots els números obtinguts de les quatre parts estiguin entre
     * 0 i 255 fixa cert a la variable global ipCorrecta.
     */
    public void comprovarFormatIp(){
    	//deixa el contador a 0
    	contComprovacio = 0;
    	//mentres ipcorrecta sigui fals i ademes el contador sigui més petit al tamany máxim de la array ipIntroduida...
    	while (!ipCorrecta && contComprovacio < ipIntroduida.length) {
            	/**divideix les dades ipIntroduida separades pel "." i guarda les dades en la array numerosIp
            	 * El tamany de la array numerosIp es veura determinat segons les dades que s'hagin introduit previament
            	 */
                String numerosIp[] = ipIntroduida[contComprovacio].split(Pattern.quote("."));
                //si el tamany de la array es de 0 a 3 amb un total de 4 columnes ...
                if ( numerosIp.length == 4 ){
                    /**En les seguents 4 lieneas dona valor a les variables, indica que el valor era un objecte Integer
                     * i convertirá aquets objectes en tipus primitiu int
                     */
                    num1 = Integer.parseInt(numerosIp[0]);
                    num2 = Integer.parseInt(numerosIp[1]);
                    num3 = Integer.parseInt(numerosIp[2]);
                    num4 = Integer.parseInt(numerosIp[3]);
                    //si cumpleix els requits del protocol TCP/IP...
                    if ( num1 >= 0 && num1 <= 255 &&
                        num2 >= 0 && num2 <= 255 &&
                        num3 >= 0 && num3 <= 255 &&
                        num4 >= 0 && num3 <= 255 ){
                        ipCorrecta = true;
                        contComprovacio++;
                    }
                    else {
                    	ipCorrecta = false;
                    	System.out.println("Les dades introduides no han sigut correctes, torna a repetir-ho");
                    	System.out.println("#################################################################");
                    	//com que no ha sigut correcte les dades introduides es repetirá tot el programa desde el inici.
                    	inici();
                    }
                }
                else {
                	ipCorrecta = false;
                	System.out.println("Les dades introduides no han sigut correctes, torna a repetir-ho");
                	System.out.println("#################################################################");
                	//com que no ha sigut correcte les dades introduides es repetirá tot el programa desde el inici.
                	inici();
                }
    	}       
    }
    /** Funció o mètode que recorre l'arrayIps per mostrar fila 
     * a fila el seu contingut.
     */
    public void mostrarArrayIps(){
    	System.out.println("Les IP introduides son les seguents");
        for (int x = 0; x < IP_MAX; x++) {
        	System.out.println(ipIntroduida[x]);
        	System.out.println("#################################################################");
        }
    }
}
