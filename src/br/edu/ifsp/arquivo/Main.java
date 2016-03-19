package br.edu.ifsp.arquivo;

import java.io.IOException;

public class Main {

	public static void main(String[] args) throws IOException {
		Arquivo a =Arquivo.criaArquivo("arquivo_teste.txt");
		a.lerArquivo();
		
	}

}
