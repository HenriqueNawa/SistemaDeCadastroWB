package org.fatec;

import java.util.Scanner;

import org.fatec.menu.ConsultarPorGenero;
import org.fatec.menu.EditarCadastro;
import org.fatec.menu.ListarClientes;
import org.fatec.menu.Menu;
import org.fatec.menu.NovoCadastro;
import org.fatec.menu.RemoverCadastro;
import org.fatec.menu.Sair;

public class Main {

	public static void main(String[] args) {
		Scanner console = new Scanner(System.in);
		Menu[] principal = new Menu[] {
			new NovoCadastro(),
			new ListarClientes(),
			new EditarCadastro(),
			new RemoverCadastro(),
			new ConsultarPorGenero(),
			new CadastrarServico(),
			new RelatorioFilial(),
			new Sair()
		};
		
		
		boolean sair = false;
		do {
		for (int i =0; i< principal.length; i++) {
			System.out.println(i + " - " + principal[i].getDescricao());
		}
		System.out.println("Digite a opção desejada: ");
		int opcao = Integer.parseInt(console.nextLine());
		
		sair = principal[opcao].executar();
		} while (!sair);
	}

}
