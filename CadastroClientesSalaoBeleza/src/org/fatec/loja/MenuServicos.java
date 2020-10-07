package org.fatec.loja;

import org.fatec.Dao;
import org.fatec.DaoArrayList;
import org.fatec.Leitor;

public abstract class MenuServicos {
	protected Dao dao;
	protected Leitor leitor;
	
	public MenuServicos() {
		leitor = new Leitor();
		dao = new DaoArrayList();
	}
	
	public abstract String getDescricao();
	
	public abstract boolean executar();


}
