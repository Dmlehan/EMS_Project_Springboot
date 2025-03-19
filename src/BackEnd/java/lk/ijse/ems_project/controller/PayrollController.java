package lk.ijse.ems_project.controller;

import lk.ijse.ems_project.Service.PayrollService;
import lk.ijse.ems_project.entity.Payroll;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/payroll")
public class PayrollController {

    @Autowired
    private PayrollService payrollService;

    @GetMapping
    public List<Payroll> getAllPayrolls() {
        return payrollService.getAllPayrolls();
    }

    @GetMapping("/{id}")
    public Payroll getPayrollById(@PathVariable Integer id) {
        return payrollService.getPayrollById(id);
    }

    @PostMapping
    public Payroll createPayroll(@RequestBody Payroll payroll) {
        return payrollService.savePayroll(payroll);
    }

    @PutMapping("/{id}")
    public Payroll updatePayroll(@PathVariable Integer id, @RequestBody Payroll payroll) {
        return payrollService.updatePayroll(id, payroll);
    }

    @DeleteMapping("/{id}")
    public void deletePayroll(@PathVariable Integer id) {
        payrollService.deletePayroll(id);
    }

    @GetMapping("/employee/{employeeId}")
    public List<Payroll> getPayrollsByEmployee(@PathVariable Integer employeeId) {
        return payrollService.getPayrollsByEmployee(employeeId);
    }
}
