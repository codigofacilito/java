package main;

public class Main {

	public static void main(String[] args) {
		// While
		int contador = 0; 
		int numero = 55000;
		
		// 100 / 10 =  10
		// 250 / 20 = 25
		
		while( numero > 0 ) {
			numero = numero / 10;
			contador++;
		}
		
		System.out.println("El número posee " + contador + " dígitos");
		
	}

}
