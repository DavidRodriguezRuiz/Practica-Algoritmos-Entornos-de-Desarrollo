package util;

public abstract class Algoritmos {

	/**
	 * Devuelve el factorial del numero especificado.
	 * 
	 * @param numero el numero del que queremos calcular el factorial.
	 * @return total del factorial del numero especificado.
	 */
	public static int Factorial(int numero) {
		int factorial = 1;
		if (numero == 0 || numero == 1) {
			return 1;
		}
		for (int i = 1; i < numero; i++) {
			factorial = i * factorial;
		}
		return factorial;

	}

	public static int Fibonacci(int numero) {
		int num1 = 0, num2 = 1, fibonacci = 1;
		System.out.println(num1);
		for (int i = 1; i < numero; i++) {
			System.out.println(fibonacci);
			fibonacci = num1 + num2;
			num1 = num2;
			num2 = fibonacci;
		}
		return fibonacci;
	}
	
	
	public static boolean esPrimo(int numero) {
		boolean primo = false;
		int div;
		if (numero == 1) {
			System.out.println("No es primo");
		} else {
			div = 2;
			while (numero % div != 0) {
				div++;
			}
			if (div == numero) {
				System.out.println("Primo");
				primo = true;
			} else {
				System.out.println("No es primo");
				primo = false;
			}
		}
		return primo;
	}
}