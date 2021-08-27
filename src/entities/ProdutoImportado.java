package entities;

public class ProdutoImportado extends Product {
	
	public Double taxaAlfandega;
	
	public ProdutoImportado() {
		super();
	}

	public ProdutoImportado(String nome, Double preco, Double taxaAlfandega) {
		super(nome, preco);
		this.taxaAlfandega = taxaAlfandega;
	}
	
	public Double getTaxaAlfandega() {
		return taxaAlfandega;
	}

	public void setTaxaAlfandega(Double taxaAlfandega) {
		this.taxaAlfandega = taxaAlfandega;
	}
	
	public Double precoTotal() {
		return preco += taxaAlfandega;
	}

	@Override
	public String etiquetaPreco() {
		return nome +  " $ " + String.format("%.2f",precoTotal()) + "(Taxa de Alfandega: $" + String.format("%.2f",taxaAlfandega) + ")";		
	}
	
}
