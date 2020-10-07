package org.fatec.menu;

import java.io.Serializable;

import org.fatec.Cliente;

@SuppressWarnings("serial")
public class ConsultarPorGenero extends Menu implements Serializable{
	


	@Override
	public String getDescricao() {
		return "Consultar clientes por gêneros";
	}

	@Override
	public boolean executar() {
		String generoBusca = leitor.lerString("Gênero buscado: ");
		
		Cliente cliente = dao.pesquisarPorGenero(generoBusca);

		
		if (cliente == null) {
			System.out.println("Não há clientes deste gênero");
		} 			
		return false;
	}
}
