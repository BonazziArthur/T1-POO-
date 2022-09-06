import java.util.ArrayList;

public class Locacoes {
    private ArrayList<Aluguel> listaDeAlugueis;

    public Locacoes() {
        listaDeAlugueis = new ArrayList<Aluguel>();
    }

    public void adicionaAluguel(Aluguel aluguel) {
        listaDeAlugueis.add(aluguel);
    }
    public ArrayList<Aluguel> pesquisaAluguel(String cpf) {
        ArrayList<Aluguel> listaDesejadaAluguel = new ArrayList<>();
        for(int i=0; i<listaDeAlugueis.size(); i++) {
            Aluguel aluguel1 = listaDeAlugueis.get(i);
            if(aluguel1.getCpf().equals(cpf)) {
                listaDesejadaAluguel.add(aluguel1);
            }
        }
        if(listaDesejadaAluguel.isEmpty()) {
            return null;
        }
        return listaDesejadaAluguel;

    }
}
