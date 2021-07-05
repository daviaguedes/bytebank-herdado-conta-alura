package br.com.bytebank.banco.java.io.teste;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

import br.com.bytebank.banco.modelo.Cliente;
import br.com.bytebank.banco.modelo.ContaCorrente;

public class TesteSerializacaoHeranca {

	public static void main(String[] args) throws FileNotFoundException, IOException {
		
		Cliente cliente = new Cliente();
		cliente.setNome("Kaabii");
		cliente.setCpf("123456789");
		cliente.setProfissao("Hoshi no Senshi");
		
		ContaCorrente cc = new ContaCorrente(123, 456);
		cc.setTitular(cliente);
		cc.deposita(123.2);
		
		ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("cc.bin"));
		oos.writeObject(cc);
		oos.close();
		
		
		
	}

}
