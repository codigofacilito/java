package main;

public class Main {

	public static void main(String[] args) {

		Usuario usuario1 = new Usuario();
		Usuario usuario2 = new Usuario("Usuario2");
		Usuario usuario3 = new Usuario("Usuario3", "Password");
		
		usuario1.saluda();
		usuario2.saluda();
		usuario3.saluda();
		
	}

}
