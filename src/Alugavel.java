import java.util.ArrayList;

public class Alugavel {
    private int codigo;
    private String nome;
    private String rua;
    private String bairro;
    private double precoDiario;
    private ArrayList<Aluguel> listaDeAlugueis = new ArrayList<>();

    public Alugavel(int codigo, String nome, double precoDiario) {
        this.codigo = codigo;
        this.nome = nome;
        this.precoDiario = precoDiario;
    }
    public Alugavel(int codigo, String nome, double precoDiario, String rua, String bairro) {
        this.rua = rua;
        this.bairro = bairro;
        this.codigo = codigo;
        this.nome = nome;
        this.precoDiario = precoDiario;
    }

    public boolean adicionaAluguel(Aluguel aluguel) {
        listaDeAlugueis.add(aluguel);
        return true;
    }

    public ArrayList<Aluguel> getListaDeAlugueis() {
        return listaDeAlugueis;
    }

    public String getRua() {
        return rua;
    }

    public void setRua(String rua) {
        this.rua = rua;
    }

    public String getBairro() {
        return bairro;
    }

    public void setBairro(String bairro) {
        this.bairro = bairro;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getPrecoDiario() {
        return precoDiario;
    }

    public void setPrecoDiario(double precoDiario) {
        this.precoDiario = precoDiario;
    }
}
