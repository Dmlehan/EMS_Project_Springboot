package lk.ijse.ems_project.repo;

import lk.ijse.ems_project.entity.Performance;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface PerformanceRepository extends JpaRepository<Performance, Integer> {
    List<Performance> findByEmployee_EmployeeId(Integer employeeId);
}
