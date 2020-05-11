import java.util.Scanner;
public class caso07_0705 {

	public static void main(String[] args) {
		String nombre;
		
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Ingrese su nombre: ");
		nombre = sc.nextLine();
		
		for(int i=1; i<=10; i++) {
			System.out.println("Bienvenido "+nombre+" al curso");
			
		}

	}

}
