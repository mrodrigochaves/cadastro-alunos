package edu.mrodrigochaves.cadastro.Avaliacao;

import java.time.LocalDate;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class Avaliacao {

    private String nome;
    private String descricao;
    private final LocalDate dataInicial = LocalDate.now();
    private final LocalDate dataFinal = dataInicial.plusDays(60);

    private Set<Aluno> alunosInscritos = new HashSet<>();
    private Set<Disciplina> disciplinas = new LinkedHashSet<>();

    // Getter e Setter para o atributo 'nome'
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }

    // Getter e Setter para o atributo 'descricao'
    public String getDescricao() {
        return descricao;
    }
    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    // Getter para o atributo 'dataInicial'
    public LocalDate getDataInicial() {
        return dataInicial;
    }

    // Getter para o atributo 'dataFinal'
    public LocalDate getDataFinal() {
        return dataFinal;
    }

    // Getter e Setter para o atributo 'alunosInscritos'
    public Set<Aluno> getAlunosInscritos() {
        return alunosInscritos;
    }
    public void setAlunosInscritos(Set<Aluno> alunosInscritos) {
        this.alunosInscritos = alunosInscritos;
    }

    // Getter e Setter para o atributo 'disciplinas'
    public Set<Disciplina> getDisciplinas() {
        return disciplinas;
    }
    public void setDisciplinas(Set<Disciplina> disciplinas) {
        this.disciplinas = disciplinas;
    }

    // Sobrescrita do método hashCode() para permitir comparação de objetos com base nos atributos
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((nome == null) ? 0 : nome.hashCode());
        result = prime * result + ((descricao == null) ? 0 : descricao.hashCode());
        result = prime * result + ((dataInicial == null) ? 0 : dataInicial.hashCode());
        result = prime * result + ((dataFinal == null) ? 0 : dataFinal.hashCode());
        result = prime * result + ((alunosInscritos == null) ? 0 : alunosInscritos.hashCode());
        result = prime * result + ((disciplinas == null) ? 0 : disciplinas.hashCode());
        return result;
    }

    // Sobrescrita do método equals() para permitir comparação de objetos com base nos atributos
    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Avaliacao other = (Avaliacao) obj;
        if (nome == null) {
            if (other.nome != null)
                return false;
        } else if (!nome.equals(other.nome))
            return false;
        if (descricao == null) {
            if (other.descricao != null)
                return false;
        } else if (!descricao.equals(other.descricao))
            return false;
        if (dataInicial == null) {
            if (other.dataInicial != null)
                return false;
        } else if (!dataInicial.equals(other.dataInicial))
            return false;
        if (dataFinal == null) {
            if (other.dataFinal != null)
                return false;
        } else if (!dataFinal.equals(other.dataFinal))
            return false;
        if (alunosInscritos == null) {
            if (other.alunosInscritos != null)
                return false;
        } else if (!alunosInscritos.equals(other.alunosInscritos))
            return false;
        if (disciplinas == null) {
            if (other.disciplinas != null)
                return false;
        } else if (!disciplinas.equals(other.disciplinas))
            return false;
        return true;
    }
}

