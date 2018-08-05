package main;

public class Triangulo extends Figura {
	
	private float base;
	private float altura;
	
	public Triangulo(float base, float altura) {
		this.base = base;
		this.altura = altura;
	}
	
	@Override
	public float area() {
		return (base * altura) / 2;
	}
	
	
}
