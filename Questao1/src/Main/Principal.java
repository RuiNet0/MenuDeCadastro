package Main;

import java.util.ArrayList;
import java.util.List;

import javax.swing.JOptionPane;

import Entities.Cliente;
import Entities.Estoque;

public class Principal {

	public static void main(String[] args) {
		List<Estoque> es = new ArrayList<>();
		List<Cliente> cl = new ArrayList<>();
		
		Estoque esto = new Estoque();
	
		Cliente cli = new Cliente();
		int a = 0;
		while(a != 5) {
		a = Integer.parseInt(JOptionPane.showInputDialog("1 - Cadastro de Cliente:\n"+ "2 - Cadastro de estoque:\n" + "3 - Mostrar clientes:\n" + "4 - Mostrar produtos:\n\n" + "5 - Sair"));
		
		if(a==1) {
			cli.CadastroCliente();
			
		}
		
		if(a==2) {
			esto.CadastroProduto();
			
		}
		if(a==3) {
			JOptionPane.showMessageDialog(null, cli);
			
			}
		if(a==4) {
			JOptionPane.showMessageDialog(null, esto);
		}
		
	   }
	}
}




	  
