package br.edu.ifsp.pontodeentrada;

import java.io.IOException;

import br.edu.ifsp.arquivo.Arquivo;

public class Main {

	public static void main(String[] args) throws IOException {
		Arquivo a = Arquivo.criaArquivo("/home/henrique/Desktop/Exemplo de Plano de Testes.doc");
		a.lerArquivo();
	}
}
