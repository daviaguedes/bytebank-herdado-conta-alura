package br.com.bytebank.banco.teste;
import br.com.bytebank.banco.modelo.*;

public class TesteTransferencia {

	public static void main(String[] args) {
		
		ContaCorrente cc = new ContaCorrente(111, 222);
		cc.deposita(200);
		
		ContaPoupanca cp = new ContaPoupanca(333, 444);
		
		try{
			cc.transfere(210, cp);
		}catch(SaldoInsuficienteException ex) {
		System.out.println("Deu erro");	
		}

	}

}
