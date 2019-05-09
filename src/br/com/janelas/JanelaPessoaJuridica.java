package br.com.janelas;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import com.poo.heranca.PessoaJuridica;

import javax.swing.JLabel;
import javax.swing.SwingConstants;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class JanelaPessoaJuridica extends JFrame {

	private JPanel contentPane;
	private JTextField txtId;
	private JTextField txtRazaoSocial;
	private JTextField txtNomeFantasia;
	private JTextField txtCnpj;
	private JTextField txtEmail;
	private JTextField txtTelefone;
	private JTextField txtEndereco;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					JanelaPessoaJuridica frame = new JanelaPessoaJuridica();
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
	public JanelaPessoaJuridica() {
		setTitle("GerenciarPessoaJuridica");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 343, 302);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblId = new JLabel("Id:");
		lblId.setFont(new Font("Tahoma", Font.PLAIN, 11));
		lblId.setForeground(Color.BLACK);
		lblId.setHorizontalAlignment(SwingConstants.RIGHT);
		lblId.setBounds(66, 36, 21, 14);
		contentPane.add(lblId);
		
		JLabel lblRazaoSocial = new JLabel("Razao Social:");
		lblRazaoSocial.setFont(new Font("Tahoma", Font.PLAIN, 11));
		lblRazaoSocial.setForeground(Color.BLACK);
		lblRazaoSocial.setHorizontalAlignment(SwingConstants.RIGHT);
		lblRazaoSocial.setBounds(14, 62, 73, 14);
		contentPane.add(lblRazaoSocial);
		
		JLabel lblNomeFantasia = new JLabel("Nome Fantasia:");
		lblNomeFantasia.setFont(new Font("Tahoma", Font.PLAIN, 11));
		lblNomeFantasia.setForeground(Color.BLACK);
		lblNomeFantasia.setBounds(10, 87, 77, 14);
		contentPane.add(lblNomeFantasia);
		
		JLabel lblCnpj = new JLabel("CNPJ:");
		lblCnpj.setFont(new Font("Tahoma", Font.PLAIN, 11));
		lblCnpj.setForeground(Color.BLACK);
		lblCnpj.setBounds(55, 112, 32, 14);
		contentPane.add(lblCnpj);
		
		JLabel lblEmail = new JLabel("Email:");
		lblEmail.setFont(new Font("Tahoma", Font.PLAIN, 11));
		lblEmail.setForeground(Color.BLACK);
		lblEmail.setBounds(53, 142, 34, 14);
		contentPane.add(lblEmail);
		
		JLabel lblTelefone = new JLabel("Telefone:");
		lblTelefone.setHorizontalAlignment(SwingConstants.RIGHT);
		lblTelefone.setFont(new Font("Tahoma", Font.PLAIN, 11));
		lblTelefone.setForeground(Color.BLACK);
		lblTelefone.setBounds(30, 165, 57, 14);
		contentPane.add(lblTelefone);
		
		JLabel lblEndereo = new JLabel("Endere\u00E7o:");
		lblEndereo.setFont(new Font("Tahoma", Font.PLAIN, 11));
		lblEndereo.setForeground(Color.BLACK);
		lblEndereo.setHorizontalAlignment(SwingConstants.RIGHT);
		lblEndereo.setBounds(30, 190, 57, 14);
		contentPane.add(lblEndereo);
		
		txtId = new JTextField();
		txtId.setBounds(97, 33, 106, 20);
		contentPane.add(txtId);
		txtId.setColumns(10);
		
		txtRazaoSocial = new JTextField();
		txtRazaoSocial.setBounds(97, 59, 188, 20);
		contentPane.add(txtRazaoSocial);
		txtRazaoSocial.setColumns(10);
		
		txtNomeFantasia = new JTextField();
		txtNomeFantasia.setBounds(97, 84, 187, 20);
		contentPane.add(txtNomeFantasia);
		txtNomeFantasia.setColumns(10);
		
		txtCnpj = new JTextField();
		txtCnpj.setBounds(97, 109, 187, 20);
		contentPane.add(txtCnpj);
		txtCnpj.setColumns(10);
		
		txtEmail = new JTextField();
		txtEmail.setBounds(97, 139, 187, 20);
		contentPane.add(txtEmail);
		txtEmail.setColumns(10);
		
		txtTelefone = new JTextField();
		txtTelefone.setBounds(97, 162, 187, 20);
		contentPane.add(txtTelefone);
		txtTelefone.setColumns(10);
		
		txtEndereco = new JTextField();
		txtEndereco.setBounds(97, 187, 187, 20);
		contentPane.add(txtEndereco);
		txtEndereco.setColumns(10);
		
		JButton btnCadastrar = new JButton("Cadastrar");
		
		PessoaJuridica pj = new PessoaJuridica();
		
		btnCadastrar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				pj.cadastrar();
			}
		});
		btnCadastrar.setBounds(97, 218, 106, 23);
		contentPane.add(btnCadastrar);
	}

}
