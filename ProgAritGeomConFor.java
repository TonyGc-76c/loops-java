// crea y muestra cuadros de diálogo simples
// para mensajes y entradas del usuario.
import javax.swing.JOptionPane;
/**
 * Programa: Fracciones con numeradores nones y denominadores x2 del anteior
 * 
 * Descripción:
 * Este programa hace uso de un bucle for para generar fracciones con
 * numeradores nones y donde cada denominador es el doble del anterior.
 * 
 * @author TonyGc-76c
 * 
 */
public class ProgAritGeomConFor {
	public static void main(String[] args) {
		// declaración de variables
		int i = 1;
		int n = 3;
		int p = 9;
		String imp="";
		System.out.println(i + "/" + n);
		for (; i <= p;) {
			i = i + 2;
			n = n * 2;
			imp+= +i + "/" + n + "\n";
			System.out.println(i + "/" + n);
		}
	  JOptionPane.showMessageDialog(null,1 + "/" + 3 + "\n" + imp + "\n");
	}

}