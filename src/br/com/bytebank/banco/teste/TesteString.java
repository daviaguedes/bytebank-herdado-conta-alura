package br.com.bytebank.banco.teste;

public class TesteString {

	public static void main(String[] args) {
		
		String nome = "Davi Guedes";
		
		StringBuilder sb = new StringBuilder(nome);
		
		sb.append(" est� testando");
		sb.append(" a classe");
		sb.append(" StringBuilder.");
		
		nome = sb.toString();
		System.out.println(nome);
		
		/*String upper = nome.toUpperCase();
		System.out.println(upper);
		
		String trim = nome.trim();
		System.out.println(trim);
		
		String substring = nome.substring(5);
		System.out.println(substring);*/
		
		/*for(int i = 0; i<nome.length(); i++) {
			char d = nome.charAt(i);
			System.out.println(d);
		}*/
		
		//nome = nome.toLowerCase(); // tamb�m funciona
		//System.out.println(nome);

	}

}
