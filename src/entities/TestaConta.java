package entities;

import java.util.Scanner;

public class TestaConta {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Digite o numero da conta: ");
		int numero = sc.nextInt();
		
		System.out.println("Digite o cpf: ");
		String cpf = sc.next();
		
		ContaCorrente conta = new ContaCorrente(numero, cpf);
		System.out.println();

		System.out.println("Olá, seja bem-vindo ao banco banco\n");
		
		conta.menuOperacao();
		
		conta.operacao();
		
		/*double valor = sc.nextDouble();
		
		conta.creditarValor(valor);
		conta.verificaSaldo();
		conta.debitarValor(50);
		conta.verificaSaldo();
		//conta.pedirTalao(2);*/

	}

}
