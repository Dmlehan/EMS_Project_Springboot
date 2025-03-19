package lk.ijse.ems_project.repo;

import lk.ijse.ems_project.entity.Attendance;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Date;
import java.util.List;

@Repository
public interface AttendanceRepository extends JpaRepository<Attendance, Integer> {

    // Find attendance records by employee ID
    List<Attendance> findByEmployee_EmployeeId(Integer employeeId);

    // Find attendance records by date
    List<Attendance> findByDate(Date date);
}
