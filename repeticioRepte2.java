package repeticiorepte2;
import java.util.Scanner;
public class repeticioRepte2 {
  //Identificadores estáticos
  private static final byte MAX = 10;
  static void main (String [] args) {
    //variables
      byte contador = 0;
      boolean finish = false;
    
    //mientras contador sea más pequeño o igual que MAX se repite la secuencia, contador aumenta el valor
    while (contador <= MAX) {
      contador = contador + 1;
      System.out.print(contador);
      if (contador = 10) {
        finish = true;
      }
    }
  }
}
