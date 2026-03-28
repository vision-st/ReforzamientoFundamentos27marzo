package com.duoc.concepto1;

import java.util.Scanner;

public class CalculadoraPropina {
	
	public static void main(String[] args) {
		
		//===ENTRADA
		Scanner scanner = new Scanner(System.in);
		System.out.println("Ingrese el total de la cuenta ($)");
		double totalCuenta = scanner.nextDouble();
		System.out.println("Ingrese el porcentaje de propina: ");
		int porcentaje = scanner.nextInt();
		
		//===PROCESO
		double propina = totalCuenta * porcentaje / 100.0;
		double totalFinal = totalCuenta + propina;
		
		//===SALIDA
		System.out.printf( "Propina (%d%%): $%.2f%n", porcentaje, propina);
		System.out.printf("Total a pagar: $%.2f%n", totalFinal);
		System.out.println("------------------------------------------");
		System.out.println("Propina : " + porcentaje + " propina: " + propina);
		

	}

}
