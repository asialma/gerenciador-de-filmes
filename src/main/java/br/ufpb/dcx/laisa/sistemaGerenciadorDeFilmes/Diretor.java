package br.ufpb.dcx.laisa.sistemaGerenciadorDeFilmes;

import java.util.Objects;

public class Diretor {
    private String nome;
    private int anoNascimento;

    public Diretor(String nome, int anoNascimento) {
        this.nome = nome;
        this.anoNascimento = anoNascimento;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getAnoNascimento() {
        return anoNascimento;
    }

    public void setAnoNascimento(int anoNascimento) {
        this.anoNascimento = anoNascimento;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Diretor diretor = (Diretor) o;

        if (anoNascimento != diretor.anoNascimento) return false;
        return Objects.equals(nome, diretor.nome);
    }

    @Override
    public int hashCode() {
        int result = nome != null ? nome.hashCode() : 0;
        result = 31 * result + anoNascimento;
        return result;
    }

    @Override
    public String toString() {
        return nome + '\'' +
                ", Ano de Nascimento: " + anoNascimento;
    }
}
