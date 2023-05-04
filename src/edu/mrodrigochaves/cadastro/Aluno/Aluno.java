package edu.mrodrigochaves.cadastro.Aluno;

import java.util.LinkedHashSet;
import java.util.Set;

import edu.mrodrigochaves.cadastro.Disciplina;

public class Aluno {
    
    private String nome;
    private Set<Disciplina> disciplinasConcluidas = new LinkedHashSet<>();
    private Set<Disciplina> disciplinasIncompletas = new LinkedHashSet<>();


    public void inscreverDisciplina(Disciplina disciplina){}

    public void realizarAvaliacao(){}

    public void calcular_Nota(){}

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Set<Disciplina> getDisciplinasConcluidas() {
        return disciplinasConcluidas;
    }

    public void setDisciplinasConcluidas(Set<Disciplina> disciplinasConcluidas) {
        this.disciplinasConcluidas = disciplinasConcluidas;
    }

    public Set<Disciplina> getDisciplinasIncompletas() {
        return disciplinasIncompletas;
    }

    public void setDisciplinasIncompletas(Set<Disciplina> disciplinasIncompletas) {
        this.disciplinasIncompletas = disciplinasIncompletas;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((nome == null) ? 0 : nome.hashCode());
        result = prime * result + ((disciplinasConcluidas == null) ? 0 : disciplinasConcluidas.hashCode());
        result = prime * result + ((disciplinasIncompletas == null) ? 0 : disciplinasIncompletas.hashCode());
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Aluno other = (Aluno) obj;
        if (nome == null) {
            if (other.nome != null)
                return false;
        } else if (!nome.equals(other.nome))
            return false;
        if (disciplinasConcluidas == null) {
            if (other.disciplinasConcluidas != null)
                return false;
        } else if (!disciplinasConcluidas.equals(other.disciplinasConcluidas))
            return false;
        if (disciplinasIncompletas == null) {
            if (other.disciplinasIncompletas != null)
                return false;
        } else if (!disciplinasIncompletas.equals(other.disciplinasIncompletas))
            return false;
        return true;
    }

    
    
    
    

}
