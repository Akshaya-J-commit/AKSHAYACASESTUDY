package org.hcl.services;


import org.hcl.entities.Admin;

public interface AdminServices {
	
	public void insertAdmin(Admin admin);
	public Admin getLogin(int id, String passWord);
}
