package ejercicio1;

import java.util.Scanner;

public class Ejercicio1 {

	public static void main(String[] args) {
		/*
		 * Pedir al usaurio 3 número enteros
		 * Calcular la media
		 * Mostrar la operación con decimales
		 */
		
	 
		// Crear Scammer
		Scanner reader = new Scanner(System.in);
		
		// variables
		int nota1;
		int nota2;
		int nota3; 
		
		// Pedir al usuario 3 número enteros
		System.out.println("Introduce primer número:");
		nota1 = reader.nextInt();
		
		System.out.println("Introduce segundo número:");
		nota2 = reader.nextInt();
		
		System.out.println("Introduce tercer número:");
		nota3 = reader.nextInt();
		
		//Calcular la media
		System.out.println("Tu nota media es de:" +  (nota1 + nota2 + nota3)/3);
		
	}

}
