package br.ufpb.dcx.laisa.sistemaGerenciadorDeFilmes.Exceptions;

public class FilmeNaoExisteException extends Exception{
    public FilmeNaoExisteException(String msg) {
        super(msg);
    }
}
