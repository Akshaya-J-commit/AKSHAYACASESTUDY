package org.hcl.services;

import org.hcl.dao.AdminDaoo;
import org.hcl.entities.Admin;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
@Service
public class AdminServiceImplt implements AdminServices {
	@Autowired
	AdminDaoo dao;

	@Override
	public void insertAdmin(Admin admin) {
		// TODO Auto-generated method stub
		dao.insert(admin);

	}
	@Override
	public Admin getLogin(int id, String passWord)
	{
		Admin admin= dao.getIdAndPassWord(id, passWord);
		return admin;
	}

}
