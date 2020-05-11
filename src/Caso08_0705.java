import java.util.Scanner;

public class Caso08_0705 {

	public static void main(String[] args) {
		int num;
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Ingrese el numero:");
		num = sc.nextInt();
		
		for(int x=1; x<=15 ;x+=1) {
			System.out.println(num + " * " + x + " = " + (num*x));
		}

	}

}
