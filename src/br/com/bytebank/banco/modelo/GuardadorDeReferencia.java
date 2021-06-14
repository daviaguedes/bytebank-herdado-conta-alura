package br.com.bytebank.banco.modelo;

public class GuardadorDeReferencia {
	
	private Object[] referencias;
	private int contador = 0;
	
	public GuardadorDeReferencia() {
		this.referencias = new Object[10];
	}

	public void adiciona(Object ref) {
		this.referencias[contador] = ref;
		contador++;
		
	}

	public int getQuantidadeDeElementos() {
		
		return this.contador;
	}

	public Object getReferencia(int pos) {
		return referencias[pos];
	}

}
