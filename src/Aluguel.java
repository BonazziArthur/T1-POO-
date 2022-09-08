public class Aluguel {
    private String data;
    private int periodo;
    private String cpf;
    private String nome;
    private double valorFinal;
    private Alugavel itemAlugado;

    public Aluguel(String data, int periodo, String cpf, String nome, double valorFinal, Alugavel itemAlugado) {
        this.data = data;
        this.periodo = periodo;
        this.cpf = cpf;
        this.nome = nome;
        this.valorFinal = valorFinal;
        this.itemAlugado = itemAlugado;
        itemAlugado.adicionaAluguel(this);
    }


    public double calculaValorFinal() {
        double desconto, valorDescontado;
        valorFinal = periodo * itemAlugado.getPrecoDiario();
        if(periodo > 7) {
            desconto = valorFinal * 10/100;
            valorDescontado = valorFinal - desconto;
            return valorDescontado;
        }
        return valorFinal;
    }


    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public int getPeriodo() {
        return periodo;
    }

    public void setPeriodo(int periodo) {
        this.periodo = periodo;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getValorFinal() {
        return valorFinal;
    }

    public void setValorFinal(double valorFinal) {
        this.valorFinal = valorFinal;
    }

    public Alugavel getItemAlugado() {
        return itemAlugado;
    }

    public void setItemAlugado(Alugavel itemAlugado) {
        this.itemAlugado = itemAlugado;
    }
}
