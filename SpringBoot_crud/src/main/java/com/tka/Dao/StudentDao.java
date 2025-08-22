package com.tka.Dao;

import com.tka.entities.Student;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class StudentDao {

    @Autowired
    SessionFactory factory;

    public String insertData(Student s){
        Session ss = factory.openSession();
        Transaction tx = ss.beginTransaction();
        ss.persist(s);
        tx.commit();
        ss.close();
        return "Data is inserted...";
    }

}
