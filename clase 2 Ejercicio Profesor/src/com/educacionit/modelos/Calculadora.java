package com.educacionit.modelos;

public class Calculadora {
	
	//Metodos de la clase calculadora
	public float sumar(float n1, float n2) {
		float resultado = n1 + n2;
		return resultado;
		
	}
	
	public float restar(float n1, float n2) {
		float resultado = n1 - n2;
		return resultado;
	}
	
	public float multiplicar(float n1, float n2) {
		float resultado = n1*n2;
		return resultado;
		
	}
	
	public float dividir(float n1, float n2) {
		//Validar qe n2 no es cero
		float resultado = 0;
		if (n2!= 0) {
			resultado = n1 / n2;
		} else {
			mostrarError("No se puede dividir por cero");
		}
		return resultado;
	}
	
	
	
	public void mostrarError(String mensajeAMostrar) {
		System.out.println(mensajeAMostrar);
	}
	
	public void mostrarResultado(float resultado, String operacionRealizada) {
		System.out.println("El resultado de la " + operacionRealizada + " es " + resultado);
		
	}
	
	
	

}
