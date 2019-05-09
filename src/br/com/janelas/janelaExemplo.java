package br.com.janelas;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;

public class janelaExemplo extends JFrame {

	private JPanel contentPane;
	private JTextField txtIdCliente;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					janelaExemplo frame = new janelaExemplo();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public janelaExemplo() {
		setTitle("Gerenciar Clientes");
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblIdDoCliente = new JLabel("id do Cliente:");
		lblIdDoCliente.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblIdDoCliente.setBounds(10, 11, 82, 14);
		contentPane.add(lblIdDoCliente);
		
		txtIdCliente = new JTextField();
		txtIdCliente.setBounds(91, 8, 96, 20);
		contentPane.add(txtIdCliente);
		txtIdCliente.setColumns(10);
		
		JButton btnAcessar = new JButton("Acessar");
		btnAcessar.setBounds(208, 7, 89, 23);
		contentPane.add(btnAcessar);
	}
}
