import Exceptions.FilmeJaCadastradoException;
import Exceptions.FilmeNaoExisteException;

import java.util.List;

public interface SistemaFilmes {
    public void cadastrarFilme(String id, String titulo, int anoLancamento, CategoriaDeFilmes categoria, Diretor diretor) throws FilmeJaCadastradoException;
    public void removerFilmeDaLista(String id) throws FilmeNaoExisteException;
    public Filme pesquisarFilmePeloID(String id);
    public List<Filme> listarFilmesPelaCategoria(CategoriaDeFilmes categoria);
}
