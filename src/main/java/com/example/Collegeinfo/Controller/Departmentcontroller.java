package com.example.Collegeinfo.Controller;

import com.example.Collegeinfo.Model.Department;
import com.example.Collegeinfo.Service.Departmentservice;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/departments")
public class Departmentcontroller {
    @Autowired
    private Departmentservice departmentservice;
    @PostMapping
    public Department adddepartment(@RequestBody Department department)
    {
        return departmentservice.adddepartment(department);
    }
    @GetMapping("get/{id}")
    public Department getdepartment(@PathVariable int id)
    {
        return departmentservice.getdepartment(id);
    }
}
