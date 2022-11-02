package Entities;

import java.util.ArrayList;
import java.util.List;

import javax.swing.JOptionPane;

public class Cliente {
	
	List<Cliente> clien = new ArrayList<>();
	
	int codigo;
	String nome;
	String cpf;
	String rg;
	String endereco;
	String uf;
	String pais;
	String email;
	String tel;
	
	
	public Cliente() {
		
	}
	public Cliente(int codigo, String nome, String cpf, String rg, String endereco, String uf,
			String pais, String email, String tel) {
		this.codigo = codigo;
		this.nome = nome;
		this.cpf = cpf;
		this.rg = rg;
		this.endereco = endereco;
		this.uf = uf;
		this.pais = pais;
		this.email = email;
		this.tel = tel;
	}



	public void CadastroCliente() {
		codigo = Integer.parseInt(JOptionPane.showInputDialog("Digite o codigo do cliente: "));
		nome = JOptionPane.showInputDialog("Digite o nome do cliente:");
		cpf = JOptionPane.showInputDialog("Informe o CPF do cliente:");
		rg = JOptionPane.showInputDialog("Informe o RG do cliente:");
		endereco = JOptionPane.showInputDialog("Informe o endereço do cliente:");
		uf = JOptionPane.showInputDialog("Informe o Estado do cliente:");
		pais = JOptionPane.showInputDialog("Informe o país do cliente:");
		email = JOptionPane.showInputDialog("Informe o e-mail do cliente:");
		tel = JOptionPane.showInputDialog("Informe o telefône do cliente:");
		
		Cliente c = new Cliente();
		
		clien.add(c);
	}
	@Override
	public String toString() {
		return "Cliente:\n codigo: " + codigo + ", nome: " + nome + ", cpf: " + cpf + ", rg: " + rg + ", endereco: " + endereco
				+ ", uf: " + uf + ", pais: " + pais + ", email: " + email + ", tel: " + tel;
	}
	
}

