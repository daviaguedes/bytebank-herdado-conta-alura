package br.com.bytebank.banco.test.util;

import java.util.ArrayList;
import java.util.List;

public class TesteWrapperInteger {

	public static void main(String[] args) {

		Integer idadeRef = 29; //autoboxing, é criado um objeto do tipo Integer
		
		@SuppressWarnings("deprecation")
		int primitivo = new Integer(21);//unboxing, é criado um primitivo a partir do construtor da classe Integer, construtor depreciado

		List<Integer> lista = new ArrayList<Integer>();
		
		lista.add(idadeRef); //ok
		lista.add(primitivo);//autoboxing, primitivo para um objeto tipo Integer
		
		int i1= lista.get(0); // unboxing, "(0)" é "idadeRef" que é um objeto do tipo Integer
		Integer i2 = lista.get(1); //ok, "(1)" é um objeto do tipo Integer, logo continua sendo um objeto Integer
		
		System.out.println(i1);
		System.out.println(i2);
		
		Integer valorRef = Integer.valueOf(22); // criação do objeto para o método valueOf
		int valorPri = valorRef.intValue(); // desembrulhando, pegando valor primitivo do objeto wrapper
		
		System.out.println(valorRef);
		System.out.println(valorPri);
		
		Integer iParseado1 = Integer.valueOf("42"); // parseando e devolvendo referencia
		int iParseado2 = Integer.parseInt("44"); //parseando e devolvendo primitivo
		
		System.out.println(iParseado1);
		System.out.println(iParseado2);
		
		System.out.println(Integer.MAX_VALUE); //2^31 - 1
		System.out.println(Integer.MIN_VALUE); // -2^31
		System.out.println(Integer.SIZE); //32bits
		System.out.println(Integer.BYTES); //4bytes
		
	}

}
