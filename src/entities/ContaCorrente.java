package entities;

import app.Conta;

public class ContaCorrente extends Conta{

	public ContaCorrente(int numero, String cpf) {
		super(numero, cpf);
	}

	private int contadorTalao;
	
	public void pedirTalao(int quantidadeCheques) {
		if (quantidadeCheques <= 3 && quantidadeCheques > 0) {
			debito(quantidadeCheques * 30);
			if(getSaldo() < 0) {
				System.out.println("Não foi possível concluir pedido de Talão. Saldo indisponível.");
			}
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
	
	
}
