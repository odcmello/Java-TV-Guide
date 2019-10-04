package Control;

import Main.globalVariablesLists;
import Model.Filme;
import java.util.ArrayList;

public class filmeController {
    public void inserirPrograma(String ano, String nome, String classificacao, String idioma, 
        String genero, String diretor, String duracao, String distribuidora, String sinopse, ArrayList<String> Atores){
        Filme filme = new Filme();       
        filme.setAno(Integer.valueOf(ano));
        filme.setNome(nome);
        filme.setClassificacaoIndicativa(classificacao);
        filme.setDiretor(diretor);
        filme.setDuracao(Integer.valueOf(duracao));
        filme.setElenco(Atores);
        filme.setGenero(genero);
        filme.setIdioma(idioma);
        filme.setIdPrograma(globalVariablesLists.programasTV.size()+1);
        filme.setIdioma(idioma);
        filme.setSinopse(sinopse);
        globalVariablesLists.programasTV.add(filme);
        globalVariablesLists.filmesTV.add(filme);
    }
    
    public static boolean removerFilme(int idFilme) {
        for (Filme f : globalVariablesLists.filmesTV) {
            if (f.getIdPrograma() == idFilme) {
                globalVariablesLists.filmesTV.remove(f);
                return true;
            }
        }
        return false;
    }            
}
