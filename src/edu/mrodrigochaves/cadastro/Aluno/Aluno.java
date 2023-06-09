package edu.mrodrigochaves.cadastro.Aluno;

import java.util.*;

import edu.mrodrigochaves.cadastro.Avaliacao.Avaliacao;
import edu.mrodrigochaves.cadastro.Curso.Curso;
import edu.mrodrigochaves.cadastro.Disciplina.Disciplina;

public class Aluno {
    
    private String nome;
    private Set<Disciplina> disciplinasInscritas = new LinkedHashSet<>();
    private Set<Disciplina> disciplinasConcluidas = new LinkedHashSet<>();
    
    // Método para inscrever o aluno em um curso
    public void inscreverCurso(Avaliacao avaliacao){
        this.disciplinasInscritas.addAll(avaliacao.getDisciplinas());
        avaliacao.getAlunosInscritos().add(this);
    }
    
    // Método para avançar o aluno para a próxima disciplina
    public void avancar(){
        Optional<Disciplina> disciplina = this.disciplinasInscritas.stream().findFirst();
        if(disciplina.isPresent()){
            this.disciplinasConcluidas.add(disciplina.get());
            this.disciplinasInscritas.remove(disciplina.get());
        } else {
            System.err.println("Você não está matriculado em nenhuma disciplina!");
        }
    }
    
    // Método para calcular a nota total do aluno
    public int calcular_Nota(){
        Iterator<Disciplina> iterator = this.disciplinasConcluidas.iterator();
        int soma = 0;
        while(iterator.hasNext()){
            int next = iterator.next().calcular_Nota();
            soma += next;
        }
        return soma;
        // return this.disciplinasConcluidas.stream().mapToInt(disciplina -> disciplina.calcular_Nota()).sum();
    }
    
    // Getters e Setters
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Set<Disciplina> getDisciplinasInscritas() {
        return disciplinasInscritas;
    }

    public void setDisciplinasInscritas(Set<Disciplina> disciplinasInscritas) {
        this.disciplinasInscritas = disciplinasInscritas;
    }

    public Set<Disciplina> getDisciplinasConcluidas() {
        return disciplinasConcluidas;
    }

    public void setDisciplinasConcluidas(Set<Disciplina> disciplinasConcluidas) {
        this.disciplinasConcluidas = disciplinasConcluidas;
    }

    // Métodos hashCode() e equals() para comparação de objetos Aluno
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((nome == null) ? 0 : nome.hashCode());
        result = prime * result + ((disciplinasConcluidas == null) ? 0 : disciplinasConcluidas.hashCode());
        result = prime * result + ((disciplinasInscritas == null) ? 0 : disciplinasInscritas.hashCode());
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
        if (disciplinasInscritas == null) {
            if (other.disciplinasInscritas != null)
                return false;
        } else if (!disciplinasInscritas.equals(other.disciplinasInscritas))
            return false;
        return true;
    }
}
