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
    private JFrame jframe;

    public SisFilmesSearchController(SistemaFilmesMap sistemaFilmes, JFrame jframe) {
        this.sistemaFilmes = sistemaFilmes;
        this.jframe = jframe;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String id = JOptionPane.showInputDialog(jframe,
                "Qual o id do filme para pesquisar?");

        Filme filmesPesquisado = sistemaFilmes.pesquisarFilmePeloID(id);
        if (filmesPesquisado.getId().equals(id)){
            JOptionPane.showMessageDialog(jframe,
                    "Filme encontrado:" + filmesPesquisado);
        } else {
            JOptionPane.showMessageDialog(jframe,
                    "Não foi encontrado nenhum aniversariante nesta data");
        }
    }
}
