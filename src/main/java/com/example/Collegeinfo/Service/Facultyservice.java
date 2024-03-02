package com.example.Collegeinfo.Service;

import com.example.Collegeinfo.Model.Faculty;
import com.example.Collegeinfo.Repository.facultyrepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class Facultyservice {
    @Autowired
    public facultyrepository frepo;

    public Faculty addFacultyToCollege(Faculty faculty) {
        return frepo.save(faculty);
    }

    public List<Faculty> getAllFacultiesByCollegeId(int collegeId) {
        return frepo.findAllByCollegeId(collegeId);
    }
}
