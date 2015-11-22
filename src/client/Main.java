package client;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;

import com.sun.xml.internal.ws.org.objectweb.asm.Label;

import util.InterfaceMensage;

import java.awt.BorderLayout;
import javax.swing.JLabel;
import java.awt.GridLayout;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;

import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Main {
	
	
	private int idConta, idConta1, idConta2;
	private double valor;
	
	private JFrame frame;
	private JPanel panel_conteudo;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
//					Registry registro = LocateRegistry.getRegistry(123);
//					
//					InterfaceMensage gerente = (InterfaceMensage) registro.lookup("adm");
//					
					Main window = new Main();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Main() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JPanel panel_mensagem = new JPanel();
		frame.getContentPane().add(panel_mensagem, BorderLayout.NORTH);
		
		JLabel lblBancoSd = new JLabel("Banco SD - Ol\u00E1 cliente :D");
		panel_mensagem.add(lblBancoSd);
		
		JPanel panel_botoes = new JPanel();
		frame.getContentPane().add(panel_botoes, BorderLayout.WEST);
		panel_botoes.setLayout(new GridLayout(5, 1, 0, 0));
		
		JButton btnCriarConta = new JButton("Criar Conta");
		btnCriarConta.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				panel_conteudo.removeAll();
				panel_conteudo.repaint();

				panel_conteudo.add(new JLabel("Banco SD - Ol\u00E1 cliente :D"));
				panel_conteudo.validate();
				panel_conteudo.repaint();

			}
		});
		panel_botoes.add(btnCriarConta);
		
		JButton btnRemoverConta = new JButton("Remover Conta");
		panel_botoes.add(btnRemoverConta);
		
		JButton btnDeposito = new JButton("Dep\u00F3sito");
		panel_botoes.add(btnDeposito);
		
		JButton btnSaque = new JButton("Saque");
		panel_botoes.add(btnSaque);
		
		JButton btnTransferencia = new JButton("Transfer\u00EAncia");
		panel_botoes.add(btnTransferencia);
		
		panel_conteudo = new JPanel();
		frame.getContentPane().add(panel_conteudo, BorderLayout.CENTER);
		panel_conteudo.setLayout(new BorderLayout(0, 0));
		
		JLabel lblVadvavdad = new JLabel("vadvavdad");
		panel_conteudo.add(lblVadvavdad, BorderLayout.CENTER);
	}

}
