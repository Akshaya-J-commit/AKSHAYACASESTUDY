package org.hcl.dao;

import org.apache.catalina.Manager;
import org.hcl.entities.Admin;

public interface ManagerDaoo {
	public  Integer insert (Manager manager);
	public Admin getIdAndPassWord(int id,String passWord);

}
