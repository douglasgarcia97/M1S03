package Banco_Floripa;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Banco_Floripa {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		List<Conta> contas = new ArrayList<>();
		while (true) {
		int opcaoSelecionada;
		
		System.out.println("----- Seja Bem-Vindo! -----");
		System.out.println("Escolha uma opçâo:"
				+ "\n1 - Deposito."
				+ "\n2 - Saque."
				+ "\n3 - Transferência."
				+ "\n4 - Saldo."
				+ "\n----- Outros -----"
				+ "\n5 - Abrir conta."
				+ "\n6 - Encerrar."
				+ "");
		opcaoSelecionada = entrada.nextInt();
		switch (opcaoSelecionada) {
		case 1: {
			System.out.println("Deposito selecionado");
			break;
		}
		case 2: {
			System.out.println("Saque selecionado");
			break;
		}
		case 3: {
			System.out.println("Transferência Selecionado");
			break;
		}
		case 4: {
			System.out.println("Saldo selecionado");
			break;
		}
		case 5: {
			Conta conta = new Conta();
			if(contas.isEmpty()) {
				conta.setNumeroConta("1");
				
			}else {
				Integer numeroConta = contas.size() + 1;
				conta.setNumeroConta(numeroConta.toString());
			}
			contas.add(conta);
			
			break;
		}
		case 6: {
			System.out.println("Encerrar.");
			break;
		}
		default:
			System.out.println("Opção inválida");
		}
		
		
		
		}
	}

}
