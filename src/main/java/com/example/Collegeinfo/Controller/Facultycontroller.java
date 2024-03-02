package com.example.Collegeinfo.Controller;

import com.example.Collegeinfo.Model.Faculty;
import com.example.Collegeinfo.Service.Facultyservice;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping
public class Facultycontroller {
    @Autowired
    public Facultyservice facultyservice;
    @PostMapping("/{collegeId}/faculties")
    public Faculty addFacultyToCollege(@RequestBody Faculty faculty)
    {
        return facultyservice.addFacultyToCollege(faculty);
    }
    @GetMapping("/{collegeId}/faculties")
    public List<Faculty> getAllFacultiesByCollegeId(@PathVariable int collegeId)
    {
        return facultyservice.getAllFacultiesByCollegeId(collegeId);
    }
}
