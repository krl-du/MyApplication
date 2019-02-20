package br.senac.myapplication.model;

public class ContatoEntity {
    private Integer id;
    private String nome;
    private String telefone;
    private  Double pontuacao;

    public ContatoEntity(String nome, String telefone, Double pontuacao) {

        this.nome = nome;
        this.telefone = telefone;
        this.pontuacao = pontuacao;

    }

    public ContatoEntity() {
    }

    public Integer getId() {

        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public Double getPontuacao() {
        return pontuacao;
    }

    public void setPontuacao(Double pontuacao) {
        this.pontuacao = pontuacao;
    }

    @Override
    public String toString() {
        return  "nome='" + nome + '\'' +
                ", telefone='" + telefone + '\'' +
                ", pontuacao=" + pontuacao;

    }
}
