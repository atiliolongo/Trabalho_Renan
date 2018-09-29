3package aulajava;

import java.util.ArrayList;
import java.util.List;

public class Agenda {
    // Lista de contatos da agenda

    List<Contato> contatos = new ArrayList<Contato>();

    public void add(String nome, Double altura, Integer idade) {
        Contato contato = new Contato();
        contato.setContato(nome);
        contato.setAltura(altura);
        contato.setIdade(idade);
        contatos.add(contato);
    }

    public void remove(String nomeDoContato) {
        contatos.remove(get(nomeDoContato));
    }

    public void posicao(String nome) {
        int posicaoDoContato = contatos.indexOf(get(nome));
        System.out.println("O contato " + nome + " está na posição: " + posicaoDoContato + " \n");
    }

    public Contato get(String nome) {
        Contato contatoFiltro = new Contato();
        contatoFiltro.setContato(nome);
        int posicaoDoContato = contatos.indexOf(contatoFiltro);
        return contatos.get(posicaoDoContato);

    }

    public void imprimir() {
        contatos.stream().forEach((Contato c) -> {
            if (c == null) {
             System.out.println("Nenhum contato Cadastrado");
            } else {
             System.out.println(c);
            }
        });
    }

}