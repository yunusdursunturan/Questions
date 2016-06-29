package com.project.entity;

/**
 * Created by yunus on 26.06.2016.
 */

import static javax.persistence.GenerationType.IDENTITY;
import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Entity
@Table(name = "Employee")
public class Employee {

    @Id
    @GeneratedValue(strategy = IDENTITY)
    @Column(name = "Employee_Id", unique = true, nullable = false)
    private Integer EmployeeId;

    @Column(name = "Name")
    private String Name;

    @Column(name = "Surname")
    private String Surname;

    @Column(name = "Salary")
    private String Salary;

    @OneToMany(fetch = FetchType.LAZY, mappedBy = "Employee")
    private Set<Department> stockDailyRecords = new HashSet<Department>(0);

    public Employee() {
    }

    public Integer getEmployeeId() {
        return EmployeeId;
    }

    public void setEmployeeId(Integer employeeId) {
        EmployeeId = employeeId;
    }

    public Set<Department> getStockDailyRecords() {
        return stockDailyRecords;
    }

    public void setStockDailyRecords(Set<Department> stockDailyRecords) {
        this.stockDailyRecords = stockDailyRecords;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public String getSurname() {
        return Surname;
    }

    public void setSurname(String surname) {
        Surname = surname;
    }

    public String getSalary() {
        return Salary;
    }

    public void setSalary(String salary) {
        Salary = salary;
    }
}
