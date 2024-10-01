package br.ufpb.dcx.laisa.sistemaGerenciadorDeFilmes;

import java.util.Objects;

public class Filme {
    private String id;
    private String titulo;
    private int anoLancamento;
    private String categoria;
    private Diretor diretor;

    public Filme(String id, String titulo, int anoLancamento, String categoria, Diretor diretor) {
        this.id = id;
        this.titulo = titulo;
        this.anoLancamento = anoLancamento;
        this.categoria = categoria;
        this.diretor = diretor;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public int getAnoLancamento() {
        return anoLancamento;
    }

    public void setAnoLancamento(int anoLancamento) {
        this.anoLancamento = anoLancamento;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public Diretor getDiretor() {
        return diretor;
    }

    public void setDiretor(Diretor diretor) {
        this.diretor = diretor;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Filme filme = (Filme) o;

        if (anoLancamento != filme.anoLancamento) return false;
        if (!Objects.equals(id, filme.id)) return false;
        if (!Objects.equals(titulo, filme.titulo)) return false;
        if (categoria != filme.categoria) return false;
        return Objects.equals(diretor, filme.diretor);
    }

    @Override
    public int hashCode() {
        int result = id != null ? id.hashCode() : 0;
        result = 31 * result + (titulo != null ? titulo.hashCode() : 0);
        result = 31 * result + anoLancamento;
        result = 31 * result + (categoria != null ? categoria.hashCode() : 0);
        result = 31 * result + (diretor != null ? diretor.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "br.ufpb.dcx.laisa.sistemaGerenciadorDeFilmes.Filme" +
                "\nID:'" + id + '\'' +
                "\nTÍTULO:" + titulo + '\'' +
                "\nANO DE LANÇAMENTO:" + anoLancamento +
                "\nCATEGORIA:" + categoria +
                "\nDIRETOR: " + diretor +
                '}';
    }
}
