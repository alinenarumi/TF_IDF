package br.edu.ifsp.arquivo;

import br.edu.ifsp.utilitarios.Util;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public abstract class Arquivo {
	// Tipo de arquivos aceitos no sistema
	public static final String DOC = "doc";
	public static final String DOCX = "docx";
	public static final String PDF = "pdf";
	public static final String TXT = "txt";//teste
	//teste
	//teste
	
	
	// Atributos
	protected String nome;
	private Map<String, Integer>palavras = new HashMap<>();
	
	private String representacaoTexto;
	
	// Getters e Setters
	public String getNome() {
		return this.nome;
	}
	
	// Operacoes
	public abstract void lerArquivo();
	
	public static Arquivo criaArquivo(String nome) {
		Arquivo arquivo = null;
		
		switch (obterExtensaoArquivo(nome)) {
		case DOC:
			arquivo = new ArquivoDOC();
			arquivo.nome = nome;
			break;
		case DOCX:
			arquivo = new ArquivoDOCX();
			arquivo.nome = nome;
			break;
		case PDF:
			arquivo = new ArquivoPDF();
			arquivo.nome = nome;
			break;
		case TXT:
			arquivo = new ArquivoTXT();
			arquivo.nome = nome;
			break;
		}
		return arquivo;
	}
	
	public static String obterExtensaoArquivo(String nome) {
		return nome.substring(nome.lastIndexOf('.') + 1).toLowerCase();
	}
	
	public void inserirPalavras(String[] palavras) {
		
		ArrayList<String> listaPalavras = 
				new ArrayList<String>(Arrays.asList(palavras));
		
		listaPalavras.forEach(palavra -> {
			if (this.palavras.containsKey(palavra)) {
				this.palavras.replace(palavra, this.palavras.get(palavra) + 1);
			} else {
				this.palavras.put(palavra, 1);
			}
		});
	}
	
	public String[] obterPalavras(String texto) {
		texto = texto.replaceAll("\\p{P}","").toLowerCase();
		return Util.trimStringArray(texto.split("[\\s\\xA0]+"));
	}
	
	// Metodos sobreescritos
	@Override
	public String toString() {		
		this.representacaoTexto = "";
		
		this.palavras.forEach((chave, valor) -> {
			this.representacaoTexto += 
					"\nA palavra: " + chave + 
					" contém " + valor + " ocorrências.";  
		});
		
		return this.representacaoTexto;
	}
	
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
