package application;

import entities.CozinhaLanche;
import entities.Lanche;
import entities.LancheBuilder;
import entities.TipoLanche;
import entities.TipoLancheFactory;

public class Testador_3 {

	public static void main(String[] args) {
		
		Lanche lanche = new Lanche(15.50, 2, "catupiry");
		LancheBuilder lb = new LancheBuilder(lanche);
		
		TipoLancheFactory tlf = new TipoLancheFactory();
		CozinhaLanche cl = new CozinhaLanche(tlf);
		TipoLanche tipo = cl.add("Xis");
		System.out.println(tipo.getLanche());
		
		lb
		.acompanhamento("Bacon")
		.acompanhamento("Katshup")
		.acompanhamento("Alface")
		.bebida("Coca-cola");
		
		System.out.println(lanche);
	}

}
