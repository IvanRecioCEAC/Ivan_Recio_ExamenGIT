package pkg2;
import java.util.*;
public class Hola {
	public void saludos() {
		System.out.println("Hola muy buenas");
	}
	
	public void libro() {
		String libro;
		Scanner sc = new Scanner(System.in);
		System.out.println("Dime un libro que me recomiendes: ");
		libro = sc.nextLine();
		System.out.println("Prefecto me leere este libro: " + libro);
	}
}
