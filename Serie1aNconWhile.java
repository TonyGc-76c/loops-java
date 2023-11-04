// crea y muestra cuadros de diálogo simples
// para mensajes y entradas del usuario.
import javax.swing.JOptionPane;
/**
 * Programa: Serie númeria dese 1 a 'n' con while
 * 
 * Descripción:
 * Este programa hace uso de un bucle while para generar
 * numeros desde el 0 hasta un número n.
 *
 * @author TonyGc-76c
 */
public class Serie1aNconWhile // While
{
	public static void main(String[] args) {
		// declaracion de variables 
		String cad;
		int i = 0; // Variable para contar desde uno hasta n
		// muestra cuadro de diálogo con mensaje y espera entreda del usuario. 
		cad = JOptionPane.showInputDialog("Ingresa el valor final");
		// El valor se almacena en la variable `cad`.
		int n = Integer.parseInt(cad);

		while (i < n) {
			i = i + 1;
			System.out.println(i);
		}
	}
}