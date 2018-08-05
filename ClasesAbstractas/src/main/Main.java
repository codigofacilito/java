package main;

public class Main {

	public static void main(String[] args) {
		
		Figura figuras[] = new Figura[2];
		
		Circulo circulo = new Circulo(9f);
		Triangulo triangulo = new Triangulo(10f, 5f);
		
		figuras[0] = circulo;
		figuras[1] = triangulo;
		
		System.out.println(figuras[0].area());
		System.out.println(figuras[1].area());
		
	}

}
