package br.com.bytebank.banco.teste;
import br.com.bytebank.banco.modelo.*;

public class TesteSaca {

	public static void main(String[] args) {
		
		ContaCorrente c1 = new ContaCorrente(111, 222);
		c1.deposita(200);
		try {
		c1.saca(210);
		}
		catch(SaldoInsuficienteException ex){
			System.out.println("Erro");
		}
		System.out.println(c1.getSaldo());

	}

}
