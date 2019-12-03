package com.kyo.exe.servlet;

import com.kyo.exe.dao.StudentDao;
import com.kyo.exe.entity.Student;

import java.util.Iterator;
import java.util.List;

public class Test {
    @org.junit.Test
    public void demo(){
         StudentDao studentDao = new StudentDao();
         List<Student> list =  studentDao.findAll();
        Iterator it = list.iterator();
         while (it.hasNext()) {
             System.out.println(it.next());


         }
    }
}
