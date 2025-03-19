package br.com.eng.senai.calculadora.model;

public class Triangulo {
	private double base;
	private double altura;
	private double area;
	
	
	public void setBase(double base) {
		if(base > 0) {
			this.base = base;
		} else {
			System.out.println("A base precisa ser um valor maior do que zero.");
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
		area = (altura * base) / 2;
		return area;
	}
	
	public void resultado() {
		System.out.println("==================");
		System.out.println("DADOS DO TRIANGULO");
		System.out.println("==================");
		System.out.println("BASE: " + base);
		System.out.println("ALTURA: " + altura);
		System.out.println("AREA: " + String.format("%.2f", calcularArea()));
		System.out.println("==================");
	}
}
