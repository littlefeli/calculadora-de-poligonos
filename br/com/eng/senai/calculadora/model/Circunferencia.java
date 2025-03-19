package br.com.eng.senai.calculadora.model;

public class Circunferencia {
	private double raio;
	private double area;

	public void setRaio(double raio) {
		if(raio > 0) {
			this.raio =raio;
		} else {
			System.out.println("O valor do raio precisa ser maior que zero.");
		}
	}
	
	private double calcularArea() {
		area = Math.PI * Math.pow(raio, 2);
		return area;
	}
	
	public void resultado() {
		System.out.println("==================");
		System.out.println("DADOS DA CIRCUNFERÊNCIA");
		System.out.println("==================");
		System.out.println("RAIO: " + raio);
		System.out.println("ÁREA: " + String.format("%.2f", calcularArea()));
		System.out.println("==================");
	}
}
