package br.com.janelas;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import com.poo.heranca.PessoaFisica;

import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.SwingConstants;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class JanelaPessoaFisica extends JFrame {

	private JPanel contentPane;
	private JTextField txtId;
	private JTextField txtNome;
	private JTextField txtRg;
	private JTextField txtCpf;
	private JTextField txtEndereco;
	private JTextField txtEmail;
	private JTextField txtTelefone;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					JanelaPessoaFisica frame = new JanelaPessoaFisica();
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
	public JanelaPessoaFisica() {
		setTitle("GerenciarPessoaFisica");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 306, 292);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblId = new JLabel("ID:");
		lblId.setBounds(47, 23, 31, 14);
		contentPane.add(lblId);
		
		JLabel lblNome = new JLabel("Nome:");
		lblNome.setBounds(30, 49, 48, 14);
		contentPane.add(lblNome);
		
		JLabel lblRg = new JLabel("RG:");
		lblRg.setHorizontalAlignment(SwingConstants.RIGHT);
		lblRg.setBounds(40, 74, 25, 14);
		contentPane.add(lblRg);
		
		JLabel lblCpf = new JLabel("CPF:");
		lblCpf.setBounds(41, 99, 37, 14);
		contentPane.add(lblCpf);
		
		JLabel lblEndereco = new JLabel("Endere\u00E7o:");
		lblEndereco.setBounds(15, 124, 63, 14);
		contentPane.add(lblEndereco);
		
		JLabel lblEmail = new JLabel("Email:");
		lblEmail.setBounds(30, 149, 48, 14);
		contentPane.add(lblEmail);
		
		JLabel lblTelefone = new JLabel("Telefone:");
		lblTelefone.setHorizontalAlignment(SwingConstants.RIGHT);
		lblTelefone.setBounds(10, 177, 53, 14);
		contentPane.add(lblTelefone);
		
		txtId = new JTextField();
		txtId.setToolTipText("");
		txtId.setBounds(76, 20, 96, 20);
		contentPane.add(txtId);
		txtId.setColumns(10);
		
		txtNome = new JTextField();
		txtNome.setBounds(76, 46, 173, 20);
		contentPane.add(txtNome);
		txtNome.setColumns(10);
		
		txtRg = new JTextField();
		txtRg.setBounds(76, 71, 173, 20);
		contentPane.add(txtRg);
		txtRg.setColumns(10);
		
		txtCpf = new JTextField();
		txtCpf.setBounds(76, 96, 173, 20);
		contentPane.add(txtCpf);
		txtCpf.setColumns(10);
		
		txtEndereco = new JTextField();
		txtEndereco.setBounds(76, 121, 173, 20);
		contentPane.add(txtEndereco);
		txtEndereco.setColumns(10);
		
		txtEmail = new JTextField();
		txtEmail.setBounds(76, 146, 173, 20);
		contentPane.add(txtEmail);
		txtEmail.setColumns(10);
		
		txtTelefone = new JTextField();
		txtTelefone.setBounds(76, 174, 173, 20);
		contentPane.add(txtTelefone);
		txtTelefone.setColumns(10);
		
		JButton btnCadastrar = new JButton("Cadastrar");
		
		PessoaFisica pf = new PessoaFisica();
		
		btnCadastrar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				pf.setId(Integer.parseInt(txtId.getText()));
				pf.setNome(txtNome.getText());
				pf.setEmail(txtEmail.getText());
				pf.setTelefone(txtTelefone.getText());
				pf.setEndereco(txtEndereco.getText());
				pf.setCpf(txtCpf.getText());
				pf.setRg(txtRg.getText());
				
				pf.cadastrar();
				
				JOptionPane.showMessageDialog(null,"Cadastrou");
				
			}
		});
		btnCadastrar.setBounds(76, 202, 107, 23);
		contentPane.add(btnCadastrar);
	}
}
