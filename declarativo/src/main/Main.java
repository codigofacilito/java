package main;

import java.util.ArrayList;
import java.util.Arrays;

public class Main {

	public static void main(String[] args) {
		
		ArrayList<Integer> numeros = new ArrayList<>(
				Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10));

		int suma = 0;
		
		for(int numero : numeros) {
			if(numero > 5)
				suma += numero;
		}
		System.out.println("Resultado final, modo Imperativo : " + suma);
		
		suma = numeros.stream().filter(num -> num > 5).mapToInt(Integer::intValue).sum();
		System.out.println("Resultado final, modo Declarativo : " + suma);
		

	}

}
