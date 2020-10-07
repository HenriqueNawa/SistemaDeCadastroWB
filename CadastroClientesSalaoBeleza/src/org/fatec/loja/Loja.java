package org.fatec.loja;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;


public class Loja  {
	public int getCodLoja() {
		return codLoja;
	}
	public void setCodLoja(int codLoja) {
		this.codLoja = codLoja;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public static Map<Integer, String> getEscolhaServico() {
		return escolhaServico;
	}
	public void setEscolhaServico(Map<Integer, String> escolhaServico) {
		Loja.escolhaServico = escolhaServico;
	}
	public Loja(Map<Integer, String> escolhaServico) {
		super();
		Loja.escolhaServico = escolhaServico;
	}
	public  int codLoja;
	public  String nome;
	public static Map<Integer,String> escolhaServico = new HashMap<Integer,String>();
	
	public static void relatorioLoja (int codLoja) {
//		if (escolhaServico.containsKey(codLoja)) {
//			System.out.println("Cód. Loja e serviços: " + getEscolhaServico());
//			
		Set<Integer> chaves = escolhaServico.keySet();
		for (int chave : chaves)
		{
			if(chave == codLoja)
				System.out.println(chave + escolhaServico.get(chave));
		}
		}
	}
	


