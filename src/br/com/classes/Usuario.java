package br.com.classes;

public class Usuario {
	//Declara��o dos atributos da classe Usuario
	public String login;
	public String senha;
	
	//Declara��o dos m�todos da classe Usuario
	public String cadastrar() {
		return "Cadastro realizado com sucesso!";
	}
	
	//Declara��o do m�todo logar para permitir o acesso ao sistema
	public String logar() {
		
		String msg="";
		
		if(login.equals("adm") && senha.equals("123")) {
			msg = "Bem Vindo!";
		}
		else {
			msg = "Login ou senha incorreto";
		}
		return msg;
	}
	
	//Declara��o do m�todo logout
	public String logout( ) {
		return "Voce saiu do aplicativo";
	}
}
