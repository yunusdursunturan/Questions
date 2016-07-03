package entity;

/**
 * Created by yunus on 26.06.2016.
 */

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

import static javax.persistence.GenerationType.IDENTITY;
/**
 * @author Yunus Dursun TURAN
 * @since 26.06.2016
 * @version 1.0.0.0
 */

/**
 * Bu kısımda Projemizin veritabanındaki tabloların propertylerine göre Entity Class ları oluşturduk.
 * Her Class'ın başına @Entity annotation'u sonra @Table annotation'unu ekliyoruz. Tablo ismini de
 * ayrıyeten yazabiliyoruz. Eğer yazmazsak Class' ın ismini tablo ismi olarak görür.
 * */
@Entity
@Table(name = "Department")
public class Department {
    /**
     * Bu kısımda tablonun propertiylerini belirtiyoruz. Column isimleri, türlerini ve ilişkileri
     * de buradan annotation'larla yapabiliyoruz.*/
    @Id
    @GeneratedValue(strategy = IDENTITY)
    @Column(name = "Department_Id", unique = true, nullable = false)
    private Integer DepartmentId;

    @Column(name = "Name")
    private String Name;

    @Column(name = "Description")
    private String Description;
    /**
     * Burada tablo ilişkisi olduğunu belirtiyoruz. Department tablosu ile Meetings tablosu arasında
     * bire çok @OneToMany annotation'u ile ilişkisi olduğu belirtilir.*/
    @OneToMany(fetch = FetchType.LAZY, mappedBy = "Department")
    private Set<Meetings> stockDailyRecords = new HashSet<Meetings>(0);

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "Employee_Id", nullable = false)
    private Employee Employee;
    /**
     * Parametresiz constructor*/
    public Department() {
    }
    /**
     * getDepartmentId methodu
     * @return Departmend'in id'sini dönderir.*/
    public Integer getDepartmentId() {
        return DepartmentId;
    }
    /**
     * setDepartmentId methodu
     * @param departmentId degerini parametre olarak alır.
     * Department objesinin id'sini set etmeye yarar.*/
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

    public Employee getEmployee() {
        return Employee;
    }

    public void setEmployee(Employee employee) {
        Employee = employee;
    }
}
