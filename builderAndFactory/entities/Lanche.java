package entities;

import java.util.ArrayList;
import java.util.List;

public class Lanche {

	private Double preco;
	private int quantidade;
	private String bebida;
	private List<String> acompanhamento = new ArrayList<>();
	
	public Lanche(Double preco, int quantidade, String acompanhamento) {
		this.preco = preco;
		this.quantidade = quantidade;
		this.addAcompanhamento(acompanhamento);
	}

	private void addAcompanhamento(String lanche) {
		this.acompanhamento.add(lanche);
	}

	public Double getPreco() {
		return preco;
	}

	public void setPreco(Double preco) {
		this.preco = preco;
	}

	public int getQuantidade() {
		return quantidade;
	}

	public void setQuantidade(int quantidade) {
		this.quantidade = quantidade;
	}

	public String getBebida() {
		return bebida;
	}

	public void setBebida(String bebida) {
		this.bebida = bebida;
	}

	public List<String> getAcompanhamento() {
		return acompanhamento;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("\n Preco:");
		builder.append(preco);
		builder.append("\n Quantidade:");
		builder.append(quantidade);
		builder.append("\n Acompanhamento:");
		builder.append(acompanhamento);
		builder.append("\n Bebida: ");
		builder.append(bebida);
		return builder.toString();
	}

	
	
}
