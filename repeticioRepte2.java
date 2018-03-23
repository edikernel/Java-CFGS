package repeticiorepte2;
import java.util.Scanner;
public class repeticioRepte2 {
  //Identificadores estáticos
  private static final byte MAX = 10;
  private static final byte MIN = 0;
  static void main (String [] args) {
    //variables
      byte contador = 0;
      boolean finish = false;
    
    //mientras contador sea más pequeño o igual que MAX se repite la secuencia, contador aumenta el valor
    while (contador < MAX) {
      //Aumenta el valor
      contador = contador + 1;
      //Muestra por pantalla el resultado del contador
      System.out.print(contador +"/");
      //Si contador llega a 10 modifica la variable finish que será utilizada a continuación.
      if (contador = MAX) {
        finish = true;
      }
      //Si finish és true ejecuta el while
      if (finish) {
        //Línea para cambiar diferenciar
        System.out.println("--------------------------------");
        //mientras contador sea igual a max y mayor o igual que MIN se ejecuta la cuenta atrás
        while (contador < MAX && contador > MIN) {
          //Se inicia el contador hacia atrás
          contador = contador - 1;
          System.out.print(contador +"/");
        }
      }
    }
  }
}
