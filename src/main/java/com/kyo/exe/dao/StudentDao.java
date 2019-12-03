package com.kyo.exe.dao;

import com.kyo.exe.entity.Student;
import com.kyo.exe.utils.SqlSessionFactoryUtils;
import org.apache.ibatis.session.SqlSession;

import java.util.List;

public class StudentDao {

    private SqlSession sqlSession;
    private Student student;
    private List<Student> list;

    private SqlSession getSqlSession(){
        SqlSessionFactoryUtils.initSqlSessionFactory();
        sqlSession = SqlSessionFactoryUtils.getSqlSessionFactory().openSession();

        return sqlSession;
    }

    public List<Student> findAll(){
        try {
            list = getSqlSession().selectList("findAll");
        }catch (Exception e){
            e.printStackTrace();
        }finally {
            sqlSession.close();
        }
        return list;
    }
}
