/** To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eac4p2;

import java.util.Scanner;
import java.util.regex.Pattern;

/**
 *
 * @author emunoz
 */
public class Activitat1 {
    
    /**
     * Zona de declaració de constants i variables globals.
     * PROCUREU NO USAR VARIABLES GLOBALS! NOMÉS CONSTANTS
     * Heu d'utilitzar el pas de paràmetres i retorn de resultats a 
     * les funcions!
     */
    static final String IP_FINAL = "0.0.0.0";
    String[] arrayIps = new String[0];//Mesura inicial predefinida per l'array
    
    /** 
     * Punt d'entrada al programa, crea una variable del tipus igual al nom de
     * la classe i crida a la funció d'inici per tal que comenci l'execució.
     */
    public static void main(String[] args) {
        //adapteu la instanciació del programa d'acord amb el fitxer on treballeu
        Activitat1 prg = new Activitat1();
        prg.inici();
    }
    
    
    /**
     * Programa principal.
     * Partint del vostre programa principal o el de la solució de l'EAC4P1
     * realitzeu els canvis necessaris per tal de que faci el mateix però 
     * fent ús de variables locals. Com a pista penseu que aquí caldrà declarar 
     * les variables principals del programa, com l'array d'IPs (inicialitzat
     * a zero valors en un inici) o la IP que s'introduïrà cada vegada.
     * A cada inserció d'una IP i en acabar el programa es mostrarà el contingut
     * de l'array d'IPs.
     */
    public void inici(){
        while (!demanarString().contentEquals(IP_FINAL)) {
        	//Mentres el atribut de sortida de demanarString sigui diferent a IP_FINAL
        	demanarString();
        	if (!demanarString().contentEquals(IP_FINAL)) {
        		//si demanarString es diferent a IP_FINAL
        		//BUSCARipREpetides
        	}
        }
    }
    
    /**
     * Funció anomenada en l'anterior EAC com a demanarIP. En aquest cas es fa
     * més genèrica ja que al fi i al cap el que es fa és demanar una cadena de
     * text. No cal comprovar en ella el format de cap IP, només demanar el text
     * comprovar que no sigui buid i retornar-lo. En cas que sigui buid insisteix
     * a l'usuari fins que introdueix algun text vàlid (suposem una IP).
     * @param missatge Conté el missatge que es mostrarà a l'usuari abans de que
     * aquest introdueixi el text.
     * @param missatgeError Conté el missatge que es mostrarà a l'usuari en cas 
     * que aquest introdueixi una String buida
     * @return El text introduït
     */
    private String demanarString(){
    	/////////////////////
    	//VARIABLES LOCALS//
    	///////////////////
    	Scanner scanner = new Scanner(System.in);//variable scanner que fa crida al mètode Scanner
    	String missatge = "Introduiu una IP (4 números separats per punt entre 0 i 255)";//donar atribut
    	String missatgeError = "No s'admeten IPs buides";//donar atribut
    	String ipIntroduida;
    	///////////
    	//FUNCIÓ//
    	/////////
    	ipIntroduida = scanner.nextLine();//escoltar les dades pel teclat
    	while (ipIntroduida.isEmpty()) {//ipIntroduida está buit?
    		System.out.println(missatgeError);
    		ipIntroduida = scanner.nextLine();//escoltar les dades pel teclat
    	}
    	return ipIntroduida;
    }
    
    /**
     * Funció que ens indica si el primer paràmetre es troba present en l'array
     * d'Strings que trobem com a segon paràmetre. Retornarà cert en cas que 
     * trobi alguna coincidència amb les IPs introduïdes i false altrament.
     * @param ipIntroduida Simbolitza la IP que cercarem en l'array arrayIps
     * @param arrayIps Simboolitza l'array on buscarem si hi ha ipIntroduida
     * @return cert si IpIntroduida es dins d'arrayIps, false altrament
     */
    private boolean hiHaIpsRepetides(String ipIntroduida, String[] arrayIps){

    }
    
    /**
     * Funció ja implementada que ens diu si el paràmetre ipIntroduida té
     * forma d'IP vàlida. Presuposa que la String són sempre quatre números
     * separats per un punt.
     * @param ipIntroduida
     * @return cert si els 4 números es troben entre 0 i 255. Fals altrament.
     */
    private boolean ipTeFormatCorrecte(String ipIntroduida){
        String[] numerosIp = ipIntroduida.split(Pattern.quote("."));
        if ( numerosIp.length == 4 ){
            int num1 = Integer.parseInt(numerosIp[0]);
            int num2 = Integer.parseInt(numerosIp[1]);
            int num3 = Integer.parseInt(numerosIp[2]);
            int num4 = Integer.parseInt(numerosIp[3]);
            if ( num1 >= 0 && num1 <= 255 &&
                    num2 >= 0 && num2 <= 255 &&
                    num3 >= 0 && num3 <= 255 &&
                    num4 >= 0 && num4 <= 255 ){
                return true;
            }
        }
        return false;
    }
    
    /**
     * Funcíó que a partir del primer array que rep com a paràmetre, en crea un
     * de nou amb tantes posicions com el del paràmetres més 1 per tal d'emma-
     * gatzemar en aquesta darrera, el segon paràmetre.
     * @param arrayIps Array amb les Ips 
     * @param ipIntroduida ip que cal afegir al nou array
     * @return un nou array igual que arrayIps però afegint en una nova darrera
     * posició el paràmetre ipIntroduida
     */
    private String[] guardarIP(String[] arrayIps, String ipIntroduida){

    }

    /** 
     * Funció que visualitza l'array que es passa com a paràmetre.
     * @param arrayIps conté les IPs que es viaualitzaran.
     */
    private void mostrarArrayIps(String[] arrayIps){

    }
}
