package com.duoc.concepto1;

import java.util.Scanner;

public class ValoresBorde {

	public static void main(String[] args) {
		
		int velocidad = -8;
		
		if(velocidad < 0) {
			System.out.println("Velocidad invalida");
		} else if(velocidad == 0) {
			System.out.println("Vehiculo detenido");
		} else if(velocidad <= 60) {
			System.out.println("Zona urbana: velocidad permitida");
		} else if(velocidad <= 100) {
			System.out.println("Carretera: velocidad permitida");
		} else {
			System.out.println("Exceso de velocidad");
		}
					
	}

}
