package app;

public abstract class Conta {
	
	private int numero;
	private String cpf;
	private double saldo;
	private boolean ativo;
	
	public Conta(int numero, String cpf) {
		super();
		this.numero = numero;
		this.cpf = cpf;
		this.ativo = false;
		this.saldo = 0;
	}

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}

	public boolean isAtivo() {
		return ativo;
	}

	public void setAtivo(boolean ativo) {
		this.ativo = ativo;
	}
	
	protected void debito(double valor) {
		if(valor <= getSaldo())
			this.saldo = saldo - valor;
	}
	
	public void credito(double valor) {
		this.saldo = saldo + valor;
	}
	
	public void verificaSaldo() {
		System.out.println("Saldo Atual: " + getSaldo());
	}
	
	
	
	
	
	
	
	
	

}
