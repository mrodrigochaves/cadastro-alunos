package edu.mrodrigochaves.cadastro;

public abstract class Heranca {

    protected static final int Nota = 10;
    
    private String titulo;
    private String descricao;

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
