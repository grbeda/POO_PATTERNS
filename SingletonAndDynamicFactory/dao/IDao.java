package dao;

import java.util.List;

import dominio.Pc;

public interface IDao <T>{

	void save(T t);
		
	//List<T> list();

	Pc getOne(int id);
}
