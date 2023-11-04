// crea y muestra cuadros de diálogo simples
// para mensajes y entradas del usuario.
import javax.swing.JOptionPane;
/**
 * Programa: Sumatoria
 * 
 * Descripción:
 * Este programa genera una serie numerica de 1 a n números 
 * donde n debe ser un número mayor a 0
 * y despues devuelve su sumatoria usando un buble while.
 * 
 * @author TonyGc-76c
 */
public class Sumatoria {
	public static void main(String[] args) {
		int n;
		int i = 1;
		int s = 0;
		String cad;
		String can="";
		cad = JOptionPane.showInputDialog("Dame un numero entero final");
		n = Integer.parseInt(cad);
		if (n > 0) {
			while (i <= n) {
				s = s + i;
				can+= i + "\n";
				System.out.println(i);
				i = i + 1;
			}
			JOptionPane.showMessageDialog(null, can + "Sumatoria: " + s);
			System.out.println("Sumatoria: " + s);
		}
	}
}