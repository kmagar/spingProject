package com.spring.jdbc.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Component;

import com.spring.jdbc.entites.Student;

@Component("studentDao")
public class StudentDaoImpl implements StudentDao{

	@Autowired
	private JdbcTemplate jdbcTemplate;

	public int insert(Student student) {
		
		String query = "insert into Student(id, name, city) values(?,?,?)";
		int r=this.jdbcTemplate.update(query,student.getId(),student.getName(),student.getCity());
		return r;
		
	}
	
	public int change(Student student) {
		
		String query="update Student set name=?,city=? where id=?";
		int r=this.jdbcTemplate.update(query,student.getName(),student.getCity(),student.getId());
		return r;
	}
	public Student getStudent(int studentid) {
		
		String query="select * from Student where id=?";
		RowMapper<Student> rowMapper = new RowMapperImpl();
		Student s=this.jdbcTemplate.queryForObject(query,rowMapper,studentid);
		return s;
	}
	
	public List<Student> getAllStudent() {
		// selecting multiple students
		String query="select * from student";
		List<Student> student=this.jdbcTemplate.query(query, new RowMapperImpl());
		return student;
	}
	
	public JdbcTemplate getJdbcTemplate() {
		return jdbcTemplate;
	}

	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}

	

	

	
	
}
