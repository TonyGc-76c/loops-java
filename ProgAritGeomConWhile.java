import javax.swing.JOptionPane;
/**
 * Programa: Fracciones con numeradores nones y denominadores x2 del anteior
 * 
 * Descripción:
 * Este programa hace uso de un bucle while para generar fracciones con
 * numeradores nones y donde cada denominador es el doble del anterior.
 * 
 * 
 * @author TonyGc-76c
 */
public class ProgAritGeomConWhile {
	public static void main(String[] args) {
		int i = 1;
		int il = 3;
		String imp="";
		System.out.println(i + "/" + il);
		int n = 9;
		while (i <= n) {
			i = i + 2;
			il = il * 2;
			imp+= i + "/" + il + "\n";
			System.out.println(i + "/" + il);
		}
		JOptionPane.showMessageDialog(null,1 + "/" + 3 + "\n" + imp + "\n");
	}
}