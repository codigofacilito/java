package main;

public class Main {

	public static void main(String[] args) {
		// El promedio mínimo para aprobar es de 7.
		// Si el promedio es diez = Muchas Felicidades
		// Si el promedio es aprobatorio pero menor a diez = Felicidades
		// Si el promedio no es aprobatorio = Es necesario repasar bloques
		
		int promedio = 6;
		
		if ( promedio >= 7 ) {
			
			//El promedio es aprobatorio
			
			if (promedio == 10) {
				
				System.out.println("Muchas Felicidades");
			}else {
				
				System.out.println("Felicidades");
			}
			
		}else {
			
			// El promedio NO es aprobatorio
			System.out.println("Es necesario repasar bloques");
		}
		
	}

}
