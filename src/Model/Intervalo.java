package Model;

import java.time.LocalDate;
import java.time.LocalTime;

/**
 *
 * @author UFSM
 */
public class Intervalo {
    Programa programaPassando;
    Canal canalPassando;
    LocalTime inicio,fim;
    LocalDate data;

    public Programa getProgramaPassando() {
        return programaPassando;
    }

    public void setProgramaPassando(Programa programaPassando) {
        this.programaPassando = programaPassando;
    }

    public Canal getCanalPassando() {
        return canalPassando;
    }

    public void setCanalPassando(Canal canalPassando) {
        this.canalPassando = canalPassando;
    }

    public LocalTime getInicio() {
        return inicio;
    }

    public void setInicio(LocalTime inicio) {
        this.inicio = inicio;
    }

    public LocalTime getFim() {
        return fim;
    }

    public void setFim(LocalTime fim) {
        this.fim = fim;
    }

    public LocalDate getData() {
        return data;
    }

    public void setData(LocalDate data) {
        this.data = data;
    }
}
