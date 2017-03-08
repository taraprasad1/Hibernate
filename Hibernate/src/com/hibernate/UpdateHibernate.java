package com.hibernate;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class UpdateHibernate {
public static void main(String args[])
{
	SessionFactory factory=new Configuration().configure("product.cfg.xml").buildSessionFactory();
	Session session=factory.openSession();
	Object obj=session.load(Product.class,new Integer(100));
	Product product=(Product)obj;
	product.setPrice(4000);
	Transaction tx=session.beginTransaction();
	session.update(product);
	tx.commit();
	session.close();
	factory.close();
}
}
