package br.com.bytebank.banco.test;

import br.com.bytebank.banco.modelo.Conta;
import br.com.bytebank.banco.modelo.ContaCorrente;
import br.com.bytebank.banco.modelo.ContaPoupanca;

public class Teste {

	public static void main(String[] args) {

		System.out.println("x");
		System.out.println(3);
		System.out.println(false);
		
		ContaCorrente cc = new ContaCorrente(11, 22);
		ContaPoupanca cp = new ContaPoupanca(33, 44);
		
		System.out.println(cc.toString());
		System.out.println(cp.toString());
		
		}

	static void println() {

	}

	static void println(int a) {

	}
	
	static void println(boolean b) {

	}
}
