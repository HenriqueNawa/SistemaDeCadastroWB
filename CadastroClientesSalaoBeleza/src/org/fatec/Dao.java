package org.fatec;

import java.util.ArrayList;

public interface Dao {
	void inserir(Cliente cliente);		
	
	
	ArrayList<Cliente> listar();
	
	Cliente pesquisar(String nome);
	
	void atualizar(Cliente cliente);
	
	Cliente pesquisarPorGenero(String genero);
	
	void remover (Cliente cliente);

}
