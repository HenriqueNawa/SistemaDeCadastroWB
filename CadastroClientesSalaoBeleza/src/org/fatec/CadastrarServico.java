package org.fatec;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

import org.fatec.loja.Loja;
import org.fatec.menu.Menu;

public class CadastrarServico extends Menu {

	@Override
	public String getDescricao() {
		return "Cadastrar servicos consumidos";
	}

	@Override
	public boolean executar() {
//		public void enviarRelatorio(int codLoja){
//	    	Set<Integer> chaves = cliente.escolhaServico.keySet();
//	    	for (int chave : chaves)
//	    	{
//	    		if(chave == codLoja)
//	    			System.out.println(chave + cliente.escolhaServico.get(chave));
//	    	}
//	    }
	
		System.out.println("Menu de serviços/produtos");
		System.out.println("0 - Manicure");
		System.out.println("1 - Pedicure");
		System.out.println("2 - Design de sobrancelhas");
		System.out.println("3 - Corte de cabelo");
		System.out.println("4 - Pintura de cabelo");
	    System.out.println("5 - Remoção de rugas");
	    System.out.println("6 - Remoção de manchas de pele");
	    System.out.println("7 - Botox");
	    System.out.println("8 - Tratamento para emagrecimento");
	    System.out.println("9 - Redução de medidas");
	    System.out.println("10 - Para sair");
	    String nome = leitor.lerString("Digite o nome do cliente");
	    Cliente cliente = dao.pesquisar(nome);
		
		if (cliente == null) {
			System.out.println("Cliente não encontrado");
		} else {
			int codLoja = leitor.lerInt("Digite o cód da loja: ");
		    int opcao = leitor.lerInt("Opção desejada: ");
		     Map<Integer,String> escolhaServico = new HashMap<Integer,String>();
		    switch (opcao) {
		    	case 0:
		    		cliente.escolhaServico.put(codLoja, "Manicure");
		    		break;
		    		
		    	case 1:
		    		cliente.escolhaServico.put(codLoja, "Pedicure");
		    		break;
		    		
		    	case 2:
		    		cliente.escolhaServico.put(codLoja,"Design de sobrancelhas");
		    		break;
		    	
		    	case 3:
		    		cliente.escolhaServico.put(codLoja, "Corte de cabelo");
		    		break;
		    		
		    	case 4:
		    		cliente.escolhaServico.put(codLoja, "Pintura de cabelo");
		    		break;
		    		
		    	case 5:
		    		cliente.escolhaServico.put(codLoja, "Remoção de rugas");
		    		break; 
		    	
		    	case 6:
		    		cliente.escolhaServico.put(codLoja, "Remoção de manchas de pele");
		    		break; 
		    		
		    	case 7:
		    		cliente.escolhaServico.put(codLoja, "Botox");
		    		break; 
		    	
		    	case 8:
		    		cliente.escolhaServico.put(codLoja, "Tratamento para emagrecimento");
		    		break; 
		    		
		    	case 9: 
		    		cliente.escolhaServico.put(codLoja, "Redução de medidas");
		    		break;
		    	
		    	case 10: 
		    		break;
		    	
		    	default:
		    		System.out.println("Opção inválida!");
		    		break;		
		    }
		    

			
		}
		return false;
	}

}
