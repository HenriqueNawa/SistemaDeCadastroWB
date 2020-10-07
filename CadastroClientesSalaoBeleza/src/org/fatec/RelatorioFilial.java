package org.fatec;

import org.fatec.loja.Loja;
import org.fatec.menu.Menu;

public class RelatorioFilial extends Menu {

	@Override
	public String getDescricao() {
		// TODO Auto-generated method stub
		return "Relatório da filiar";
	}

	@Override
	public boolean executar() {
		int codLoja = leitor.lerInt("Digite o código da filial: ");
//		Map<Integer,String> escolhaServico = new HashMap<Integer,String>();
//		System.out.println(escolhaServico.get(codLoja));
////		Set<Integer> chaves = escolhaServico.keySet();
////			for (int chave : chaves)
////	    	{
////	    		if(chave == codLoja) {
////	    			System.out.println(chave + escolhaServico.get(chave));
////	    		}
////	    	}
		Loja.relatorioLoja(codLoja);
////	   

		return false;
	}

}
