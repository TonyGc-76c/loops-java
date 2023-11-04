/**
 * Programa: Serie númeria de 1's con indices de nivel
 * 
 * Descripción:
 * Este programa hace uso de un bucle for para generar
 * una serie de unos hasta un nivel 9.
 * 
 * @author TonyGc-76c
 * 
 */
public class SerieUnosLvl {
  public static void main(String[] args){
    int n = 9;
    int s = 0;
    for (int i = 1; i <= n; i++) {
      System.out.print("Lvl. " + i + " → ");
      s = (s * 10) + 1;
      System.out.println(s);
    }
  }
}
