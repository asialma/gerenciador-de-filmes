package br.ufpb.dcx.laisa.sistemaGerenciadorDeFilmes.controller;

import br.ufpb.dcx.laisa.sistemaGerenciadorDeFilmes.SistemaFilmesMap;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class SisFilmesAddController implements ActionListener {
    private SistemaFilmesMap sistemaFilmes;
    private JFrame jframe;

    public SisFilmesAddController(SistemaFilmesMap sistemaFilmes, JFrame jframe) {
        this.sistemaFilmes = sistemaFilmes;
        this.jframe = jframe;
    }

    @Override
    public void actionPerformed(ActionEvent e) {

    }
}
