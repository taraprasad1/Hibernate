package com.hibernate;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class HibernateGet {
public static void main(String args[])
{
SessionFactory factory=new Configuration().configure("product.cfg.xml").buildSessionFactory();
Session session=factory.openSession();
Object obj=session.get(Product.class, new Integer(100));
Product product=(Product)obj;
System.out.println(product.getPid());
System.out.println(product.getPname());
System.out.println(product.getPrice());
session.close();
factory.close();
}
}
