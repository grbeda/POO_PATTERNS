package application;

import entities.CalculadorDeImposto;
import entities.ICMS;
import entities.ISS;
import entities.Imposto;
import entities.Orcamento;

public class Testador_2 {

	public static void main(String[] args) {
		
		Imposto iss = new ISS();
		Imposto icms = new ICMS();
		
		Orcamento orcamento = new Orcamento(1000.00);
		
		CalculadorDeImposto calc = new CalculadorDeImposto();
		
		calc.realizaCalculo(orcamento, iss);
		calc.realizaCalculo(orcamento, icms);
	}

}
