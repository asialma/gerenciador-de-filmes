package br.ufpb.dcx.laisa.sistemaGerenciadorDeFilmes;

import br.ufpb.dcx.laisa.sistemaGerenciadorDeFilmes.exceptions.FilmeJaCadastradoException;
import br.ufpb.dcx.laisa.sistemaGerenciadorDeFilmes.exceptions.FilmeNaoExisteException;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class SistemaFilmesMap implements SistemaFilmes {
    private Map<String, Filme> filmes;

    public SistemaFilmesMap() {
        this.filmes = new HashMap<>();
    }

    public void cadastrarFilme(String id, String titulo, int anoLancamento, String categoria, Diretor diretor) throws FilmeJaCadastradoException {
        if (filmes.containsKey(id)) {
            throw new FilmeJaCadastradoException("Filme já cadastrado com o ID: " + id);
        }
        Filme novoFilme = new Filme(id, titulo, anoLancamento, categoria, diretor);
        filmes.put(id, novoFilme);
    }

    @Override
    public void removerFilmeDaLista(String id) throws FilmeNaoExisteException {
        if (!filmes.containsKey(id)) {
            throw new FilmeNaoExisteException("Filme com o ID " + id + " não existe.");
        }

        filmes.remove(id);
    }

    @Override
    public Filme pesquisarFilmePeloID(String id) {
        for (Filme f: filmes.values()){
            if (f.getId().equals(id)){
                return f;
            }
        }
        return null;
    }

    @Override
    public List<Filme> listarFilmesPelaCategoria(CategoriaDeFilmes categoria) {
        List<Filme> listaDeFilmesDaCategoriaPesquisada = new ArrayList<>();
        for (Filme f: filmes.values()){
            if (f.getCategoria().equals(categoria)){
                listaDeFilmesDaCategoriaPesquisada.add(f);
            }
        }
        return listaDeFilmesDaCategoriaPesquisada;
    }
}
