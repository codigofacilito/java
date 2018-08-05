package main;

public class Calculadora {
	
	public int suma(int... numeros) { //n -> int Arreglo
		int suma = 0;
		
		System.out.println(numeros.length);
		
		for(int numero : numeros)
			suma += numero;
		
		return suma;
	}
	
	public float suma(float... numeros) { //n -> int Arreglo
		int suma = 0;
		
		System.out.println(numeros.length);
		
		for(float numero : numeros)
			suma += numero;
		
		return suma;
	}
	
	public double suma(double... numeros) { //n -> int Arreglo
		int suma = 0;
		
		System.out.println(numeros.length);
		
		for(double numero : numeros)
			suma += numero;
		
		return suma;
	}
	
}
