package br.edu.ifsp.pontodeentrada;

import java.io.IOException;

import br.edu.ifsp.configuracao.ArquivoConfiguracao;
import br.edu.ifsp.controles.ArquivoConfiguracaoControle;
import br.edu.ifsp.telas.TelaConfiguracao;

public class PontoDeEntrada {

	public static void main(String[] args) throws IOException {
		
		new ArquivoConfiguracaoControle(
				new TelaConfiguracao(), 
				new ArquivoConfiguracao("initial.txt")
				);
	}
}
