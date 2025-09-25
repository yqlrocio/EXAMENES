package exercise14;

import java.nio.file.FileSystemNotFoundException;
import java.util.Scanner;

public class Exercise14 {

	public static void main(String[] args) {
		// Pedir al usuario las notas de los tres trimestres
		// Calcular la nota media entre los tres trismestres 
		// Mostrar al usuario la nota media con decimales 
		// Mostar al usario la nota media pero solo con la parte entera
		
		//Crear Scanner
		Scanner sc = new Scanner(System.in); 
		
		//Crear variables
		int nota1; 
		int nota2;
		int nota3;
		
		//Pedir al usuario las notas del primer, segundo y tercer trimestre: mostra al usuario sus notas
		System.out.println("¿Cúanto has sacado en el primer trimestre?");
		nota1 = sc.nextInt();
		
		System.out.println("¿Cúanto has sacado en el segundo trimestre?");
		nota2 = sc.nextInt();
		
		System.out.println("¿Cúanto has sacado en el tercer trimestre?");
		nota3 = sc.nextInt();

		//Calcular la media: nota que sale en el expediente académico (con decimales)
		System.out.println("Tu nota en el boletín es de:" +  (nota1 + nota2 + nota3)/3);
		//ME FALTA PONER COMO ES  CON DECIMALES 0...
		
		//Calcular la media: nota que sale en el boletín (solo la parte entera)
		System.out.println("Tu nota en el boletín es de:" + ((nota3+nota2+nota1)/3));
		
	}

}
