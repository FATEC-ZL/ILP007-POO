package edu.fatec;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public final class Agenda implements ActionListener{
	
	private JFrame janela = new JFrame("Agenda de Contatos");
	private JTextField txtNome = new JTextField( 50 );
	private JTextField txtDDD = new JTextField( 5 );
	private JTextField txtTelefone = new JTextField( 20 );
	private JTextField txtEmail = new JTextField( 50 );
	
	private JButton btnAdicionar = new JButton("Adicionar");
	private JButton btnPesquisar = new JButton("Pesquisar");
	private JButton btnRemover = new JButton("Remover");
	
	private JRadioButton radioMasculino = new JRadioButton("Masculino");
	private JRadioButton radioFeminino = new JRadioButton("Feminino");
	
	public Agenda() { 
		JPanel panPrincipal = new JPanel( new BorderLayout() );
		JPanel panForm = new JPanel( new GridLayout(5, 2) );
		JPanel panSexo = new JPanel( );
		JPanel panBotoes = new JPanel( );
		
		panForm.add( new JLabel("Nome : ") );
		panForm.add( txtNome );
		panForm.add( new JLabel("DDD : ") );
		panForm.add( txtDDD );
		panForm.add( new JLabel("Telefone : ") );
		panForm.add( txtTelefone );
		panForm.add( new JLabel("Email : ") );
		panForm.add( txtEmail );
		panForm.add( new JLabel("Sexo : ") );
		panForm.add( panSexo );
		
		panBotoes.add( btnAdicionar );
		panBotoes.add( btnPesquisar );
		panBotoes.add( btnRemover );
		
		ButtonGroup sexo = new ButtonGroup();
		sexo.add( radioMasculino );
		sexo.add( radioFeminino );
		panSexo.add( radioMasculino );
		panSexo.add( radioFeminino );
		
		panPrincipal.add( panForm, BorderLayout.CENTER );
		panPrincipal.add( panBotoes, BorderLayout.SOUTH );
		
		//Desenho ovo = new Desenho();
		//panPrincipal.add(ovo, BorderLayout.CENTER);
		janela.setContentPane( panPrincipal );
		
		janela.setSize( 640, 240 );
		janela.setVisible( true );
		janela.setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE );
		
		//CodigoTeste ct = new CodigoTeste();
		//btnAdicionar.addActionListener(ct);
		btnAdicionar.addActionListener(this);
	}

	public static void main(String[] args) {
		Agenda a = new Agenda();
	}

	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
		String cmd = e.getActionCommand();
		
		if("Adicionar".equals(cmd)){
			System.out.println("Registro adicionado com sucesso: " + txtNome);
		} else if ("Remover".equals(cmd)) {
			System.out.println("Registro removido com sucesso: " + txtNome);
		} else if ("Pesquisar".equals(cmd)) {
			System.out.println("Registro Pesquisado com sucesso: " + txtNome);
		}
	}
}