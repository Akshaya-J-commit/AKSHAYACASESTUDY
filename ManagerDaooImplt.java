package org.hcl.dao;

import java.util.List;

import org.hcl.entities.Admin;
import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.criterion.Criterion;
import org.hibernate.criterion.Restrictions;
import org.springframework.beans.factory.annotation.Autowired;

public class ManagerDaooImplt implements ManagerDaoo {
	@Autowired	
	SessionFactory factory;

	@Override
	public Integer insert(Manager manager){
		Session session= factory.openSession();
		Integer id=(Integer)session.save(manager);
		session.close();
		return id;
	}
	@Override
	public Admin getIdAndPassWord(int id, String passWord)
	{
		Session session = factory.openSession();
		Criteria crit = session.createCriteria(Admin.class);
		Criterion idd= Restrictions.eq("id",id);
		Criterion password =Restrictions.eq("passWord",passWord);
		Criterion condition=Restrictions.and(idd,password);
		crit.add(condition);
		List<Admin> ans= crit.list();
	    return ans.get(0);
		
	}


}
