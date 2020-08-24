package dao;

import java.util.List;

import model.member;

public interface memberdao {
	void add(Object o);
	void remove(String name);
	member get(String mid);
	List<member> list();

}
