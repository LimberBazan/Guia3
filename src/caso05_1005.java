import java.util.Scanner;
public class caso05_1005 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = 0;
		int i = 1;
		int mayor= 0;
		int menor = 1;
		
		while(i<=5) {
			System.out.print("Ingrese el numero "+ i +": ");
			n=sc.nextInt();
			
			if (i == 1) {
				menor = n;
			}
			if(n<menor) {
				menor = n;
			}
			i++;
		}
		
		System.out.println("El numero menor es: "+ menor);
		
	}

}