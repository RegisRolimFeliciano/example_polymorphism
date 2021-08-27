package entities;

import java.util.Date;

public class ProdutoUsado extends Product {
	
	private Date dataFab;
	
	public ProdutoUsado() {
		super();
	}

	public ProdutoUsado(String nome, Double preco, Date dataFab) {
		super(nome, preco);
		this.dataFab = dataFab;
	}

	public Date getDataFab() {
		return dataFab;
	}

	public void setDataFab(Date dataFab) {
		this.dataFab = dataFab;
	}
	
	@Override
	public String etiquetaPreco() {
		return super.etiquetaPreco() + (" Data de Fabricação: " + dataFab);
	}
	

	
	

}
