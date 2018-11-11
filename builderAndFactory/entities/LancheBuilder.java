package entities;

public class LancheBuilder {

	private Lanche lanche;
	
	public LancheBuilder(Lanche lanche) {
		this.lanche = lanche;
	}
	
	public LancheBuilder preco(Double preco) {
		lanche.setPreco(preco);
		return this;
	}
	
	public LancheBuilder quantidade(int quantidade) {
		lanche.setQuantidade(quantidade);
		return this;
	}
	
	public LancheBuilder bebida(String bebida) {
		lanche.setBebida(bebida);
		return this;
	}
	
	public LancheBuilder acompanhamento (String acompanhamento) {
		lanche.getAcompanhamento().add(acompanhamento);
		return this;
	}
}
