package br.edu.ifsp.telas;

import java.awt.FlowLayout;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class TelaPrincipal extends JFrame {
	private static final long serialVersionUID = 1L;
	
	private JPanel painel;
	private JMenuBar baraMenu;
	
	private JMenu menuArquivo;
	private JMenuItem menuItemSair;
		
	private JMenu menuConfiguracao;
	private JMenuItem menuItemConfiguracao;
	
	private JMenu menuAjuda;
	private JMenuItem menuItemSobre;
	
	public TelaPrincipal() {
		this.baraMenu = new JMenuBar();
		
		this.menuArquivo = new JMenu ("Arquivo");
		this.menuItemSair = new JMenuItem("Sair");
		this.menuArquivo.add(menuItemSair);
		
		this.menuConfiguracao= new JMenu("Configuração");
		this.menuItemConfiguracao = new JMenuItem("Configuração");
		this.menuConfiguracao.add(menuItemConfiguracao);
		
		this.menuAjuda = new JMenu("Ajuda");
		this.menuItemSobre = new JMenuItem("Sobre");
		this.menuAjuda.add(menuItemSobre);
		
		this.baraMenu.add(menuArquivo);
		this.baraMenu.add(menuConfiguracao);
		this.baraMenu.add(menuAjuda);
		
		this.setJMenuBar(this.baraMenu);
		
		this.painel = new JPanel(new FlowLayout());
		this.add(painel);
		
		this.setTitle("TF_IDF Projeto");
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setSize(500, 500);
		this.setLocationRelativeTo(null);
		this.setVisible(true);
	}
	
	public void setMenuItemSairEventoClick(ActionListener evento) {
		this.menuItemSair.addActionListener(evento);
	}
	
	public void setMenuItemConfiguracaoEventoClick(ActionListener evento) {
		this.menuItemConfiguracao.addActionListener(evento);
	}
	
	public void setMenuItemSobreEventoClick(ActionListener evento) {
		this.menuItemSobre.addActionListener(evento);
	}
	
	public void mensagem(String msg) {
		JOptionPane.showMessageDialog(this, msg);
	}
}
