package com.examplo.sprbootthymeleafcrud.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.examplo.sprbootthymeleafcrud.entity.Student;

@Repository
public interface StudentRepository extends CrudRepository <Student, Long>{
	List<Student> findByName(String name);
}
