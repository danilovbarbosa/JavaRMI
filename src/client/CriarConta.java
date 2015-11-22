package client;

import javax.swing.JPanel;
import java.awt.BorderLayout;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.GridLayout;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class CriarConta extends JPanel {
	private JTextField textField_nomeCliente;
	private JTextField textField_IdConta;

	/**
	 * Create the panel.
	 */
	public CriarConta() {
		setLayout(new BorderLayout(0, 0));
		
		JPanel panel_Detalhe = new JPanel();
		add(panel_Detalhe, BorderLayout.NORTH);
		
		JLabel lblCriarConta = new JLabel("Criar Conta");
		panel_Detalhe.add(lblCriarConta);
		
		JPanel panel_conteudo = new JPanel();
		add(panel_conteudo, BorderLayout.CENTER);
		panel_conteudo.setLayout(new GridLayout(3, 2, 0, 0));
		
		JLabel lblInformeSeuNome = new JLabel("Informe seu nome:");
		panel_conteudo.add(lblInformeSeuNome);
		
		textField_nomeCliente = new JTextField();
		panel_conteudo.add(textField_nomeCliente);
		textField_nomeCliente.setColumns(10);
		
		JLabel lblNewLabel = new JLabel("Informe o n\u00FAmero da conta");
		panel_conteudo.add(lblNewLabel);
		
		textField_IdConta = new JTextField();
		panel_conteudo.add(textField_IdConta);
		textField_IdConta.setColumns(10);
		
		JButton btn_CriarConta = new JButton("Criar Conta");
		btn_CriarConta.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
//				if (){
//					
//					
//				}else{
//					JOptionPane.showMessageDialog(null, "Conta já existente.");
//				}
				
			}
		});
		add(btn_CriarConta, BorderLayout.SOUTH);

	}

}
