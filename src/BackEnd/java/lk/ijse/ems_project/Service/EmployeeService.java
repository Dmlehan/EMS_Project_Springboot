package lk.ijse.ems_project.Service;


import lk.ijse.ems_project.entity.Employee;
import java.util.List;

public interface EmployeeService {
    Employee saveEmployee(Employee employee);
    Employee getEmployeeById(Integer id);
    List<Employee> getAllEmployees();
    Employee updateEmployee(Integer id, Employee employee);
    void deleteEmployee(Integer id);
}
