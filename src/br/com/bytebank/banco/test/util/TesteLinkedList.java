package br.com.bytebank.banco.test.util;

import java.util.LinkedList;

import br.com.bytebank.banco.modelo.Conta;
import br.com.bytebank.banco.modelo.ContaCorrente;
import br.com.bytebank.banco.modelo.ContaPoupanca;

public class TesteLinkedList {

	public static void main(String[] args) {
		
		LinkedList<Conta> lista = new LinkedList<Conta>();

		Conta cc = new ContaCorrente(12, 34);

		lista.add(cc);

		Conta cc2 = new ContaPoupanca(45, 67);
		lista.add(cc2);
		
		Conta cc3 = new ContaPoupanca(12, 34);
		
		System.out.println(lista.contains(cc3));

	}

}
