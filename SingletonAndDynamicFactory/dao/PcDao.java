package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;

import dominio.Pc;

public class PcDao implements IDao<Pc> {

	private Connection connection;

	public PcDao(Connection connection) {
		this.connection = connection;

	}

	@Override
	public void save(Pc t) {
		String SQL = "insert into pessoa (nome, memoria, processador, avaliacao, preco) values (?, ?, ?)";
		try {
			PreparedStatement pstmt = this.connection.prepareStatement(SQL);
			pstmt.setString(1, t.getHd());
			pstmt.setString(2, t.getMemoria());
			pstmt.setString(3, t.getProcessador());
			pstmt.setInt(4, t.getAvaliacao());
			pstmt.setDouble(5, t.getPreco());
			
			
			
			pstmt.execute();
			System.out.println("Pessoa inserida com sucesso!");
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}

	@Override
	public Pc getOne(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	

}
