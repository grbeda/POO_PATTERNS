package application;

import java.io.IOException;

import fabricaDinamica.FabricaDinamica;

public class Program_8 {
	
	public static void main(String[] args) {
		try {
			FabricaDinamica fb = new FabricaDinamica("properties.txt");
			fb.criaImplementacao(fabricaDinamica.GravaDados.class);
		}catch (IOException e) {
			e.printStackTrace();
		}
	}

}
