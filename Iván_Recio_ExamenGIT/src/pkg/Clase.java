package pkg;

import java.util.*;

public class Clase {
	public void holaMuyBuenas() {
		String nombre;
		Scanner sc = new Scanner(System.in);
		System.out.println("Hola muy buenas introduzca su nombre: ");
		nombre = sc.nextLine();
		System.out.println("Bienvenido " + nombre);
	}
	
	public void edad() {
		int edad;
		Scanner sn = new Scanner(System.in);
		System.out.println("Introduzca su edad: ");
		edad = sn.nextInt();
		System.out.println("Te ves muy mayor para tener " + edad + " años");
	}
}
