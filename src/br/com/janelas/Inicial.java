package br.com.janelas;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Font;

public class Inicial extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Inicial frame = new Inicial();
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
	public Inicial() {
		setTitle("Gerenciar Pessoas");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btnPessoaFisica = new JButton("Pessoa Fisica");
		btnPessoaFisica.setFont(new Font("Tahoma", Font.BOLD, 11));
		btnPessoaFisica.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				JanelaPessoaFisica jpf = new JanelaPessoaFisica();
				jpf.setVisible(true);
			}
		});
		btnPessoaFisica.setBounds(67, 98, 111, 23);
		contentPane.add(btnPessoaFisica);
		
		JButton btnPessoaJuridica = new JButton("Pessoa Juridica");
		btnPessoaJuridica.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				JanelaPessoaJuridica jpj = new JanelaPessoaJuridica();
				jpj.setVisible(true);
			}
		});
		btnPessoaJuridica.setFont(new Font("Tahoma", Font.BOLD, 11));
		btnPessoaJuridica.setBounds(232, 98, 127, 23);
		contentPane.add(btnPessoaJuridica);
	}
}
