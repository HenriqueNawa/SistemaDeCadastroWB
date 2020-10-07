package org.fatec.menu;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

import org.fatec.Cliente;


public class ListarClientes extends Menu implements Comparator<Cliente> {

	@Override
	public String getDescricao() {
		return "Listagem de clientes";
	}

	@Override
	public boolean executar() {
		
		ArrayList<Cliente> clientes = dao.listar();
		
		Collections.sort(clientes, this);
		
		for (int i=0; i<clientes.size();i++) {
			Cliente atual = clientes.get(i);
			System.out.println("Nome: " + atual.getNome());
			System.out.println("Data de Nascimento: " + atual.getDataNascimento());
			System.out.println("Gênero: "+ atual.getGenero());
			System.out.println("Telefone: " + atual.getTelefone());
			atual.listarConsumidor();
			System.out.println("---------------------------------------------------");
		}
		
		return false;
	}

	@Override
	public int compare(Cliente o1, Cliente o2) {
		String nome1 = o1.getNome();
		String nome2 = o2.getNome();
		
		return nome1.compareTo(nome2);
	}

}

