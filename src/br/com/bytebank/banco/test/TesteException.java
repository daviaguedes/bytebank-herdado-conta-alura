package br.com.bytebank.banco.test;
import br.com.bytebank.banco.modelo.*;

public class TesteException {

	public static void main(String[] args) {
		
		try {
			ContaCorrente cc = new ContaCorrente(-111, 111);
			System.out.println("cc criado");
			ContaPoupanca cp = new ContaPoupanca(111, -222);
			System.out.println("cp criado");
			
		}catch(IllegalArgumentException ex) {
			System.out.println(ex.getMessage());
		}
		

	}

}
