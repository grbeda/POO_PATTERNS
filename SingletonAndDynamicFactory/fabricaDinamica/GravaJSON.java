package fabricaDinamica;

import java.io.FileWriter;
import java.io.IOException;

import com.google.gson.Gson;

import dominio.Pc;



public class GravaJSON implements GravaDados{
	
	@Override
	public void GravaDados() {
		System.out.println("Gravando arquivo JSON");
		
		Pc pc = new Pc("1000 Gbs", "8 gb", "Ryzen", 8, 2500.00);
		
		Gson gson = new Gson();
		
		String aux = gson.toJson(pc);
		
		try {
	        //Escreve Json convertido em arquivo chamado "file.json"
	        FileWriter writer = new FileWriter("file.json");
	        writer.write(aux);
	        writer.close();
	  
	    } catch (IOException e) {
	        e.printStackTrace();
	    }
		
		System.out.println(aux);
		
	}
	public GravaJSON() throws IOException {
		this.GravaDados();
	}

}