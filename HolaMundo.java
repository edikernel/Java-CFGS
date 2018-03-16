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
    //Ejemplo de entrada de datos y gestión de errores
    //Crear la cariable que contine la herramienta Scanner
    teclado = new Scanner(System.in);
    //en la siguietne línea pide los datos y comprueba si és el tipo de dato solicitado
    m = teclado.hasNextInt();
    //Si el tipo de datos és correcto continua con el programa
    if (m) {
      System.out.println("Introduce un número del 1 al 10");
      //El tipo de dato es correcto, asigna el valor correspondiente y continua con el análisis de los datos
      in = teclado.NextInt();
      //Elimina el intro de la memória buffer de la variable
      teclado.NextLine();
      if (in >= 1 && in <= 10) {
        System.out.println("Los datos introducidos són correctos");
        System.out.println("Pràctica el Switch");
        switch (in) {
          case 1: System.out.println("Has elegido el 1");
            break;
          case 2: System.out.println("Has elegido el 2");
        }
      }
      else {
        System.out.println("Los datos introducidos no són correctos");
      }
      
    }
    else {
      System.out.println("Los datos introducidos no són correctos");
    }
  }
}
