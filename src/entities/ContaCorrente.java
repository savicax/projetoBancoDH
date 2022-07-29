package entities;

import java.util.Scanner;

import app.Conta;

public class ContaCorrente extends Conta{

	public ContaCorrente(int numero, String cpf) {
		super(numero, cpf);
	}

	private int contadorTalao = 3;
	private int opcao;
	private Scanner sc = new Scanner(System.in);
	
	public int menuOperacao() {
		
		System.out.println("Selecione a operação desejada:");
		System.out.println("[1] - Consultar Saldo");
		System.out.println("[2] - Crédito em conta");
		System.out.println("[3] - Débito em conta");
		System.out.println("[0] - Sair \n");
		opcao = sc.nextInt();
		return opcao;
	}
	
	public void operacao() {
		int contador = 0;
		
		while(opcao != 0 || (contador == 0)) {
			
			if (opcao == 1){ 
				System.out.printf("Saldo atual: R$ %.2f%n" , getSaldo());
				System.out.println();
				menuOperacao();
			}
			else if (opcao == 2) {
				System.out.println("Informe valor a ser creditado: ");
				double valorCreditado = sc.nextDouble();
				creditarValor(valorCreditado);
				contador++;
				System.out.println("contador = " + contador);
				menuOperacao();
			}else if (opcao == 3) {
				System.out.println("Informe valor a ser debitado: ");
				double valorDebitado = sc.nextDouble();
				if(getSaldo() >= valorDebitado) {
					debitarValor(valorDebitado);
					contador++;
					System.out.println("contador = " + contador);
					menuOperacao();
				}else {
					System.out.println("Saldo insuficiente.\n");
					menuOperacao();
				}	
				
			}else {
				System.out.println("Opção inválida.");
				menuOperacao();
			}
				
		}
		
		System.out.println("Deseja solicitar cheque? \n[1] - Sim \n[2] - Cancelar");
		int aceita = sc.nextInt();
		
		if(aceita == 1) {
			System.out.println("Quantos talões deseja solicitar? (Limite até 3 talões) ");
			int talao = sc.nextInt();
			pedirTalao(talao);
			
		}else if (aceita == 2){
			System.out.println("Que pena! Saiba que pode contar conosco no futuro.");
		}else {
			System.out.println("Opção inválida.");
		}
		
		
	}		
			
	
	
	
	public void creditarValor(double valor) {
		
		setSaldo(getSaldo() + valor);
		System.out.println("Crédito adicionado.\n");
		System.out.printf("Novo Saldo: R$ %.2f%n%n", getSaldo());
		
	}
	
	public void debitarValor(double valorDebitado) {
		
		if (getSaldo() >= valorDebitado) {
			setSaldo(getSaldo() - valorDebitado);
			System.out.printf("Novo Saldo: R$ %.2f%n%n", getSaldo());
			
			
		}else {
			System.out.println("Saldo insuficiente.\n");
			
		}
		
	}
	
	
	public void pedirTalao(int contadorTalao) {
		double taxa = 30.0;
			if(contadorTalao * taxa < getSaldo()) {
				setSaldo(getSaldo() - (contadorTalao * taxa)) ;
				System.out.println("Solicitação concluída. ");
				System.out.printf("Valor da Taxa de Contrataçao: R$ %.2f%n%n", (contadorTalao * taxa));
				System.out.printf("Novo Saldo: R$ %.2f%n%n", getSaldo());
				menuOperacao();
			}else {
				System.out.println("Saldo insuficiente.");
				menuOperacao();
			}
	}
	
	
	public void debito(double valor) {
		
	}

	public int getContadorTalao() {
		return contadorTalao;
	}

	public void setContadorTalao(int contadorTalao) {
		this.contadorTalao = contadorTalao;
	}

	public int getOpcao() {
		return opcao;
	}

	public void setOpcao(int opcao) {
		this.opcao = opcao;
	}
	
	
	
}
