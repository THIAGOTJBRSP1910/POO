package br.com.janelas;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

import com.loja.Categoria;
import com.loja.Fornecedor;
import com.loja.Produto;

public class GerenciarProdutos extends JFrame{
	
	//Elementos para a categoria
	static JLabel lblIdCat = new JLabel("Id Categoria:");
	static JLabel lblNomeCat = new JLabel("Nome Categoria:");
	static JLabel lblDescCat = new JLabel("Descrição:");
	
	static JTextField txtIdCat = new JTextField();
	static JTextField txtNomeCat = new JTextField();
	static JTextField txtDescCat = new JTextField();
	
	static JButton btnCadCat = new JButton("Cadastrar Categoria");
	
	//Elementos para o fornecedor
	static JLabel lblIdFor = new JLabel("Id Fornecedor:");
	static JLabel lblRS = new JLabel("Razão Social:");
	static JLabel lblCnpj = new JLabel("CNPJ:");
			
	static JTextField txtIdFor = new JTextField();
	static JTextField txtRS = new JTextField();
	static JTextField txtCnpj = new JTextField();
	
	static JButton btnCadFor = new JButton("Cadastrar Fornecedor");
	
	//Elementos para produtos
	
	static JLabel lblIdPr = new JLabel("Id Produto:");
	static JLabel lblNomePr = new JLabel("Nome do produto:");
	static JLabel lblDescPr = new JLabel("Descrição Produto:");
	static JLabel lblCategoria = new JLabel("Selecione uma Categoria:");
	static JLabel lblFornecedor = new JLabel("Selecione um Fornecedor:");
	static JLabel lblPrecoPr = new JLabel("Preço do Produto:");
	
	static JTextField txtIdPr = new JTextField();
	static JTextField txtNomePr = new JTextField();
	static JTextField txtDescPr = new JTextField();
	static JTextField txtCategoria = new JTextField();
	static JTextField txtFornecedor = new JTextField();
	static JTextField txtPrecoPr = new JTextField();
	
	static JButton btnCadPr = new JButton("Cadastrar Produto");

	public static void main(String[] args) {
		JFrame gerenciar = new JFrame();
		gerenciar.setTitle("Gerenciar Produtos");
		gerenciar.setSize(700,600);
		gerenciar.setLocationRelativeTo(null);
		gerenciar.setDefaultCloseOperation(EXIT_ON_CLOSE);
		gerenciar.setResizable(false);
		//Definir o gerenciamento do layout como absoluto, ou seja, nulo
		gerenciar.getContentPane().setLayout(null);
		
		lblIdCat.setBounds(10,10,150,30);
		gerenciar.add(lblIdCat);
		
		txtIdCat.setBounds(10,45,100,30);
		gerenciar.add(txtIdCat);
		
		lblNomeCat.setBounds(10,75,150,30);
		gerenciar.add(lblNomeCat);
		
		txtNomeCat.setBounds(10,110,160,30);
		gerenciar.add(txtNomeCat);
		
		lblDescCat.setBounds(10,140,150,30);
		gerenciar.add(lblDescCat);
		
		txtDescCat.setBounds(10,175,160,30);
		gerenciar.add(txtDescCat);
		
		btnCadCat.setBounds(10,220,160,30);
		gerenciar.add(btnCadCat);
		
		//---------Cadastrar Fornecedor----------
		
		lblIdFor.setBounds(10,255,160,30);
		gerenciar.add(lblIdFor);
		
		txtIdFor.setBounds(10,280,160,30);
		gerenciar.add(txtIdFor);
		
		lblRS.setBounds(10,305,160,30);
		gerenciar.add(lblRS);
		
		txtRS.setBounds(10,340,160,30);
		gerenciar.add(txtRS);
		
		lblCnpj.setBounds(10,375,160,30);
		gerenciar.add(lblCnpj);
		
		txtCnpj.setBounds(10,405,160,30);
		gerenciar.add(txtCnpj);
		
		btnCadFor.setBounds(10,450,170,30);
		gerenciar.add(btnCadFor);
		
		//--------Cadastrar Produtos-------
		
		lblIdPr.setBounds(220,10,150,30);
		gerenciar.add(lblIdPr);
		
		txtIdPr.setBounds(220,35,100,30);
		gerenciar.add(txtIdPr);
		
		lblNomePr.setBounds(220,75,150,30);
		gerenciar.add(lblNomePr);
		
		txtNomePr.setBounds(220,110,450,30);
		gerenciar.add(txtNomePr);
		
		lblDescPr.setBounds(220,140,150,30);
		gerenciar.add(lblDescPr);
		
		txtDescPr.setBounds(220,175,450,100);
		gerenciar.add(txtDescPr);
		
		lblCategoria.setBounds(220,280,150,30);
		gerenciar.add(lblCategoria);
		
		txtCategoria.setBounds(220,315,450,30);
		gerenciar.add(txtCategoria);
		
		lblFornecedor.setBounds(220,350,150,30);
		gerenciar.add(lblFornecedor);
		
		txtFornecedor.setBounds(220,385,450,30);
		gerenciar.add(txtFornecedor);
		
		lblPrecoPr.setBounds(220,420,150,30);
		gerenciar.add(lblPrecoPr);
		
		txtPrecoPr.setBounds(220,455,180,30);
		gerenciar.add(txtPrecoPr);
		
		btnCadPr.setBounds(220,500,180,30);
		gerenciar.add(btnCadPr);
		
		//---------Desabilitar os controles textfield do 
		//---------Fornecedor e Produtos--------
		
		txtIdFor.setEnabled(false);
		txtRS.setEnabled(false);
		txtCnpj.setEnabled(false);
		btnCadFor.setEnabled(false);

		txtIdPr.setEnabled(false);
		txtNomePr.setEnabled(false);
		txtDescPr.setEnabled(false);
		txtFornecedor.setEnabled(false);
		txtCategoria.setEditable(false);
		txtPrecoPr.setEnabled(false);
		btnCadPr.setEnabled(false);
		
		//--------Vamos criar o objeto categoria e
		//--------Passar os dados do formulario para
		//--------o objeto criado
		Categoria cat = new Categoria();
		
		//--------Vamos fazer a passagem dos dados para o objeto
		//--------no momento em que clicamos no botão de cadastro
		btnCadCat.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				cat.setId(Integer.parseInt(txtIdCat.getText()));
				cat.setNome(txtNomeCat.getText());
				cat.setDescricao(txtDescCat.getText());
				
				//----Desabilitar as caixas da categorias
				txtIdCat.setEnabled(false);
				txtNomeCat.setEnabled(false);
				txtDescCat.setEnabled(false);
				btnCadCat.setEnabled(false);
				//----Habilitar as caixas do fornecedor
				txtIdFor.setEnabled(true);
				txtRS.setEnabled(true);
				txtCnpj.setEnabled(true);
				btnCadFor.setEnabled(true);
				
				
			}
		});
		
		//---Vamos instanciar a classe fornecedor e passar
		//---os dados para o objeto no momento que em que
		//---o botão de cadastro for clicado
		Fornecedor f = new Fornecedor();
		btnCadFor.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				f.setId(Integer.parseInt(txtIdFor.getText()));
				f.setRazaoSocial(txtRS.getText());
				f.setCnpj(txtCnpj.getText());
				
				//----Desabilitar as caixas do fornecedor
				txtIdFor.setEnabled(false);
				txtRS.setEnabled(false);
				txtCnpj.setEnabled(false);
				btnCadFor.setEnabled(false);
				
				//----Habilitar os controles produto
				txtIdPr.setEnabled(true);
				txtNomePr.setEnabled(true);
				txtDescPr.setEnabled(true);
				txtFornecedor.setEnabled(true);
				txtCategoria.setEditable(true);
				txtPrecoPr.setEnabled(true);
				btnCadPr.setEnabled(true);
				
			}
		});
		
		//----Vamos criar um objeto baseado em
		//----Produtos para passar os dados no momento do clique
		//----botão cadastro
		
		Produto  pr = new Produto();
		btnCadPr.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				pr.setId(Integer.parseInt(txtIdPr.getText()));
				pr.setNome(txtNomePr.getText());
				pr.setDescricao(txtDescPr.getText());
				pr.setCategoria(cat);
				pr.setFornecedor(f);
				pr.setPreco(Double.parseDouble(txtPrecoPr.getText()));
				
				//----Desabilitar os controles do produto
				txtIdPr.setEnabled(false);
				txtNomePr.setEnabled(false);
				txtDescPr.setEnabled(false);
				txtFornecedor.setEnabled(false);
				txtCategoria.setEditable(false);
				txtPrecoPr.setEnabled(false);
				btnCadPr.setEnabled(false);
				
				//----Caixa de confirmação
				JOptionPane.showMessageDialog(null, "Produto cadastrado com sucesso!");
				
				//Habilitar Cateforias
				txtIdCat.setEnabled(true);
				txtNomeCat.setEnabled(true);
				txtDescCat.setEnabled(true);
				btnCadCat.setEnabled(true);
				
			}
		});
		
		gerenciar.setVisible(true);

	}

}
