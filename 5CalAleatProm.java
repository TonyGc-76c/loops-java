// crea y muestra cuadros de diálogo simples
// para mensajes y entradas del usuario.
import javax.swing.JOptionPane;
/**
 * Programa: 5 claificaciones aleatorias y promedio
 * 
 * Descripción:
 * Este programa hace uso de un bucle while para generar 5 calificaciones
 * aleatorias, donde cada calificaciones no es mayor a 50 de valor.
 * 
 * @author TonyGc-76c
 * 
 */
public class 5CalAleatProm {
	public static void main(String[] args) {
		int s;
		int c;
		double r;
		int i;
		s = 0;
		i = 1;
		String cal="";
		while (i <= 5) {
			c = (int) (Math.random() * 50 + 1);
			s = s + c;
			cal+= c + "\n";
			System.out.println(c);
			i = i + 1;
		}
		r = s / 5;
		System.out.println("Resultado: " + r);
		JOptionPane.showMessageDialog(null, cal + "Resultado: " + r);
	}
}