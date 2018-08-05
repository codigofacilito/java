package main;

public class Main {

	public static void main(String[] args) {
		//Escope
		
		int promedio = 10;
		
		if (promedio > 7) {
			String mensaje = "Felicidades, tu promedio es";
			
			System.out.println(mensaje);
			
			if (promedio == 10) {
				
				System.out.println("Tienes un promedio de 10");
			}
		}
		
	}

}
