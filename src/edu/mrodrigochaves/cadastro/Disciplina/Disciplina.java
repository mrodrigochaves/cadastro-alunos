package edu.mrodrigochaves.cadastro.Disciplina;

public abstract class Disciplina {

    protected static final int Nota = 15;
    
    private String titulo;
    private String descricao;

    // Método abstrato para calcular a nota da disciplina
    public abstract int calcular_Nota();

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
    
}
