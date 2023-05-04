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
    
    
    

}
