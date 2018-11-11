package fabricaDinamica;

import java.sql.Connection;

import conexao.ConexaoDB;
import dao.PcDao;
import dominio.Pc;


public class GravaBD implements GravaDados{
	
	@Override
    public void GravaDados() {
		System.out.println("Estou gravando no BD");
		
        Pc pc1 = new Pc("1000 Gbs", "8 gb", "Ryzen", 8, 2500.00);
        

        Connection conexao = ConexaoDB.getInstance();
        
        PcDao pd = new PcDao(conexao);
        pd.save(pc1);
        
        
    }

    public GravaBD() {
        this.GravaDados();
    }

}
