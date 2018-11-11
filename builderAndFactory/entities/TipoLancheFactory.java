package entities;

public class TipoLancheFactory {

	public TipoLanche getLanche(String lanche) {
		
		TipoLanche tipo = null;
		
		if(lanche.equalsIgnoreCase("Xis")) {
			tipo = new Xis();
		}else if(lanche.equalsIgnoreCase("Dog")) {
			tipo = new Dog();
		}else {
			tipo = new Fritas();
		}
		
		return tipo;
	}
}
