package org.hcl.services;

import org.hcl.dao.ManagerDaoo;
import org.hcl.entities.Manager;
import org.springframework.beans.factory.annotation.Autowired;

public class ManagerServiceImplt implements ManagerServices {
	@Autowired
	ManagerDaoo dao;

	@Override
	public void insertManager(Manager manager) {
		// TODO Auto-generated method stub
		dao.insert(manager);

	}
	@Override
	public Manager getLogin(int id, String passWord)
	{
		Manager manager= dao.getIdAndPassWord(id, passWord);
		return manager;
	}

}
