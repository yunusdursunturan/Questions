import dao.DepartmentDao;
import dao.EmployeeDao;
import dao.MeetingsDao;
import entity.Department;
import entity.Employee;
import entity.Meetings;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AppTest {

    public static void main(String args[]) {

        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");

        EmployeeDao employeeDao= context.getBean(EmployeeDao.class);
        DepartmentDao departmentDao= context.getBean(DepartmentDao.class);
        MeetingsDao meetingsDao= context.getBean(MeetingsDao.class);

        Employee employee = new Employee();
        employee.setName("Yunus");
        employee.setSurname("Turan");
        employee.setSalary("3000");

        employeeDao.save(employee);

        Department department = new Department();
        department.setName("Mühendislik");
        department.setDescription("Yazılım");
        department.setEmployee(employee);
        employee.getStockDailyRecords().add(department);

        departmentDao.save(department);

        Meetings meetings = new Meetings();
        meetings.setName("Toplantı");
        meetings.setDescription("Deneme");
        meetings.setDepartment(department);
        department.getStockDailyRecords().add(meetings);

        meetingsDao.save(meetings);

        context.close();

    }
}
