// crea y muestra cuadros de diálogo simples
// para mensajes y entradas del usuario.
import javax.swing.JOptionPane;
/**
 * Programa: Serie númeria del doble del número anterior
 * 
 * Descripción:
 * Este programa hace uso de un bucle for para generar
 * numeros desde el 1 hasta un número n donde cada
 * número es el doble que el anterior.
 * 
 * @author TonyGc-76c
 * 
 */
public class ProgX2 {
	public static void main(String [] args) {
		int i;
		int n;
		String cad;
		// muestra cuadro de diálogo con mensaje y espera entreda del usuario. 
		cad = JOptionPane.showInputDialog("Numero entero final");
		// El valor se almacena en la variable `cad`.
		n = Integer.parseInt(cad);
		for (i = 1; i <= n; i = i * 2) {
			//JOptionPane.showMessageDialog(null, i);
			System.out.println(i);
		}
	}
}