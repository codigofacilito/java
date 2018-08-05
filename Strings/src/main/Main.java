package main;

public class Main {

	public static void main(String[] args) {
		
		float pi = 3.14159265359f;

		String resultado = String.format("%1f - Decimales: %1$.2f", pi, pi);
		System.out.println(resultado);
		
				
//		String cadena1 = "HOLA";
//		String cadena2 = "hola";
//		
//		
//		boolean resultado = cadena2.toUpperCase().equals(cadena1.toUpperCase());
//		System.out.println(resultado);
//		
//		resultado = cadena1.equalsIgnoreCase(cadena2);
//		System.out.println(resultado);
		
	}

}
