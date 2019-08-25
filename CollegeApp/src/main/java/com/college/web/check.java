package com.college.web;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class check {
	public static void main(String args[])
	{
		
		Student st=new Student();
		st.setName("ganesh");
		st.setRollno(101);
		Post post = new Post();
		post.setName("Hibernate Master Class");

PostDetails details = new PostDetails();
post.addDetails(details);
		
		
		
		
		
		
		Configuration cfg=new Configuration().configure().addAnnotatedClass(Student.class).addAnnotatedClass(Post.class).addAnnotatedClass(PostDetails.class);
		SessionFactory sf=cfg.buildSessionFactory();
		Session session=sf.openSession();
		
		Transaction tx=session.beginTransaction();
	 session.save(st);
	 session.persist(post);
	tx.commit();
		
	}
	

}
