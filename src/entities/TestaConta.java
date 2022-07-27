package entities;

import java.util.Scanner;

public class TestaConta {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int numero = sc.nextInt();
		sc.nextLine();
		
		String cpf = sc.nextLine();
		
		ContaCorrente conta = new ContaCorrente(numero, cpf);
		
		
		System.out.println(conta.getNumero());
		System.out.println(conta.getCpf());
		//System.out.println(conta.getSaldo());
		//System.out.println(conta.isAtivo());
		
		double valor = sc.nextDouble();
		
		conta.credito(valor);
		System.out.println(conta.getSaldo());
		

	}

}
