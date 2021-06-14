package br.com.bytebank.banco.util;

import java.util.ArrayList;

import br.com.bytebank.banco.modelo.Cliente;
import br.com.bytebank.banco.modelo.Conta;
import br.com.bytebank.banco.modelo.ContaCorrente;
import br.com.bytebank.banco.modelo.ContaPoupanca;

public class TesteArrayList {

	public static void main(String[] args) {

		ArrayList<Conta> lista = new ArrayList<Conta>();

		Conta cc = new ContaCorrente(12, 34);

		lista.add(cc);
		
		Cliente cliente = new Cliente();
		///lista.add(cliente); não compila

		Conta cc2 = new ContaPoupanca(45, 67);
		lista.add(cc2);
		
		for(Object o : lista) {
			System.out.println(o);
		}
		
		System.out.println(lista.size());
	}

}
