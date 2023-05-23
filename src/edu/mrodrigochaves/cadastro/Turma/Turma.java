package edu.mrodrigochaves.cadastro.Turma;

import java.time.LocalDate;

import edu.mrodrigochaves.cadastro.Disciplina.Disciplina;

public class Turma extends Disciplina {
    
    private LocalDate dataInicio;

    // Sobrescreve o método calcular_Nota() da classe Disciplina
    @Override
    public int calcular_Nota() {
        return Nota + 10;
    }

    public Turma() {
        // Construtor padrão
    }

    public LocalDate getDataInicio() {
        return dataInicio;
    }

    public void setDataInicio(LocalDate dataInicio) {
        this.dataInicio = dataInicio;
    }

    // Sobrescreve o método toString() da classe Object
    @Override
    public String toString() {
        return "Turma [titulo=" + getTitulo() + ", descricao=" + getDescricao() + ", dataInicio=" + dataInicio + "]";
    }
}
