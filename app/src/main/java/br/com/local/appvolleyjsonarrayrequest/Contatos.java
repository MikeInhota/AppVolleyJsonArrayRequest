package br.com.local.appvolleyjsonarrayrequest;

public class Contatos {
    private String nome;
    private String tipo;

    public Contatos() {
    }

    public Contatos(String nome, String tipo) {
        this.nome = nome;
        this.tipo = tipo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
}
