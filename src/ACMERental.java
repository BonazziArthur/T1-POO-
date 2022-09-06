import org.w3c.dom.ls.LSOutput;

import javax.swing.plaf.basic.BasicLabelUI;
import java.util.ArrayList;
import java.util.Scanner;

public class ACMERental {
    private Acervo acervo;
    private Locacoes locacoes;
    private Scanner in;
    public ACMERental() {
        acervo = new Acervo();
        locacoes = new Locacoes();
        in = new Scanner(System.in);
    }
    public void executa() {
        int escolha;
        do {
            menu();
            escolha = in.nextInt();
            in.nextLine();
            switch(escolha) {
                case 1:
                    dadosCadastrados();
                    break;
                case 2:
                    itemAlugavelCodigo();
                    break;
                case 3:
                    itemAlugavelNome();
                    break;
                case 4:
                    alugueisCliente();
                    break;
                case 5:
                    break;
            }
        }while(escolha != 5);
    }

    private void alugueisCliente() {
        System.out.println("Insira o CPF do cliente: ");
        String cpf = in.nextLine();
        ArrayList<Aluguel> aluguels = locacoes.pesquisaAluguel(cpf);
        if(aluguels.equals(null)) {
            System.out.println("Nenhum aluguel encontrado com este CPF.");
        } else {
            for (Aluguel aluguel :
                    aluguels) {
                System.out.println("Data : " + aluguel.getData());
                System.out.println("Período: " + aluguel.getPeriodo());
                System.out.println("CPF: " + aluguel.getCpf());
                System.out.println("Nome: " + aluguel.getNome());
                System.out.println("Valor Final: " + aluguel.getValorFinal());
                System.out.println("Nome do imóvel: " + aluguel.getItemAlugado().getNome());
                System.out.println("Rua: " + aluguel.getItemAlugado().getRua());
                System.out.println("Bairro: " + aluguel.getItemAlugado().getBairro());
                System.out.println("Preço: " + aluguel.getItemAlugado().getPrecoDiario());
            }
        }
    }

    private void itemAlugavelNome() {
        System.out.println("Insira o nome do item alugável: ");
        String nome = in.nextLine();
        ArrayList<Alugavel> listaAlugaveis = acervo.pesquisaAlugavel(nome);
        if(listaAlugaveis.isEmpty()) {
            System.out.println("Nenhum item alugavel encontrado com este nome.");
        } else {
            for (Alugavel item :
                    listaAlugaveis) {
                System.out.println("Nome: " + item.getNome());
                System.out.println("Código: " + item.getCodigo());
                System.out.println("Preço Diário: " + item.getPrecoDiario());
                System.out.println("Rua: " +item.getRua());
                System.out.println("Bairro: " +item.getBairro());
            }
        }
    }

    private void itemAlugavelCodigo() {
        System.out.println("Insira o código de um item alugável: ");
        int codigo = in.nextInt();
        Alugavel itemAlugavel = acervo.pesquisaAlugavel(codigo);
        if(itemAlugavel.equals(null)) {
            System.out.println("Nenhum item alugável encontrado com este código");
        } else {
            System.out.println("Código: " + itemAlugavel.getCodigo());
            System.out.println("Nome: " + itemAlugavel.getNome());
            System.out.println("Preço Diário: " + itemAlugavel.getPrecoDiario());
            System.out.println("Rua: " +itemAlugavel.getRua());
            System.out.println("Bairro: " +itemAlugavel.getBairro());
        }
    }

    private void dadosCadastrados() {
        ArrayList<Alugavel> listaItens = acervo.getListaItens();
        if(listaItens.isEmpty()) {
            System.out.println("Nenhum item alugavel cadastrado no sistema");
        } else {
            for (Alugavel item :
                    listaItens) {
                System.out.println("Nome: " + item.getNome());
                System.out.println("Código: " + item.getCodigo());
                System.out.println("Preço Diário: " + item.getPrecoDiario());
                System.out.println("Rua: " + item.getRua());
                System.out.println("Bairro: " +item.getBairro());;
            }
        }


    }

    private void menu() {
        System.out.println("=============================");
        System.out.println("Opcoes:");
        System.out.println("[1] Mostrar todos os dados cadastrados");
        System.out.println("[2] Pesquisar item alugável pelo código");
        System.out.println("[3] Pesquisar itens alugáveis pelo nome");
        System.out.println("[4] Pesquisar aluguéis de um cliente");
        System.out.println("[5] Sair do sistema");
        System.out.println("Opcao desejada: ");
    }

    public void preCadastra() { //acabar
        Alugavel alugavel;
        Aluguel aluguel;
        alugavel = new Alugavel(101, "CasaBelaVista", 500.00, "Freire Alemao", "Nonoai");
        acervo.adicionaAlugavel(alugavel);
        alugavel = new Alugavel(102, "CasaMontSerrat", 450.00, "Alcebiades", "Bela Vista");
        acervo.adicionaAlugavel(alugavel);
        alugavel = new Alugavel(100, "ApartamentoCidadeBaixa", 250.00, "Pedro Ivo", "Floresta");
        acervo.adicionaAlugavel(alugavel);
        aluguel = new Aluguel("19/08/2022", 8, "02915275076","Arthur", 250, 100);
        locacoes.adicionaAluguel(aluguel);
        aluguel = new Aluguel("28/09/2022", 5, "46552286015", "Cleber", 500);
        locacoes.adicionaAluguel(aluguel);
        aluguel = new Aluguel("19/08/2022", 2, "02915275076","Arthur", 250);
        locacoes.adicionaAluguel(aluguel);
        aluguel = new Aluguel("28/09/2022", 5, "46552286015", "Cleber", 500);
        locacoes.adicionaAluguel(aluguel);
        aluguel = new Aluguel("28/09/2022", 5, "46552286015", "Cleber", 500);
        locacoes.adicionaAluguel(aluguel);

        System.out.println("Imóveis e Aluguéis pré-cadastrados.");
    }




}
