package edu.fatec;

import javax.swing.*;

public class Janela {

	public static void main(String[] args) {
		JFrame janela = new JFrame("Teste de Janela");
		JLabel label = new JLabel ("Alô Mundo!");
		JButton botao = new JButton("OK");
		JPanel painel = new JPanel();
		
		janela.add(painel);
		janela.setSize(600,400);
		janela.setVisible(true);
		janela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		painel.add(label);
		painel.add(botao);
	}
}