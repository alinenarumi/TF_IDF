package br.edu.ifsp.arquivo;

import java.io.IOException;

public class Main {

	public static void main(String[] args) throws IOException {
		Arquivo a = Arquivo.criaArquivo("/home/henrique/Desktop/10.1.1.53.7394.pdf");
		a.lerArquivo();
	}
}
