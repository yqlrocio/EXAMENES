package ejercicio1;

public class Ejercicio1 {

	public static void main(String[] args) {
	
			//1. Variable of the number that were typing in
			int number;
			
	        //2. Ask to the user for a number
	        System.out.println("Por favor, introduce un número:");

	        //3. We create the Scanner 
	        Scanner reader = new Scanner (System.in) ;
	        
	    	//4. Then we read the number
	        number = reader.nextInt();
	        
	    	//5. Now we know the number and we can print it
	    		System.out.println("Tu número es "+ (number));
	    		
	    	//6. Finally, we close the Scanner we created
	    		reader.close();

	}

}
