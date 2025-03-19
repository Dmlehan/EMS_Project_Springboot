package lk.ijse.ems_project.Service;

import lk.ijse.ems_project.entity.Performance;

import java.util.List;

public interface PerformanceService {
    List<Performance> getAllPerformances();
    Performance getPerformanceById(Integer id);
    Performance savePerformance(Performance performance);
    Performance updatePerformance(Integer id, Performance performance);
    void deletePerformance(Integer id);
    List<Performance> getPerformancesByEmployee(Integer employeeId);
}
