package br.com.bytebank.banco.util;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

import br.com.bytebank.banco.modelo.Conta;
import br.com.bytebank.banco.modelo.ContaCorrente;
import br.com.bytebank.banco.modelo.ContaPoupanca;

public class TesteList {

	public static void main(String[] args) {
		
		List<Conta> lista = new ArrayList<Conta>();

		Conta cc = new ContaCorrente(12, 34);

		lista.add(cc);

		Conta cc2 = new ContaPoupanca(45, 67);
		lista.add(cc2);
		
		Conta cc3 = new ContaPoupanca(12, 34);
		
		System.out.println(lista.contains(cc3));
		
		
	}

}
