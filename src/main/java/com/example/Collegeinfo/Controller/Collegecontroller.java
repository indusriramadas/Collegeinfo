package com.example.Collegeinfo.Controller;

import com.example.Collegeinfo.Model.College;
import com.example.Collegeinfo.Service.Collegeservice;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/colleges")
public class Collegecontroller {
    @Autowired
    public Collegeservice cservice;
    @PostMapping
    public College addCollege(@RequestBody College college){
        return cservice.addCollege(college);
    }
    @PostMapping("/addcolleges")
    public List<College> addColleges(@RequestBody List<College> colleges){
        return cservice.addcolleges(colleges);
    }
    @GetMapping("/colleges")
    public List<College> getColleges(){
        return cservice.getColleges();
    }
    @GetMapping("/colleges/{id}")
    public College getcollege(@PathVariable int id){
        return cservice.getCollege(id);
    }
    @DeleteMapping("/colleges/{id}")
    public String deletecollege(@PathVariable int id){
        return cservice.deletecollege(id);
    }
    @PutMapping("/colleges/{id}")
    public College updatecollege(@PathVariable int id,@RequestBody College college){
        return cservice.updatecollege(id,college);
    }



    }





