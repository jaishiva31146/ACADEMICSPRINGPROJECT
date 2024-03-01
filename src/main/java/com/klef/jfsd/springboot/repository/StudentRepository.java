package com.klef.jfsd.springboot.repository;

import org.springframework.stereotype.Repository;
import org.springframework.data.repository.CrudRepository;

import com.klef.jfsd.model.*;

@Repository
public interface StudentRepository extends CrudRepository<Student,String>
{

}
