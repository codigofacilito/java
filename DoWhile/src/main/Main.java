package main;

public class Main {

	public static void main(String[] args) {
		// Do While
		int contador = 10;
		
		// While -> 1.-Se evalua 2.-Se ejecuta el bloque
		// DO While -> 1.-Se ejecuta el bloque 2.-Se evalua
		
		while(contador < 10){
			System.out.println(contador);
			contador++;
		}
		
		do {
			System.out.println(contador);
			contador++;
		} while( contador < 10 ); 
		
		
	}

}
