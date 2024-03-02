package com.example.Collegeinfo.Repository;

import com.example.Collegeinfo.Model.Faculty;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface facultyrepository extends JpaRepository<Faculty,Integer> {
    List<Faculty> findAllByCollegeId(int collegeId);
}
