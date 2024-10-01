package br.ufpb.dcx.laisa.sistemaGerenciadorDeFilmes.controller;

import br.ufpb.dcx.laisa.sistemaGerenciadorDeFilmes.SistemaFilmesMap;
import br.ufpb.dcx.laisa.sistemaGerenciadorDeFilmes.exceptions.FilmeNaoExisteException;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class SisFilmesRemoveController implements ActionListener {
    private SistemaFilmesMap sistemaFilmes;
    private JFrame jframe;
    public SisFilmesRemoveController(SistemaFilmesMap sistemaFilmes, JFrame jframe) {
        this.sistemaFilmes = sistemaFilmes;
        this.jframe = jframe;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String id = JOptionPane.showInputDialog(jframe,
                "Qual o id do filme para remover?");
        try {
            sistemaFilmes.removerFilmeDaLista(id);
            JOptionPane.showMessageDialog(jframe,
                    "Filme removido com sucesso!");
        } catch (FilmeNaoExisteException ex) {
            JOptionPane.showMessageDialog(jframe,
                    "Filme não foi encontrado. "+
                            "Operação não realizada");
        }
    }
}
