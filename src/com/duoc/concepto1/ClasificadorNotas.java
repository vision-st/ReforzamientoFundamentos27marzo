package com.duoc.concepto1;

import java.util.Scanner;

public class ClasificadorNotas {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Ingrese la nota (1.0 a 7.0)");
		double nota = scanner.nextDouble();
		
		// Los rangos van de mayor a menor para evitar superposicion
		if(nota >= 6.0) {
			System.out.println("Excelente, APROBADO");
		} else if (nota >= 5) {
			System.out.println("Muy bien, APROBADO");
		} else if (nota >= 4) {
			System.out.println("APROBADO");
		} else if (nota >= 1.0) {
			System.out.println("Reprobado :( ");
		} else {
			System.out.println("Nota fuera de rango");
		}
		scanner.close();
					
	}

}
