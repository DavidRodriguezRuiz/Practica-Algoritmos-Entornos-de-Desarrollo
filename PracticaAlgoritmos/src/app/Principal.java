package app;
import util.Algoritmos;

public class Principal {
	
	public static void main(String[] args) {
		
		int[] numeros = new int [5];
		int[] resultadoFactorial = new int [5];
		int[] resultadoFibonacci = new int [5];
		boolean[] resultadoPrimo = new boolean [5];
			
		/**
		 * 
		 * BUCLE DE NÚMEROS ALEATORIOS
		 * 
		 *
		 **/
		for (int i=0; i<numeros.length; i++){
			numeros[i] = (int) Math.floor(Math.random() * (10 - 1 + 1)) + 1;
		}
		
		/**
		 * 
		 * SACAR EL FACTORIAL DE UN NÚMERO
		 * 
		 *
		 **/
		for (int i=0; i<numeros.length; i++){
			if (numeros[i] == 0 || numeros[i] == 1) {
				resultadoFactorial[i] = 1;
			}
			resultadoFactorial[i] = i * resultadoFactorial[i];
			System.out.println("El valor del array factorial es " + resultadoFactorial[i]);
		}
		
		/**
		 * 
		 * SACAR EL FIBONACCI DE UN NÚMERO
		 * 
		 *
		 **/
		for (int i=0; i<numeros.length; i++){
			int num1 = 0, num2 = 1;
			resultadoFibonacci[i] = numeros[i];
			resultadoFibonacci[i] = num1 + num2;
			num1 = num2;
			num2 = resultadoFibonacci[i];
			System.out.println("El valor del array fibonacci es " + resultadoFibonacci[i]);
		}
		
		/**
		 * 
		 * SACAR SI EL NÚMERO ES PRIMO O NO
		 * 
		 *
		 **/
		for (int i=0; i<numeros.length; i++){
			boolean primo = false;
			int div;
			if (numeros[i] == 1) {
				System.out.println("No es primo");
			} else {
				div = 2;
				while (numeros[i] % div != 0) {
					div++;
				}
				if (div == numeros[i]) {
					System.out.println("Primo");
					resultadoPrimo[i] = true;
				} else {
					System.out.println("No es primo");
					resultadoPrimo[i] = false;
				}
			}
		}
	}
}