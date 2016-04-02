package br.edu.ifsp.controles;

import br.edu.ifsp.configuracao.ArquivoConfiguracao;
import br.edu.ifsp.telas.TelaArquivoConfiguracao;

public class ArquivoConfiguracaoControle {
	
	private ArquivoConfiguracao modelo;
	private TelaArquivoConfiguracao tela;
		
	public ArquivoConfiguracaoControle(
			ArquivoConfiguracao modelo, 
			TelaArquivoConfiguracao tela) {
		this.modelo = modelo;
		this.tela = tela;
	}
}
