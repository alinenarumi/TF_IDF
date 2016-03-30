package br.edu.ifsp.arquivo;

import java.io.FileInputStream;
import java.io.IOException;

// http://poi.apache.org/download.html#POI-3.14
import org.apache.poi.poifs.filesystem.POIFSFileSystem;
import org.apache.poi.hwpf.extractor.WordExtractor;

public class ArquivoDOC extends Arquivo {

	@Override
	public void lerArquivo() {
		POIFSFileSystem sistemaDeArquivo = null;
		WordExtractor extrator = null;  
		String texto = "";
		
		try {
			sistemaDeArquivo = new POIFSFileSystem(new FileInputStream(this.nome));
			extrator = new WordExtractor(sistemaDeArquivo);  
			texto = extrator.getText();
			System.out.println(texto);
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
