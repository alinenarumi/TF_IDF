package br.edu.ifsp.diretorio;

import java.util.ArrayList;
import java.util.List;

import br.edu.ifsp.diretorio.Extensao;
import br.edu.ifsp.arquivo.Arquivo;

public class Diretorio {
	private String caminho;
    private Extensao[] extensoes;
    private List<Arquivo> listaDeArquivos;

    public Diretorio(String path, Extensao[] extensions) {
        this.caminho = path;
        this.extensoes = extensions;
        listaDeArquivos = new ArrayList<>();
    }

    public List<Arquivo> getFileList() {
        return this.listaDeArquivos;
    }

    public void obterSubArquivos() {
        List<String> filaDeDiretorios = new ArrayList<>();
        filaDeDiretorios.add(this.caminho);
        
        while (filaDeDiretorios.size() > 0) {
            java.io.File file = new java.io.File(filaDeDiretorios.get(0));
            java.io.File[] subArquivos = file.listFiles();
            
            if (subArquivos != null) {
                for (java.io.File arquivo : subArquivos) {
                    if (arquivo.isFile()) {
                        if (verificarExtensao(Arquivo.obterExtensaoArquivo(arquivo.getAbsolutePath()))) {
                            this.listaDeArquivos.add(Arquivo.criaArquivo(arquivo.getAbsolutePath()));
                        }
                    } else if (arquivo.isDirectory()) {
                    	filaDeDiretorios.add(arquivo.getAbsolutePath());
                    }
                }
            }
            
            filaDeDiretorios.remove(0);
        }
    }

    public boolean verificarExtensao(String extensao) {
        for (Extensao ext : this.extensoes) {
            if (ext.getNome().equals(extensao)) {
                return true;
            }
        }
        return false;
    }
}
