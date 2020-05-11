import java.util.Scanner;
public class Caso02_0505 {

	public static void main(String[] args) {
		int c = 1;
		int sum = 0;
		int num;
		
		System.out.println("Ingrese el numero: ");
		Scanner sc = new Scanner(System.in);
		num = sc.nextInt();
		
		while(c<=num) {
			sum = sum + c;
			c++;
		}
		
		System.out.println("la suma es: "+ sum);
		
		
	}

}
