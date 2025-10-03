package Examen2024_T1;

import java.util.Scanner;

public class Ejercicio02 {

	public static void main(String[] args) {
		// Constante
		final double IMPUESTO_MENOR_1000 = 0.1;
		final double IMPUESTO_MAYOR_1000 = 0.15;
		
		// Variable para almacenar el salario en bruto
		double salarioBruto;
		
		// Variable para almacenar el salario neto
		double salarioNeto;
		
		//Número de horas trabajadas
		int numHoras;
		
		//Precio por hora
		double precioHora;
		
		// Variable para el desuento a aplicar
		double descuento;
		
		// Creamos el Scanner
		Scanner reader = new Scanner(System.in);

		// Preguntamos por el precio por hora
		System.out.println("¿Cuántas horas has trabajado esta semana?");
		numHoras = reader.nextInt();
		
		// Preguntamos por el precio por hora
		System.out.println("¿Cuántas cobras por hora?");
		precioHora = reader.nextDouble();
		
		//Calculamos el salario bruto (sin impuestos)
		salarioBruto = numHoras*precioHora; 
		
		// Calculamos el descuento a aplicar atendiendo al salario bruto
		descuento = (salatioBruto < 1000) ? 0.1 : 0.15; 
		
		// Calculamos el salario neto
		salarioNeto = salarioNeto - salarioBruto*descuento; 
		
		// Mostramos el salario neto
		System.out.println("Tu salario neto es " + salarioNeto);
		
		// Cerramos el scanner
		reader.close(); 

}

}
