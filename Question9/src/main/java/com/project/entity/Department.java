package com.project.entity;

/**
 * Created by yunus on 26.06.2016.
 */

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

import static javax.persistence.GenerationType.IDENTITY;

@Entity
@Table(name = "Department")
public class Department {
    @Id
    @GeneratedValue(strategy = IDENTITY)
    @Column(name = "Department_Id", unique = true, nullable = false)
    private Integer DepartmentId;

    @Column(name = "Name")
    private String Name;

    @Column(name = "Description")
    private String Description;

    @OneToMany(fetch = FetchType.LAZY, mappedBy = "Department")
    private Set<Meetings> stockDailyRecords = new HashSet<Meetings>(0);

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "Employee_Id", nullable = false)
    private Employee Employee;

    public Department() {
    }

    public Integer getDepartmentId() {
        return DepartmentId;
    }

    public void setDepartmentId(Integer departmentId) {
        DepartmentId = departmentId;
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

    public Set<Meetings> getStockDailyRecords() {
        return stockDailyRecords;
    }

    public void setStockDailyRecords(Set<Meetings> stockDailyRecords) {
        this.stockDailyRecords = stockDailyRecords;
    }

    public com.project.entity.Employee getEmployee() {
        return Employee;
    }

    public void setEmployee(com.project.entity.Employee employee) {
        Employee = employee;
    }
}
