package edu.mrodrigochaves.cadastro.Curso;

import edu.mrodrigochaves.cadastro.Disciplina;

public class Curso extends Disciplina{

    
    private int cargaHoraria;

    @Override
    public int calcular_Nota() {
        return Nota * cargaHoraria;
    }

    public Curso(){

    }
   
    public int getCargaHoraria() {
        return cargaHoraria;
    }
    public void setCargaHoraria(int cargaHoraria) {
        this.cargaHoraria = cargaHoraria;
    }
    @Override
    public String toString() {
        return "Curso [titulo=" + getTitulo() + ", descricao=" + getDescricao() + ", cargaHoraria=" + cargaHoraria + "]";
    }
       
    
}
