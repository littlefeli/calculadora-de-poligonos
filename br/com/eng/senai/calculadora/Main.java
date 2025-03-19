package br.com.eng.senai.calculadora;

import br.com.eng.senai.calculadora.model.Circunferencia;
import br.com.eng.senai.calculadora.model.Quadrado;
import br.com.eng.senai.calculadora.model.Retangulo;
import br.com.eng.senai.calculadora.model.Trapezio;
import br.com.eng.senai.calculadora.model.Triangulo;

public class Main {
	public static void main(String args[]) {
		
		//Circunferencia
		Circunferencia c1 = new Circunferencia();
		c1.setRaio(5);
		c1.resultado();
		
		//Triangulo
		Triangulo t1 = new Triangulo();
		t1.setBase(6);
		t1.setAltura(4);
		t1.resultado();
		
		//Trapezio
		Trapezio tr1 = new Trapezio();
		tr1.setBaseMaior(8);
		tr1.setBaseMenor(5);
		tr1.setAltura(4);
		tr1.resultado();
		
		//Quadrado
		Quadrado q1 = new Quadrado();
		q1.setLado(4);
		q1.resultado();
		
		
		//Retangulo
		Retangulo r1 = new Retangulo();
		r1.setBase(6);
		r1.setAltura(3);
		r1.resultado();
		
	}
}
