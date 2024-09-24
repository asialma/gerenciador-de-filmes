package br.ufpb.dcx.laisa.sistemaGerenciadorDeFilmes.gui;

import br.ufpb.dcx.laisa.sistemaGerenciadorDeFilmes.SistemaFilmes;
import br.ufpb.dcx.laisa.sistemaGerenciadorDeFilmes.SistemaFilmesMap;

import javax.swing.*;
import java.awt.*;

public class SistemaFilmesGUIV1 extends JFrame {
    JLabel linha1, linha2;
    SistemaFilmes sistemaFilmes = new SistemaFilmesMap();
    JMenuBar barraDeMenu = new JMenuBar();

    public SistemaFilmesGUIV1(){
        setTitle("LAÍSAFlix");
        setSize(800, 600); //tamanho da janela
        setLocation(150, 150);
        setResizable(false);
        setBackground(Color.white);
        linha1 = new JLabel("Meu gerenciador de filmes", JLabel.CENTER);

    }

    public static void main(String[] args) {
        JFrame janela = new SistemaFilmesGUIV1();
        janela.setVisible(true);
        janela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
