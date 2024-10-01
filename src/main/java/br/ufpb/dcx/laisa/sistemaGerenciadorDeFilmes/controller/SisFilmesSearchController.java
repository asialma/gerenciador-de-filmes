package br.ufpb.dcx.laisa.sistemaGerenciadorDeFilmes.controller;

import br.ufpb.dcx.laisa.sistemaGerenciadorDeFilmes.Filme;
import br.ufpb.dcx.laisa.sistemaGerenciadorDeFilmes.SistemaFilmes;
import br.ufpb.dcx.laisa.sistemaGerenciadorDeFilmes.SistemaFilmesMap;
import br.ufpb.dcx.laisa.sistemaGerenciadorDeFilmes.gui.SistemaFilmesGUIV1;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Collection;

public class SisFilmesSearchController implements ActionListener {
    private SistemaFilmesMap sistemaFilmes;
    private JFrame janela;

    public SisFilmesSearchController(SistemaFilmesMap sistemaFilmes, JFrame janela) {
        this.sistemaFilmes = sistemaFilmes;
        this.janela = janela;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String id = JOptionPane.showInputDialog(janela,
                "Qual o id do filme para pesquisar?");

        Filme filmePesquisado = sistemaFilmes.pesquisarFilmePeloID(id);
        if (filmePesquisado != null){
            JOptionPane.showMessageDialog(janela,
                    "Filme encontrado:" + filmePesquisado);
        } else {
            JOptionPane.showMessageDialog(janela,
                    "Filme não encontrado!");
        }
    }
}
