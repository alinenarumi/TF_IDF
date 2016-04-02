package br.edu.ifsp.diretorio;

public class Extensao {
	private String nome;
    private boolean caseSensitive;

    public Extensao(String nome, boolean caseSensitive) {
        this.nome = nome;
        this.caseSensitive = caseSensitive;
    }

    public String getNome() {
        return nome;
    }
    public boolean getCaseSensitive() {
        return caseSensitive;
    }
}
