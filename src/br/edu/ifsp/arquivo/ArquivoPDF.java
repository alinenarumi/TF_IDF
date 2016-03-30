package br.edu.ifsp.arquivo;

import java.io.File;
import java.io.IOException;

// http://pdfbox.apache.org/download.cgi#20x
import org.apache.pdfbox.pdmodel.PDDocument;
import org.apache.pdfbox.text.PDFTextStripper;

public class ArquivoPDF extends Arquivo{
	
	public void lerArquivo()
	{
		PDDocument arquivoPDF = null;
		try {
			arquivoPDF = PDDocument.load(new File(this.nome));
			PDFTextStripper descascador = new PDFTextStripper();
			String texto = descascador.getText(arquivoPDF);
			System.out.println(texto);
		} catch(IOException e) {
			System.out.println("IOException: " + e.getMessage());
			throw new RuntimeException(e);
		}
		catch(Exception e) {
			System.out.println("Exception: " + e.getMessage());
		}
		finally {
			if(arquivoPDF != null) {
				try {
					arquivoPDF.close();
				} catch(IOException e) {
					System.out.println("IOException: " + e.getMessage());
					throw new RuntimeException(e);
				}
			}
		}
	}
}
