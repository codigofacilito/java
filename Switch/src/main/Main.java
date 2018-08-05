package main;

public class Main {

	public static void main(String[] args) {
		// Switch
		char calificacion = 'C';

		switch(calificacion) {
		 case 'A' :
		    System.out.println("Excelente!"); 
		    break;
		 case 'B' :
		 case 'C' :
		    System.out.println("Bien hecho");
		    break;
		 case 'D' :
		    System.out.println("Aprobatorio");
		    break;
		 case 'F' :
		    System.out.println("Puedes mejorar");
		    break;
		 default :
		    System.out.println("Calificación no válida");
		}
		
		
	}

}
