package com.dao;

import org.hibernate.Session;
import org.hibernate.Transaction;

import com.product.product;
import com.util.productcon;

public class productdao {

	public static void saveUser(product user) {
        Transaction transaction = null;
        try (Session session = productcon.getSessionFactory().openSession()) {
            // start a transaction
            transaction = session.beginTransaction();
            // save the student object
            session.save(user);
            // commit transaction
            transaction.commit();
            session.close();
        } catch (Exception e) {
            if (transaction != null) {
                transaction.rollback();
            }
            e.printStackTrace();
        }
    }

	
}
