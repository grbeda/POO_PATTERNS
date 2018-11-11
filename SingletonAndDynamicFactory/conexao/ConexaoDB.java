package conexao;

import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Connection;

public class ConexaoDB {
	
	private final String URL = "jdbc:mysql://localhost:3306/bd2?useTimezone=true&serverTimezone=UTC";
	private final String USER = "root";
	private final String PASSWORD = "root";
	private final String TP_CONEXAO = "com.mysql.cj.jdbc.Driver";
	
	private static Connection instance;
	
	private ConexaoDB() {}
	
	public static Connection getInstance() {
		if(instance == null) {
			instance = new ConexaoDB().criaConexao();
		}
		return instance;
	}
	
	private Connection criaConexao() {
		try {
			Class.forName(TP_CONEXAO);
			instance = DriverManager.getConnection(URL, USER, PASSWORD);
			System.out.println("conectei ao bd");
		} catch (ClassNotFoundException | SQLException ex) {
			ex.printStackTrace();
		}
		return instance;
	}
	
	public static void fechaConexao() {
		try {
			if (instance != null && (!instance.isClosed())) {
				try {
					instance.close();
					System.out.println("fechei conexao com o bd");
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
}
