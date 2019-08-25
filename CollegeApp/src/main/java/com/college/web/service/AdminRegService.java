package com.college.web.service;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;

import com.college.web.model.Admin;
import com.college.web.model.Applicant;
import com.college.web.util.HibernateUtil;

public class AdminRegService {

	public boolean adminRegister(Admin admin) {
		// TODO Auto-generated method stub
		Session session=HibernateUtil.openSession();
		if(isAdminExists(admin)) return false;
		
		
		
		Transaction tx = null;
	     try {
	         tx = session.getTransaction();
	         tx.begin();
	         session.saveOrUpdate(admin);       
	         tx.commit();
	     } catch (Exception e) {
	         if (tx != null) {
	             tx.rollback();
	         }
	         e.printStackTrace();
	     } finally {
	         session.close();
	     } 
	   
		
		return true;
		
	}

	private boolean isAdminExists(Admin admin) {
		// TODO Auto-generated method stub
		
		
		

		Session session = HibernateUtil.openSession();
	     boolean result = true;
	     Transaction tx = null;
	     try{
	         tx = session.getTransaction();
	         tx.begin();
	         Query query = session.createQuery("from Admin where aid='"+admin.getAid()+"'");
	         Admin u = (Admin)query.uniqueResult();
	         tx.commit();
	         if(u==null) result = false;
	        	 
	     }catch(Exception ex){
	         if(tx!=null){
	             tx.rollback();
	         }
	     }finally{
	         session.close();
	     }
	     return result;
	}

}
