package br.ufpb.dcx.laisa.sistemaGerenciadorDeFilmes;
import br.ufpb.dcx.laisa.sistemaGerenciadorDeFilmes.exceptions.FilmeJaCadastradoException;
import br.ufpb.dcx.laisa.sistemaGerenciadorDeFilmes.exceptions.FilmeNaoExisteException;

import java.util.List;

public interface SistemaFilmes {
    public void cadastrarFilme(String id, String titulo, int anoLancamento, String categoria, Diretor diretor) throws FilmeJaCadastradoException;
    public void removerFilmeDaLista(String id) throws FilmeNaoExisteException;
    public Filme pesquisarFilmePeloID(String id);
    public List<Filme> listarFilmesPelaCategoria(CategoriaDeFilmes categoria);
}
