package main;

public class Main {

	public static void main(String[] args) {
		// Clases y Objetos
		
		Perro lassie = new Perro(); //Instancia
		
		lassie.establecerAtributos("Lassie", "Collie", 4); //Argumentos
		
		System.out.println("El nombre es : " + lassie.nombre );
		System.out.println("La raza es : " + lassie.raza );
		System.out.println("La edad es : " + lassie.edad );
		
		lassie.comer();
		lassie.ladrar();
		lassie.dormir();
		
		
		
	}

}
