package aulajava;

import java.util.Scanner;

public class Executa {

    static Scanner entrada = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Escolha uma opcao: \n"
                + "1: Cadastrar um contato\n"
                + "2: Mostrar contatos\n"
                + "3: Ver qual posicao\n"
                + "4: Excluir contato\n"
                + "5: sair\n");
        Integer menu = entrada.nextInt();
        operacao(menu);

    }

    private static void operacao(Integer menu) {
        Agenda agenda = new Agenda();
        OUTER:
        while (true) {
            Scanner teclado = new Scanner(System.in);
            if (null != menu) {
                switch (menu) {
                    case 1:

                        System.out.println("Informe o nome do contato: ");
                        String nome = teclado.next();
                        System.out.println("Informe a  Altura do contato: ");
                        String altura = teclado.next();
                        System.out.println("Informe idade do contato: ");
                        String idade = teclado.next();

                        agenda.add(nome, altura, idade);
                        System.out.println("Cadastrado com Sucesso!!!");
                        System.out.println("Escolha uma opcao: \n"
                                + "1: Cadastrar outro contato\n"
                                + "2: Mostrar Todos contatos\n"
                                + "3: Ver qual posicao\n"
                                + "4: Excluir contato\n"
                                + "5: sair\n");

                        break;

                    case 2:
                        System.out.println("Imprimindo Todos Contatos");
                        agenda.imprimir();
                        System.out.println("Todos imprimido Sucesso!!!");
                        System.out.println("Escolha uma opcao: \n"
                                + "1: Cadastrar  contato\n"
                                + "3: Ver qual posicao\n"
                                + "4: Excluir contato\n"
                                + "5: sair\n");
                        break;

                    case 3:
                        System.out.println("Informe nome do11 Contato");
                        String nomePosicao = teclado.next();
                        agenda.posicao(nomePosicao);
                        
                        System.out.println("Escolha uma opcao: \n"
                                + "1: Cadastrar  contato\n"
                                + "2: Mostrar Todos contatos\n"
                                + "3: Ver qual posicao\n"
                                + "4: Excluir contato\n"
                                + "5: sair\n");
                        break;

                    case 4:
                        System.out.println("Informe o nome do contato para ser excluido: ");
                        String nomeremove = teclado.next();
                        agenda.remove(nomeremove);
                        System.out.println("Contato " + nomeremove + " Removido com Sucesso!!!");
                        System.out.println("Escolha uma opcao: \n"
                                + "1: Cadastrar  contato\n"
                                + "2: Mostrar Todos contatos\n"
                                + "3: Ver qual posicao\n"
                                + "5: sair\n");
                        break;

                    case 5:
                        System.out.println("Voce saiu do Sistema");
                        break OUTER;
                    default:
                        break;
                }
            }
            menu = entrada.nextInt();
        }
    }

}
