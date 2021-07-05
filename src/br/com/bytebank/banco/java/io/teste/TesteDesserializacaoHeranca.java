package br.com.bytebank.banco.java.io.teste;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;

import br.com.bytebank.banco.modelo.ContaCorrente;

public class TesteDesserializacaoHeranca {

	public static void main(String[] args) throws FileNotFoundException, IOException, ClassNotFoundException {
		
		ObjectInputStream ois = new ObjectInputStream(new FileInputStream("cc.bin"));
		ContaCorrente cc = (ContaCorrente) ois.readObject();
		ois.close();
		
		System.out.println(cc.getTitular().getNome());
		

	}

}
