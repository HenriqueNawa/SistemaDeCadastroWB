package org.fatec;

import java.util.ArrayList;

public class DaoArrayList implements Dao{

	private static ArrayList<Cliente> clientes = new ArrayList<Cliente>();
	@Override
	public void inserir(Cliente cliente) {
		clientes.add(cliente);
		
	}

	@Override
	public ArrayList<Cliente> listar() {
		return clientes;
	}

	@Override
	public Cliente pesquisar(String nome) {
		 Cliente resultado = null;
		 
		 for (int i = 0; i<clientes.size();i++) {
			 Cliente atual = clientes.get(i);
			 if (atual.getNome().equals(nome)) {
				 resultado = atual;
				 break;
			 }
			 
			 
		 }
		return resultado;
	}
	
	@Override
	public Cliente pesquisarPorGenero(String genero) {
		 Cliente resultado = null;
		 
		 for (int i = 0; i<clientes.size();i++) {
			 Cliente atual = clientes.get(i);
			 if (atual.getGenero().equals(genero)) {
				 resultado = atual;
				 System.out.println("Nome: " + resultado.getNome());
				 System.out.println("Data de Nascimento: " + resultado.getDataNascimento());
				 System.out.println("Telefone: " + resultado.getTelefone());
				 System.out.println("------------------------------------------------------------");
			 }
			 
				
		 }
		 return resultado; 
		 
	}
	
	@Override
	public void atualizar (Cliente cliente) {
		Cliente pesquisado = pesquisar(cliente.getNome());
		pesquisado.setNome(cliente.getNome());
		pesquisado.setDataNascimento(cliente.getDataNascimento());
		pesquisado.setGenero(cliente.getGenero());

	}	
	
	public void remover (Cliente cliente) {
		clientes.remove(cliente);
	}
	

}
