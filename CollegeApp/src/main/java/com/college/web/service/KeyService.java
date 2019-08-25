package com.college.web.service;

import org.hibernate.Hibernate;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;

import com.college.web.model.Applicant;
import com.college.web.model.Security;
import com.college.web.util.HibernateUtil;

public class KeyService {

	public  boolean validate(String key) {
		
		boolean r=false;
		
		if(isKeyExists(key))  
			{
			r= true;
			}
			
		
		
		
		
		
	
		return r;
	}

	private boolean isKeyExists(String key) {
		Session session = HibernateUtil.openSession();
		 boolean result = false;
	     Transaction tx = null;
	     try
	     {
	    	 tx=session.getTransaction();
	    	 tx.begin();
	    	// System.out.println(key);
	    	 Security s=new Security();
	    	 System.out.println(s.getKey());
	    	 
	    	 Query query=session.createQuery("from Security where key='"+key+"'");
	    	
	    	 System.out.println("in is exiSt");
	    	 
	    Security ob=(Security)query.uniqueResult();
	    System.out.println(ob.getKey()+"from ob");
	    
	    	 tx.commit();
	    	 if(ob!=null) 
	    		 {
	    		 
	    		 System.out.println("in if ");   
	    		 result= true;
	    	
	    		 }
	     }
       	 
	     catch(Exception ex){
	         if(tx!=null){
	             tx.rollback();
	         }
	     }finally{
	         session.close();
	     }
	     System.out.println("in end");
		
		
		
		return result;
	}
	
	
	

}
