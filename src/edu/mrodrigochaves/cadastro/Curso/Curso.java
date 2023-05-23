package edu.mrodrigochaves.cadastro.Curso;

import java.util.Collection;
import java.util.HashSet;
import java.util.Set;

import edu.mrodrigochaves.cadastro.Aluno.Aluno;
import edu.mrodrigochaves.cadastro.Disciplina.Disciplina;

public class Curso extends Disciplina {
    
    private int cargaHoraria;
    private Set<Aluno> alunosInscritos = new HashSet<>();

    // Sobrescreve o método calcular_Nota() da classe Disciplina
    @Override
    public int calcular_Nota() {
        return Nota * cargaHoraria;
    }

    public Curso() {
        // Construtor padrão
    }
   
    public int getCargaHoraria() {
        return cargaHoraria;
    }
    
    public void setCargaHoraria(int cargaHoraria) {
        this.cargaHoraria = cargaHoraria;
    }
    
    // Sobrescreve o método toString() da classe Object
    @Override
    public String toString() {
        return "Curso [titulo=" + getTitulo() + ", descricao=" + getDescricao() + ", cargaHoraria=" + cargaHoraria + "]";
    }

    public Set<Aluno> getAlunosInscritos() {
        return alunosInscritos;
    }

    public void setAlunosInscritos(Set<Aluno> alunosInscritos) {
        this.alunosInscritos = alunosInscritos;
    }

    // Retorna uma coleção de Disciplina (método não implementado)
    public Collection<? extends Disciplina> getDisciplinas() {
        return null;
    }
}
