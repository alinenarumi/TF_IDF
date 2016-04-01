package br.edu.ifsp.arquivo;

import java.io.FileInputStream;

import org.apache.poi.xwpf.extractor.XWPFWordExtractor;
import org.apache.poi.xwpf.usermodel.XWPFDocument;

public class ArquivoDOCX extends Arquivo {

	@Override
	public void lerArquivo() {
		XWPFDocument documento = null;
		XWPFWordExtractor extractor = null;
		
		try {
            documento = new XWPFDocument(new FileInputStream(this.nome));
            extractor = new XWPFWordExtractor(documento);
            String texto = extractor.getText();
            String[] arrayPalavras = this.obterPalavras(texto);
			this.inserirPalavras(arrayPalavras);
        }
        catch (Exception e) {
            e.printStackTrace();
        }
	}

}
