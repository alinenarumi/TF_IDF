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
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((nome == null) ? 0 : nome.hashCode());
		result = prime * result + ((palavras == null) ? 0 : palavras.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Arquivo other = (Arquivo) obj;
		if (nome == null) {
			if (other.nome != null)
				return false;
		} else if (!nome.equals(other.nome))
			return false;
		if (palavras == null) {
			if (other.palavras != null)
				return false;
		} else if (!palavras.equals(other.palavras))
			return false;
		return true;
	}

}
