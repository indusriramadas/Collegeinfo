package com.example.Collegeinfo.Model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Faculty {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public Long id;
    public String name;
    public String specialization;
    public int experienceYears;
    @ManyToOne
    @JsonIgnore
    @JoinColumn(name = "department_id",referencedColumnName = "id")
    private College college;
}
