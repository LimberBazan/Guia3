import java.util.Scanner;
public class Caso03_0505 {

	public static void main(String[] args) {
		int n = 1;
		int fact= 1;
		int i = 1;
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Ingrese el numero: ");
		n = sc.nextInt();
		
		if (n <= 7) {
			while (i<=n) {
				fact = fact * i;
				i++;
			}
			System.out.println("El factoria de "+n+" es :"+ fact);
		}else {
			System.out.println("El numero es superior de 7");
		}
		

	}

}
