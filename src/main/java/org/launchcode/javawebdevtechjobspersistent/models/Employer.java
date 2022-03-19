package org.launchcode.javawebdevtechjobspersistent.models;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Entity;
import javax.validation.constraints.NotBlank;
import java.util.ArrayList;
import java.util.List;

@Entity
public class Employer extends AbstractEntity {

    @OneToMany(mappedBy = "employer")

    private List<Job> jobs;

    @NotBlank(message = "It has to be located somewhere.")
    private String location;
    @OneToMany
    @JoinColumn
    private List<Job> job = new ArrayList<>();

    public Employer() {}

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }


    public List<Job> getJobs() {
        return jobs;
    }

    public void setJobs(List<Job> jobs) {
        this.jobs = jobs;
    }
}
