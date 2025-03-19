package br.com.eng.senai.calculadora.model;

public class Retangulo {
	private double base;
	private double altura;
	private double area;
	private double perimetro;
	
	public void setBase(double base) {
		if(base > 0) {
			this.base = base;
		} else {
			System.out.println("A base precisa ser maior do que zero.");
		}
	}
	
	public void setAltura(double altura) {
		if(altura > 0) {
			this.altura = altura;
		} else {
			System.out.println("O valor da altura precisa ser maior do que zero.");
		}
	}
	
	private double calcularArea() {
		area = base * altura;
		return area;
	}
	
	private double calcularPerimetro() {
		perimetro = (base + altura)*2;
		return perimetro;
	}
	
	public void resultado() {
		System.out.println("==================");
		System.out.println("DADOS DO RETÂNGULO");
		System.out.println("==================");
		System.out.println("BASE: " + base);
		System.out.println("ALTURA: " + altura);
		System.out.println("ÁREA: " + String.format("%.2f", calcularArea()));
		System.out.println("PERÍMETRO:  " + String.format("%.2f", calcularPerimetro()));
		System.out.println("==================");
	}
		
}
