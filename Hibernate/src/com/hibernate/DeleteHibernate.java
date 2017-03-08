package com.hibernate;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class DeleteHibernate {
public static void main(String args[])
{
	SessionFactory factory=new Configuration().configure("product.cfg.xml").buildSessionFactory();
	Session session=factory.openSession();
	Object obj=session.get(Product.class, new Integer(100));
	Product product=(Product)obj;
	Transaction tx=session.beginTransaction();
	session.delete(product);
	tx.commit();
	session.close();
	factory.close();
	System.out.println("Product Deleted");
}
}
