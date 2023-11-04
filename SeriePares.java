import javax.swing.JOptionPane;
/**
 * Programa: Serie de numeros pares
 * 
 * Descripción:
 * Este programa genera una serie de números pares hasta n
 * utilizando un bucle for y utilizando cuadros de dialogo.
 * 
 * @author TonyGc-76c
 */
public class SeriePares {
	public static void main(String[] args) {
		int i;
		int n;
		String s="";
		String cad;
		// cuadro de dialogo que recibe una entrada del usuario
		cad = JOptionPane.showInputDialog("Dame un numero final que sea par");
		// el valor de la entrada se almacena en una variable
		n = Integer.parseInt(cad);
		for (i = 1; i <= n; i = i * 2) {
			s+= i + "\n";
			System.out.println(i);
		}
		JOptionPane.showMessageDialog(null, s);
	}
}