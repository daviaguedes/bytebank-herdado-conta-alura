package br.com.bytebank.banco.teste;
import br.com.bytebank.banco.modelo.*;

public class TesteContas {
	public static void main(String[] args) throws Exception {

		try{
			ContaPoupanca c2 = new ContaPoupanca(222,-222);
			c2.deposita(200.00);
		}catch(IllegalArgumentException ex) {
			System.out.println(ex.getMessage());
		}
		try {	ContaCorrente c1 = new ContaCorrente(-111,222);
			c1.deposita(100.00);	
		}catch(IllegalArgumentException ex) {
			System.out.println(ex.getMessage());
		}

	}
}
