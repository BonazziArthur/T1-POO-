public class Alugavel {
    private int codigo;
    private String nome;
    private String imovelNaBelaVista;
    private String imovelNoCentro;
    private double precoDiario;

    public Alugavel(int codigo, String nome, double precoDiario) {
        this.codigo = codigo;
        this.nome = nome;
        this.precoDiario = precoDiario;
    }
    //posso fazer o segundo construtor assim?
    public Alugavel(int codigo, String nome, double precoDiario, String imovelNaBelaVista, String imovelNoCentro) {
        this.imovelNaBelaVista = imovelNaBelaVista;
        this.imovelNoCentro = imovelNoCentro;
        this.codigo = codigo;
        this.nome = nome;
        this.precoDiario = precoDiario;
    }

    public boolean adicionaAluguel(Aluguel aluguel) {
         //!
    }

    public String getImovelNaBelaVista() {
        return imovelNaBelaVista;
    }

    public void setImovelNaBelaVista(String imovelNaBelaVista) {
        this.imovelNaBelaVista = imovelNaBelaVista;
    }

    public String getImovelNoCentro() {
        return imovelNoCentro;
    }

    public void setImovelNoCentro(String imovelNoCentro) {
        this.imovelNoCentro = imovelNoCentro;
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
