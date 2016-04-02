package br.edu.ifsp.configuracao;

import java.io.BufferedReader;
import java.io.FileReader;

import br.edu.ifsp.diretorio.Diretorio;
import br.edu.ifsp.diretorio.Extensao;

public class AppConfiguracao {
	private Diretorio[] listaDiretorios;
	
	public AppConfiguracao(String caminho) 
	{
		this.leituraInicial(caminho);
	}
	
	public Diretorio[] getListaDiretorios() {
		return this.listaDiretorios;
	}
	
	private void leituraInicial(String caminho) {
		try {
            BufferedReader leitor = new BufferedReader(new FileReader(caminho));
            this.listaDiretorios = new Diretorio[((Long) leitor.lines().count()).intValue()];
            leitor.close();
            
            leitor = new BufferedReader(new FileReader(caminho));
            String line;
            int i = 0;
            
            while ((line = leitor.readLine()) != null) {
                String[] parameters = line.split("\\{");
                String directoryPath = parameters[0].trim();
                String extensionsLine = parameters[1].split("}")[0];
                String extensionsStrings[] = extensionsLine.split(";");
                
                Extensao[] extensions = new Extensao[extensionsStrings.length];
                
                int j = 0;
                
                for (String extensionString : extensionsStrings) {
                    String extensionParameters[] = extensionString.split(",");
                    extensions[j] =  new Extensao(extensionParameters[0], extensionParameters[1].equals("S"));
                    j++;
                }
                this.listaDiretorios[i] = new Diretorio(directoryPath, extensions);
                i++;
            }
            leitor.close();
        }
        catch(Exception e) {
            e.printStackTrace();
        }
	}
}
