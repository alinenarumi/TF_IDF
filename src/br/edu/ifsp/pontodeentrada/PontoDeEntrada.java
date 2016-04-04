package br.edu.ifsp.pontodeentrada;

import java.io.IOException;

import br.edu.ifsp.controles.TelaPrincipalControle;
import br.edu.ifsp.telas.TelaPrincipal;

public class PontoDeEntrada {

	public static void main(String[] args) throws IOException {
		new TelaPrincipalControle (
				new TelaPrincipal()
				);
	}
}
