package edu.mrodrigochaves.cadastro.Turma;

import java.time.LocalDate;

import edu.mrodrigochaves.cadastro.Heranca;

public class Turma extends Heranca {

    private LocalDate dataInicio;

    @Override
    public int calcular_Nota() {
        return Nota + 10;
    }

    public Turma(){

    }

    public LocalDate getDataInicio() {
        return dataInicio;
    }

    public void setDataInicio(LocalDate localDate) {
        this.dataInicio = localDate;
    }

    @Override
    public String toString() {
        return "Turma [titulo=" + getTitulo() + ", descricao=" + getDescricao() + ", dataInicio=" + dataInicio + "]";
    }

}
