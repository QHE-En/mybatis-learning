package com.demo.mybatis;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.InputStream;
import java.util.List;

public class TestStudentDelete {
    public static void main(String[] args)throws Exception{
        InputStream is = Resources.getResourceAsStream("mybatis-config.xml");
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(is);
        SqlSession sqlSession = sqlSessionFactory.openSession();
        StudentMapper mapper = sqlSession.getMapper(StudentMapper.class);
        Student dStudent = new Student();
        dStudent.setId("6");
        int deletecount = mapper.deleteStudent(dStudent);
        System.out.println("成功删除"+deletecount+"数据");
        sqlSession.commit();
        List<Student> list = mapper.findAll();
        for (Student s:list){
            System.out.println(s);
        }
        sqlSession.close();
    }
}
