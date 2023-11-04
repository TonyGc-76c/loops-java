// importa todas las clases de javax.swing
import javax.swing.*;
/**
 * Programa: Serie númeria de 1 a 50
 * 
 * Descripción:
 * Este programa hace uso de un bucle for para generar 
 * una serie del 1 al 50 y utilizando un textArea dentro
 * de un cuadro de dialogo para la impresión.
 * 
 * @author TonyGc-76c
 * 
 */
public class Serie1a50conScroll {
	public static void main(String[] args) {
		int i;
		int n = 50; // final de la sucesion
		// Crear un componente JTextArea para el mensaje
    JTextArea textArea = new JTextArea(5, 2);
    textArea.setWrapStyleWord(true);
    textArea.setLineWrap(true);
		for (i = 1; i <= n; i = i + 1) { // 'i = i + 1' lo puedes sustituir con 'i++'
			textArea.append(" "+ i + "\n");
			System.out.println(i);
		}
		// Crear un componente JScrollPane para agregar la barra de desplazamiento
    JScrollPane scrollPane = new JScrollPane(textArea);
		// muestra un cuadro de diálogo con un área de texto desplazable
		JOptionPane.showMessageDialog(null, scrollPane, "Resultado", JOptionPane.INFORMATION_MESSAGE);
	}
}