package br.edu.ifsp.arquivo;

import java.io.BufferedReader;
import java.io.FileReader;

public class ArquivoTXT extends Arquivo {
	
	@Override
	public void lerArquivo() 
	{
		BufferedReader leitor = null;
		try {
			leitor = new BufferedReader(new FileReader(super.getNome()));
			String linha;
			while ((linha = leitor.readLine()) != null) {
				String[] palavras = this.obterPalavras(linha);
				super.inserirPalavras(palavras);
			}
			leitor.close();
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		
	}	
}
