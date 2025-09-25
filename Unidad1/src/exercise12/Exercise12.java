package exercise12;

import java.util.Scanner;

public class Exercise12 {

	public static void main(String[] args) {
		// crear variables de las frutas de la frutertia (manzana y pera)
		// mostrar al usuario el precio de la fruta comprada en euro por kilo
		
		// Crear el Scanner
		Scanner reader = new Scanner (System.in); 
		String fruta; 
		String manzana;
		String pera; 
		double a, b; 
		a = 2.35;  
		b = 1.95; 
		
		// Preguntar al usuario qué quiere comprar 
        System.out.println("¿Qué quieres comprar?");
        fruta = reader.nextLine();
        
        // Preguntar al usuario cuántas manzanas quiere comprar 
        System.out.println("¿Cúanto pesa tu manzana?");
        manzana = reader.nextLine();
        
     // Preguntar al usuario cuánto quiere comprar 
        System.out.println("¿Cúanto pesa tu manzana?");
        manzana = reader.nextLine();
	}

}
