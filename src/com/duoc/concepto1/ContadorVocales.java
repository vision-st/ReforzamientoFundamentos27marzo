package com.duoc.concepto1;

import java.util.Scanner;

public class ContadorVocales {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int totalVocales = 0;
		String seguir = "s";
		char letrita = 'a';
		
		// ==
		
		while(seguir.equals("s")) {
			System.out.println("Ingrese la palabra");
			String palabra = scanner.next().toLowerCase();
			
			int vocalesEnPalabra = 0;
			
			for(int i = 0; i < palabra.length(); i++) {
				char letra = palabra.charAt(i);
				if(letra == 'a' || letra == 'e' || letra == 'i' || letra == 'o' || letra == 'u') {
					vocalesEnPalabra++;
				}
				/*if(palabra.contains(String.valueOf(letra))) {
					vocalesEnPalabra++;
				}*/
			}
			
			System.out.println("Vocales en la palabra: " + palabra + " : " +vocalesEnPalabra);
			
			totalVocales += vocalesEnPalabra;
			
			System.out.print("¿Continuar? (s/n): " );
			seguir = scanner.next();
		}
		
		System.out.println("Total de vocales contadas: " + totalVocales);
		scanner.close();

	}
}
