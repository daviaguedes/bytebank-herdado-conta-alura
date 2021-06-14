package br.com.bytebank.banco.modelo;

public class ContaPoupanca extends Conta implements AutoCloseable{

	public ContaPoupanca(int agencia, int numero) {
		super(agencia, numero);
	}

	public void deposita(double valor) {
		super.saldo += valor;	
	}
	
	public void verificarSaldo() {
		System.out.println("O valor do saldo é: " + super.saldo);
	}

	@Override
	public void close() throws Exception {
		// TODO Auto-generated method stub
		
	}
	
	public String toString() {
		
		return super.toString() + " ContaPoupança";
	}
	
	
}
