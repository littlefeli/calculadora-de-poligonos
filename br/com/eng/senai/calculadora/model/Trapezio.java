package br.com.eng.senai.calculadora.model;

public class Trapezio {
	private double baseMaior;
	private double baseMenor;
	private double altura;
	private double area;
	
	public void setBaseMaior(double baseMaior) {
		if(baseMaior > 0) {
			this.baseMaior = baseMaior;
		} else {
			System.out.println("O valor da base precisa ser maior do que zero");
		}
	}
	
	public void setBaseMenor(double baseMenor) {
		if(baseMenor > 0) {
			this.baseMenor = baseMenor;
		} else {
			System.out.println("O valor da base precisa ser maior do que zero");
		}
	
	}
		
	public void setAltura(double altura) {
		if(altura > 0) {
			this.altura = altura;
		} else {
			System.out.println("A altura precisa ser maior do que zero.");
		}
	}
	
	private double calcularArea() {
		area = (baseMaior + baseMenor)* altura/2;
		return area;
	}
	
	public void resultado() {
		System.out.println("==================");
		System.out.println("DADOS DO TRAPEZIO");
		System.out.println("==================");
		System.out.println("BASE MAIOR: " + baseMaior);
		System.out.println("BASE MENOR: " + baseMenor);
		System.out.println("ALTURA: " + altura);
		System.out.println("AREA: " + String.format("%.2f", calcularArea()));
		System.out.println("==================");
	}
}
