package dao;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import model.member;

public class memberim implements memberdao{

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	private static Map<String,member> members=new HashMap<String,member>();
	static
	{
		member m1=new member();
		member m2=new member();
		members.put(m1.getMid(), m1);
		members.put(m1.getMid(),m2);
	}
	

	@Override
	public void add(Object o) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void remove(String name) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public member get(String mid) {
		// TODO Auto-generated method stub
		return members.get(mid);
	}

	@Override
	public List<member> list() {
		// TODO Auto-generated method stub
		return new ArrayList<member>(members.values());
	}

}
