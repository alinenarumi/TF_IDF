package br.edu.ifsp.configuracao;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
//teste aline

public class ArquivoConfiguracao {
	private String caminho;
	private List<String> linhas;
	
	public ArquivoConfiguracao(String caminho) {
		this.caminho = caminho;
		linhas = new ArrayList<>();
		this.lerArquivo();
	}
	
	public String getCaminho() {
		return this.caminho;
	}
	
	public List<String> linhas() {
		this.linhas = new ArrayList<>(); 
		this.lerArquivo();
		return this.linhas;
	}
	
	public void atualizar(String[] linhas) {
		this.salvar(linhas);
		this.lerArquivo();
	}
	
	private void lerArquivo() { 
		BufferedReader leitor = null;
		try {
			leitor = new BufferedReader(new FileReader(this.caminho));
			String linha;
			
			while ((linha = leitor.readLine()) != null) {
				this.linhas.add(linha);
			}
			leitor.close();
		}
		catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	private void salvar(String[] linhas) {
        BufferedWriter output = null;
        
        try {
            File file = new File(this.caminho);
            output = new BufferedWriter(new FileWriter(file));
            
            for (int i = 0; i < linhas.length; i++) {
            	output.write(linhas[i]);
            	
            	if(i != linhas.length-1) {
            		output.write("\n");
            	}
			} 
            output.close();
        } catch ( IOException e ) {
            e.printStackTrace();
        } catch(Exception e) {
        	e.printStackTrace();
        }
	}
}
