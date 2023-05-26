package pkg;

import java.util.*;

public class Clase {
	public void holaMuyBuenas() {
		String nombre;
		Scanner sc = new Scanner(System.in);
		System.out.print("Hola muy buenas introduzca su nombre: ");
		nombre = sc.nextLine();
		System.out.print("Bienvenido " + nombre);
	}
}
