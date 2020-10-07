package org.fatec.menu;

import org.fatec.Cliente;

public class EditarCadastro extends Menu {

	@Override
	public String getDescricao() {
		
		return "Editar cadastro";
	}

	@Override
	public boolean executar() {
		String nome = leitor.lerString("Nome: ");
		Cliente cliente = dao.pesquisar(nome);
		
		if (cliente == null) {
			System.out.println("Cliente não encontrado");
		} else {
			System.out.println("Nome: "+ cliente.getNome());
			System.out.println("Data de nascimento: "+ cliente.getDataNascimento());
			System.out.println("Gênero: "+ cliente.getGenero());
			System.out.println("Telefone: "+ cliente.getTelefone());
			
			String nomeEditar = leitor.lerString("Novo nome: ");
			String dataNascimento = leitor.lerString("Nova data de nascimento (dd/mm/aaaa): ");
			String genero = leitor.lerString("Gênero (m/f): ");
			int telefone = leitor.lerInt("Novo telefone (somente números):");
			
			cliente.setNome(nomeEditar);
			cliente.setDataNascimento(dataNascimento);
			cliente.setGenero(genero);
			cliente.setTelefone(telefone);
			
			dao.atualizar(cliente);
		}
		
		
		return false;
	}

}
