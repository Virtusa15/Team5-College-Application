package com.college.web.service;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;

import com.college.web.model.Admin;
import com.college.web.util.HibernateUtil;

public class AdminLoginService {

	public boolean authenticateAdmin(String aid, String password) {
		// TODO Auto-generated method stub
		
		Admin admin=getAdminByAid(aid);
		if(admin!=null && admin.getAid().equals(aid) && admin.getPassword().equals(password)){
            return true;
        }else{
            return false;
        }
	}

	private Admin getAdminByAid(String aid) {
		 Session session = HibernateUtil.openSession();
	        Transaction tx = null;
	        Admin admin = null;
	        try {
	            tx = session.getTransaction();
	            tx.begin();
	            Query query = session.createQuery("from Admin where aid='"+aid+"'");
	            admin = (Admin)query.uniqueResult();
	            tx.commit();
	        } catch (Exception e) {
	            if (tx != null) {
	                tx.rollback();
	            }
	            e.printStackTrace();
	        } finally {
	            session.close();
	        }
	        return admin;
	}

}
