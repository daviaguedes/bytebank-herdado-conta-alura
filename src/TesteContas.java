
public class TesteContas {
	public static void main(String[] args) {
		
		ContaCorrente c1 = new ContaCorrente(111,222);
		c1.deposita(100.00);
		
		ContaPoupanca c2 = new ContaPoupanca(222,222);
		c2.deposita(200.00);
		
		c1.transfere(10.00,c2);
		
		System.out.println("CC: " + c1.getSaldo());
		System.out.println("CP: " + c2.getSaldo());
	}
}
