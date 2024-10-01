package br.ufpb.dcx.laisa.sistemaGerenciadorDeFilmes.exceptions;

public class FilmeNaoExisteException extends Exception{
    public FilmeNaoExisteException(String msg) {
        super(msg);
    }
}
