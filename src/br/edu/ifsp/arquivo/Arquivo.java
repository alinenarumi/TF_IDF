package br.edu.ifsp.arquivo;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

public abstract class Arquivo {
	protected String nome;
	private Map<String,Integer>palavras = new HashMap<>();
	
	public static Arquivo criaArquivo(String nome) throws IOException {
		
		String extensao = nome.substring(nome.lastIndexOf('.') + 1);
		
		if (extensao.equals("txt"))
		{
			Arquivo arquivo = new ArquivoTXT();
			arquivo.nome=nome;
						
			return  arquivo;
		}
		return null;
	
	}
	
	public abstract void lerArquivo();

}
