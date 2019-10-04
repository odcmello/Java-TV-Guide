package Control;

import Main.globalVariablesLists;
import Model.Serie;
import java.util.ArrayList;

public class serieController {
    public void inserirPrograma(String ano, String nome, String classificacao, String idioma, 
                                   String genero, String diretor, String duracao, String distribuidora, 
                                   String temp, String episo, String sinopse, ArrayList<String> Atores){
        Serie serie = new Serie();
        serie.setAno(Integer.valueOf(ano));
        serie.setNome(nome);
        serie.setClassificacaoIndicativa(classificacao);
        serie.setDiretor(diretor);
        serie.setDuracao(Integer.valueOf(duracao));
        serie.setElenco(Atores);
        serie.setGenero(genero);
        serie.setIdioma(idioma);
        serie.setIdPrograma(globalVariablesLists.programasTV.size()+1);
        serie.setIdioma(idioma);
        serie.setNumeroEpisodios(Integer.valueOf(episo));
        serie.setSinopse(sinopse);
        serie.setTemporada(Integer.valueOf(temp));
        globalVariablesLists.programasTV.add(serie);
        globalVariablesLists.seriesTV.add(serie);
    }
    
    
    public static boolean removerSerie(int idSerie) {
        for (Serie s : globalVariablesLists.seriesTV) {
            if (s.getIdPrograma() == idSerie) {
                globalVariablesLists.seriesTV.remove(s);
                return true;
            }
        }
        return false;
    }
}
