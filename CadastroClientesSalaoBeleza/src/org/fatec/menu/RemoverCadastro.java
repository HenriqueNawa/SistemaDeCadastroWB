package org.fatec.menu;

import org.fatec.Cliente;

public class RemoverCadastro extends Menu {

	@Override
	public String getDescricao() {
		return "Remover cadastro";
	}

	@Override
	public boolean executar() {
		String nome = leitor.lerString("Nome do cliente que deseja remover: ");
		Cliente cliente = dao.pesquisar(nome);
		
		if (nome == null) {
			System.out.println("Cliente não encontrado");
		} else {
			dao.remover(cliente);
		}
		
		return false;
	}

}
