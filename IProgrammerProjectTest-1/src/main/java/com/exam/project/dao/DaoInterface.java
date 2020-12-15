package com.exam.project.dao;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.exam.project.model.Employee;


public interface DaoInterface extends MongoRepository<Employee, Integer>{

}
