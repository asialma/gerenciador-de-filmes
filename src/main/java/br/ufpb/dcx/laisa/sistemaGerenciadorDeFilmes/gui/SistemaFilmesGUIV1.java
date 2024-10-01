package br.ufpb.dcx.laisa.sistemaGerenciadorDeFilmes.gui;

import br.ufpb.dcx.laisa.sistemaGerenciadorDeFilmes.*;
import br.ufpb.dcx.laisa.sistemaGerenciadorDeFilmes.controller.SisFilmesSearchController;
import br.ufpb.dcx.laisa.sistemaGerenciadorDeFilmes.controller.SisFilmesRemoveController;
import br.ufpb.dcx.laisa.sistemaGerenciadorDeFilmes.exceptions.FilmeJaCadastradoException;

import javax.swing.*;
import java.awt.*;
import java.util.Locale;

public class SistemaFilmesGUIV1 extends JFrame {
    JLabel linha1, linha2;
    SistemaFilmesMap sistemaFilmes = new SistemaFilmesMap();
    ImageIcon capa = new ImageIcon("./imgs/capawatchlist.png");
    JMenuBar barraDeMenu = new JMenuBar();

    public SistemaFilmesGUIV1(){
        setTitle("Meu gerenciador de filmes");
        setSize(800, 600);
        setLocation(150, 150);
        setResizable(false);
        setBackground(Color.white);
        linha1 = new JLabel("MyFilmes", JLabel.CENTER);
        linha1.setForeground(Color.red);
        linha1.setFont(new Font("Serif", Font.BOLD, 24));
        linha2 = new JLabel(capa, JLabel.CENTER);
        setLayout(new GridLayout(3, 1));
        add(linha1);
        add(linha2);
        add(new JLabel());

        JMenu menuCadastrar = new JMenu("Cadastrar novo filme");
        JMenuItem menuCadastrarFilme = new JMenuItem("Cadastrar filme");
        menuCadastrar.add(menuCadastrarFilme);

        JMenu menuPesquisarID = new JMenu("Pesquisar filme");
        JMenuItem menuPesquisarFilmeID = new JMenuItem("Pesquisar filme pelo ID");
        menuPesquisarID.add(menuPesquisarFilmeID);

        JMenu menuRemover = new JMenu("Remover filme");
        JMenuItem menuRemoverFilme = new JMenuItem("Remover filme");
        menuRemover.add(menuRemoverFilme);

        menuPesquisarFilmeID.addActionListener(
                new SisFilmesSearchController(sistemaFilmes,this));
        menuRemoverFilme.addActionListener(
                new SisFilmesRemoveController(sistemaFilmes, this));
        menuCadastrarFilme.addActionListener(
                (ae) -> {
                    String id = JOptionPane.showInputDialog(this,
                            "Qual o ID do filme?");

                    String titulo = JOptionPane.showInputDialog(this,
                            "Qual o título do filme?");

                    int anoLancamento = Integer.parseInt(JOptionPane.showInputDialog(this,
                            "Qual o ano de lançamento do filme?"));

                    String categoria = JOptionPane.showInputDialog(this,
                            "Qual a categoria do filme?");

                    String nomeDiretor = JOptionPane.showInputDialog(this, "Qual o nome do diretor?");
                    int anoNascimentoDiretor = Integer.parseInt(JOptionPane.showInputDialog(this, "Qual o ano de nascimento do diretor?"));
                    Diretor diretor = new Diretor(nomeDiretor, anoNascimentoDiretor);

                    try {
                        sistemaFilmes.cadastrarFilme(id,  titulo,  anoLancamento, categoria, diretor);
                    } catch (FilmeJaCadastradoException e) {
                        throw new RuntimeException(e);
                    }
                });

        barraDeMenu.add(menuCadastrar);
        barraDeMenu.add(menuPesquisarID);
        barraDeMenu.add(menuRemover);
        setJMenuBar(barraDeMenu);
    }

    public static void main(String[] args) {
        JFrame janela = new SistemaFilmesGUIV1();
        janela.setVisible(true);
        janela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
