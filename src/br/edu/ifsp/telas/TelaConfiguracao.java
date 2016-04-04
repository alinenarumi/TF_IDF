package br.edu.ifsp.telas;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.ScrollPaneConstants;

public class TelaConfiguracao extends JFrame
{
	static final long serialVersionUID = 1L;
	
	private JPanel painel;

	private JLabel lblRegra;
	private JTextArea txtArquivoConfiguracao;
	private JButton btnSalvar;
	private JButton btnCarregar;
	private JScrollPane scroll;
	
	public TelaConfiguracao() {
		this.painel = new JPanel(new FlowLayout());
				
		this.lblRegra = new JLabel(
				"Insira a regra. \nEx: [ diretorio {txt,N;pdf,N} ]");
		this.lblRegra.setFont(new Font("Arial", 1, 16));
		
		this.txtArquivoConfiguracao = new JTextArea(20, 40);
		this.txtArquivoConfiguracao.setToolTipText("Insira a a URL e a regra...");	
		this.txtArquivoConfiguracao.setForeground(Color.BLUE);
		
		this.scroll = new JScrollPane(txtArquivoConfiguracao);
		scroll.setVerticalScrollBarPolicy (ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS );
		
		this.btnSalvar = new JButton("Salvar");
		this.btnCarregar = new JButton("Carregar");
		
		this.painel.add(this.lblRegra);
		this.painel.add(this.scroll);
		this.painel.add(this.btnCarregar);
		this.painel.add(this.btnSalvar);
		this.add(painel);
		
		this.setSize(500, 400);
		this.setResizable(false);
		this.setLocationRelativeTo(null);
		this.setVisible(true);
	}
	
	public String getTxtArquivoConfiguracao() {
		return this.txtArquivoConfiguracao.getText();
	}
	
	public void setTxtArquivoConfiguracao(String texto) {
		this.txtArquivoConfiguracao.setText(texto);
	}
	
	public void setBtnCarregarEventoClick(ActionListener carregarEvento) {
		this.btnCarregar.addActionListener(carregarEvento);
	}
	
	public void setBtnSalvarEventoClick(ActionListener salvarEvento) {
		this.btnSalvar.addActionListener(salvarEvento);
	}
	
	public void mensagem(String msg) {
		JOptionPane.showMessageDialog(this, msg);
	}
}
