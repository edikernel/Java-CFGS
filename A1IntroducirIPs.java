package eac4p1;

import java.util.Scanner;
import java.util.regex.Pattern;

public class A1IntroduirIPs {
    /** Declareu en aquesta zona les constants i variables globals 
     * accessibles des de totes les funcions i des del programa principal.
     */
	///////////////
	//CONSTANSTS//
	/////////////
	
	//determina el valor máxim de la array
	static final int IP_MAX = 9;
	
	//////////////
	//VARIABLES//
	////////////
	//Declaració array
	String[] numerosIp = new String[IP_MAX];
	//guarda les dades introduides en la array
	Scanner resp = new Scanner(System.in);
    
    public static void main(String[] args) {
        // Es crea una variable prg de tipus A1IntroduirIPs i es crida al seu
        // mÃ¨tode inici per a comenÃ§ar el programa.
        A1IntroduirIPs prg = new A1IntroduirIPs();
        prg.inici();
    }
    
    /**
     * Programa principal. 
     * Anirem demanant IP's fins que el nombre d'IPs introduÃ¯des siguin les que
     * marca la constant del nostre programa, o bÃ© la IP introduÃ¯da sigui 0.0.0.0
     * Una variable anirÃ  comptant el nombre d'IPs que s'han introduÃ¯t i indexant 
     * a la vegada l'array on aquestes es guarden.
     */
    private void inici(){

    }
    
    /** FunciÃ³ o mÃ¨tode que demana per teclat una IP i no en fa la comprovaciÃ³ de si Ã©s o
     * no correcte, nomÃ©s demana que s'introdueixi un text i el guarda a la variable
     * global corresponent per a ser usada des del codi principal.
     */
    private void demanarIP(){
    	while ()
    	System.out.println("Introdueix un número IP valid");
    	resp.hasNextLine();//es tipus string introduït pel teclat?
    	if (resp.hasNextLine()) {//si es tipus string
    		
    	}
    	

    }
    
    /** FunciÃ³ o mÃ¨tode que recorre totes les posicions de l'arrayIps comprovant
     * si alguna d'aquestes posicions contÃ© el mateix valor que el que es troba
     * a la variable global que contÃ© la ip introduida, en cas de ser aixÃ­ 
     * guardarÃ  en una variable global el valor de cert.
     */
    private void buscarIpsRepetides(){

    }
    
    /** FunciÃ³ o mÃ¨tode que mitjanÃ§ant un split aplicat a l'String ipIntroduida
     * separa aquesta en quatre parts diferents fent servir de separador el '.'
     * En cas que tots els nÃºmeros obtinguts de les quatre parts estiguin entre
     * 0 i 255 fixa cert a la variable global ipCorrecta.
     */
    private void comprovarFormatIp(){
        ipCorrecta = false;
        String[] numerosIp = ipIntroduida.split(Pattern.quote("."));
        if ( numerosIp.length == 4 ){
            int num1 = Integer.parseInt(numerosIp[0]);
            int num2 = Integer.parseInt(numerosIp[1]);
            int num3 = Integer.parseInt(numerosIp[2]);
            int num4 = Integer.parseInt(numerosIp[3]);
            if ( num1 >= 0 && num1 <= 255 &&
                    num2 >= 0 && num2 <= 255 &&
                    num3 >= 0 && num3 <= 255 &&
                    num4 >= 0 && num3 <= 255 ){
                ipCorrecta = true;
            }
        }
    }
    
    /** FunciÃ³ o mÃ¨tode que recorre l'arrayIps per mostrar fila 
     * a fila el seu contingut.
     */
    private void mostrarArrayIps(){

    }
    
}
