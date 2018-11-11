package entities;

public class CozinhaLanche {
	
	private TipoLancheFactory tipoLancheFactory;
	
	public CozinhaLanche(TipoLancheFactory tl) {
		this.tipoLancheFactory = tl;
	}
	
	public TipoLanche add(String tipo) {
		return tipoLancheFactory.getLanche(tipo);
	}
	
	}

