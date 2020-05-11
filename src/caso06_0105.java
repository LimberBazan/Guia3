import java.util.Scanner;
public class caso06_0105 {

	public static void main(String[] args) {
		String Nombre = " ";
		int edad;
		int i = 0, a = 0;
		String estado = "S";
		
		Scanner sc = new Scanner(System.in);
		
		while (estado.contentEquals("S")){
			System.out.println("Ingrese su nombre: ");
			Nombre=sc.nextLine();
			
			System.out.println("Ingrese su edad: ");
			edad=sc.nextInt();
			
			i++;
			if (edad >=18) {
				System.out.println("Estado del participante: Apto para votar");
				a++;
			}else {
				System.out.println("Estado del participante: Menor de edad");
			}
			sc.nextLine();
			
			System.out.println("¿Desea registrar otro participante?<S/N>");
			estado = sc.nextLine();
		}
		
		System.out.println("RESUMEN ");
		System.out.println("-----------------");
		System.out.println("Participantes registrados: "+ i);
		System.out.println("Participantes aptos para votar: "+ a);
	}

}
