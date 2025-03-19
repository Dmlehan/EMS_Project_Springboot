package lk.ijse.ems_project.repo;
import lk.ijse.ems_project.entity.Payroll;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface PayrollRepository extends JpaRepository<Payroll, Integer> {
    List<Payroll> findByEmployee_EmployeeId(Integer employeeId);
}

