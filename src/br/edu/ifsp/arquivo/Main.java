package br.edu.ifsp.arquivo;

import java.io.IOException;

public class Main {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		Arquivo a =Arquivo.criaArquivo("arquivo_teste.txt");
		a.lerArquivo();
		
	}

}
