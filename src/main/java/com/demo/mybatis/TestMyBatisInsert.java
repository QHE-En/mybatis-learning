package com.demo.mybatis;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.InputStream;
import java.util.List;

public class TestMyBatisInsert {
    public static void main(String[] args)throws Exception{
        InputStream is = Resources.getResourceAsStream("mybatis-config.xml");
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(is);
        SqlSession sqlSession = sqlSessionFactory.openSession();
        StudentMapper mapper = sqlSession.getMapper(StudentMapper.class);
        Student newStudent = new Student();
        newStudent.setId("6");
        newStudent.setName("周八");
        newStudent.setAge(24);
        int insertcount = mapper.insertStudent(newStudent);
        System.out.println("新增了"+insertcount+"条数据");
        sqlSession.commit();
        List<Student> list= mapper.findAll();
        for(Student s:list){
            System.out.println(s);
        }
        sqlSession.close();
    }
}
