package com.example.Collegeinfo.Service;

import com.example.Collegeinfo.Model.Department;
import com.example.Collegeinfo.Repository.departmentrepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class Departmentservice {
    @Autowired
    public departmentrepository drepo;
    public Department adddepartment(Department department) {
        return drepo.save(department);
    }

    public Department getdepartment(int id) {
        return drepo.findById(id).orElse(null);
    }
}
