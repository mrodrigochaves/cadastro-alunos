package edu.mrodrigochaves.cadastro.Turma;

import java.time.LocalDate;

import edu.mrodrigochaves.cadastro.Disciplina.Disciplina;

public class Turma extends Disciplina {

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

    public void setDataInicio(LocalDate dataInicio) {
        this.dataInicio = dataInicio;
    }

    @Override
    public String toString() {
        return "Turma [titulo=" + getTitulo() + ", descricao=" + getDescricao() + ", dataInicio=" + dataInicio + "]";
    }

}
