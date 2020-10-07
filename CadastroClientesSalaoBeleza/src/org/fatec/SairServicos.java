package org.fatec;

import org.fatec.loja.MenuServicos;

public class SairServicos extends MenuServicos {

	@Override
	public String getDescricao() {
		return "Sair menu de servicos";
	}

	@Override
	public boolean executar() {
		
		return true;
	}

}
