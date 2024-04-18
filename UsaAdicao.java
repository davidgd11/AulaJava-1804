package br.com.fiap;

import javax.swing.JOptionPane;

public class UsaAdicao {

	public static void main(String[] args) {
		
		Adicao ad = new Adicao();
		String aux, escolha = "sim";
		int opcao;
		
		while (escolha.equalsIgnoreCase("sim")) {
			try {
				aux = JOptionPane.showInputDialog("Você deseja fazer a soma com números: "
						+ "\n(1) Inteiros \n(2) Reais");
				opcao = Integer.parseInt(aux);
				
				switch(opcao) {
				case 1: 
					aux = JOptionPane.showInputDialog("Digite o valor do primeiro número inteiro:");
					int num1 = Integer.parseInt(aux);
					aux = JOptionPane.showInputDialog("Digite o valor do segundo número inteiro:");
					int num2 = Integer.parseInt(aux);
					ad.soma(num1, num2);
					break;
				case 2:
					aux = JOptionPane.showInputDialog("Digite o valor do primeiro número real:");
					double num3 = Double.parseDouble(aux);
					aux = JOptionPane.showInputDialog("Digite o valor do segundo número real:");
					double num4 = Double.parseDouble(aux);
					ad.soma2(num3, num4);
					break;
				default:
					throw new Exception("Escolha incorreta!");
				}
				
				escolha = JOptionPane.showInputDialog("Deseja continuar? (sim ou não) ");
				
			} catch (Exception e) {
				JOptionPane.showMessageDialog(null, "Erro: " + e.getMessage());
				}
			}
		
		JOptionPane.showMessageDialog(null, "Fim de programa!");
		
	}

}
