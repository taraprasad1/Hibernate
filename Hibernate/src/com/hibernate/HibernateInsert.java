package com.hibernate;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class HibernateInsert {
public static void main(String args[])
{
	SessionFactory factory=new Configuration().configure("product.cfg.xml").buildSessionFactory();
	Session session=factory.openSession();
	Product product=new Product();
	product.setPid(100);
	product.setPname("Product1");
	product.setPrice(2000);
	Transaction tx=session.beginTransaction();
	session.save(product);
	tx.commit();
	session.close();
	factory.close();
}
}
