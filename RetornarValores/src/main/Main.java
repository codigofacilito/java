package main;

public class Main {

	public static void main(String[] args) {
		// Retornar valores

		Triangulo triangulo = new Triangulo();
		triangulo.base = 10;
		triangulo.altura = 20;
		
		float resultado = triangulo.area();
		System.out.println(resultado);
		
	}

}
