package com.educacionit.programa;

import com.educacionit.modelos.Calculadora;

public class AppPrincipal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Calculadora miCalculadora = new Calculadora();
		
		miCalculadora.sumar(5, 8);
		miCalculadora.restar(5, 8);
		miCalculadora.dividir(5, 0);
		miCalculadora.multiplicar(5, 8);
		
		miCalculadora.mostrarResultado(miCalculadora.sumar(5, 8), "suma");
		miCalculadora.mostrarResultado(miCalculadora.restar(5, 8), "resta");
		miCalculadora.mostrarResultado(miCalculadora.dividir(5, 2), "divicion");
		miCalculadora.mostrarResultado(miCalculadora.multiplicar(5, 8), "multiplicacion");
		

	}

}
