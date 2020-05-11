import java.util.Scanner;

public class caso10_1005 {

	public static void main(String[] args) {
		String emple = " ", s1name = "Nadie", s2name = "Nadie", s3name = "Nadie";
		int ht = 0, th = 0, late = 0, sueldo = 0;
		float bn = 0, desc = 0, sueldon = 0, porc = 0;
		float mayor = 0, menor = 0, late2 = 0;
		int i = 1, m = 0;
		String estado = "S";
		
		Scanner sc = new Scanner(System.in);
		
		while (estado.contentEquals("S")){
			System.out.println("**************************");
			System.out.println("Registro (" + i + ")");
			System.out.println("**************************");
			
			System.out.print("Empleado: ");
			emple=sc.nextLine();
			System.out.print("Horas trabajadas: ");
			ht=sc.nextInt();
			System.out.print("Tarifa por hora: ");
			th=sc.nextInt();
			System.out.print("Minutos de tardanza: ");
			late=sc.nextInt();
			
			sueldo = ht * th;
			bn = sueldo *0.15f;
			desc = 0f;
			
			if(ht<50) {
				bn = 0f;
			} else if (ht<60) {
				bn = sueldo * 0.02f;
			} else if (ht<70) {
				bn = sueldo * 0.08f;
			} else if (ht<80) {
				bn = sueldo * 0.13f;
			}
			
			if(late>15){
				desc = (sueldo * 0.003f)*late;
			}
			if(late>30){
				desc = (sueldo * 0.005f)*late;
			}
			
			sueldon = (sueldo + bn) - desc;
			porc = ht /0.8f;
			
			System.out.println("***************");
			System.out.println("Resultados");
			System.out.println("***************");
			System.out.println("Sueldo bruto:	"+ sueldo);
			System.out.println("Bonificacion:	"+ bn);
			System.out.println("Descuento:	"+ desc);
			System.out.println("Sueldo neto:	"+ sueldon);
			System.out.println("%Alcanzado:	"+ porc+"%");
			System.out.println("***************");
			
			sc.nextLine();
			System.out.print("¿Otro empleado?  [S/N]:");
			estado = sc.nextLine();
			
			if (i == 1) {
				late2 = late;
				menor = sueldon;
				s2name = emple;
				s3name = emple;
			}
			
			if(sueldon>mayor) {
				mayor = sueldon;
				s1name = emple;
			}
			if(sueldon<menor) {
				menor = sueldon;
				s2name = emple;
			}
			if(late>late2) {
				late2 = late;
				s3name = emple;
			} if (porc>90) {
				m++;
			}
			
			if(estado.contentEquals("N")) {
				System.out.println("---------------------------");
				System.out.println("        Resumen:");
				System.out.println("---------------------------");
				System.out.println("Número de empleados registrados"+ i);
				System.out.println("Sueldo neto mayor: "+ mayor+" pertenece a: "+ s1name);
				System.out.println("Sueldo neto menor: "+ menor+" pertenece a: "+ s2name);
				System.out.println("Mayor cantidad de minutos de tardanza: "+ s3name +" ("+ late2 +" min.)");
				System.out.println("Número de empleados que alcanzaron más del 90% de la meta: "+ m);
			}
			
			
			i++;
		}
	}	
}