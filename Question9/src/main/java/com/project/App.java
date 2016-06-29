package com.project;

import com.project.entity.Department;
import com.project.entity.Employee;
import com.project.entity.Meetings;
import org.hibernate.Session;
import com.project.config.HibernateConfig;

/**
 * Created by yunus on 26.06.2016.
 */

public class App {

    public static void main( String[] args ){
        Session session = HibernateConfig.getSessionFactory().openSession();
        session.beginTransaction();

        Employee employee = new Employee();
        employee.setName("Yunus");
        employee.setSurname("Turan");
        employee.setSalary("3000");

        session.save(employee);

        Department department = new Department();
        department.setName("Mühendislik");
        department.setDescription("Yazılım");
        department.setEmployee(employee);
        employee.getStockDailyRecords().add(department);

        session.save(department);

        Meetings meetings = new Meetings();
        meetings.setName("Toplantı");
        meetings.setDescription("Deneme");
        meetings.setDepartment(department);
        department.getStockDailyRecords().add(meetings);

        session.save(meetings);

        session.getTransaction().commit();
    }
}
