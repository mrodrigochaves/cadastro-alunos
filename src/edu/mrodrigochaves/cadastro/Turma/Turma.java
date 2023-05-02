package edu.mrodrigochaves.cadastro.Turma;

import java.time.LocalDate;

public class Turma {

    private String titulo;
    private String descricao;
    private LocalDate dataInicio;

    public String getTitulo() {
        return titulo;
    }
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }
    public String getDescricao() {
        return descricao;
    }
    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }
    public LocalDate getDataInicio() {
        return dataInicio;
    }
    public void setDataInicio(LocalDate localDate) {
        this.dataInicio = localDate;
    }
    @Override
    public String toString() {
        return "Turma [titulo=" + titulo + ", descricao=" + descricao + ", dataInicio=" + dataInicio + "]";
    }

    
    
    
}
