//Aquí invoco el paquete, el nombre del archivo
package HolaMundo;
import java.util.Scanner;
//Aqui se genera la primera classe, la classe principal del paquete
public class HolaMundo {
  //Aquí se crean las variables estáticas
  public static void main(String[] args) {
    //Todo el código se ejecuta aquí
    /**Creación de variables, repaso de datos primitivos
    El tipo byte contiene números enteros, ocupan un byte.
    Un byte són 8 bits, 1 bit tiene 2 combinaciones, 2 * 8 = 16, 16^2 = 255, es un total de 255 diferentes posibilidades.
    En el caso de el primitivo byte contiene del -128 al 127, un total de 255 combinaciones diferentes*/
    byte by = 0;
    //En este caso ocupa 2 bytes, implica 255^2 = 65025 combinaciones diferentes, del -32768 al 32767
    short sh = 0;
    //int primitivo entero ocupa 4 bytes
    int in = 0;
    //long primitivo entero ocupa 8 bytes
    long lon = 0;
    //float, primitivo real, ocupa 4 bytes
    float flo = 0.00;
    //double, primitivo real, ocupa 8 bytes, decimal doble
    double doub = 00.00;
    //char, un caracter, ocupa 2 bytes
    char j = "j";
    //boolen, 1 byte
    boolean m = true;
  }
}
