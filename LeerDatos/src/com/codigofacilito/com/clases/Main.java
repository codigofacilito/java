package com.codigofacilito.com.clases;

import javax.swing.JOptionPane;

public class Main {

	public static void main(String[] args) {
		
		String nombre = JOptionPane.showInputDialog(null, "¿Cúal es tu nombre?");
		int edad = Integer.parseInt(  
					JOptionPane.showInputDialog(null, "¿Cúal es tu edad?"));
		
		String mensaje = "Hola " + nombre + " con una edad de " + edad;
		
		JOptionPane.showMessageDialog(null, mensaje);
		
		
	}
	
}
