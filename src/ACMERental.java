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
        String nome = in.nextLine(); //?
        Aluguel aluguel = Locacoes.pesquisaAluguel(cpf);
        Alugavel itemAlugavel = Acervo.pesquisaAlugavel(nome); //?
        if(aluguel.equals(null)) {
            System.out.println("Nenhum aluguel encontrado com este CPF.");
        } else {
            System.out.println("Data : " + aluguel.getData());
            System.out.println("Período: " + aluguel.getPeriodo());
            System.out.println("CPF: " + aluguel.getCpf());
            System.out.println("Nome: " + aluguel.getNome());
            System.out.println("Valor Final: " + aluguel.getValorFinal());

            System.out.println("[Dados do Item Alugado]"); //? (daqui pra baixo)

            System.out.println("Nome: " + itemAlugavel.getNome());
            System.out.println("Código: " + itemAlugavel.getCodigo());
            System.out.println("Preço Diário: " + itemAlugavel.getPrecoDiario());
        }
    }

    private void itemAlugavelNome() {
        System.out.println("Insira o nome do item alugável: ");
        String nome = in.nextLine();
        Alugavel itemAlugavel = Acervo.pesquisaAlugavel(nome);
        if(itemAlugavel.equals(null)) {
            System.out.println("Nenhum item alugavel encontrado com este nome.");
        } else {
            System.out.println("Nome: " + itemAlugavel.getNome());
            System.out.println("Código: " + itemAlugavel.getCodigo());
            System.out.println("Preço Diário: " + itemAlugavel.getPrecoDiario());
        }
    }

    private void itemAlugavelCodigo() {
        System.out.println("Insira o código de um item alugável: ");
        int codigo = in.nextInt();
        Alugavel itemAlugavel = Acervo.pesquisaAlugavel(codigo);
        if(itemAlugavel.equals(null)) {
            System.out.println("Nenhum item alugável encontrado com este código");
        } else {
            System.out.println("Código: " + itemAlugavel.getCodigo());
            System.out.println("Nome: " + itemAlugavel.getNome());
            System.out.println("Preço Diário: " + itemAlugavel.getPrecoDiario());
        }


    }

    private void dadosCadastrados() {

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

    public void preCadastra() { //colocar alguns alugueis pre cadastrados
        Alugavel alugavel;
        Aluguel aluguel;
        alugavel = new Alugavel(101, "CasaBelaVista", 500.00);
        acervo.adicionaAlugavel(alugavel);
        alugavel = new Alugavel(102, "CasaMontSerrat", 450.00);
        acervo.adicionaAlugavel(alugavel);
        alugavel = new Alugavel(100, "ApartamentoCidadeBaixa", 250.00);
        acervo.adicionaAlugavel(alugavel);
        aluguel = new Aluguel("19/08/2022", 2, "02915275076","Arthur", 250);
        locacoes.adicionaAluguel(aluguel);
        aluguel = new Aluguel("28/09/2022", 5, "46552286015", "Cleber", 500);
        locacoes.adicionaAluguel(aluguel);

        System.out.println("Imóveis e Aluguéis pré-cadastrados.");
    }



}
