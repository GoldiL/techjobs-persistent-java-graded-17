package org.launchcode.techjobs.persistent.models;


import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToMany;
import org.launchcode.techjobs.persistent.models.data.EmployerRepository;

import java.util.ArrayList;
import java.util.List;

@Entity
public class Job extends AbstractEntity{

    @ManyToMany
    private List<Skill> skills = new ArrayList<>();

    private Employer employer;

    // Initialize the id and value fields.
    public Job(Employer employer,List<Skill> someSkills) {
        //super();
        this.employer = employer;
        this.skills = someSkills;
    }

    // Getters and setters.
   public Job(){

}
    public void setSkills(List<Skill> skills) {
        this.skills = skills;
    }

    public void setEmployer(Employer employer) {
        this.employer = employer;
    }

    public Employer getEmployer() {
        return employer;
    }

    public List<Skill> getSkills() {
        return skills;
    }

}
