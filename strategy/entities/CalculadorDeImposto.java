package entities;

public class CalculadorDeImposto {

	public void realizaCalculo(Orcamento orcamento, Imposto impostoQualquer) {
		
		double calc = impostoQualquer.calcula(orcamento);
		System.out.println(calc);
	}
}
