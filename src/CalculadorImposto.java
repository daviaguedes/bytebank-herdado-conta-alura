
public class CalculadorImposto {
	
	private double totalImposto;
	
	public void registra(Tributavel t) {
		t.getValorImposto();
		this.totalImposto +=t.getValorImposto();
	}
	
	public double getTotalImposto() {
		return this.totalImposto;
	}
	
}
