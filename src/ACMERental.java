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
        alugavel = new Alugavel(101, "CasaBelaVista", 500.00);
        acervo.adicionaAlugavel(alugavel);
        alugavel = new Alugavel(102, "CasaMontSerrat", 450.00);
        acervo.adicionaAlugavel(alugavel);
        alugavel = new Alugavel(100, "ApartamentoCidadeBaixa", 250.00);
        acervo.adicionaAlugavel(alugavel);
        System.out.println("Imóveis pré-cadastrados.");

    }
}
