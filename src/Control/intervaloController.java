package Control;

import Main.globalVariablesLists;
import Model.Canal;
import Model.Intervalo;
import Model.Programa;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import javax.swing.JOptionPane;

public class intervaloController {

    public boolean inserirProgramaInIntervalo(String nomePrograma, String numeroCanal, String date, String time) {
        Intervalo intervalo = new Intervalo();
        DateTimeFormatter format = DateTimeFormatter.ofPattern("dd-MM-yyyy");
        DateTimeFormatter formatTime = DateTimeFormatter.ofPattern("HH:mm");
        for (Programa p : globalVariablesLists.programasTV) {
            if (p.getNome().equals(nomePrograma)) {
                intervalo.setProgramaPassando(p);
            }
        }
        if (intervalo.getProgramaPassando() == null) {
            JOptionPane.showMessageDialog(null, "Programa não existe no banco.");
            return false;
        }
        for (Canal c : globalVariablesLists.canaisTV) {
            if (c.getNumeroCanal() == Integer.valueOf(numeroCanal)) {
                intervalo.setCanalPassando(c);
            }
        }
        if (intervalo.getCanalPassando() == null) {
            JOptionPane.showMessageDialog(null, "Canal não existe no banco.");
            return false;
        }
        for (Intervalo i : globalVariablesLists.intervalosTV) {
            if (intervalo.getCanalPassando().getNumeroCanal() == i.getCanalPassando().getNumeroCanal()) {
                if (i.getData().compareTo(LocalDate.parse(date,format)) == 0) {
                    if (!(LocalTime.parse(time,formatTime)).isBefore(i.getInicio()) && (LocalTime.parse(time,formatTime)).isBefore(i.getFim())) {
                        JOptionPane.showMessageDialog(null, "Já existe um programa agendado nesse horário.");
                        return false;
                    }
                }
            }
        }
        intervalo.setData(LocalDate.parse(date,format));
        intervalo.setInicio(LocalTime.parse(time,formatTime));
        intervalo.setFim(LocalTime.parse(time,formatTime).plusMinutes(intervalo.getProgramaPassando().getDuracao()));
        globalVariablesLists.intervalosTV.add(intervalo);
        return true;
    }
    
    public static boolean removerIntervalo(String nomePrograma, int idCanal, LocalDate data, LocalTime inicio, LocalTime fim){
        for (Intervalo i: globalVariablesLists.intervalosTV){
            if (i.getCanalPassando().getNumeroCanal() == idCanal && i.getProgramaPassando().getNome().equals(nomePrograma)
                && i.getData().equals(data) && i.getInicio().equals(inicio) && i.getFim().equals(fim)) {
                globalVariablesLists.intervalosTV.remove(i);
                return true;
            }
        }
        return false;
    }
}
