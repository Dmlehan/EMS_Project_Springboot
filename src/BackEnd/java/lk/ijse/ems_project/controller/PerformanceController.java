package lk.ijse.ems_project.controller;
import lk.ijse.ems_project.Service.PerformanceService;
import lk.ijse.ems_project.entity.Performance;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/performance")
public class PerformanceController {

    @Autowired
    private PerformanceService performanceService;

    @GetMapping
    public List<Performance> getAllPerformances() {
        return performanceService.getAllPerformances();
    }

    @GetMapping("/{id}")
    public Performance getPerformanceById(@PathVariable Integer id) {
        return performanceService.getPerformanceById(id);
    }

    @PostMapping
    public Performance createPerformance(@RequestBody Performance performance) {
        return performanceService.savePerformance(performance);
    }

    @PutMapping("/{id}")
    public Performance updatePerformance(@PathVariable Integer id, @RequestBody Performance performance) {
        return performanceService.updatePerformance(id, performance);
    }

    @DeleteMapping("/{id}")
    public void deletePerformance(@PathVariable Integer id) {
        performanceService.deletePerformance(id);
    }

    @GetMapping("/employee/{employeeId}")
    public List<Performance> getPerformancesByEmployee(@PathVariable Integer employeeId) {
        return performanceService.getPerformancesByEmployee(employeeId);
    }
}
