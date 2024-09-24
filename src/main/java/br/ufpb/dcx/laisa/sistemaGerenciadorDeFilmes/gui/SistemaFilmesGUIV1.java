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
        setTitle("MyFilmes");
        setSize(800, 600);
        setLocation(150, 150);
        setResizable(false);
        setBackground(Color.white);
        linha1 = new JLabel("MyFilmes - Meu gerenciador de filmes", JLabel.CENTER);
        linha1.setForeground(Color.red);
        linha1.setFont(new Font("Serif", Font.BOLD, 24));
        add(linha1);
    }

    public static void main(String[] args) {
        JFrame janela = new SistemaFilmesGUIV1();
        janela.setVisible(true);
        janela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
