package br.edu.ifsp.arquivo;

import java.util.HashMap;
import java.util.Map;

public abstract class Arquivo {
	// Tipo de arquivos aceitos no sistema
	public static final String DOC = "doc";
	public static final String PDF = "pdf";
	public static final String TXT = "txt";
	
	// Atributos
	protected String nome;
	private Map<String,Integer>palavras = new HashMap<>();
	
	// Operacoes
	public static Arquivo criaArquivo(String nome) {
		
		if (obterExtensaoArquivo(nome).equals(DOC))
		{
			Arquivo arquivo = new ArquivoDOC();
			arquivo.nome = nome;
			
			return arquivo;
		}
		if (obterExtensaoArquivo(nome).equals(PDF))
		{
			Arquivo arquivo = new ArquivoPDF();
			arquivo.nome = nome;
			
			return arquivo;
		}
		if (obterExtensaoArquivo(nome).equals(TXT))
		{
			Arquivo arquivo = new ArquivoTXT();
			arquivo.nome = nome;
			
			return arquivo;
		}
		return null;
	}
	
	public static String obterExtensaoArquivo(String nome) {
		return nome.substring(nome.lastIndexOf('.') + 1).toLowerCase();
	}
	
	public abstract void lerArquivo();
}
