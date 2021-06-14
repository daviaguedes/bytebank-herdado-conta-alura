package br.com.bytebank.banco.teste;

import br.com.bytebank.banco.modelo.Conta;
import br.com.bytebank.banco.modelo.ContaCorrente;
import br.com.bytebank.banco.modelo.ContaPoupanca;
import br.com.bytebank.banco.modelo.GuardadorDeReferencia;

public class TesteGuardadorDeReferencia {

	public static void main(String[] args) {
		
		GuardadorDeReferencia guardador = new GuardadorDeReferencia();
		
		Conta cc = new ContaCorrente(12, 34);
		
		guardador.adiciona(cc);
		
		Conta cc2 = new ContaPoupanca(45, 67);
		guardador.adiciona(cc2);
		
		int tamanho = guardador.getQuantidadeDeElementos();
		System.out.println(tamanho);
		
		Conta ref = (Conta) guardador.getReferencia(0);
		System.out.println(ref.getAgencia());

	}

}
