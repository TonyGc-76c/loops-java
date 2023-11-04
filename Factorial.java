import javax.swing.JOptionPane;
/**
 * Programa: Factorial
 * 
 * Descripción:
 * Este programa genera la funcion factorial de n número
 * utilizando un bucle while condicionado a n > 0.
 * 
 * @author TonyGc-76c
 */
public class Factorial {
	public static void main(String[] args) {
		int n;
		int i = 1;
		int p = 1;
		String cad;
		// Cuadro de dialogo con mensaje que recibe entrada
		cad = JOptionPane.showInputDialog("Dame un numero entero final");
		// el valor de la entrada se alamacena en una variable
		n = Integer.parseInt(cad);
		if (n > 0) {
			while (i <= n) {
				p = p * i;
				System.out.println(i);
				i = i + 1;
			}
			JOptionPane.showMessageDialog(null, "Factorial: " + p);
			System.out.println("Factorial: " + p);
		}
	}
}