package com.example.Collegeinfo.Repository;

import com.example.Collegeinfo.Model.Department;
import org.springframework.data.jpa.repository.JpaRepository;

public interface departmentrepository extends JpaRepository<Department,Integer> {
}
