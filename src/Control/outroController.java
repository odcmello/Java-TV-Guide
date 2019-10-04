package Control;

import Main.globalVariablesLists;
import Model.Outro;
import java.util.ArrayList;

public class outroController {
    public void inserirPrograma(String ano, String nome, String classificacao, String idioma, 
                                   String genero, String diretor, String duracao, String distribuidora, String sinopse, ArrayList<String> Atores){
        Outro outro = new Outro();
        outro.setAno(Integer.valueOf(ano));
        outro.setNome(nome);
        outro.setClassificacaoIndicativa(classificacao);
        outro.setDiretor(diretor);
        outro.setDuracao(Integer.valueOf(duracao));
        outro.setElenco(Atores);
        outro.setGenero(genero);
        outro.setIdioma(idioma);
        outro.setIdPrograma(globalVariablesLists.programasTV.size()+1);
        outro.setIdioma(idioma);
        outro.setSinopse(sinopse);
        globalVariablesLists.programasTV.add(outro);
        globalVariablesLists.outrosTV.add(outro);
    }
        
    public static boolean removerOutros(int idOutro) {
        for (Outro o : globalVariablesLists.outrosTV) {
            if (o.getIdPrograma() == idOutro) {
                globalVariablesLists.outrosTV.remove(o);
                return true;
            }
        }
        return false;
    }
}
