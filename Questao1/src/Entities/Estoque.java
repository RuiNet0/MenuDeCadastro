package Entities;

import java.util.ArrayList;
import java.util.List;

import javax.swing.JOptionPane;

public class Estoque {

List<Estoque> esto = new ArrayList<>();
	
	int codigo;
	int codigoBarras;
	String descricao;
	String lote;
	String validade;
	double valorCusto;
	double valorVenda;
	
	
	
	public Estoque( int codigo, int codigoBarras, String descricao, String lote, String validade,
			double valorCusto, double valorVenda) {

		this.codigo = codigo;
		this.codigoBarras = codigoBarras;
		this.descricao = descricao;
		this.lote = lote;
		this.validade = validade;
		this.valorCusto = valorCusto;
		this.valorVenda = valorVenda;
	}


	public Estoque() {
		
	}


	public void CadastroProduto() {
		codigo = Integer.parseInt(JOptionPane.showInputDialog("Digite o codigo do produto: "));
		codigoBarras = Integer.parseInt(JOptionPane.showInputDialog("Digite o código de barras do produto:"));
		descricao = JOptionPane.showInputDialog("Informe a descrição do produto:");
		lote = JOptionPane.showInputDialog("Informe o lote do produto:");
		validade = JOptionPane.showInputDialog("Informe a validade do produto:");
		valorCusto = Double.parseDouble(JOptionPane.showInputDialog("Informe o valor de custo do produto:"));
		valorVenda = Double.parseDouble(JOptionPane.showInputDialog("Informe o valor de venda do produto:"));
		
		Estoque e = new Estoque( codigo,  codigoBarras,  descricao,  lote,  validade, valorCusto,
				 valorVenda);
		
		esto.add(e);
	}


	@Override
	public String toString() {
		return "Estoque:\n codigo: " + codigo + ", codigoBarras: " + codigoBarras + ", descricao: " + descricao + ", lote: "
				+ lote + ", validade: " + validade + ", valorCusto: " + valorCusto + ", valorVenda: " + valorVenda;
	}
	
}
