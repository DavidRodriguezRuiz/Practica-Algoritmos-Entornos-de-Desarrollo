package app;

public class Principal {
	
	public static void main(String[] args) {
		
		int[] numeros = new int[5];
		
		for (int i=1; i<numeros.length; i++){
			numeros[i] = (int) Math.floor(Math.random() * (10 - 1 + 1)) + 1;
		}
		
		
	}
	
}
