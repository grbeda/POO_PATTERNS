package entities;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

import entities.enums.NivelDoTrabalhador;

public class Trabalhador {

	private String nome;
	private NivelDoTrabalhador nivel;
	private Double salarioBase;

	private Departamento departamento;

	private List<ContratoPorHora> contratos = new ArrayList<>();

	public Trabalhador() {
	}

	public Trabalhador(String nome, NivelDoTrabalhador nivel, Double salarioBase, Departamento departamento) {
		this.nome = nome;
		this.nivel = nivel;
		this.salarioBase = salarioBase;
		this.departamento = departamento;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public NivelDoTrabalhador getNivel() {
		return nivel;
	}

	public void setNivel(NivelDoTrabalhador nivel) {
		this.nivel = nivel;
	}

	public Double getSalarioBase() {
		return salarioBase;
	}

	public void setSalarioBase(Double salarioBase) {
		this.salarioBase = salarioBase;
	}

	public Departamento getDepartamento() {
		return departamento;
	}

	public void setDepartamento(Departamento departamento) {
		this.departamento = departamento;
	}

	public List<ContratoPorHora> getContratos() {
		return contratos;
	}

	public void addContrato(ContratoPorHora contrato) {
		contratos.add(contrato);
	}

	public void removeContrato(ContratoPorHora contrato) {
		contratos.remove(contrato);
	}

	public double renda(int ano, int mes) {

		double soma = salarioBase;
		Calendar cal = Calendar.getInstance();

		for (ContratoPorHora c : contratos) {
			cal.setTime(c.getData());
			int c_ano = cal.get(Calendar.YEAR);
			int c_mes = 1 + cal.get(Calendar.MONTH);

			if (ano == c_ano && mes == c_mes) {
				soma += c.ValorTotal();
			}

		}
		return soma;
	}

}
