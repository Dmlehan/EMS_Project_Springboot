package lk.ijse.ems_project.Service.impl;


import lk.ijse.ems_project.Service.PerformanceService;
import lk.ijse.ems_project.entity.Performance;
import lk.ijse.ems_project.repo.PerformanceRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class PerformanceServiceImpl implements PerformanceService {

    @Autowired
    private PerformanceRepository performanceRepository;

    @Override
    public List<Performance> getAllPerformances() {
        return performanceRepository.findAll();
    }

    @Override
    public Performance getPerformanceById(Integer id) {
        return performanceRepository.findById(id).orElse(null);
    }

    @Override
    public Performance savePerformance(Performance performance) {
        return performanceRepository.save(performance);
    }

    @Override
    public Performance updatePerformance(Integer id, Performance performance) {
        Optional<Performance> existingPerformance = performanceRepository.findById(id);
        if (existingPerformance.isPresent()) {
            performance.setPerformanceId(id);
            return performanceRepository.save(performance);
        }
        return null;
    }

    @Override
    public void deletePerformance(Integer id) {
        performanceRepository.deleteById(id);
    }

    @Override
    public List<Performance> getPerformancesByEmployee(Integer employeeId) {
        return performanceRepository.findByEmployee_EmployeeId(employeeId);
    }
}
