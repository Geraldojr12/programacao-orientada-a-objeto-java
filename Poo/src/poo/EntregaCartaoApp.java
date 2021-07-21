package poo;

import java.util.ArrayList;

import poo.model.Cliente;
import poo.model.Endereco;

public class EntregaCartaoApp {

	public static void main(String[] args) {
		
		Endereco endereco = new Endereco();
		endereco.cep = "000000";
		// dados de endereço
		
		Cliente cliente = new Cliente();
		// dados do cliente
		
		try {
			cliente.adicionaEndereco(endereco);
			System.out.println("Endereco adicionado com sucesso");
		} catch (Exception e) {
			System.err.println("Houve um erro ao adicionar o endereco: " + e.getMessage());
		}
		
	
	}
	
}
