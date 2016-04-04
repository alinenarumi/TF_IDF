package br.edu.ifsp.controles;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import br.edu.ifsp.configuracao.ArquivoConfiguracao;
import br.edu.ifsp.telas.TelaConfiguracao;

public class ArquivoConfiguracaoControle {
	private ArquivoConfiguracao modelo;
	private TelaConfiguracao tela;
	
	public ArquivoConfiguracaoControle(TelaConfiguracao tela, ArquivoConfiguracao modelo) {
		this.tela = tela;
		this.modelo = modelo;
		
		this.intEventos();
	}
	
	public void intEventos() {
		this.tela.setBtnSalvarEventoClick(new ActionListener() {		
			@Override
			public void actionPerformed(ActionEvent e) {
				try {
					String texto = tela.getTxtArquivoConfiguracao();
					modelo.atualizar(texto.split("\n"));
					tela.mensagem("Salvo!");
				}
				catch(Exception erro) {
					tela.mensagem(erro.getMessage());
				}
			}
		});
		
		this.tela.setBtnCarregarEventoClick(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				tela.setTxtArquivoConfiguracao("");
				String texto = "";
				for (String t : modelo.linhas()) {
					texto += t + "\n";
				}
				tela.setTxtArquivoConfiguracao(texto);
				tela.mensagem("Completo!");
			}
		});
	}
}
