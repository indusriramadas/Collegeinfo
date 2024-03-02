package com.example.Collegeinfo.Service;

import com.example.Collegeinfo.Model.College;
import com.example.Collegeinfo.Repository.collegerepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import java.util.List;
import java.util.Optional;

@Service
public class Collegeservice {
    @Autowired
    private collegerepository crepo;


    public College addCollege(College college) {
        return crepo.save(college);
    }

    public List<College> getColleges() {
        return crepo.findAll();
    }

    public College getCollege(int id) {
        return crepo.findById(id).orElse(null);
    }

    public String deletecollege(int id) {
        crepo.deleteById(id);
        return "College deleted";
    }

    public List<College> addcolleges(List<College> colleges) {
        return crepo.saveAll(colleges);
    }

    public College updatecollege(int id, College updatedcollege) {
        Optional<College> optionalCollege=crepo.findById(id);
        if(optionalCollege.isPresent()){
            College existingcollege=optionalCollege.get();
            existingcollege.setName(updatedcollege.getName());
            return crepo.save(existingcollege);
        }else{
            throw new RuntimeException(("College not found with"+id));
        }
    }
}


