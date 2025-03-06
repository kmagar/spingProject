package com.spring.orm.dao;

import org.springframework.orm.hibernate5.HibernateTemplate;

import com.spring.orm.entities.Student;

public class StudentDao {
	
	private HibernateTemplate hibernetTemplate;
	public int insert(Student student) {
		Integer i=(Integer) this.hibernetTemplate.save(student);
		return i;
	}

}
