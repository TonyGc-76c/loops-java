// crea y muestra cuadros de diálogo simples
// para mensajes y entradas del usuario.
import javax.swing.JOptionPane;
/**
 * Programa: Serie númeria dese 1 a 'n' con for
 * 
 * Descripción:
 * Este programa hace uso de un bucle for para generar
 * numeros desde el 0 hasta un número n.
 *
 * @author TonyGc-76c
 */
public class Serie1aNconFor // For
{
	public static void main(String [] pato) {
		// declaración de variables
		String cad;
		int i; // Variable para contar desde uno hasta n
		int n;
		// muestra cuadro de diálogo con mensaje y espera entreda del usuario. 
		cad = JOptionPane.showInputDialog("Ingresa el valor final");
		// El valor se almacena en la variable `cad`.
		n = Integer.parseInt(cad);
		for (i = 1; i <= n; i++) {
			System.out.println(i);
		}
	}
}