package br.com.bytebank.banco.test.util;

import java.util.ArrayList;

import br.com.bytebank.banco.modelo.Conta;
import br.com.bytebank.banco.modelo.ContaCorrente;
import br.com.bytebank.banco.modelo.ContaPoupanca;

public class TesteArrayList {

	public static void main(String[] args) {

		ArrayList<Conta> lista = new ArrayList<Conta>();

		Conta cc = new ContaCorrente(12, 34);

		lista.add(cc);
		
		Conta cc2 = new ContaPoupanca(45, 67);
		lista.add(cc2);
		
		Conta cc3 = new ContaPoupanca(12, 34);
		
		System.out.println(lista.contains(cc3));
		
		for(Object o : lista) {
			System.out.println(o);
		}
		
		System.out.println(lista.size());
	}

}
