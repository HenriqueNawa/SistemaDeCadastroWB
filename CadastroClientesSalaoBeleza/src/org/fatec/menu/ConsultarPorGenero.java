package org.fatec.menu;

import java.io.Serializable;

import org.fatec.Cliente;

@SuppressWarnings("serial")
public class ConsultarPorGenero extends Menu implements Serializable{
	


	@Override
	public String getDescricao() {
		return "Consultar clientes por g�neros";
	}

	@Override
	public boolean executar() {
		String generoBusca = leitor.lerString("G�nero buscado: ");
		
		Cliente cliente = dao.pesquisarPorGenero(generoBusca);

		
		if (cliente == null) {
			System.out.println("N�o h� clientes deste g�nero");
		} 			
		return false;
	}
}
