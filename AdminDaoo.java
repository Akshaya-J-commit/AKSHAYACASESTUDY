package org.hcl.dao;

import org.hcl.entities.Admin;

public interface AdminDaoo {
	public  Integer insert (Admin admin);
	public Admin getIdAndPassWord(int id,String passWord);

}
