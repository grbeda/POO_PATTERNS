package fabricaDinamica;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class FabricaDinamica {

    private Properties props;

    public FabricaDinamica(String arquivo) throws FileNotFoundException,
            IOException {
        props = new Properties();
        props.load(new FileInputStream(arquivo));
    }

    public <E> E criaImplementacao(Class<E> inter) {
        String nomeClasse = props.getProperty(inter.getName());
        if (nomeClasse == null) {
            throw new IllegalArgumentException("Interface nao configurada");
        }
        try {
            Class clazz = Class.forName(nomeClasse);
            if (inter.isAssignableFrom(clazz)) {
                return (E) clazz.newInstance();
            } else {
                throw new IllegalArgumentException("Classe configurada nao implementa a interface");
            }
        } catch (Exception e) {
            throw new IllegalArgumentException("Não foi possivel criar a implementacao", e);
        }
    }

}
