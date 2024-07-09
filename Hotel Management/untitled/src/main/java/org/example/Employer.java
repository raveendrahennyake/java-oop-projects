package org.example;

public class Employer {
    private Integer id;
    private String name;
    private Double salary;
    private String job;
    Employer (Integer id,String name,Double salary,String job){
        this.id=id;
        this.name=name;
        this.salary=salary;
        this.job=job;
    }
    public Employer (){}
    public Integer getId() {
        return id;
    }
    public String getJob() {
        return job;
    }
    public String getName() {
        return name;
    }
    public Double getSalary() {
        return salary;
    }
}
