package br.com.fiap.bean;

import javax.swing.JOptionPane;

public class Geometria {
	
	//atributos 
	private float lado;
	private float altura;
	private double raio;
	
	//construtor vazio (gcfs)
	public Geometria() {}

	//métodos getters and setters
	public float getLado() {
		return lado;
	}

	public void setLado(float lado) {
		this.lado = lado;
	}

	public float getAltura() {
		return altura;
	}

	public void setAltura(float altura) {
		this.altura = altura;
	}

	public double getRaio() {
		return raio;
	}

	public void setRaio(double raio) {
		this.raio = raio;
	}
	
	//métodos da classe 
	public void calculaArea(float lado) {
		setLado(lado);
		float area = this.lado * this.lado;
		JOptionPane.showMessageDialog(null, "Área do quadrado: " + area);
	}
	
	public void calculaArea(float lado, float altura) {
		setLado(lado);
		setAltura(altura);
		float area = this.lado * this.altura;
		JOptionPane.showMessageDialog(null, "Área do retângulo: " + area);
	}
	
	public void calculaArea(double raio) {
		setRaio(raio);
		final double PI = 3.1416;
		double area = PI * Math.pow(this.raio, 2);
		JOptionPane.showMessageDialog(null, "Área do círculo: " + area);
	}
	
}
