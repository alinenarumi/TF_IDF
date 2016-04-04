package br.edu.ifsp.controles;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import br.edu.ifsp.configuracao.ArquivoConfiguracao;
import br.edu.ifsp.telas.TelaConfiguracao;
import br.edu.ifsp.telas.TelaPrincipal;

public class TelaPrincipalControle {
	
	private TelaPrincipal telaPrincipal;
	
	public TelaPrincipalControle(TelaPrincipal telaPrincipal) {
		this.telaPrincipal = telaPrincipal;
		
		// Iniciando eventos
		this.intEventos();
	}
	
	public void intEventos() {
		this.telaPrincipal.setMenuItemSobreEventoClick(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				telaPrincipal.mensagem("TF_IDF B1LP2");
				
			}
		});
		
		this.telaPrincipal.setMenuItemSairEventoClick(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				telaPrincipal.mensagem("Saindo...");
				System.exit(0);
			}
		});
	
		this.telaPrincipal.setMenuItemConfiguracaoEventoClick(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				//
				new ArquivoConfiguracaoControle (
						new TelaConfiguracao(), 
						new ArquivoConfiguracao("initial.txt")
						);
			}
		});
	}
}
