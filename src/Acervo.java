import java.util.ArrayList;

public class Acervo {
    private ArrayList <Alugavel> listaItens;

    public Acervo() {
        listaItens = new ArrayList<Alugavel>();
    }

    public boolean adicionaAlugavel(Alugavel itemAlugavel) {
        for (Alugavel item:
             listaItens) {
            if(itemAlugavel.getCodigo()==item.getCodigo()) {
                return false;
            }
        }
        listaItens.add(itemAlugavel);
        return true;
    }

    public Alugavel pesquisaAlugavel(int codigo) {
        for(int i = 0; i < listaItens.size(); i++) {
            Alugavel itemAlugavel = listaItens.get(i);
            if(itemAlugavel.getCodigo()==(codigo))
                return itemAlugavel;
        }
        return null;
    }

    public ArrayList<Alugavel> pesquisaAlugavel(String nome) {
        ArrayList<Alugavel> listaDesejada = new ArrayList<>();
        for(int i = 0; i < listaItens.size(); i++) {
            Alugavel itemAlugavel = listaItens.get(i);
            if(itemAlugavel.getNome().equals(nome)) {
                listaDesejada.add(itemAlugavel);
            }
            return listaDesejada;
        }
        return null;
    }
    public ArrayList<Alugavel> getListaItens() {
        return listaItens;
    }
}
