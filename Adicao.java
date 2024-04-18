package br.com.fiap;

import javax.swing.JOptionPane;

public class Adicao {
	
	//Atributos
	private int numInteiro1;
	private int numInteiro2;
	private double numReal1;
	private double numReal2;
	
	//construtor vazio
	public Adicao(){}

	//métodos getters and setters
	public int getNumInteiro1() {
		return numInteiro1;
	}

	public void setNumInteiro1(int numInteiro1) {
		this.numInteiro1 = numInteiro1;
	}

	public int getNumInteiro2() {
		return numInteiro2;
	}

	public void setNumInteiro2(int numInteiro2) {
		this.numInteiro2 = numInteiro2;
	}

	public double getNumReal1() {
		return numReal1;
	}

	public void setNumReal1(double numReal1) {
		this.numReal1 = numReal1;
	}

	public double getNumReal2() {
		return numReal2;
	}

	public void setNumReal2(double numReal2) {
		this.numReal2 = numReal2;
	}
	
	//métodos da classe
	public void soma(int numInteiro1, int numInteiro2) {
		setNumInteiro1(numInteiro1);
		setNumInteiro2(numInteiro2);
		int soma = this.numInteiro1 + this.numInteiro2;
		JOptionPane.showMessageDialog(null, "A soma dos números inteiros é igual à: " + soma);
	}
	
	public void soma2(double numReal1, double numReal2) {
		setNumReal1(numReal1);
		setNumReal2(numReal2);
		double soma2 = this.numReal1 + this.numReal2;
		JOptionPane.showMessageDialog(null, "A soma dos números reais é igual à: " + soma2);
	}

} 
