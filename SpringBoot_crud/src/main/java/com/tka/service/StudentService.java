package com.tka.service;

import com.tka.Dao.StudentDao;
import com.tka.entities.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class StudentService {

    @Autowired
    StudentDao dao;

    public String insertData(Student s){
        String msg = dao.insertData(s);
        return msg;
    }

}
