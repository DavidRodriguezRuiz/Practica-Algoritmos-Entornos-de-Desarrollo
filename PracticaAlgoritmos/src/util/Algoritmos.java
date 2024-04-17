package util;

public abstract class Algoritmos {
	
	/**
     * Devuelve el factorial del numero especificado.
     * 
     * @param numero	el numero del que queremos calcular el factorial.
     * @return			total del factorial del numero especificado.
     */
	public static int [] factorial (int[] numeros){
		int[] factorial = new int [numeros.length];
		for (int i=1; i<=numeros.length; i++) {
			factorial[i] *= i;
		}
		return factorial;
	}
}