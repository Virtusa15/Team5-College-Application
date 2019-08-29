package com.college.web.service;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;

import com.college.web.model.Applicant;
import com.college.web.model.ApplicationStatus;
import com.college.web.util.HibernateUtil;

public class ApplicantServices {
	
	public boolean appregister(Applicant app)
	{
		
		 Session session = HibernateUtil.openSession();
		
		
	     if(isUserExists(app)) return false;  
	     
	     Transaction tx = null;
	     try {
	         tx = session.getTransaction();
	         tx.begin();
	         session.saveOrUpdate(app);       
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
	

	public List<Applicant> getAllApplicants()
	{
		
		Session session=HibernateUtil.openSession();
		Transaction tx = null;
		List<Applicant>    applicant=null;
		 try {
		
	         tx = session.getTransaction();
	         tx.begin();
	         applicant =session.createQuery("from Applicant").list();    
	      
	
	         tx.commit();
	     } catch (Exception e) {
	         if (tx != null) {
	             tx.rollback();
	         }
	         e.printStackTrace();
	     } finally {
	         session.close();
	     } 
		
		return applicant ;
		
	}
	

	private boolean isUserExists(Applicant app) {
		// TODO Auto-generated method stub
		
		
		Session session = HibernateUtil.openSession();
	     boolean result = true;
	     Transaction tx = null;
	     try{
	         tx = session.getTransaction();
	         tx.begin();
	         Query query = session.createQuery("from Applicant where email_id='"+app.getEmail_id()+"'");
	         Applicant u = (Applicant)query.uniqueResult();
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


	public ApplicationStatus getStatus(int aid) {
		

		Session session = HibernateUtil.openSession();
	    // boolean result = true;
		 ApplicationStatus u=null;
	     Transaction tx = null;
	     try{
	         tx = session.getTransaction();
	         tx.begin();
	         Query query = session.createQuery("from ApplicationStatus where aid='"+aid+"'");
	          u = (ApplicationStatus)query.uniqueResult();
	         tx.commit();
	       //  if(u==null) result = false;
	        	 
	     }catch(Exception ex){
	         if(tx!=null){
	             tx.rollback();
	         }
	     }finally{
	         session.close();
	     }
	     return u;
		
		
		
	
	}

}
