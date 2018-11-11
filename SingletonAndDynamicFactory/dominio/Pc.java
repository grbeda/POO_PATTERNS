package dominio;

public class Pc {

	private int id;
	private String hd;
	private String memoria;
	private String processador;
	private int avaliacao;
	private Double preco;

	public Pc(String hd, String memoria, String processador, int avaliacao, Double preco) {
		this.hd = hd;
		this.memoria = memoria;
		this.processador = processador;
		this.avaliacao = avaliacao;
		this.preco = preco;
	}

	public Pc() {
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getHd() {
		return hd;
	}

	public void setHd(String hd) {
		this.hd = hd;
	}

	public String getMemoria() {
		return memoria;
	}

	public void setMemoria(String memoria) {
		this.memoria = memoria;
	}

	public String getProcessador() {
		return processador;
	}

	public void setProcessador(String processador) {
		this.processador = processador;
	}

	public int getAvaliacao() {
		return avaliacao;
	}

	public void setAvaliacao(int avaliacao) {
		this.avaliacao = avaliacao;
	}

	public Double getPreco() {
		return preco;
	}

	public void setPreco(Double preco) {
		this.preco = preco;
	}

	@Override
	public String toString() {
		return "Pc id=" + id + "\nhd=" + hd + "\nmemoria=" + memoria + "\nprocessador=" + processador + "\navaliacao="
				+ avaliacao + "\npreco=" + preco + "]";
	}

}
