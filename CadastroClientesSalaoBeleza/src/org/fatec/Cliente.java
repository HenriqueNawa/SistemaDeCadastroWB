package org.fatec;

import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;



@SuppressWarnings("serial")
public class Cliente implements Serializable  {
	
	Scanner leitor = new Scanner(System.in);
	
	private String nome;
	private String dataNascimento;
	private String genero;
	private int telefone;
	public Map<Integer,String> escolhaServico = new HashMap<Integer,String>();
	
	public Cliente(String nome, String dataNascimento, String genero, int telefone) {
		this.nome = nome;
		this.dataNascimento = dataNascimento;
		this.genero = genero;
		this.telefone = telefone;
	}
	
	
	public  void listarConsumidor() {
		System.out.println("Serviços/Produtos consumidos: ");
		for (Map.Entry<Integer,String> pair :escolhaServico.entrySet()) {
		    System.out.println("Cód. Loja: " + pair.getKey());
		    System.out.println("Serviço/Produto: " + pair.getValue());
		    System.out.println("--------------------------------------------------------");
		}
	}
	
	public void gerarRelatorio(int codLoja) {
		
	}
		

	public String getNome() {
		return nome;
	}


	public void setNome(String nome) {
		this.nome = nome;
	}


	public String getDataNascimento() {
		return dataNascimento;
	}


	public void setDataNascimento(String dataNascimento) {
		this.dataNascimento = dataNascimento;
	}


	public String getGenero() {
		return genero;
	}


	public void setGenero(String genero) {
		this.genero = genero;
	}


	public int getTelefone() {
		return telefone;
	}


	public void setTelefone(int telefone) {
		this.telefone = telefone;
	}


	
}
