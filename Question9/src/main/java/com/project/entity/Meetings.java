package com.project.entity;

/**
 * Created by yunus on 26.06.2016.
 */

import javax.persistence.*;

import static javax.persistence.GenerationType.IDENTITY;

@Entity
@Table(name = "Meetings")
public class Meetings {

    @Id
    @GeneratedValue(strategy = IDENTITY)
    @Column(name = "Meetings_Id", unique = true, nullable = false)
    private Integer Id;

    @Column(name = "Name")
    private String Name;

    @Column(name = "Description")
    private String Description;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "Department_Id", nullable = false)
    private Department Department;

    public Meetings() {
    }

    public Integer getId() {
        return Id;
    }

    public void setId(Integer id) {
        Id = id;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public String getDescription() {
        return Description;
    }

    public void setDescription(String description) {
        Description = description;
    }

    public com.project.entity.Department getDepartment() {
        return Department;
    }

    public void setDepartment(com.project.entity.Department department) {
        Department = department;
    }
}
