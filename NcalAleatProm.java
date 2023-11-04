// importa métodos para crear y mostrar cuadros
// de diálogo simples para mensajes y entradas del usuario.
import javax.swing.JOptionPane;
/**
 * Programa: 'n' calificaciones aleatorias y promedio
 * 
 * Descripción:
 * Este programa hace uso de un bucle while para generar n calificaciones
 * y obtener su promedio, tambien se utiliza para este ejercicio la clase
 * JOptionPane para crear cuadros de dialogo simple.
 * 
 * @author TonyGc-76c
 */
public class NcalAleatProm {
	public static void main(String[] pato) {
		// declaración de variables para el programa.
		String cad;
		int n; // 6 materias
		int s;
		int c;
		double r;
		int i; // varible para contar desde 1 hasta n
		s = 0;
		i = 1;
		String cal="";
		// muestra un cuadro de diálogo con un mensaje "Numero de materias" y espera a que el usuario ingrese un valor. 
		cad = JOptionPane.showInputDialog("Numero de materias");
		// El valor de cuantas materias asignadas usuario se almacena en la variable `cad`.
		n = Integer.parseInt(cad);

		// ciclo o bucle ` while` genera un número aleatorio entre 1 y 100
		while (i <= n) {
			c = (int) (Math.random() * 100 + 1); // el +1 dicta que empiece desde el 1 y no el 0
			s = s + c;
			cal+= c + "\n";
			System.out.println(c);
			i = i + 1;
		}
		r = s / n;
		JOptionPane.showMessageDialog(null, cal);

		// Se imprime en la consola y en un cuadro de dialogo simple el promedio
		System.out.println("calificacion final:" + r);
		JOptionPane.showMessageDialog(null, "calificacion final:" + r);

	}
}