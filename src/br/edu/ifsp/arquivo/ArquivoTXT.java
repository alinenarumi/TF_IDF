package br.edu.ifsp.arquivo;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class ArquivoTXT extends Arquivo {
	
	@Override
	public void lerArquivo() 
	{
		BufferedReader leitor;
		String linha = "";

		try {
			leitor = new BufferedReader(new FileReader(this.nome));
			
			while ((linha = leitor.readLine()) != null) {
				
				System.out.println(linha);
			}
			
			leitor.close();
			
		} catch (IOException e) {
			System.err.println(e.getMessage());
		} catch (Exception e) {
			System.err.println(e.getMessage());
		}
		
	}	
}


