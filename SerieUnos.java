/**
 * Programa: Serie númeria del 1's
 * 
 * Descripción:
 * Este programa hace uso de un bucle for para generar
 * una serie de unos hasta un nivel 5.
 * 
 * @author TonyGc-76c
 * 
 */
public class SerieUnos {
  public static void main(String[] args) {
    int n = 5, s = 0;
    for (int i = 1; i <= n; i++) {
      s = (s * 10) + 1;
      System.out.println(s);
    }
  }
}
