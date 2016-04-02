package br.edu.ifsp.configuracao;

public class ArquivoConfiguracao {
	private String caminho;
	private String[] linhas;
	
	public ArquivoConfiguracao(String caminho) {
		this.caminho = caminho;
		this.linhas = this.lerArquivo();
	}
	
	public String getCaminho() {
		return this.caminho;
	}
	
	public void atualizar(String[] linhas) {
		this.salvar(linhas);
		this.linhas = this.lerArquivo();
	}
	 
	public String[] linhas() {
		return this.linhas;
	}
	
	private void salvar(String[] linhas) {}
	private String[] lerArquivo() { return null;}
}
