package org.fatec.menu;

import org.fatec.Dao;
import org.fatec.DaoArrayList;
import org.fatec.Leitor;

public abstract class Menu {
	protected Dao dao;
	protected Leitor leitor;
	
	public Menu() {
		leitor = new Leitor();
		dao = new DaoArrayList();
	}
	
	public abstract String getDescricao();
	
	public abstract boolean executar();

}
