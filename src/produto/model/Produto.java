package produto.model;

public class Produto {
	private int numeroProduto;
	private String tipoProduto;
    private String nomeProduto;
    private double valor;
    private int quantidade;

    public Produto(int numeroProduto, String tipoProduto, String nomeProduto, double valor, int quantidade) {
		this.numeroProduto = numeroProduto;
		this.tipoProduto = tipoProduto;
		this.nomeProduto = nomeProduto;
		this.valor = valor;
		this.quantidade = quantidade;
	}

	public int getNumeroProduto() {
		return numeroProduto;
	}

	public void setNumeroProduto(int numeroProduto) {
		this.numeroProduto = numeroProduto;
	}

	public String getTipoProduto() {
		return tipoProduto;
	}

	public void setTipoProduto(String tipoProduto) {
		this.tipoProduto = tipoProduto;
	}

	public String getNomeProduto() {
		return nomeProduto;
	}

	public void setNomeProduto(String nomeProduto) {
		this.nomeProduto = nomeProduto;
	}

	public double getValor() {
		return valor;
	}

	public void setValor(double valor) {
		this.valor = valor;
	}

	public int getQuantidade() {
		return quantidade;
	}

	public void setQuantidade(int quantidade) {
		this.quantidade = quantidade;
	}
    
    public void visualizar() {
		System.out.println("*************************************************\n" +
                "\t\tDados do Produto\n" +
                "*************************************************\n" +
                "Numero da Produto: " + numeroProduto + "\n" +
                "Tipo de Produto: " + tipoProduto + "\n" +
                "Nome do Produto: " + nomeProduto + "\n" +
                "Valor: " + valor + "\n");
    }
}
