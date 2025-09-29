package ejercicio01;

import java.util.Scanner;

public class Ejercicio01 {

	public static void main(String[] args) {
		// Variable of the number that were typing in
					int number1;
					int number2;
					int number3;
				
					// Declaramos una variable paea almacenar la media
					double media;

			        // Creamos Scanner 
			        Scanner reader = new Scanner (System.in) ;
			        
			        // Pedimos al usuario 3 número al usuario
			        System.out.println("Por favor, introduce número 1:");
			        number1 = reader.nextInt();
			        
			        System.out.println("Por favor, introduce número 2:");
			        number2 = reader.nextInt();
			        
			        System.out.println("Por favor, introduce número 3:");
			        number3 = reader.nextInt();
			        
			    	// Calculamos la media
			    	media = (number1 + number2 + number3) / 3.0; 
			    	
			    	// Mostrar la media
			    	System.out.println("La media es: " + media);
			    		
			    	// Cerramos Scanner
			    	reader.close();


	}

}
