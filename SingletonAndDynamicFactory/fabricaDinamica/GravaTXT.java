package fabricaDinamica;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

import dominio.Pc;

public class GravaTXT implements GravaDados{
	
	@Override
	public void GravaDados() {
		System.out.println("Gravando arquivo TXT");
		
		Pc pc1 = new Pc("1000 Gbs", "8 gb", "Ryzen", 8, 2500.00);

        try {
            // Conteudo, aqui passa o conteudo das pessoas para a string conteudo para escrever no arquivo
            String texto = pc1.toString();
            
            File file = new File("TXT.txt");

            // Se o arquivo nao existir, ele gera
            if (!file.exists()) {
                file.createNewFile();
            }

            // Prepara para escrever no arquivo
            FileWriter fw = new FileWriter(file.getAbsoluteFile());
            BufferedWriter bw = new BufferedWriter(fw);
            
            bw.write(texto);
            bw.close();
            
            // Le o arquivo
            FileReader ler = new FileReader("TXT.txt");
            BufferedReader reader = new BufferedReader(ler);  
            String linha;
            while( (linha = reader.readLine()) != null ){
                System.out.println(linha);
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
    }		
	
	public GravaTXT() {
		this.GravaDados();
	}


}
