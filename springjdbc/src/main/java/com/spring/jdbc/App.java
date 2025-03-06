package com.spring.jdbc;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;

import com.spring.jdbc.dao.StudentDao;
import com.spring.jdbc.entites.Student;

/**
 * Hello world!
 *
 */
public class App
{
    public static void main( String[] args )
    {
        System.out.println( "My Prog started.." );
        ApplicationContext context=new AnnotationConfigApplicationContext(JdbcConfig.class);
       
        StudentDao studentDao=context.getBean("StudentDao",StudentDao.class);
        
//        Student student1=new Student();
//        student1.setId(245);
//        student1.setName("RohitC");
//        student1.setCity("Solaput");
//        
//        studentDao.change(student1);
//        
        Student s= studentDao.getStudent(121);
        List<Student> student=studentDao.getAllStudent();
        
        for(Student s1:student) {
        System.out.println(s1);
        }
        // JdbcTemplate template = context.getBean("jdbcTemplate",JdbcTemplate.class);
        
        //insert query
//        String query="insert into Student(id,name,city) values(?,?,?)";
//        
//        //fire the query
//        int result=template.update(query,101,"KishorM","Pune");
//        System.out.println(result);
        
        
    }
}
