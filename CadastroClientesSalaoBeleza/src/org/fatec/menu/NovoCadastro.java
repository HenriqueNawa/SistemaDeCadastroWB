package org.fatec.menu;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

import org.fatec.Cliente;
import org.fatec.Leitor;

public class NovoCadastro extends Menu {

	@Override
	public String getDescricao() {
		return "Inserir cliente";
	}

	@Override
	public boolean executar() {
		
		Leitor leitor = new Leitor();
		
		String nome = leitor.lerString("Nome: ");
		
		String dataNascimento = leitor.lerString("Data de nascimento (dd/mm/aaaa): ");
		
		String genero = leitor.lerString("Gênero (m/f): ");
		
		int telefone = leitor.lerInt("Telefone (somente números): ");
		
		Cliente cli = new Cliente (nome, dataNascimento,genero,telefone);
		
		try {
			FileOutputStream arquivoClientes =
					new FileOutputStream ("C:\\Doc\\clientes.dat");
			ObjectOutputStream objGravar = new ObjectOutputStream(arquivoClientes);
			objGravar.writeObject(cli);
			objGravar.flush();
			objGravar.close();
			arquivoClientes.flush();
			arquivoClientes.close();
//			System.out.println("Arquivo Gravado com Sucesso");
			
		} catch (Exception e) {
			e.printStackTrace();
		}
//		System.out.println("Recuperando Objeto: ");
		
		try
	    {
	      FileInputStream arquivoLeitura = new FileInputStream ("C:\\Doc\\clientes.dat");
	      ObjectInputStream objLeitura = new ObjectInputStream(arquivoLeitura);
	      System.out.println(objLeitura.readObject());
	      objLeitura.close();
	      arquivoLeitura.close();
	    }
	    catch(Exception e) {
	      e.printStackTrace();
	    }
	  
		
		dao.inserir(cli);
		
		
		System.out.println("Cliente cadastrado!");
		
		return false;
	}

}
