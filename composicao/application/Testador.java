package application;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import entities.ContratoPorHora;
import entities.Departamento;
import entities.Trabalhador;
import entities.enums.NivelDoTrabalhador;

public class Testador {

	public static void main(String[] args) throws ParseException {

		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		
		//Trabalhador
		String departamento = "Design";
		String nome = "Ricardo";
		String nivel = "MID_LEVEL";
		double salarioBase = 1200.0;
		
		Trabalhador trabalhador = new Trabalhador(nome, NivelDoTrabalhador.valueOf(nivel), salarioBase, new Departamento(departamento));
		
		//Contrato 1
		Date data = sdf.parse("20/08/2018");
		double valorPorHora = 50.00;
		int horas = 20;
		ContratoPorHora contrato = new ContratoPorHora(data, valorPorHora, horas);
		trabalhador.addContrato(contrato);
		
		//Contrato 2
		data = sdf.parse("13/06/2018");
		valorPorHora = 30.00;
		horas = 18;
		ContratoPorHora contrato_2 = new ContratoPorHora(data, valorPorHora, horas);
		trabalhador.addContrato(contrato_2);
		
		//Contrato 3
		data = sdf.parse("25/08/2018");
		valorPorHora = 80.00;
		horas = 10;
		ContratoPorHora contrato_3 = new ContratoPorHora(data, valorPorHora, horas);
		trabalhador.addContrato(contrato_3);
		
		//Calcular renda
		 String mes_ano = "08/2018"; // <-- Mes e ano pra calcular a renda do trabalhador;
		int mes = Integer.parseInt(mes_ano.substring(0, 2));
		int ano = Integer.parseInt(mes_ano.substring(3));
		
		//Dados na tela
		System.out.println("Nome: "+ trabalhador.getNome());
		System.out.println("Departamento: "+ trabalhador.getDepartamento().getName());
		System.out.println("Renda para "+ mes_ano + ": " + String.format("%.2f", trabalhador.renda(ano, mes)));
		
		
	}

}
