public class Aluguel {
    private String data;
    private int periodo;
    private String cpf;
    private String nome;
    private double valorFinal;

    public double calculaValorFinal() { //!
        double desconto;
        periodo * precoDiario = valorFinal;
        if(periodo > 7) {
            desconto = valorFinal * 10/100;
            valorFinal = desconto;
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
}
