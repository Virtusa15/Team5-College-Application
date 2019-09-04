package com.college.web.service;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;

import com.college.web.model.Admin;
import com.college.web.model.ApplicationStatus;
import com.college.web.model.Courses;
import com.college.web.model.PlacementDetails;
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

	public boolean updateStatus(ApplicationStatus status) {
		
		 Session session = HibernateUtil.openSession();
			
			
	  
	     Transaction tx = null;
	     try {
	         tx = session.getTransaction();
	         tx.begin();
	         session.saveOrUpdate(status);       
	         tx.commit();
	     } 
	     
	     catch (Exception e) {
	         if (tx != null) {
	             tx.rollback();
	         }
	         e.printStackTrace();
	     } 
	    
	     
	     finally {
	         session.close();
	     } 
		
		
		
		return true;
	}

	public boolean addCourse(Courses c) {
		// TODO Auto-generated method stub
		 Session session = HibernateUtil.openSession();
			
			
		  
	     Transaction tx = null;
	     try {
	         tx = session.getTransaction();
	         tx.begin();
	         session.save(c);       
	         tx.commit();
	     } 
	     
	     catch (Exception e) {
	         if (tx != null) {
	             tx.rollback();
	         }
	         e.printStackTrace();
	     } 
	    
	     
	     finally {
	         session.close();
	     } 
		
		
		return true;
	}
	
	
public 	List<Courses> viewAllCourses()
{
	
	Session session = HibernateUtil.openSession();
	List<Courses> course=null;
	
	  
    Transaction tx = null;
    try {
        tx = session.getTransaction();
        tx.begin();
        course =session.createQuery("from Courses").list();      
        tx.commit();
    } 
    
    catch (Exception e) {
        if (tx != null) {
            tx.rollback();
        }
        e.printStackTrace();
    } 
   
    
    finally {
        session.close();
    } 
	
	


	
	
	
	return course;
	
}

public boolean updateCourse(Courses course) {
	Session session = HibernateUtil.openSession();
	
	
	  
    Transaction tx = null;
    try {
        tx = session.getTransaction();
        tx.begin();
        session.update(course);    
        tx.commit();
    } 
    
    catch (Exception e) {
        if (tx != null) {
            tx.rollback();
        }
        e.printStackTrace();
    } 
   
    
    finally {
        session.close();
    } 
	
	
	return true;
}

public boolean deleteCourse(long cid) {
	// TODO Auto-generated method stub
	Session session = HibernateUtil.openSession();
	

	  
    Transaction tx = null;
    try {
        tx = session.getTransaction();
        tx.begin();
    	Courses c=(Courses) session.get(Courses.class,cid);
    	if(c!=null)
    	{
    		
    		session.delete(c);
    		System.out.println("course deleted");
    	}
        tx.commit();
    } 
    
    catch (Exception e) {
        if (tx != null) {
            tx.rollback();
        }
        e.printStackTrace();
    } 
   
    
    finally {
        session.close();
    } 
	
	
	return true;
}

public boolean addPlacement(PlacementDetails p) {
	 Session session = HibernateUtil.openSession();
		
		
	  
     Transaction tx = null;
     try {
         tx = session.getTransaction();
         tx.begin();
         session.saveOrUpdate(p);       
         tx.commit();
     } 
     
     catch (Exception e) {
         if (tx != null) {
             tx.rollback();
         }
         e.printStackTrace();
     } 
    
     
     finally {
         session.close();
     } 
	
	
	
	return true;
}



}
