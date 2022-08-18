package com.masai.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.masai.entity.Department;
@Repository
public interface DepartmentDao extends JpaRepository<Department, Integer>{

}
