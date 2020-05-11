import java.util.Scanner;

public class caso09_1005 {

	public static void main(String[] args) {
		String nombre = " ", s1name = "Nadie", s2name = "Nadie";
		int n1 = 0, n2 = 0, n3 = 0;
		float np = 0, asist = 0, menor = 0,mayor = 0;
		int i = 1, a = 0, d = 0;
		String estado = "S";
		
		Scanner sc = new Scanner(System.in);
		
		while (estado.contentEquals("S")){
			System.out.println("-----------------");
			System.out.println("Registro " + i + ":");
			System.out.println("-----------------");
			
			System.out.print("Ingrese su nombre: ");
			nombre=sc.nextLine();
			
			System.out.print("Nota 1: ");
			n1=sc.nextInt();
			
			System.out.print("Nota 2: ");
			n2=sc.nextInt();
			
			System.out.print("Nota 3: ");
			n3=sc.nextInt();
			
			System.out.print("Asistencia [1-12]: ");
			asist=sc.nextInt();
			
			np = (n1*0.2f) + (n2*0.3f) + (n3*0.5f);
			
			asist = asist/0.12f;
			
			System.out.println("-----------------");
			System.out.println("Resultado: ");
			System.out.println("-----------------");
			
			System.out.println("Promedio:" + np);
			System.out.println("Asistencia: "+ asist + "%");
			
			if(np>=13 && asist >= 70) {
				System.out.println("Estado: Obtiene certificado");
				a++;
			}else {
				System.out.println("Estado: Sin certificado");
				d++;
			}
			sc.nextLine();
			System.out.println("¿Registrar otro?<S/N>");
			estado = sc.nextLine();
			
			if (i == 1) {
				menor = np;
				s2name = nombre;
			}
			
			if(np>mayor) {
				mayor = np;
				s1name = nombre;
			}
			if(np<menor) {
				menor = np;
				s2name = nombre;
			}
			
			
			if(estado.contentEquals("N")) {
				System.out.println("---------------------------");
				System.out.println("        Resumen:");
				System.out.println("---------------------------");
				System.out.println("Mayor promedio " + mayor+ " de " + s1name);
				System.out.println("Menor promedio " + menor+ " de " + s2name);
				System.out.println("Numero de alumnos aprobados: "+ a);
				System.out.println("Numero de alumnos desaprobados: "+ d);
			}
			i++;
		}
		
	}

}